
import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

class Main {
    static int Height(Node root) {
        if(root==null) return 0;
        return 1+Math.max(Height(root.left),Height(root.right));
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.right = new Node(70);

        System.out.println(Height(root));
    }
}
