package Trees.AVL;

public class AVL{
    class Node{
        int value;
        Node left;
        Node right;
        int height;
        Node(int value){
            this.value = value;
            this.left = null;
            this.right = null;
            this.height = 1;
        }
    }
    Node root;

    int height(Node n){ //to get height of Node given using recursion
        if(n==null){
            return 0;
        }
        return n.height;
    }
    int max(int a, int b){ // to get maximum of two values used in calculation of height
        if (a > b) return a;
        return b;
    }

    int balancefactor(Node n){ //balance factor calculation of each node it should be either -1 or 1 or 0 to make tree balanced
        if(n==null){
            return 0;
        }
        return height(n.left) - height(n.right);
    }

    Node insertion(Node n, int value){ //insertion function requires two arguments node which is root, and value to be inserted
        //if node found is null create a new node and attach value to it.
        if(n==null){
            return (new Node(value)); // if tree is empty make a root node
        }
        /**if tree is not empty then check if value is less than or greater than root node
         * if less than root node then go to left side of tree and check again recursivelu left side until node is null
         * if greater than root node go to right side and check again recursivelu right side until node is null
         */
        if(value<n.value){
            n.left = insertion(n.left, value);
        }
        else if(value>n.value){
            n.right = insertion(n.right, value);
        }
        else{
            return n;
        }
        /**
         * now after insertion since it is a AVL we should check
         * whether tree is balanced or not
         * for that balance factor is in need.
         */
        n.height = 1 + max(height(n.left), height(n.right));

        int balance = balancefactor(n);
        /**
         * if tree is unbalanced i.e if b>1 or b<-1 then we have 4 cases to make it balanced
         * case 1: left and left
         */
        if(balance>1 && value<n.left.value){
            return rightRotate(n);
        }
        /**
         * case 2: right and right
         */
        if(balance<-1 && value>n.right.value){
            return leftRotate(n);
        }
        /**
         * left and right
         */
        if(balance > 1 && value>n.left.value){
            n.left = leftRotate(n.left);
            return rightRotate(n);
        }
        /**
         * right and left
         */
        if(balance<-1 && value<n.right.value){
            n.right = rightRotate(n.right);
            return leftRotate(n);
        }
        return n;
    }

    /**
     *Left Rotation
     */
    Node leftRotate(Node x){
        /**
         * x
         *  \
         *    y
         *     \
         *      z
         */
        Node y = x.right;
        Node T2 = y.left;
        //rotations performed
        /**
         *     y
         *    / \
         *   x   z
         */
        y.left = x;
        x.right = T2;
        //heights updated
        x.height = max(height(x.left), height(x.right)) + 1;
        y.height =  max(height(y.left), height(y.right)) + 1;

        return y;
    }

    /**
     *right rotation
     */
    Node rightRotate(Node y){
        Node x = y.left;
        Node T2 = x.right;
        //rotation starts
        x.right = y;
        y.left = T2;
        //updating heights
        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;

        return x;
    }

    void Preorder(Node n){
        if(n!=null){
            System.out.print(n.value + " ");
            Preorder(n.left);
            Preorder(n.right);
        }
    }

    public static void main(String[] args) {
        AVL tree = new AVL();
        tree.root = tree.insertion(tree.root, 10);
        tree.root = tree.insertion(tree.root, 20);
        tree.root = tree.insertion(tree.root, 30);
        tree.root = tree.insertion(tree.root, 40);
        tree.root = tree.insertion(tree.root, 50);
        tree.root = tree.insertion(tree.root, 25);
        tree.root = tree.insertion(tree.root, 26);
        tree.root = tree.insertion(tree.root, 100);
        System.out.println("Preorder traversal" +
                " of constructed tree is : ");
        tree.Preorder(tree.root);
        System.out.println(tree.height(tree.root));
    }



}
