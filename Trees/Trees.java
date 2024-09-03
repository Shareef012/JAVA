package Trees;

public class Trees {
    public static void main(String[] args) {
        AVL tree = new AVL();
        int nums[] = {-10,-3,0,5,9};
        for(int i=0;i<nums.length;i++){
              tree.insert(nums[i]);
        }

        tree.inorder();
        
    }
}
