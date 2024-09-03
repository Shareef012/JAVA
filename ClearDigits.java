// import java.lang.*;
public class ClearDigits {
    public static void clearDigits(String s,int n){
        StringBuilder str = new StringBuilder(s);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                if(i==0){
                    for(int j=i+1;j<str.length();j++){
                        if(str.charAt(j)>='a' && str.charAt(j)<='z'){
                            str.deleteCharAt(j);
                            str.deleteCharAt(i);
                            break;
                            
                        }
                    }
                }
                else{
                    str.deleteCharAt(i);
                    str.deleteCharAt(i-1);
                }
            }
            System.out.println(str.toString());
        }



    }
    public static void main(String[] args) {
        String str = "cb34";
        int n = str.length();
        clearDigits(str,n);
    }
}
