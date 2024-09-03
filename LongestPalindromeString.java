public class LongestPalindromeString {
    public static void main(String[] args) {
        System.out.println(longestPalString("asdsa"));
    }
    public static boolean isPalindrome(String str){
         // Initializing an empty string to store the reverse
        // of the original str
        String rev = "";
 
        // Initializing a new boolean variable for the
        // answer
        boolean ans = false;
 
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
 
        // Checking if both the strings are equal
        if (str.equals(rev)) {
            ans = true;
        }
        return ans;
    }
    public static String longestPalString(String s){
        if(s.length()==0 || s==null){
            return "";
        }
        if(s.length() == 1){
            return s;
        }
        int start=0,end=s.length()-1;
        //String res = s.substring(start,end+1);
        if(isPalindrome(s)){
            return s;
        }

        while(start<=end){
            if(isPalindrome(s.substring(start,end+1))){
                return s.substring(start, end+1);
            }
            start++;
            end--;
        }
        return s.substring(0,1);
    }
}
