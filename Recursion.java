public class Recursion {

    public static void printName(int n){
        if(n==6){
            return;
        }
        n++;
        printName(n);
        System.out.println("Shareef");
    }
    public static void printNumber(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        n--;
        printNumber(n);
    }
    public static void main(String[] args) {
        
        // printName(1);
        // printNumber(5);
    }
    
}
