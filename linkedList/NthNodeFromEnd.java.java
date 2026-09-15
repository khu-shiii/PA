import java.util.*;

class Main {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node insert(Node head, int data) {

        Node newNode = new Node(data);

        if (head == null)
            return newNode;

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;

        return head;
    }

    static int nthFromEnd(Node head, int n) {

        Node fast = head;
        Node slow = head;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow.data;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Node head = null;

        int size = sc.nextInt();

        for (int i = 0; i < size; i++) {
            head = insert(head, sc.nextInt());
        }

        int n = sc.nextInt();

        System.out.println(nthFromEnd(head, n));
    }
}