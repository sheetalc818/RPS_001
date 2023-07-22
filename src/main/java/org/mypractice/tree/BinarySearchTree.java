package org.mypractice.tree;

public class BinarySearchTree {
    class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    Node root;

    void insert(int data) {
        root = insertData(root, data);
    }

    Node insertData(Node root, int data) {
        // Insert a new node if tree is empty
        if (root == null) {
            root = new Node(data);
        }
        /*
         * If data is less than the root node
         * then insert the data to left of the root
         * node
         */
        if (data < root.data) {
            root.left = insertData(root.left, data);
        }
        /*
         * If data is greater than the root node
         * then insert the data to right of the
         * root node
         */
        else if (data > root.data) {
            root.right = insertData(root.right, data);

        }
        return root;
    }

    void display() {
        displayNode(root);
    }

    void displayNode(Node root) {
        // Traversing the tree
        if (root != null) {
            // Displaying the left elements of the root node
            displayNode(root.left);

            // Displaying the root node
            System.out.print(root.data + ",");

            // Displaying the right elements of the root node
            displayNode(root.right);
        }

    }

    // Utility function to search a key in a BST
    Node search(Node root, int key) {
        // Base Cases: root is null or data is present at root
        if (root == null || root.data == key)
            return root;

        // Key is greater than root's key
        if (root.data < key)
            return search(root.right, key);

        // Key is smaller than root's key
        return search(root.left, key);
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        System.out.println();
        System.out.println("BINARY SEARCH TREE");

        tree.insert(56);
        tree.insert(30);
        tree.insert(70);

        tree.display();

        System.out.println();
        // Key to be found
        int key = 3;

        // Searching in a BST
        if (tree.search(tree.root, key) == null)
            System.out.println(key + " not found");
        else
            System.out.println(key + " found");

        key = 70;

        // Searching in a BST
        if (tree.search(tree.root, key) == null)
            System.out.println(key + " not found");
        else
            System.out.println(key + " found");
    }
}
