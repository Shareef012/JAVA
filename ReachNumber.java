public class ReachNumber {
    public static void main(String[] args) {
        
        System.out.println(reachNumber(100));
    }
    public static int reachNumber(int target){
        int start=0;
        int end = Math.abs(target);
        int c=0;
        while(start<end){
            c = c +1;
            start = start+c;
            if(start==end){
                return c;
            }
            if(start<end){
                continue;
            }
            if(start>end){
                start =  start-c;
            }
        }
        return 0;
    }
}
