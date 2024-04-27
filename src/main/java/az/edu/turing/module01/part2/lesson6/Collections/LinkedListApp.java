package az.edu.turing.module01.part2.lesson6.Collections;

public class LinkedListApp {
    public static void main(String[] args) {


        LinkedList<Integer> myLinkedList = new LinkedList<>(10);



        myLinkedList.addTail(12);

        myLinkedList.addHead(8);

        myLinkedList.addHead(6);





        myLinkedList.insert(1,14);



        System.out.println(myLinkedList);

    }
}
