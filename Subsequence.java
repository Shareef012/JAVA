import java.util.*;

public class Subsequence {

    public static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(ch+p, up.substring(1));
        subseq(p+ch, up.substring(1));
    }


    public static ArrayList<String> subsetReq(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subsetReq(p+ch, up.substring(1));
        ArrayList<String> right = subsetReq(p, up.substring(1));

        left.addAll(right);

        return left;
    }

    public static ArrayList<String> subseqReq(String p,String up,ArrayList<String> list){
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        subseqReq(p+ch, up.substring(1),list);
        subseqReq(p, up.substring(1),list);

        return new ArrayList<>(list);
 
    }

    public static List<List<Integer>> subSetLoop(int[] arr){
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        for(int num : arr){
            int n = list.size();
            for(int i=0;i<n;i++){
                List<Integer> current = new ArrayList<>(list.get(i));
                current.add(num);
                list.add(current);
            }
        }

        return list;
    }

    public static List<List<Integer>> subSetDupilcate(int[] arr){
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);
        int start = 0;
        int end = 0;
        list.add(new ArrayList<>());
        for(int i=0;i<arr.length;i++){
            start = 0;
            if(i>0 && arr[i]==arr[i-1]){
                start = end+1;
            }
            end = list.size()-1;
            // int n = list.size();
            for(int j=start;j<=end;j++){
                List<Integer> current = new ArrayList<>(list.get(j));
                current.add(arr[i]);
                list.add(current);
            }
        }

        return list;
    }

    public static void permutationPrinting(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String first = p.substring(0,i);
            String last = p.substring(i);
            permutationPrinting(first+ch+last, up.substring(1));
        }
    }

    public static List<String> permutationPrintingRet(String p,String up,List<String> list){
        if(up.isEmpty()){
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String first = p.substring(0,i);
            String last = p.substring(i);
            permutationPrintingRet(first+ch+last, up.substring(1),list);
        }

        return list;
    }
    
    public static int permutationCount(String p,String up){
        if(up.isEmpty()){
            
            return 1;
        }

        char ch = up.charAt(0);
        int count = 0;
        for(int i=0;i<=p.length();i++){
            String first = p.substring(0,i);
            String last = p.substring(i);
            count+=permutationCount(first+ch+last, up.substring(1));
        }

        return count;
    }

    public static void main(String[] args) {
        // int arr[]= {1,2,2};
       permutationPrinting("","algo");
    }
}
