import java.util.*;

public class _103_BinaryTreeZigzagLevelOrderTraversal {

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

    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null){
            return ans;
        }
        int level=0;
        List<Integer> temp = new ArrayList<>();
        que.add(root);
        que.add(null);
        while (!que.isEmpty()) {
            TreeNode curr = que.remove();
            if (curr == null) {
                level++;
                if(level%2==0){
                    Collections.reverse(temp);
                }
                ans.add(new ArrayList<>(temp));
                temp=new ArrayList<>();
                if (que.peek() == null) {
                    break;
                } else {
                    que.add(null);
                }
            } else {
                temp.add(curr.val);
                
                if (curr.left != null) {
                    que.add(curr.left);
                }
                if (curr.right != null) {
                    que.add(curr.right);
                }
            }
        }
        return ans;
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        return levelOrder(root);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}