public class Pattern {
    public static void main(String[] args) {
        pattern1(10);   
        pattern2(10);
        pattern3(5);
        pattern4(5);
        pattern5(5);
        pattern6(5);
        System.out.println();
        pattern7(5);
        pattern8(5);
        pattern9(5);
    }
    public static void pattern1(int n){
        for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void pattern3(int n){
        for(int i=1;i<=2*n-1;i++){
            if(i<=n){
                for(int j=1;j<=i;j++){
                    System.out.print("* ");
                }
            }
            else{
                for(int j=1;j<=2*n-i;j++){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
    public static void pattern4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern5(int n){
        for(int i=1;i<=n;i++){
            for(int k=1;k<=i-1;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=n-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern6(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern7(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=2*i-1;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern8(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                if(k%2==1)
                {
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void pattern9(int n){
        for(int i=1;i<=n;i++){
            for(int space=1;space<=n-i;space++){
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            for(int j=2;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
