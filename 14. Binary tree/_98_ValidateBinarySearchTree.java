
import java.util.*;
public class _98_ValidateBinarySearchTree {

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
   
    public static boolean inorder(TreeNode root,List<Integer>arr){
        if(root==null){
            return true;
        }
        boolean left=true;
        boolean right=true;
        if(root.left!=null){
            left=inorder(root.left, arr);
        }
        if(arr.size()>0&&root.val<=arr.get(arr.size()-1)){
            return false;
        }
        arr.add(root.val);
        
        if(root.right!=null){
            right=inorder(root.right, arr);
        }
        return left&&right;
    }

    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer>arr=new ArrayList<>();
       return inorder(root, arr);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}