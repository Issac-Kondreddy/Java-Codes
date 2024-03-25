package Trees;

public class Implementation {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
    }

}
class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree {
    TreeNode root;

    void printInOrder(TreeNode node) {
        if (node == null) return;
        printInOrder(node.left);
        System.out.print(node.value + " ");
        printInOrder(node.right);
    }

    void printPreOrder(TreeNode node) {
        if (node == null) return;
        System.out.print(node.value + " ");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }

    void printPostOrder(TreeNode node) {
        if (node == null) return;
        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.print(node.value + " ");
    }
}

