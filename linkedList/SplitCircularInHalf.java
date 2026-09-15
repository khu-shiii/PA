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

    // Insert at end
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

    // Display circular list
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

    // Split circular list into two halves
    static void split(Node head) {

        Node slow = head;
        Node fast = head;

        // Find middle
        while (fast.next != head && fast.next.next != head) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // If even number of nodes
        if (fast.next.next == head) {
            fast = fast.next;
        }

        // Second half starts after slow
        Node head1 = head;
        Node head2 = slow.next;

        // Make first half circular
        slow.next = head1;

        // Make second half circular
        fast.next = head2;

        System.out.println("First Half:");
        display(head1);

        System.out.println("Second Half:");
        display(head2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Node head = null;

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            head = insert(head, data);
        }

        split(head);
    }
}