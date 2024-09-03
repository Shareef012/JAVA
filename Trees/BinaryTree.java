package Trees;

public class BinaryTree {

    

    public static void main(String[] args){
        int[] preorder = {1,2,4,8,9,5,3,6,10,7,11};
        int[] inorder = {8,4,9,2,5,1,10,6,3,7,11};
        TreeNode tree = new TreeNode();
        TreeNode root = tree.buildTree(preorder,inorder);
    }
    
}
