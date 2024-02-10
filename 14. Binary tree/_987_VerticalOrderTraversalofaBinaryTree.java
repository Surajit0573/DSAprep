import java.util.*;

public class _987_VerticalOrderTraversalofaBinaryTree {

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
        TreeNode node;
        int row;
        int col;
        pair(TreeNode node,int row,int col){
            this.node=node;
            this.row=row;
            this.col=col;
        }
    }

    public static class sort implements Comparable<sort>{
        int val;
        int row;
        sort(int val,int row){
            this.val=val;
            this.row=row;
        }

        public int compareTo(sort s){
            if(this.row!=s.row){
                return this.row-s.row;
            }else{
                return this.val-s.val;
            }
        }
    }
    public static void levelorder(TreeNode root, TreeMap<Integer,List<sort>>tm){
        Queue<pair>que=new LinkedList<>();
        que.add(new pair(root, 0, 0));
        while(!que.isEmpty()){
            pair curr=que.remove();
            if(curr.node.left!=null){
                que.add(new pair(curr.node.left,curr.row+1,curr.col-1));
            }
             if(curr.node.right!=null){
                que.add(new pair(curr.node.right,curr.row+1,curr.col+1));
            }
            if(tm.containsKey(curr.col)){
                tm.get(curr.col).add(new sort(curr.node.val,curr.row));
            }else{
                List<sort>ls=new ArrayList<>();
                ls.add(new sort(curr.node.val,curr.row));
                tm.put(curr.col, ls);
            }
        }
    }
   

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer,List<sort>>tm=new TreeMap<>();
       levelorder(root, tm);
         List<List<Integer>>ans=new ArrayList<>();
         for (Integer key : tm.keySet()) {

          List<sort>curr=tm.get(key);
          Collections.sort(curr);
          List<Integer>ls=new ArrayList<>();
          for(sort i:curr){
            ls.add(i.val);
          }
          ans.add(ls);
           
        }
        System.out.println(ans);
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}