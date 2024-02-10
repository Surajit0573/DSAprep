import java.util.*;

public class _1008_ConstructBinarySearchTreefromPreorderTraversal {
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

    public static TreeNode create(int[] preorder,int start,int end){
        if(start>end){
            return null;
        }
        TreeNode root=new TreeNode(preorder[start]);
        if(start==end){
            return root;
        }
        int curr=start+1;
        while(curr<=end&&preorder[curr]<preorder[start]){
            curr++;
        }
        root.left=create(preorder, start+1, curr-1);
         root.right=create(preorder, curr, end);
         return root;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        if(preorder.length<1){
            return null;
        }
        return create(preorder, 0,preorder.length-1);
    }
    

    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}