package Trees;
import java.util.*;

// import org.xml.sax.HandlerBase;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode constructTree(int[] preorder,int[] inorder,Map<Integer,Integer> map,int idx,int start,int end,TreeNode prev,TreeNode root){
       if(idx>=preorder.length) return root;
       int place = map.get(preorder[idx]);
       if(start>place || end<place) return null;
    //    TreeNode node = new TreeNode(preorder[idx]);
        TreeNode newNode = new TreeNode(preorder[idx]);
        if(start<place){
            
            prev.left = newNode;
            constructTree(preorder, inorder, map, idx, start, place-1, newNode, root);
        }
        else{
            // TreeNode newNode = new TreeNode(preorder[idx]);
            prev.right = newNode;
            constructTree(preorder, inorder, map, idx+1, place+1, end,newNode,root);
        }

        return root;
    }

    public static TreeNode buildTree(int[] preorder,int inorder[]){
        TreeNode root = new TreeNode(preorder[0]);
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }

        return constructTree(preorder, inorder, map, 0, 0, preorder.length-1, root, root);

    }
}