import java.util.*;

public class _235_LowestCommonAncestorofaBinarySearchTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static TreeNode search(TreeNode root,TreeNode max,TreeNode min){
        if((root.val>min.val&&root.val<max.val)||(root==max||root==min)){
            return root;
        }
        if(root.val<max.val&&root.val<min.val){
            return search(root.right, max, min);
        }else{
            return search(root.left, max, min);
        }

    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(q.val>p.val){
            TreeNode temp;
            temp=p;
            p=q;
            q=temp;
        }
        return search(root, p, q);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}