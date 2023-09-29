import java.util.*;

public class _19_RemoveNthNodeFromEndofList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null||head==null){
            return null;
        }
       ListNode slow=head;
       ListNode fast=head;
       while(n-->0){
           fast=fast.next;
       }
       if(fast==null){
           return head.next;
       }
       while(fast.next!=null){
           slow=slow.next;
           fast=fast.next;
       }
       
       slow.next=slow.next.next;
       return head;
   }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}