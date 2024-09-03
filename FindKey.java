import java.util.*;
import java.lang.*;
public class FindKey {

    public int[] seprateDigits(int n){
        int[] arr = new int[4];
        int idx=0;
        while(n>0){
            arr[idx++] = n%10;
            n= n /10;
        }

        return arr;
    }

    public int findKey(int a,int b,int c){
        int arr1[] = seprateDigits(a);
        int arr2[] = seprateDigits(b);
        int arr3[] = seprateDigits(c);

        int n1 = Math.min(arr1[3],Math.min(arr2[3],arr3[3]));
        int n2 = Math.min(arr1[2],Math.min(arr2[2],arr3[2]));
        int n3 = Math.min(arr1[1],Math.min(arr2[1],arr3[1]));
        int n4 = Math.min(arr1[0],Math.min(arr2[0],arr3[0]));

        return n1*1000 + n2*100+n3*10+n4;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        FindKey fk = new FindKey();

        System.out.println(fk.findKey(a, b, c));
    }
}
