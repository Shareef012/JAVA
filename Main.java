import java.util.*;

public class Main {

    static List<String> list1 = new ArrayList<>();
    static List<String> list2 = new ArrayList<>();
    static List<String> list3 = new ArrayList<>();

    public static void combine(List<String> list1,List<String> list2,String str, int i,int j){

        if(j!=list2.size() && str!=""){
            list3.add(str);
        }
        if(i==list1.size()){
            return;
        }
        if(j==list2.size()){
            combine(list1, list2, list1.get(i)+list2.get(j-1), i+1, 0);
        }
        else{
            combine(list1, list2, list1.get(i)+list2.get(j), i, j+1);
        }

    }
    
    public static List<String> letterCombination(String digits){
         String[][] str = {
            {},
            {},
            {"a", "b", "c"},
            {"d", "e", "f"},
            {"g", "h", "i"},
            {"j", "k", "l"},
            {"m", "n", "o"}, // Corrected the typo here
            {"p", "q", "r", "s"},
            {"t", "u", "v"},
            {"w", "x", "y", "z"}
        };
        
        if(digits.length()==1){
            int n = Integer.parseInt(digits);

            List<String> k = Arrays.asList(str[n]);
            return k;
        }

        int i=digits.length()-2;
        int j= digits.length()-1;

        // System.out.println(digits.substring(i, j)+" "+digits.substring(j));

        while(i!=-1 && j!=0){

            String str1 = digits.substring(i, j);
            String str2 = digits.substring(j);

            System.out.println("String 1: "+str1+"  String 2: "+str2);
            if(j==digits.length()-1){
                Collections.addAll(list2,str[Integer.parseInt(str2)]);
                Collections.addAll(list1, str[Integer.parseInt(str1)]);
                System.out.println(list1+" "+list2);

                combine(list1,list2,"",0,0);
            }
            if(j<digits.length()-1){
                list1.clear();
                Collections.addAll(list1,str[Integer.parseInt(str1)]);
                list2.clear();
                list2.addAll(list3);
                list3.clear();

                combine(list1,list2,"",0,0);
            }
            i--;
            j--;

        }

        list3.removeIf(str4 -> str4.length() <digits.length());

        return list3;
    }
    public static void main(String[] args) {
       
        
        String digits = "22";
        System.out.println(letterCombination(digits));
    }
    
}
