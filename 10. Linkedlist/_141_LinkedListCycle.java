import java.util.*;
public class _141_LinkedListCycle{
    class ListNode {
             int val;
             ListNode next;
             ListNode(int x) {
                 val = x;
                next = null;
             }
         }
    public boolean hasCycle(ListNode head) {
         if(head==null||head.next==null){
            return false;
         }
       ListNode slow=head;
       ListNode fast=head.next.next;
       while(slow!=fast){
        slow=slow.next;
        fast=fast.next.next;
        if(fast==null){
            return false;
        }
       } 
      return true;
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}