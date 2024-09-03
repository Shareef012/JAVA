import java.util.ArrayList;

public class Permutation {
    public static ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    public static void permutationGenerator(ArrayList<Integer> arr,ArrayList<Integer> temp,int idx,int n,boolean[] vis){
        if(temp.size()==arr.size()){
            list.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<n;i++){
            if(!vis[i]){
                vis[i] = true;
                temp.add(arr.get(idx));
                permutationGenerator(arr, temp, idx+1, n, vis);
                temp.remove(temp.size()-1);
                vis[i] = false;
            }
        }

        

    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        boolean[] vis  = new boolean[arr.size()];

        permutationGenerator(arr,new ArrayList<>(),0,3,vis);

        System.out.println(list);
    }
}
