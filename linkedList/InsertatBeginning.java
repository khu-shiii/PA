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

    static Node insertAtBeginning(Node head, int value) {

        Node newNode = new Node(value);

        if (head == null) {
            newNode.next = newNode;
            return newNode;
        }

        Node temp = head;

        while (temp.next != head) {
            temp = temp.next;
        }

        newNode.next = head;
        temp.next = newNode;

        head = newNode;

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

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Node head = null;

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            head = insert(head, sc.nextInt());
        }

        System.out.println("Before:");
        display(head);

        int value = sc.nextInt();

        head = insertAtBeginning(head, value);

        System.out.println("After:");
        display(head);
    }
}