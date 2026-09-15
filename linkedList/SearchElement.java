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

    static boolean search(Node head, int value) {

        if (head == null) {
            return false;
        }

        Node temp = head;

        do {
            if (temp.data == value) {
                return true;
            }

            temp = temp.next;

        } while (temp != head);

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Node head = null;

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            head = insert(head, sc.nextInt());
        }

        int value = sc.nextInt();

        if (search(head, value)) {
            System.out.println("Found");
        }
        else {
            System.out.println("Not Found");
        }
    }
}