package az.edu.turing.module01.lesson6.Collections.queue;

import java.util.*;
import java.util.LinkedList;

public class QueueApp {
    public static void main(String[] args) {
        Queue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        Deque<Integer> dequeLinkedList = new LinkedList<>();
        Deque<Integer> arrayDeque = new ArrayDeque<>();
    }
}
