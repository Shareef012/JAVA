// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Subset {
    public static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    public static void generateAllSubsetsUsingList(int idx,ArrayList<Integer> list1,ArrayList<Integer> arr){
        if(idx==arr.size()){
            if(!list.contains(list1)){
            Collections.sort(list1);
            list.add(new ArrayList<>(list1));
            }
            return;
        }
       
        generateAllSubsetsUsingList(idx+1,list1,arr);
         list1.add(arr.get(idx));
        
        generateAllSubsetsUsingList(idx+1,list1,arr);
        list1.remove(list1.size()-1);
    }
    public static void generateAllSubsets(int idx,StringBuilder str,int[] arr){
        if(idx==arr.length){
            System.out.println(str.toString()+" ");
            return;
        }
        generateAllSubsets(idx+1,str.append(Integer.toString(arr[idx])),arr);
        generateAllSubsets(idx+1,str.deleteCharAt(str.length()-1),arr);
    }
    public static void subsetGeneration(int[] arr,int n){
        for(int i=0;i<=(1<<n)-1;i++){
            int idx = i;
            int ind = 0;
            ArrayList<Integer> subset = new ArrayList<>();
            while(idx!=0){
                if((idx&1)==1){
                    subset.add(arr[n-ind-1]);
                }
                ind++;
                idx = idx>>1;
                
            }
            list.add(subset);
        }
    }
    public static void main(String[] args) {
        list.clear();
        // 
        int[] arr = {1,2,3};
        int n = arr.length;
        subsetGeneration(arr,n);
        System.out.println(list);
        
    }
}