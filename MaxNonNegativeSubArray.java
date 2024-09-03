import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * MaxNonNegativeSubArray
 */
public class MaxNonNegativeSubArray {

    public static void maxNonNegativeSubArray(long[] arr,int n){
        int p1=0,p2=0;
        long maxSum=Integer.MIN_VALUE;
        HashMap<Long,HashMap<Integer,Integer>> map = new HashMap<>();
        long sum=0;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                HashMap<Integer,Integer> map1 = new HashMap<>();
                if(map.containsKey(sum)){
                     Map.Entry<Integer, Integer> singleEntry = map.get(sum).entrySet().iterator().next();
                     int start = singleEntry.getKey();
                     int end = singleEntry.getValue();
                     if((p2-p1)>(end-start)){
                        map1.put(p1,p2);
                        map.put(sum,map1);
                     }

                      if((p2-p1)==(end-start)){
                         if(arr[p1]<arr[start]){
                            map1.put(p1,p2);
                            map.put(sum,map1);
                         }
                      }
                }
                else{
                    map1.put(p1,p2);
                    map.put(sum,map1);
                }
                maxSum = Math.max(maxSum, sum);
                sum=0;
                p1 = p2+1;
                p2 = p1;
            }
            else{
                sum+=arr[p2];
                p2++;
            }
        }

        if(arr[n-1]>0){
            HashMap<Integer,Integer> map1 = new HashMap<>();
                if(map.containsKey(sum)){
                     Map.Entry<Integer, Integer> singleEntry = map.get(sum).entrySet().iterator().next();
                     int start = singleEntry.getKey();
                     int end = singleEntry.getValue();
                     if((p2-p1)>(start-end)){
                        map1.put(p1,p2);
                        map.put(sum,map1);
                     }
                }
                else{
                    map1.put(p1,p2);
                    map.put(sum,map1);
                }
        }

        System.out.println(map+"  "+maxSum);
        maxSum = Math.max(sum,maxSum);

        ArrayList<Long> list = new ArrayList<>();
        Map.Entry<Integer, Integer> singleEntry = map.get(maxSum).entrySet().iterator().next();
        int start = singleEntry.getKey();
        int end = singleEntry.getValue();

        for(int i=start;i<end;i++){
            list.add(arr[i]);
        }

        System.out.println(list);

        long arr1[] = new long[list.size()];
        for(int i=0;i<list.size();i++){
            arr1[i] = list.get(i);
        }

        System.out.println(Arrays.toString(arr1));
    }

    public static void main(String[] args) {
        long[] arr = { 0, 0, -1, 0};
        int n = arr.length;
        maxNonNegativeSubArray(arr,n);
    }
}