// import java.util.Arrays;

public class PickUpFromBothSides {

    public static int pickUpFromBothSidesPrefix(int[] arr,int n,int b){
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = arr[0];
        for(int i=1;i<n;i++){
            left[i] = left[i-1]+arr[i];
        }
        right[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--){
            right[i] = right[i+1] + arr[i];
        }
        // System.out.println(Arrays.toString(left)+" "+Arrays.toString(right));
        int p1 = b-1;
        int p2 = n;
        int maxSum= Integer.MIN_VALUE;
        while(p1>=-1 && p2>=n-b){
            int currSum = 0;
            if(p1>-1){
                currSum+=left[p1];
            }
            if(p2<n){
                currSum+=right[p2];
            }
            p1--;
            p2--;

            maxSum = Math.max(currSum,maxSum);
        }
        return maxSum;
    }

    // public static int pickUpFromBothSides(int[] arr,int n,int b){

    //     // System.out.println((b-1)+"  "+n);

    //     int maxSum=Integer.MIN_VALUE;
    //     int currSum=0;
    //     int p1=(b-1);
    //     int p2=n;
    //     while(p1>=-1 && p2>=n-b){
    //          currSum=0;
    //         if(p1>-1){
    //             for(int i=0;i<=p1;i++){
    //                 currSum+=arr[i];
    //             }
    //         }

            
            
    //         if(p2<n){
    //             for(int i=p2;i<=n-1;i++){
    //                 currSum+=arr[i];
    //             }
    //         }
    //         p2--;
    //         p1--;
    //         // System.out.println(p1+"  "+p2+"  "+currSum+"   "+maxSum);
    //         maxSum = Math.max(currSum,maxSum);
    //         // System.out.println(currSum+"   "+maxSum);
    //     }


    //     return maxSum;
    // }
    
    public static void main(String[] args) {
        int[] arr = {5, -2, 3 , 1, 2};
        int n = arr.length;
        int b = 3;
        // System.out.println(n);
        System.out.println(pickUpFromBothSidesPrefix(arr,n,b));
    }
}
