/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        ListNode forward=null;
        while(curr!=null){
            forward=curr.next;
            curr.next=prev;
            prev=curr;
           curr=forward;
        }
        return prev;


    }
    public void reorderList(ListNode head) { 
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode temp=slow.next;
        slow.next=null;
        temp=reverse(temp);
        ListNode t1=head.next;
        ListNode t2=temp;
        ListNode t=head;
        while(t2!=null){
            t.next=t2;
            t2=t2.next;
            t=t.next;

            t.next=t1;
            t=t.next;
            t1=t1.next;
        }

        // return dummy.next;
    }
}