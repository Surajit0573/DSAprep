import java.util.*;

public class _863_AllNodesDistanceKinBinaryTree {

    // Definition for a binary tree node.
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    // BFS
    public static void BFS(TreeNode root, int k, int dist, List<Integer> ans) {
        dist++;
        if (dist == k) {
            ans.add(root.val);
            return;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            TreeNode temp = q.remove();
            if (temp == null && !q.isEmpty()) {
                dist++;
                q.add(temp);
                continue;
            }
            if(temp==null){
                break;
            }
            if (dist == k-1) {
                if (temp.left != null) {
                    ans.add(temp.left.val);
                }
                if (temp.right != null) {
                    ans.add(temp.right.val);
                }
            }else{
            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }
        }

        }
    }

    // DFS
    public static int find(TreeNode root, TreeNode target, int k, int dist, List<Integer> ans) {
        if (root == null) {
            return -1;
        }
        if (root == target) {
            return 0;
        }
        int leftdist=find(root.left, target, k, dist, ans);
        int rightdist=find(root.right, target, k, dist, ans);
        if (leftdist>-1) {
            dist+=leftdist;
            dist++;
            if (dist == k) {
                ans.add(root.val);
            } else if(root.right!=null) {
                int currdist = dist;
                BFS(root.right, k, currdist, ans);
            }
            return dist;
        } 
        else if (rightdist>-1) {
            dist+=rightdist;
            dist++;
            if (dist == k) {
                ans.add(root.val);
            } else if(root.left!=null){
                int currdist = dist;
                BFS(root.left, k, currdist, ans);
            }
            return dist;
        }
        return -1;
    }

    public static List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> ans = new ArrayList<>();
        if(k==0){
            ans.add(target.val);
            return ans;
        }
        find(root, target, k, 0, ans);
        if(target.left!=null)
        BFS(target.left, k, 0, ans);
        if(target.right!=null)
        BFS(target.right, k, 0, ans);
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        TreeNode root=new TreeNode(0);
        root.left=new TreeNode(1);
        root.right=new TreeNode(6);
        root.left.left=new TreeNode(2);
        root.left.right=new TreeNode(3);
        root.left.left.left=new TreeNode(7);
        root.left.left.right=new TreeNode(4);
         root.left.left.right.right=new TreeNode(5);
        System.out.println(distanceK(root,root.left,3));
        sc.close();
    }
}
