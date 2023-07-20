import java.util.*;

public class _445_AddTwoNumbersII {

    public static class ListNode {
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

    public static ListNode reverse(ListNode l) {
        ListNode curr = l;
        ListNode next;
        ListNode prev = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static ListNode add(ListNode l1, ListNode l2) {
        int val = l1.val + l2.val;
        ListNode ans = new ListNode(val % 10);
        int r = val / 10;
        l1 = l1.next;
        l2 = l2.next;
        while (l1 != null && l2 != null) {
            val = l1.val + l2.val + r;
            ans = new ListNode(val % 10, ans);
            r = val / 10;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l2 != null) {
             val=l2.val+r;
            ans = new ListNode(val%10, ans);
            r = val/10;
            l2 = l2.next;
        }
        while (l1 != null) {
            val=l1.val+r;
            ans = new ListNode(val%10, ans);
            r = val/10;
            l1 = l1.next;
        }
        if(r!=0){
            ans = new ListNode(r, ans);
        }
        return ans;
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        l2 = reverse(l2);
        l1 = reverse(l1);
        return add(l1, l2);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        ListNode ans = addTwoNumbers(l1, l2);
        while (ans != null) {
            System.out.println(ans.val);
            ans = ans.next;
        }
        sc.close();
    }
}