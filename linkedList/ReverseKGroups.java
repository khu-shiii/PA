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

    static Node reverseK(Node head, int k) {

        Node current = head;
        Node prev = null;
        Node next = null;

        int count = 0;

        while (current != null && count < k) {

            next = current.next;

            current.next = prev;

            prev = current;
            current = next;

            count++;
        }

        if (next != null) {
            head.next = reverseK(next, k);
        }

        return prev;
    }

    static void display(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Node head = null;

        int size = sc.nextInt();

        for (int i = 0; i < size; i++) {
            head = insert(head, sc.nextInt());
        }

        int k = sc.nextInt();

        head = reverseK(head, k);

        display(head);
    }
}