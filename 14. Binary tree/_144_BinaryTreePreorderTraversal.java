import java.util.*;

import javax.swing.tree.TreeNode;

public class _144_BinaryTreePreorderTraversal {

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

    public static void preorder(TreeNode root,List<Integer>arr){
        if(root==null){
            return;
        }
        arr.add(root.val);
        if(root.left!=null){
            preorder(root.left, arr);
        }
        
        if(root.right!=null){
            preorder(root.right, arr);
        }
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>arr=new ArrayList<>();
        preorder(root, arr);
        return arr;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}
