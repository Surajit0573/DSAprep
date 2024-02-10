import java.util.*;

public class _114_FlattenBinaryTreetoLinkedList {
    public static class TreeNode {
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

    public static TreeNode preorder(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode ans = root.right;
        TreeNode curr=null;
        if (root.left != null && root.right != null) {
            root.right = preorder(root.left);
            root.left = null;
            curr=root;
            while(root.right!=null){
                root=root.right;
            }
            root.right = preorder(ans);
            root.left = null;
        } else if (root.left != null) {
            root.right = preorder(root.left);
            root.left = null;
        } else if (root.right != null) {
            root.right = preorder(ans);
            root.left = null;
        }
        if(curr!=null){
            return curr;
        }
        return root;
    }

    public void flatten(TreeNode root) {
        preorder(root);

    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}