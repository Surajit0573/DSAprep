import java.util.*;

import javax.swing.tree.TreeNode;

public class _108_ConvertSortedArraytoBinarySearchTree {

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

    public static TreeNode create(int[] nums,int start,int end){
        if(start>end){
            return null;
        }
        TreeNode root=new TreeNode();
        int mid=(start+end)/2;
        root.val=nums[mid];
        root.left=create(nums, start,mid-1);
        root.right=create(nums, mid+1, end);
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length<1){
            return null;
        }else{
            return create(nums, 0,nums.length-1);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}