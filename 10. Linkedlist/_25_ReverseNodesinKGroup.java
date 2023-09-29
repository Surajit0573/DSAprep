import java.util.*;

public class _25_ReverseNodesinKGroup {

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

    public ListNode reverseKGroup(ListNode head, int k) {
        if(k==1){
            return head;
        }
        ListNode start=head;
        ListNode end=head;
        ListNode p=null;
        int count=1;
        boolean flag=true;
        while(end!=null){
            if(count<k){
                count++;
                end=end.next;
            }
            else if(count==k){
                if(flag){
                    head=end;
                    flag=false;
                }
                count=1;
                ListNode prev=end.next;
                ListNode curr=start;
                ListNode next;
               while(curr!=end){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
               }
                next=curr.next;
                curr.next=prev;
                if(p!=null){
                    p.next=end;
                }
                p=start;
                start=end=next;
                
            }
        }
        return head;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}