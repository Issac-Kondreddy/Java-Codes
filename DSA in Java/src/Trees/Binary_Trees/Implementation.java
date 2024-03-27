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
        System.out.println("The Level order traversal of tree is: ");
        bt.Levelorder();

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

    void Levelorder(){
        int height = Height(root);
        for(int i = 1; i<=height;i++) {
            currentlevel(root, i);
        }
    }

    void currentlevel(Node node, int level){
        if(node==null){
            return;
        }
        if(level==1){
            System.out.print(node.value + " ");
        }
        else if(level>1){
            currentlevel(node.left, level-1);
            currentlevel(node.right, level-1);
        }
    }
}
