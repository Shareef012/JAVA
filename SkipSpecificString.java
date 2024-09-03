public class SkipSpecificString {
    public static String skipPart(String str){
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith("apple")){
            return str.substring(5);
        }
        else{
            return str.charAt(0)+str.substring(1);
        }
    }
    public static void main(String[] args) {
        System.out.println(skipPart("applecddfa"));
    }
}
