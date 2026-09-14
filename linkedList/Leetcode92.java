class Solution {
    public void reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode forward = null;
        while(curr != null){
            forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next == null || left == right) return head;
        
        ListNode d = new ListNode(-1);
        d.next = head;
      
        ListNode temp = d;
        for(int i = 1; i < left; i++){
            temp = temp.next;
        }
        ListNode tail1 = temp;
        ListNode head2 = tail1.next;
       
        temp = d;
        for(int i = 1; i <= right; i++){
            temp = temp.next;
        }
        ListNode tail2 = temp;
        ListNode head3 = tail2.next; 
        tail2.next = null;
        tail1.next = null;
        reverse(head2);
        
        
        tail1.next = tail2;  
        head2.next = head3;  
        
        return d.next;
    }
}