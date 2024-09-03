public class Recursion1 {
    static int count =0;
    static int sum=0;
    public static void funct(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        else{
            funct(n-1);
            System.out.println(n);
        }
    }

    public static int fact(int n){
        if(n==1){
            return 1;
        }

        return n * fact(n-1);
    }
    public static int sum(int n){
        if(n==1){
            return 1;
        }

        return n + sum(n-1);
    }

    public static int sumOfDigits(int n){
        if(n<=0){
            return 0;
        }
        return n%10+sumOfDigits(n/10);
    }

    public static int productOfDigits(int n){
        if(n<=0){
            return 1;
        }
        return n % 10*productOfDigits(n /10);
    }

    public static void reverseOfNumber(int n){
        if(n==0){
            return;
        }
        int rem = n%10;
        sum = sum*10 + rem;
        reverseOfNumber(n/10);
       
    }

    public static int reverseOfNumber2(int n,int digits){
        int rem = n%10;
        if(rem == n){
            return n;
        }

        return rem*(int)(Math.pow(10,digits-1))+reverseOfNumber2(n/10,digits-1);
    }

    public static boolean palindromeNumber(int n){
        
        if(n == reverseOfNumber2(n, (int)(Math.log10(n)+1))){
            return true;
        }
        return false;
    }
    public static int countZero(int n){
        if(n==0){
            return count;
        }
        int rem = n %10;
        if(rem == 0){
            ++count;
        }
        return countZero(n/10);
    }
    public static void main(String[] args) {
       System.out.println(countZero(3000004)); 
        
    }
}
