package Module12;
class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class Mod12 {

    static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    static void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    static void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }

    static int height(Node root) {
        if (root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    static int countNodes(Node root) {
        if (root == null) return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        //Q1
        System.out.print("Inorder: ");
        inorder(root);

        //Q2
        System.out.print("\nPreorder: ");
        preorder(root);

        //Q3
        System.out.print("\nPostorder: ");
        postorder(root);

        //Q4
        System.out.println("\nHeight: " + height(root));
        //Q5
        System.out.println("Total Nodes: " + countNodes(root));
    }
}