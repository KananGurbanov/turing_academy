package az.edu.turing.module0.multithreading;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class NeedOfConcurrentCollectionsDemo {

    public static void main(String[] args) throws InterruptedException {
        CopyOnWriteArrayList<Integer> numbers = new CopyOnWriteArrayList<>();

        Thread writer = new Thread(() -> addNumbers(numbers));
        writer.start();

        addNumbers(numbers); // add number from the main thread

        writer.join(); // wait for writer thread

        System.out.println(numbers.size()); // the result can be any
    }

    private static void addNumbers(CopyOnWriteArrayList<Integer> target) {
        for (int i = 0; i < 100_000; i++) {
            target.add(i);
        }
    }
}
