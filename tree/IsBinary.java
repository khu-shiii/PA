class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class Main {
    static boolean isBinaryTree(Node root) {
        if (root == null) {
            return true;
        }
        return (root.left == null || root.left != null) && (root.right == null || root.right != null);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        System.out.println(isBinaryTree(root));
    }
}