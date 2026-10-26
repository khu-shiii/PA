import java.util.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
    }
}
class Main {
    static void inorder(Node root){
        if(root==null) return;
        System.out.println(root.data);
        inorder(root.left);
        inorder(root.right);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        inorder(root);
    }
}
