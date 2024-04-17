package az.edu.turing.module01.part2.lesson6.Collections;

public class LinkedListApp {
    public static void main(String[] args) {


        LinkedList<Integer> myLinkedList = new LinkedList<>(10);


        System.out.println(myLinkedList);


        myLinkedList.addTail(12);

        myLinkedList.addHead(8);

        myLinkedList.addHead(6);

        System.out.println(myLinkedList.get(3));

        myLinkedList.deleteItem(10);

        myLinkedList.update(1,14);
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.getSize());
    }
}
