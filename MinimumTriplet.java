import java.util.*;

public class MinimumTriplet {

    public static int minimumTriplet(int[] arr){
        int n = arr.length;
        int sum=0;
        int maxSum = Integer.MIN_VALUE;
        TreeSet<Integer> set = new TreeSet<>();
        set.add(arr[0]);
        int[] right = new int[n];
        right[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--){
            right[i] = Math.max(right[i+1],arr[i]);
        }

        for(int i=1;i<n-1;i++){
            Integer lower = set.lower(arr[i]);
            Integer higher = right[i+1];
            if(lower!=null && higher>arr[i]){
                sum = arr[i] + lower + higher;
                maxSum = Math.max(maxSum, sum);
            }
            set.add(arr[i]);
        }

        return maxSum==Integer.MIN_VALUE ? 0 : maxSum;
    }
    
    public static void main(String[] args) {
        int arr[] = {22649, 27447, 23806, 15891, 6730, 24371, 15351, 15007, 31102, 24394, 3549, 19630, 12624, 24085};
        // int n = arr.length;
        System.out.println(minimumTriplet(arr));
    }
}
