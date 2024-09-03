package BitManupulation;

public class FindUnique {

    public static int findUniqueWithTwoDuplicates(int[] arr,int n){
        int[] set = new int[33];
        
        
        for (int i = 0; i <=32; i++) {
            for (int j = 0; j < n; j++) {
                if (((arr[j] >> i) & 1) == 1) {
                    set[i] += 1;
                }
            }
        }

        int res = 0;
       
        for (int i = 0; i <= 32; i++) {
            if (set[i] % 2 == 1) {
                res += (1 << i);
            }
        }

        return res;
    }


    public static int findUniqueWithThreeDuplicates(int[] arr,int n){
        int[] set = new int[32];
        
        
        for (int i = 0; i < 32; i++) {
            for (int j = 0; j < n; j++) {
                if (((arr[j] >> i) & 1) == 1) {
                    set[i] += 1;
                }
            }
        }

        int res = 0;
       
        for (int i = 0; i < 32; i++) {
            if (set[i] % 3 == 1) {
                res += (1 << i);
            }
        }

        return res;
    }


    
    public static void main(String[] args) {
        int[] arr = {1, 1,42,2, 2,3,3,5,5};
        int n = arr.length;
        System.out.println(findUniqueWithTwoDuplicates(arr, n));

        int arr1[] = {1,1,1,2,3,3,3,4,4,4};

        n = arr1.length;
        System.out.println(findUniqueWithThreeDuplicates(arr1, n));
    }
}
