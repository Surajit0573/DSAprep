import java.util.*;

public class _653_TwoSumIVInputisaBST {

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

    public static void inorder(TreeNode root,HashSet<Integer>hs){
        if(root==null){
            return;
        }
        if(root.left!=null){
            inorder(root.left, hs);
        }
        hs.add(root.val);
        if(root.right!=null){
            inorder(root.right,hs);
        }
    }

    public boolean findTarget(TreeNode root, int k) {
       HashSet<Integer>hs=new HashSet<>();
       inorder(root, hs);
       for(Integer key:hs){
        if((k-key!=key)&&hs.contains(k-key)){
            return true;
        }
       }
        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}