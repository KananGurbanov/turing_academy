package az.edu.turing.module01.part2.lesson6.Collections;

public class LinkedListApp {
    public static void main(String[] args) {
        Node<Integer> ten = new Node<>(10);

        LinkedList<Integer> myLinkedList = new LinkedList<>(ten);

        Node<Integer> twelve = new Node<>(12);

        Node<Integer> eight = new Node<>(8);

        System.out.println(myLinkedList);

        Node<Integer> five = new Node<>(5);

        //myLinkedList.addTail(ten);
        myLinkedList.addTail(eight);
        myLinkedList.addHead(twelve);
        myLinkedList.addHead(five);
        System.out.println(myLinkedList.get(3));
        myLinkedList.deleteIndex(3);
        myLinkedList.update(1,14);
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.getSize());
    }
}
