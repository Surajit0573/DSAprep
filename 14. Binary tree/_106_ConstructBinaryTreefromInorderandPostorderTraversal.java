import java.util.*;

public class _106_ConstructBinaryTreefromInorderandPostorderTraversal {
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
    static int idx; 
    public static TreeNode create(int[] postorder, int[] inorder,int start,int end){
      if(idx<0||start>end){
        return null;
      }
        TreeNode newnode=new TreeNode(postorder[idx]);
            idx--;
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
       
        newnode.right=create(postorder, inorder, curr+1, end);
        newnode.left=create(postorder,inorder,start,curr-1);
        return newnode;
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        idx=inorder.length-1;
        return create(postorder, inorder,0,inorder.length-1);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}