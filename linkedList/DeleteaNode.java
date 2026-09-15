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

        if (head == null) {
            newNode.next = newNode;
            return newNode;
        }

        Node temp = head;

        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;

        return head;
    }

    static Node delete(Node head, int value) {

        if (head == null) {
            return null;
        }

        // Delete head
        if (head.data == value) {

            // Only one node
            if (head.next == head) {
                return null;
            }

            Node temp = head;

            while (temp.next != head) {
                temp = temp.next;
            }

            temp.next = head.next;
            head = head.next;

            return head;
        }

        Node temp = head;

        while (temp.next != head) {

            if (temp.next.data == value) {
                temp.next = temp.next.next;
                return head;
            }

            temp = temp.next;
        }

        return head;
    }

    static void display(Node head) {

        if (head == null) {
            return;
        }

        Node temp = head;

        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Node head = null;

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            head = insert(head, sc.nextInt());
        }

        int value = sc.nextInt();

        head = delete(head, value);

        display(head);
    }
}