import java.util.*;

public class _2_AddTwoNumbers {

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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = l1;
        int val;
        int r = 0;
        ListNode prev = l1;
        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val;
            val = (sum) % 10;
            l1.val = val + r;
            r = (sum) / 10;
            prev = l1;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1!=null&&r != 0) {
            int sum = l1.val + r;
            val = (sum) % 10;
            l1.val = val;
            r = (sum) / 10;
            l1 = l1.next;
        }
        if (l2 != null) {
            prev.next = l2;
            l1=l2;
            while (l2 != null&&r != 0) {
                int sum = l1.val + r;
            val = (sum) % 10;
            l1.val = val;
            r = (sum) / 10;
            l1 = l1.next;
            }

        }
        if(r!=0){
            ListNode newNode=new ListNode(r,null);
            l1.next=newNode;
        }
        return head;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}