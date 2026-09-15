import java.util.*;

class Main {

    static class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
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
        newNode.prev = temp;

        return head;
    }

    static Node insertAfter(Node head, int key, int value) {

        Node temp = head;

        while (temp != null && temp.data != key) {
            temp = temp.next;
        }

        if (temp == null)
            return head;

        Node newNode = new Node(value);

        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null) {
            temp.next.prev = newNode;
        }

        temp.next = newNode;

        return head;
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

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            head = insert(head, sc.nextInt());
        }

        int key = sc.nextInt();
        int value = sc.nextInt();

        head = insertAfter(head, key, value);

        display(head);
    }
}