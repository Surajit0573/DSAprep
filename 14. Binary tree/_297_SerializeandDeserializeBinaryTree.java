import java.util.*;

public class _297_SerializeandDeserializeBinaryTree {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public class Codec {

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
           Queue<TreeNode> que = new LinkedList<>();
           String s="";
            if(root==null){
                return "";
            }
            que.add(root);
            s=s+root.val+" ";
            que.add(null);
            while (!que.isEmpty()) {
                TreeNode curr = que.remove();
                if (curr == null) {
                    if (que.peek() == null) {
                        break;
                    } else {
                        que.add(null);
                    }
                } else {
                    if (curr.left != null) {
                        que.add(curr.left);
                        s=s+curr.left.val+" ";
                    }else{
                        s=s+"2000"+" ";
                    }
                    if (curr.right != null) {
                        que.add(curr.right);
                        s=s+curr.right.val+" ";
                    }else{
                          s=s+"2000"+" ";
                    }
                }
            }
            System.out.println(s);
            return s;
        }
    
        public static TreeNode create(ArrayList<Integer> arr,int i){
            Queue<TreeNode>que=new LinkedList<>();
            if(arr.size()==0){
                return null;
            }
            TreeNode root=new TreeNode(arr.get(i));
            que.add(root);
            i++;
            while(!que.isEmpty()){
                TreeNode curr=que.remove();
                if(arr.get(i)==2000){
                    curr.left=null;
                }else{
                curr.left=new TreeNode(arr.get(i));
                que.add(curr.left);
                }
                i++;
                if(arr.get(i)==2000){
                    curr.right=null;
                }else{
                curr.right=new TreeNode(arr.get(i));
                que.add(curr.right);
                }
                i++;
            }
            return root;
        }
        // Decodes your encoded data to tree.
        public TreeNode deserialize(String s) {
            ArrayList<Integer> arr=new ArrayList<>();
            int i=0;
            for(int j=1;j<s.length();j++){
                if(s.charAt(j)==' '){
                    arr.add(Integer.parseInt(s.substring(i, j)));
                    i=j+1;
                }
            }
            System.out.println(arr);
            return create(arr, 0);

        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}