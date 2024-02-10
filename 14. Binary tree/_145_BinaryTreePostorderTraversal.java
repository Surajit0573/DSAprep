import java.util.*;
public class _145_BinaryTreePostorderTraversal {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void postorder(TreeNode root,List<Integer>arr){
        if(root==null){
            return;
        }
       
        if(root.left!=null){
            postorder(root.left, arr);
        }
        
        if(root.right!=null){
            postorder(root.right, arr);
        }
         arr.add(root.val);
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>arr=new ArrayList<>();
        postorder(root, arr);
        return arr;
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}