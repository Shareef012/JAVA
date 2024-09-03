import java.util.ArrayList;
import java.util.*;

public class CombinationSum {
    public static List<List<Integer>> list = new ArrayList<>();

    public static void combinationSum(int idx,int csum,ArrayList<Integer> curList,int[] arr,int target){
       
        
        if(target==csum){
            list.add(new ArrayList<>(curList));
            
            return;
            }
                if(csum<target){
                    curList.add(arr[idx]);
                    csum+=arr[idx];
                    System.out.println(""+curList+"   "+csum);
                    combinationSum(idx, csum, curList, arr, target);
                    
                    
                   
                }
        if(csum>target){
            
            // csum-=arr[idx];
            System.out.println(""+curList+"   "+(csum));
            curList.remove(curList.size()-1);
            
            // csum -=arr[idx];
             combinationSum(idx+1,csum,curList,arr,target);
            //  System.out.println(""+cu
            
            
            
            
        }

    }

    public static void combinationGenerator(List<Integer> arr,int k,List<Integer> arr2,int idx){
        if(arr2.size()==k){
            list.add(new ArrayList<>(arr2));
            return;
        }
        if(arr2.size()>k || idx==arr.size()) {
            return;
        }

        arr2.add(arr.get(idx));
        combinationGenerator(arr,k,arr2,idx+1);
        arr2.remove(arr2.size()-1);
        combinationGenerator(arr,k,arr2,idx+1);

    }

    public static void main(String[] args) {
        list.clear();
        int n =4;
        List<Integer> arr= new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(i+1);
        }
        combinationGenerator(arr, 2, new ArrayList<>(), 0);
        System.out.println(list);
    }
}
