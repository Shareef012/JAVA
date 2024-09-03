import java.util.*;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;
public class Assignment {

    public static int[] sumTriangle(int[] arr,int left,int right,int temp[]){
        if(left== temp.length){
            return temp;
        }

        temp[left] = arr[left]+arr[right];
        return sumTriangle(arr, left+1, right+1, temp);
    }

    public static void printTheArray(int[] arr,int x){
        
        if(x==0){
            return;
        }
        int[] temp = sumTriangle(arr,0,1,new int[arr.length-1]);
        printTheArray(temp, x-1);
        System.out.println(Arrays.toString(arr));
    }

    public static int minValue(int arr[],int n){
        if(n==1){
            return arr[0];
        }
        return Math.min(arr[n-1],minValue(arr, n-1));
    }

    public static int maxValue(int arr[],int n){
        if(n==1){
            return arr[0];
        }
        return Math.max(arr[n-1],maxValue(arr, n-1));
    }

    public static char firstUpperCase(String str,int idx){
        if(Character.isUpperCase(str.charAt(idx))){
            return str.charAt(idx);
        }
        return firstUpperCase(str.substring(1), idx+1);
    }

    public static int lengthOfString(String str){
        if(str.isEmpty()){
            return 0;
        }

        return lengthOfString(str.substring(1))+1;
    }

    public static void bubbleSort(int[] arr,int n){
        if(n==1){
            return;
        }
        int count = 0;
        for(int i=0;i<n-1;i++){
            if (arr[i]>arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                count++;
            }
            
        }
        if(count==0) return;

        bubbleSort(arr, n-1);
    }

    public static void insertionSortIteration(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j-1]<arr[j]){
                    break;
                }
                if(arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static int sumOfDigits(int num){
        if(num==0){
            return 0;
        }
        return sumOfDigits(num/10)+num%10;
    }

    public static boolean isPrime(int num,int i){
        if(num<=1){
            return false;
        }
        if(num==2){
            return true;
        }
        if(num%i==0){
            return false;
        }

        if(i*i>num){
            return true;
        }

        return isPrime(num,i+1);
    }

    public static boolean isSorted(int[] arr,int n){
        if(n==0 || n==1) return true;
        return (arr[n-1]>=arr[n-2] && isSorted(arr, n-1));
    }

    public static String removeConsecutiveCharacter(String str){
        if(str.length()<=1) return str;
        if(str.charAt(0)==str.charAt(1)) return removeConsecutiveCharacter(str.substring(1));
        return str.charAt(0)+removeConsecutiveCharacter(str.substring(1));
    }

    public static void main(String[] args) {
       System.out.println(removeConsecutiveCharacter("aaaaaaaaabbbbbbcccccccc"));
    }
}
