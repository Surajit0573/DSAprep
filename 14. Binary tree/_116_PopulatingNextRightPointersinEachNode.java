import java.util.*;

import javax.swing.tree.TreeNode;
public class _116_PopulatingNextRightPointersinEachNode{

    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;
    
        public Node() {}
        
        public Node(int _val) {
            val = _val;
        }
    
        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };


    public Node connect(Node root) {
         Queue<Node> que = new LinkedList<>();
        if(root==null){
            return root;
        }
       
        que.add(root);
        que.add(null);
        while (!que.isEmpty()) {
           Node curr = que.remove();
            if (curr == null) {
                if (que.peek() == null) {
                    break;
                } else {
                    que.add(null);
                }
            } else {
                curr.next=que.peek();
                if (curr.left != null) {
                    que.add(curr.left);
                }
                if (curr.right != null) {
                    que.add(curr.right);
                }
            }
        }return root;
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}