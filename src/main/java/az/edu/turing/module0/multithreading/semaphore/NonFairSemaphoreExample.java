package az.edu.turing.module0.multithreading.semaphore;

import java.util.concurrent.Semaphore;

public class NonFairSemaphoreExample {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1); // Only 1 permit, fairness=false by default.

        Runnable task = () -> {
            while (true) {
                try {
                    semaphore.acquire(); // Try to acquire the permit
                    System.out.println(Thread.currentThread().getName() + " acquired permit.");
                    Thread.sleep(100);  // Simulate work
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                } finally {
                    System.out.println(Thread.currentThread().getName() + " released permit.");
                    semaphore.release(); // Release the permit
                }
            }
        };

        Thread highPriorityThread = new Thread(task, "High-Priority Thread");
        Thread lowPriorityThread = new Thread(task, "Low-Priority Thread");

        // Start both threads
        highPriorityThread.start();
        lowPriorityThread.start();
    }
}

