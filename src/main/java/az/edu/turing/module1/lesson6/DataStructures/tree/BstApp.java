package az.edu.turing.module1.lesson6.DataStructures.tree;



public class BstApp {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        System.out.println("In-order traversal of the BST:");
        bst.inOrder();

        System.out.println();
        System.out.println("Post-Order traversal of the BST:");
        bst.postOrder();

        System.out.println();
        System.out.println("Pre-Order traversal of the BST:");
        bst.preOrder();

        System.out.println("\n\nSearching for 60 in the BST: " + bst.search(60));
        System.out.println("Searching for 25 in the BST: " + bst.search(25));
        System.out.println(bst.findMaxValue());

    }

}
