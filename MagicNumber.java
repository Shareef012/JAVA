public class MagicNumber {
    public static int findMagicNumber(int num){
        String s = String.format("%10d",Integer.parseInt(Integer.toBinaryString(num)));
        System.out.println(s);
        double base = 5; 
        int res=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                res = res +(int) Math.pow(base, (double)s.length()-i);
            }
        }
        
        return res;
    }
    public static void main(String[] args) {
        int num = 6;
        System.out.println("The "+num+" magic number is "+findMagicNumber(num)); 
    }
}
