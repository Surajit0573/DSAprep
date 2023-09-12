import java.util.*;

public class _21_MergeTwoSortedLists {
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

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode curr;
        ListNode head;
        if(list1.val>list2.val){
            curr=list2;
            list2=list2.next;
        }else{
            curr=list1;
            list1=list1.next;
        }
        head=curr;
        while(curr!=null){
            if(list1.val>list2.val){
                curr.next=list2;
                list2=list2.next;
                curr.next.next=list1;
            }else{
                 curr.next=list1;
                list1=list1.next;
                curr.next.next=list2;
            }
            curr=curr.next;
        }
        return head;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}