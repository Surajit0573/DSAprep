import java.util.*;

import javax.swing.tree.TreeNode;
public class _111_MinimumDepthofBinaryTree{
    /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        q.add(new TreeNode(-2000));
        int hight=1;
        while(!q.isEmpty()){
            TreeNode temp=q.remove();
            if(temp.val==-2000){
                if(q.isEmpty()==false){
                    hight++;
                q.add(temp);
                }else{
                    break;
                }
            }
            else if(temp.left==null&&temp.right==null){
                return height;
            }
            else{
                if(temp.right!=null){
                    q.add(temp.right);

                }
                if(temp.left!=null){
                    q.add(temp.left);
                }
            }
        }
        return hight;
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}