package az.edu.turing.module1.lesson6.DataStructures.tree;

class Node {
    int value;
    Node left, right;

    public Node(int item) {
        value = item;
        left = right = null;
    }
}

class BinarySearchTree {
    Node root;

    BinarySearchTree() {
        root = null;
    }

    void insert(int value) {
        root = insertRec(root, value);
    }

    Node insertRec(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }

        if (value < root.value) {
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }

        return root;
    }

    void inOrder() {
        inOrderRec(root);
    }

    void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.print(root.value + " ");
            inOrderRec(root.right);
        }
    }

    void postOrder() {
        postOrderRec(root);
    }

    void postOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left);
            inOrderRec(root.right);
            System.out.print(root.value + " ");
        }
    }

    void preOrder() {
        preOrderRec(root);
    }

    void preOrderRec(Node root) {
        if (root != null) {
            System.out.print(root.value + " ");
            inOrderRec(root.left);
            inOrderRec(root.right);
        }
    }


    boolean search(int value) {
        return searchRec(root, value);
    }

    boolean searchRec(Node root, int value) {
        if (root == null) {
            return false;  // Base case: found the node or reached the end
        }
        else if (root.value == value){
            return true;
        }

        // Value is smaller than root's value, search in the left subtree
        if (value < root.value) {
            return searchRec(root.left, value);
        }

        // Value is greater than root's value, search in the right subtree
        return searchRec(root.right, value);
    }

    Node findMin(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    // Method to find the node with the maximum value in the tree
    Node findMax(Node node) {
        while (node.right != null) {
            node = node.right;
        }
        return node;
    }

    int findMinValue() {
        if (root == null) throw new IllegalStateException("Tree is empty");
        return findMin(root).value;
    }

    // Public method to find the maximum value in the tree
    int findMaxValue() {
        if (root == null) throw new IllegalStateException("Tree is empty");
        return findMax(root).value;
    }
}