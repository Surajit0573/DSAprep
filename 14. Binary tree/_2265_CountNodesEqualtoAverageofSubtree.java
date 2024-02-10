import java.util.*;

public class _2265_CountNodesEqualtoAverageofSubtree {

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

    public static class pair{
        int nodes;
        int sum;
        int count;
        pair(int sum,int nodes,int count){
            this.sum=sum;
            this.nodes=nodes;
            this.count=count;
        }
    }

    public static pair postorder(TreeNode root){
        pair left;
        pair right;
        if(root.left!=null){
            left=postorder(root.left);
        }else{
             left=new pair(0,0,0);
        }

        if(root.right!=null){
            right=postorder(root.right);
        }else{
             right=new pair(0,0,0);
        }

        int sum=(left.sum+right.sum+root.val);
        int nodes=(left.nodes+right.nodes+1);
        int count=left.count+right.count;
        int avg=sum/nodes;
        if(avg==root.val){
            count++;
        }
        return new pair(sum,nodes,count);

    }

    // Function
    public int averageOfSubtree(TreeNode root) {
        pair ans=postorder(root);
        return ans.count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}