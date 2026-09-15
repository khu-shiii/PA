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

    static Node reverse(Node head) {

        Node temp = head;
        Node newHead = null;

        while (temp != null) {

            newHead = temp;

            Node t = temp.next;
            temp.next = temp.prev;
            temp.prev = t;

            temp = temp.prev;
        }

        return newHead;
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

        head = reverse(head);

        display(head);
    }
}