class LinkedListPrint {

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    Node head;

    public static void print(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
     public static int count(Node head) {
        Node temp = head;
	int count=0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
	 return count;
    }
	public static boolean search(Node head,int target){
	 Node temp = head;

        while (temp != null) {
		if(temp.val==target) return true;
            temp = temp.next;
        }
	return false;

}


    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
	head.next.next.next=new Node(40);

        print(head);
	System.out.println();
	System.out.print(count(head));
        System.out.println();
 	int target=30;
	if(search(head,target)) System.out.println("Found");
	else System.out.println("Not found");



    }
}