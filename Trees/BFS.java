package Trees;
import java.util.*;


public class BFS {
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
  }

  public static List<List<Integer>> bfs(TreeNode root){
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    if(root == null) return result;
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    while(!queue.isEmpty()){
        int size = queue.size();
        List<Integer> level = new ArrayList<>();
        for(int i = 0; i < size; i++){
            TreeNode node = queue.poll();
            level.add(node.val);
            if(node.left != null) queue.add(node.left);
            if(node.right != null) queue.add(node.right);
            }
            result.add(level);
   }

    return result;
  }

    public static TreeNode levelOrderSuccessor(TreeNode root,int search){
    
        if(root == null) return null;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node.val == search) break;
            if(node.left!=null) queue.add(node.left);
            if(node.right!=null) queue.add(node.right);
        }

        return queue.poll();
    }

    public static void rightSideView(TreeNode root){
      if(root==null) return;
      List<Integer> list = new ArrayList<>();
      Queue<TreeNode> queue = new LinkedList<>();
      queue.add(root);
      while(!queue.isEmpty()){
        int size = queue.size();
        for(int i=0;i<size;i++){
          TreeNode node = queue.poll();
          if(i==size-1) list.add(node.val);
          if(node.left!=null) queue.add(node.left);
          if(node.right!=null) queue.add(node.right);
          
        }
        
      }  
    }

  public static void main(String[] args) {

  }
 }