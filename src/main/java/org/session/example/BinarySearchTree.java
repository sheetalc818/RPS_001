package org.session.example;

public class BinarySearchTree {
    class Node{
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
    void insert(int data){
        root = insertData(root,data);
    }

    Node insertData(Node root, int data){
        //Tree is null?
        if (root==null)
            root = new Node(data);
        //data is less than root.data, then insert node on left side
        if(data<root.data){
            root.left = insertData(root.left,data);
        }
        //data is greater than root.data, then insert node on right side
        if(data>root.data){
            root.right = insertData(root.right,data);
        }
        return root;
    }

    void display(){
        displayNode(root);
    }

    void displayNode(Node root){
        if (root!=null){
            //displaying left side tree
            displayNode(root.left);
            System.out.println(root.data + ",");
            //displaying the right side tree
            displayNode(root.right);
        }
    }

    Node search(Node root, int key){
        if (root == null || root.data == key)
            return root;
        if (root.data<key){
            return search(root.right,key);
        }
       return search(root.left,key);
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(56);
        tree.insert(30);
        tree.insert(22);
        tree.insert(40);
        tree.insert(11);
        tree.insert(3);
        tree.insert(16);
        tree.insert(70);
        tree.display();
        System.out.println();

        int key = 30 ;
        if (tree.search(tree.root,key)==null){
            System.out.println(key + " not found");
        }else
            System.out.println(key + " found");

        int key1 = 63 ;
        if (tree.search(tree.root,key1)==null){
            System.out.println(key1 + " not found");
        }else
            System.out.println(key1 + " found");
    }

}
