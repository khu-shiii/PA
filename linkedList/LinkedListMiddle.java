   
class LinkedListMiddle {

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    Node head;

public static int middle(Node head){
	 Node slow = head;
	Node fast=head;


        while (fast != null && fast.next!=null) {
            slow = slow.next;
	fast=fast.next.next;
        }
	return slow.val;

}


 public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
	head.next.next.next=new Node(40);
 	
	System.out.print(middle(head));


}
    }