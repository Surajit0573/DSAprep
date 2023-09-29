import java.util.*;

public class _61_RotateList {

    public class ListNode {
            int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
             
    public ListNode rotateRight(ListNode head, int k) {
        int size=1;
        
        ListNode curr=head;
        while(curr.next==null){
            curr=curr.next;
            size++;
        }
        curr.next=head;
        int count=size-k;
        while(count-->0){
            curr=curr.next;
        }
        ListNode ans=curr.next;
        curr.next=null;
        return ans;
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}