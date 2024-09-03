public class Recursion2 {
   static int count=0;
    public static void main(String[] args) {
        int n = 123000120;
         System.out.println(countZeros(n,count));
        
    }

    public static int  sumOfDigits(int n){
        if(n==0){
            return 0;
        }
        else{
            return n%10+sumOfDigits(n/10);
        }
    }
    public static int  productOfDigits(int n){
        if(n<1){
            return 1;
        }
        else{
            return n%10*productOfDigits(n/10);
        }
    }
    
    public static int reversalOfNumber(int n){
        if(n<1){
            return 0;
        }
        else{
            return (n%10)*(int)Math.pow(10,(int)Math.log10(n))+reversalOfNumber(n/10);
        }
    }

    public static int countZeros(int n,int count){
       return 0;
    }


    
}
