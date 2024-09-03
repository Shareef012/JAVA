import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,1,4,5,3};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int max(int[] arr,int start,int end){
        int max = start;
        for(int i=start;i<=end;i++){
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }
    public static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last = arr.length-i-1;
            int maxIndex = max(arr,0,last);
            swap(arr, last, maxIndex);

        }
    }
}
