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

    static Node deleteMiddle(Node head) {

        if (head == null || head.next == null) {
            return null;
        }

        Node slow = head;
        Node fast = head;
        Node prev = null;

        while (fast != null && fast.next != null) {

            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = slow.next;

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

        int size = sc.nextInt();

        for (int i = 0; i < size; i++) {
            head = insert(head, sc.nextInt());
        }

        head = deleteMiddle(head);

        display(head);
    }
}