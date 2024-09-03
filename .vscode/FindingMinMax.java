import java.util.Arrays;
import java.util.Stack;

public class FindingMinMax {

    public static int[] rightMax(int[] arr,int n){
        int[] rightmax = new int[n];
        Stack<Integer> stack = new Stack<Integer>();
        Arrays.fill(rightmax,n-1);
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                rightmax[i] = stack.peek()-1;
            }
            stack.push(i);
        }

        return rightmax;
    }

    public static int[] leftMax(int[] arr,int n){
        int[] leftmax = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                leftmax[i] = stack.peek()+1;
            }
            stack.push(i);
        }
        return leftmax;
    }

    public static int[] rightMin(int[] arr,int n){
        Stack<Integer> stack = new Stack<>();
        int[] rightmin = new int[n];
        Arrays.fill(rightmin, n-1);
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && arr[stack.peek()]<=arr[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                rightmin[i] = stack.peek()-1;
            }
            stack.push(i);
        }

        return rightmin;
    }

    public static int[] leftMin(int arr[],int n){
        Stack<Integer> stack = new Stack<>();
        int[] leftmin = new int[n];
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                leftmin[i] = stack.peek()+1;
            }
            stack.push(i);
        }

        return leftmin;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,};
        System.out.println(Arrays.toString(leftMax(arr, arr.length)));
        System.out.println(Arrays.toString(rightMax(arr, arr.length)));
        System.out.println(Arrays.toString(leftMin(arr, arr.length)));
        System.out.println(Arrays.toString(rightMin(arr, arr.length)));
    }
}
