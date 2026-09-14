   
class LinkedListReverse {

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    Node head;

public static Node reverse(Node head){
	Node prev=null;
	Node curr=head;
	Node forward=null;
	while(curr!=null){
	forward=curr.next;
	curr.next=prev;
	prev=curr;
	curr=forward;
	
	}
	return prev;

}
public static void print(Node head){
Node temp=head;
while(temp!=null){
	System.out.print(temp.val+" ");
	temp=temp.next;
	}
}



 public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
	head.next.next.next=new Node(40);
 	print(head);
	Node newHead=reverse(head);
	System.out.println();
	print(newHead);


}
    }