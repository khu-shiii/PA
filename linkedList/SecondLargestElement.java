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

    static int secondLargest(Node head) {

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        Node temp = head;

        while (temp != null) {

            if (temp.data > largest) {
                second = largest;
                largest = temp.data;
            }
            else if (temp.data > second && temp.data != largest) {
                second = temp.data;
            }

            temp = temp.next;
        }

        return second;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Node head = null;

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            head = insert(head, sc.nextInt());
        }

        System.out.println(secondLargest(head));
    }
}