
public class SkipCharacter {

    public static void print(String p,String str){
        if(str.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = str.charAt(0);
        if(ch=='a') print(p,str.substring(1));
        else print(p+ch,str.substring(1));
    }

    public static String printWithMissingCharacter(String str){
        if(str.isEmpty()){
            return "";
        }
        char ch = str.charAt(0);
        if(ch=='a') return printWithMissingCharacter(str.substring(1));
        else return ch+printWithMissingCharacter(str.substring(1));
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the string: ");
        // String str = sc.next();
        // System.out.println("Enter the character to skip:  ");
        // char c = sc.next().charAt(0);

        // skipACharacter(str,c,str.length(),0,"");

        print("","abbbacdef");
    }
}
