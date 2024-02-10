import java.util.*;

public class _662_MaximumWidthofBinaryTree {
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
        TreeNode node;
        int idx;

        pair(TreeNode node, int idx) {
            this.node = node;
            this.idx = idx;
        }
    }

    public static int levalorder(TreeNode root,int max) {
        Queue<pair> que = new LinkedList<>();
        que.add(new pair(root, 1));
        que.add(null);
        int prev=1;
        while (!que.isEmpty()) {
            pair curr = que.remove();
            if(curr!=null&&que.peek()==null){
                 max=Math.max(max,(curr.idx-prev)+1);
            }
            if (curr == null) {
                if(que.peek()!=null){
               prev=que.peek().idx;
                que.add(null);
                }else{
                    break;
                }
                
            } else {
                if (curr.node.left != null) {
                    que.add(new pair(curr.node.left, curr.idx * 2 - 1));
                }
                if (curr.node.right != null) {
                    que.add(new pair(curr.node.right, curr.idx * 2));
                }
            }
        }
        return max;
    }

    public int widthOfBinaryTree(TreeNode root) {
        return levalorder(root, 0);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}