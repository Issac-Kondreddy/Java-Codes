package Trees;

import java.util.Stack;

public class Traversals {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.root = new Node(8);
        bt.root.left = new Node(6);
        bt.root.left.left = new Node(5);
        bt.root.left.left.left = new Node(3);
        bt.root.left.right = new Node(7);
        bt.root.right = new Node(10);
        bt.root.right.left = new Node(9);
        bt.root.right.right = new Node(11);
        bt.Inorder(bt.root);
        System.out.println();
        bt.Preorder(bt.root);
        System.out.println();
        bt.Postorder(bt.root);
        System.out.println();
        bt.InorderwithoutRecursion(bt.root);
    }
}

class Node{
    int value;
    Node left;
    Node right;
    Node(int value){
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree{
    Node root;

    BinaryTree(){
        this.root = null;
    }

    void Inorder(Node node){
        if(node==null){
            return;
        }
        Inorder(node.left);
        System.out.print(node.value + " ");
        Inorder(node.right);
    }

    void Preorder(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.value + " ");
        Preorder(node.left);
        Preorder(node.right);
    }

    void Postorder(Node node){
        if(node==null){
            return;
        }
        Postorder(node.left);
        Postorder(node.right);
        System.out.print(node.value + " ");
    }

    void InorderwithoutRecursion(Node node){
        if(node==null){
            return;
        }
        Stack<Node> s = new Stack<>();

        Node current = root;
        while(current!=null || s.size()>0) {
            while (current != null) {
                s.push(current);
                current = current.left;
            }
            current = s.pop();
            System.out.print(current.value + " ");
            current = current.right;
        }
    }
}
