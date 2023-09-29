import java.util.*;

public class _142_LinkedListCycle_II {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode detectCycle(ListNode head) {
        if(head==null||head.next==null||head.next.next==null){
            return null;
        }
        ListNode slow=head.next;
        ListNode fast=head.next.next;
        while(slow!=fast){
            if(slow==null||fast==null){
                return null;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        fast=head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}