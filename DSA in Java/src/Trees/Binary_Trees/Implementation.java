package Trees.Binary_Trees;

public class Implementation {
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
        System.out.println(bt.Height(bt.root));

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

    int Height(Node node){
        if(node == null){
            return 0;
        }
        else{
            int ldepth = Height(node.left);
            int rdepth = Height(node.right);
            if(ldepth>rdepth){
                return ldepth+1;
            }
            else{
                return rdepth+1;
            }
        }
    }
}
