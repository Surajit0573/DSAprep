import java.util.*;
public class _110_BalancedBinaryTree{

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

    static boolean flag=true;
    public static int postorder(TreeNode root){
        if(root==null){
            return 0;
        }
       int hl=0;
       int hr=0;
        if(root.left!=null){
             hl=postorder(root.left);
        }
        
        if(root.right!=null){
            hr=postorder(root.right);
        }
        if(Math.abs(hl-hr)>1){
            flag=false;
        }
         return Math.max(hl,hr)+1;
    }

    public boolean isBalanced(TreeNode root) {
        flag =true;
        postorder(root);
        return flag;
    }

public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}