import java.util.*;

public class _1373_MaximumSumBSTinBinaryTree {
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

    public static class pair {
        int max;
        int min;
        int sum;
        boolean flag;

        pair(int max, int min, int sum, boolean flag) {
            this.max = max;
            this.min = min;
            this.sum = sum;
            this.flag = flag;
        }
    }

    static int maxsum;

    public static pair find(TreeNode root) {
        if (root == null) {
            return new pair(Integer.MIN_VALUE, Integer.MAX_VALUE, 0, true);
        }
        if (root.left == null && root.right == null) {
            maxsum = Math.max(maxsum, root.val);
            return new pair(root.val, root.val, root.val, true);
        }

        pair left = find(root.left);
        pair right = find(root.right);
        boolean f = false;
        boolean currf = left.flag && right.flag;
        if (left.max < root.val && right.min > root.val && currf) {
            maxsum = Math.max(maxsum, left.sum + right.sum + root.val);
            f = true;
        }

        return new pair(Math.max(right.max,Math.max(left.max,root.val)), Math.min(right.min,Math.min(left.min,root.val)), left.sum + right.sum + root.val, currf && f);

    }

    public int maxSumBST(TreeNode root) {
        maxsum = 0;
        find(root);
        return maxsum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}