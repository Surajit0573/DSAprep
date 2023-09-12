import java.util.*;
public class _138_CopyListwithRandomPointer{

    class Node {
        int val;
        Node next;
        Node random;
    
        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        if(head==null){
            return null;
        }
     Node curr=head;
     while(curr!=null){
         Node newnode=new Node(curr.val);
         newnode.next=curr.next;
         newnode.random=curr;
         curr.next=newnode;
         curr=newnode.next;
     }
     curr=head.next;
     while(curr.next!=null){
         if(curr.random.random==null){
             curr.random=null;
         }else{
             curr.random=curr.random.random.next;
         }
         curr=curr.next.next;
     }
      if(curr.random.random==null){
             curr.random=null;
         }else{
             curr.random=curr.random.random.next;
         }
     curr=head;
     Node newhead=curr.next;
     Node temp=newhead;
     while(temp.next!=null){
         curr.next=curr.next.next;
         temp.next=temp.next.next;
         curr=curr.next;
         temp=temp.next;
     }
     curr.next=null;
     return newhead;
  }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}