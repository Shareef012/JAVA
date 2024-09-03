import java.util.*;
public class Recpattern1 {
    public static void main(String[] args) {
        //triangle1(4,0);
        int[] arr = {4,3,2,1};
        bubbleSort(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));

      
    }

    public static void triangle1(int r,int c){
        if(r==0 ){
            return;
        }
        if(r>c){
            System.out.print("*");
            triangle1(r,c+1);
        }
        else{
            System.out.println();
            triangle1(r-1,0);
        }
    }

    public static void triangle2(int r,int c){
        if(r==0 ){
            return;
        }
        if(r>c){
            triangle2(r,c+1);
            System.out.print("*");
        }
        else{
            triangle2(r-1,0);
            System.out.println();
        }
    }

    public static void bubbleSort(int[] arr,int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bubbleSort(arr, r, c+1);
        }
        else{
            bubbleSort(arr, r-1, 0);
        }
    }
}
