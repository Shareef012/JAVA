import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr= {9,8,7,6,5,4,3,2,1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void insertionSort(int[] arr){
        int i=0;
        while(i<arr.length-1){
            int j=i+1;
            while(j>0){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
                j=j-1;
            }
            i=i+1;
        }
    }
}
