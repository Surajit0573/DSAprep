import java.util.*;

import javax.swing.tree.TreeNode;

public class _236_LowestCommonAncestorofaBinaryTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static boolean find(TreeNode root, TreeNode p, ArrayList<TreeNode> arr) {
        if (root == null) {
            return false;
        }
        arr.add(root);
        if (root == p) {
            return true;
        }
        boolean left = false;
        boolean right = false;
        if (root.left != null) {
            left = find(root, p, arr);
        }
        if (root.right != null) {
            right = find(root, p, arr);
        }
        if (!left && !right) {
            arr.remove(root);
            return false;
        } else {
            return true;
        }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode>arr1=new ArrayList<>();
          ArrayList<TreeNode>arr2=new ArrayList<>();
        find(root, p,arr1);
         find(root, q,arr2);
         int i=0;
         TreeNode ans=null;
         while(i<arr1.size()&&i<arr2.size()){
            if(arr1.get(i)==arr2.get(i)){
                ans=arr1.get(i);
            }
         }
         return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}