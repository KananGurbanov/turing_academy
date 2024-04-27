package az.edu.turing.module01.part2.lesson6.Collections;

import java.util.Objects;

class Node <T>{
    private  T data;

    private Node <T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    public Node(T data, Node<T> x){
        this.setData(data);
        this.setNext(x);
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node<?> node = (Node<?>) o;
        return Objects.equals(data, node.data) && Objects.equals(next, node.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, next);
    }

    @Override
    public String toString() {
        return "data=" + data + "-->";
    }
}


public class LinkedList <T> {
    Node<T> head;
    Node <T> tail;

    private int size;

    public LinkedList(T head) {
        this.head = new Node<>(head);
        this.size++;
    }

    public int getSize() {
        return size;
    }

    boolean isEmpty(){
        return head == null;
    }

    T get(int index){
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
        return temp.getData();

    }



    void addTail(T data){
        Node <T> tail = new Node<>(data);
        Node <T> temp = head;
        while(temp.getNext() != null){
            temp = temp.getNext();
        }
        temp.setNext(tail);
        this.tail = tail;
        size++;
    }
    void addHead(T data){
        this.head = new Node<>(data, this.head);

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

    void deleteItem(T data){
        Node <T> node = new Node<>(data);
        if(node.hashCode() == head.hashCode()){
            deleteFirst();
        }
        else{
            Node<T> curr = head;
            while(curr.getNext()!= null){
                if(curr.getNext().getData() == (node.getData())){
                    curr.setNext(curr.getNext().getNext());
                    size--;
                    break;
                }
                curr = curr.getNext();
            }

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


    void insert (int index, T data){
        if(index >= getSize() || index <0){
            System.out.println("Index out of bound exception");
        }
        else{
            Node<T> newNode = new Node<>(data);
            Node<T> temp = head;
            int i = 0;

            while(i + 1 < index){
                temp = temp.getNext();
            }
            Node<T> next = temp.getNext();
            temp.setNext(newNode);
            newNode.setNext(next);
        }



    }
    void update(int index ,T newData){
        if(index >= getSize() || index < 0){
            System.out.println("Index out of bound exception");
        }
        else{
            Node <T> temp = head;
            int indice = 0;

            while(indice < index){
                temp = temp.getNext();
                indice++;
            }

            temp.setData(newData);
        }

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
