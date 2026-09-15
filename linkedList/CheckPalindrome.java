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

    static boolean isPalindrome(Node head) {

        if (head == null)
            return true;

        Node left = head;
        Node right = head;

        while (right.next != null) {
            right = right.next;
        }

        while (left != right && left.prev != right) {

            if (left.data != right.data) {
                return false;
            }

            left = left.next;
            right = right.prev;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Node head = null;

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            head = insert(head, sc.nextInt());
        }

        if (isPalindrome(head)) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}