//Cycle Sort is a sorting alogithm which is used to sort the numbers from range 1 to n-1

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr= {4,3,2,7,8,2,3,1};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr,int f,int s){
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }
    public static void cycleSort(int[] arr){
       int i=0;
       while(i<arr.length){
        int correct = arr[i]-1;
        if(arr[i]!=arr[correct]){
            swap(arr,i,correct);
        }
        else{
            i++;
        }
       }
    }
}
