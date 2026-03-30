package Module13;
class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class Mod13 {

    // Insert
    static Node insert(Node root, int key) {
        if (root == null) return new Node(key);

        if (key < root.data)
            root.left = insert(root.left, key);
        else
            root.right = insert(root.right, key);

        return root;
    }

    // Search
    static boolean search(Node root, int key) {
        if (root == null) return false;

        if (root.data == key) return true;

        if (key < root.data)
            return search(root.left, key);
        else
            return search(root.right, key);
    }

    // Min
    static int findMin(Node root) {
        while (root.left != null)
            root = root.left;
        return root.data;
    }

    // Max
    static int findMax(Node root) {
        while (root.right != null)
            root = root.right;
        return root.data;
    }

    // Delete
    static Node delete(Node root, int key) {
        if (root == null) return null;

        if (key < root.data)
            root.left = delete(root.left, key);
        else if (key > root.data)
            root.right = delete(root.right, key);
        else {
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            root.data = findMin(root.right);
            root.right = delete(root.right, root.data);
        }
        return root;
    }

    // Check BST
    static boolean isBST(Node root, int min, int max) {
        if (root == null) return true;

        if (root.data <= min || root.data >= max)
            return false;

        return isBST(root.left, min, root.data) &&
                isBST(root.right, root.data, max);
    }

    public static void main(String[] args) {

        Node root = null;

        // Q1 Insert elements
        root = insert(root, 50);
        root = insert(root, 30);
        root = insert(root, 70);
        root = insert(root, 20);
        root = insert(root, 40);
        root = insert(root, 60);
        root = insert(root, 80);

        // Q2 Search
        System.out.println("Search 40: " + search(root, 40));

        // Q3 Min & Max
        System.out.println("Min: " + findMin(root));
        System.out.println("Max: " + findMax(root));

        //Q4 Delete
        root = delete(root, 20);
        System.out.println("Deleted 20");

        // Q5 Check BST
        System.out.println("Is Valid BST: " + isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }
}