import java.util.*;

public class _105_ConstructBinaryTreefromPreorderandInorderTraversal {
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
    static int idx=0; 
    public static TreeNode create(int[] preorder, int[] inorder,int start,int end){
      if(idx>=preorder.length||start>end){
        return null;
      }
        TreeNode newnode=new TreeNode(preorder[idx]);
            idx++;
          if(start==end){
            return newnode;
        }

        int curr=0;
        for(int i=start;i<=end;i++){
            if(newnode.val==inorder[i]){
                curr=i;
                break;
            }
        }
        newnode.left=create(preorder,inorder,start,curr-1);
        newnode.right=create(preorder, inorder, curr+1, end);
        return newnode;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        idx=0;
        return create(preorder, inorder,0,inorder.length-1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}