import java.util.*;

public class _173_BinarySearchTreeIterator {

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

    class BSTIterator {
        ArrayList<Integer>arr;
        int i;
        public static void inorder(TreeNode root,List<Integer>arr){
            if(root==null){
                return;
            }
            if(root.left!=null){
                inorder(root.left, arr);
            }
            arr.add(root.val);
            if(root.right!=null){
                inorder(root.right, arr);
            }
        }

        public BSTIterator(TreeNode root) {
            i=-1;
            arr=new ArrayList<>();
            inorder(root, arr);

        }
        
        public int next() {
            i++;
            return arr.get(i);
        }
        
        public boolean hasNext() {
            return i+1<arr.size();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}