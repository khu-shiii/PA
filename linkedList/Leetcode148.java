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
    public ListNode sortList(ListNode head) {
        if(head==null) return head;
        if(head.next==null) return head;

        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null ) {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode a=slow.next;
        slow.next=null;
        head=sortList(head);
        a=sortList(a);
        return merge(head,a);


    }
    public ListNode merge(ListNode list1, ListNode list2) {
        ListNode temp1=list1;
        ListNode temp2=list2;
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        while(temp1!=null && temp2!=null){
            if(temp1.val<=temp2.val){
                temp.next=temp1;
                temp=temp.next;
                temp1=temp1.next;
            }
            else{
                temp.next=temp2;
                temp=temp.next;
                temp2=temp2.next;
            }
        }
        if(temp1==null){
            temp.next=temp2;
        }
        if(temp2==null){
            temp.next=temp1;
        }
        return dummy.next;
    }
}