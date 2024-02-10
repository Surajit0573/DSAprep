import java.util.*;

public class __94_BinaryTreeInorderTraversal {

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

    public static void inorder(TreeNode root,List<Integer>arr){
        if(root==null){
            return;
        }
        if(root.left!=null){
            inorder(root.left, arr);
        }
        arr.add(root.val);
        if(root.right!=null){
            inorder(root.right, arr);
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>arr=new ArrayList<>();
        inorder(root, arr);
        return arr;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}
