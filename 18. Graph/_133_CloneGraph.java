import java.util.*;
public class _133_CloneGraph{

    static class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

    public static Node create (Node node,HashMap<Node,Node>hs){
        if(hs.containsKey(node)){
         return hs.get(node);
         }
        Node newnode =new Node(node.val);
        List<Node>list=new ArrayList<>();
        for(int i=0;i<node.neighbors.size();i++){
            list.add(create(node.neighbors.get(i), hs));
        }
        node.neighbors=list;
        hs.put(node,newnode);
        return newnode;

    } 


    public Node cloneGraph(Node node) {
        HashMap<Node,Node>hs=new HashMap<>();
        return create(node, hs);

    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}
