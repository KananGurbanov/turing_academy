package az.edu.turing.module01.lesson6.Collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApp {
    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>();

        q.add(3);
        q.offer(4);
        System.out.println(q.peek());
        q.add(5);
        q.poll();

        System.out.println(q);


    }
}
