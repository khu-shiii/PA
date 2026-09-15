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

    static int findMax(Node head) {

        if (head == null) {
            return Integer.MIN_VALUE;
        }

        int max = head.data;

        Node temp = head.next;

        while (temp != head) {

            if (temp.data > max) {
                max = temp.data;
            }

            temp = temp.next;
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Node head = null;

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            head = insert(head, sc.nextInt());
        }

        System.out.println(findMax(head));
    }
}