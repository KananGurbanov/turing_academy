package az.edu.turing.module01.part2.lesson6;


import java.util.Scanner;

public class LinkedList <T> {
    Node <T> head;
    Node <T> tail;

    private int size;

    public LinkedList(Node<T> head) {
        this.head = head;
        this.size++;
    }

    public int getSize() {
        return size;
    }

    boolean isEmpty(){
        return head == null;
    }

    Node <T> get(int index){
        Node<T> temp = head;
        int indice = 0;
        if(index >= getSize()){
            System.out.println("Index out of bound");
        }
        else{
            while(indice<index){
                temp = temp.getNext();
                indice++;
            }
        }
        return temp;

    }

    void deleteIndex(int index){
        Node<T> temp = head;
        int indice = 0;

        if(index >= getSize()){
            System.out.println("Index out of bound");
        }

        else if (index == 0){
            deleteFirst();
        }


        else{
            while(index > indice + 1){
                temp = temp.getNext();
                indice++;
            }

            temp.setNext(temp.getNext().getNext());
            size--;
        }

    }

    void addTail(Node <T> tail){
        Node <T> temp = head;
        while(temp.getNext() != null){
            temp = temp.getNext();
        }

        temp.setNext(tail);
        this.tail = tail;
        size++;
    }

    void addHead(Node<T> head){
        if(tail == null){
            this.head = tail = head;
        }
        else{
            head.setNext(this.head);
//            Node<T> temp = head;
//            head = this.head;
            this.head = head;
            size++;
        }

    }

    void deleteItem(Node <T> node){
        if(node.hashCode() == head.hashCode()){
            deleteFirst();
        }
        else if(node.hashCode() == tail.hashCode()){
            deleteLast();
        }
        else{
            Node<T> curr = head;
            while(curr.getNext()!= null){
                if(curr.getNext().equals(node)){
                    curr.setNext(curr.getNext().getNext());
                }
                curr = curr.getNext();
            }
            size--;
        }

    }

//    void deleteItem(Node<T> node) {
//        Node<T> curr = head;
//        while (curr != null && curr.getNext() != null) {
//            if (curr.getNext().equals(node)) {
//                curr.setNext(curr.getNext().getNext());
//                size--;
//
//            }
//            curr = curr.getNext();
//        }
//    }
    void update(int index ,T newData){
        get(index).setData(newData);
    }

    void deleteFirst(){
        head = head.getNext();
        size--;
    }

    void deleteLast(){
        Node<T> temp = head;
        while(temp.getNext().getNext() != null){
            temp = temp.getNext();
        }
        tail = temp;
        temp.setNext(null);

        size--;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        Node<T> curr = head;

        while(curr != null){
            string.append(curr.toString());
            curr = curr.getNext();
        }

        return string.toString();


    }
}
