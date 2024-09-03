import java.util.*;

public class FindingDuplicate {

    public static String integertoString(int[] arr){
        String s  = "";
        for(int i=0;i<arr.length;i++){
            s = s + arr[i];
        }

        return s;
    }
    public static int toFindNoDuplicate(int[] arr){ 
            String[] a = new String[arr.length];    
            int maxlength=0;
            for(int i=0;i<arr.length;i++){
                a[i] = String.format("%10d", Integer.parseInt(Integer.toBinaryString(arr[i])));

                //System.out.println(a[i]+" ");
                if(maxlength < a[i].length()){
                    maxlength = a[i].length();
                }

                
            }
           //System.out.println(maxlength);
            int array[] = new int[maxlength];

            Arrays.fill(array,0);
            for(int i=maxlength-1;i>=0;i--){
                for(int j=0;j<a.length;j++){
                
                   if(a[j].charAt(i)=='1'){
                        array[i] = array[i]+1;
                    }
                    
                }

                array[i] = array[i] % 3;
            }

            String str = integertoString(array);

            int value = Integer.parseInt(str,2);


        return value;
    }
    public static void main(String[] args) {
        int arr[] = {3,2,2,2,4,4,4,7,7,12,12,12,7,3,3,17};

        System.out.println("The non-duplicate number that exists is "+toFindNoDuplicate(arr));
    }
}
