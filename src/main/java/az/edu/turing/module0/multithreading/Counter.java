package az.edu.turing.module0.multithreading;

public class Counter {

    private int value;

    public synchronized void increment() {
        value++;
    }

    public int getValue() {
        return value;
    }
}

class MyRunnable2 implements Runnable {
    private int counter;

    @Override
    public void run() {
        System.out.println("Task started");
        for (int i = 0; i < 10; i++) {
            this.counter++;
        }
        System.out.println(Thread.currentThread().getName() + " " + this.counter);
        System.out.println("Task finished");
    }
}

class MyRunnable implements Runnable {

    private int counter;

    @Override
    public void run() {
        System.out.println("Task started");
        for (int i = 0; i < 10; i++) {
            synchronized (this) {
                this.counter++;
            }

        }
        System.out.println(Thread.currentThread().getName() + " " + this.counter);
        System.out.println("Task finished");
    }

    public static void main(String[] args) throws InterruptedException {

        MyRunnable thread1 = new MyRunnable();
//        MyRunnable thread2 = new MyRunnable();

        Thread thread3 = new Thread(thread1);
        Thread thread4 = new Thread(thread1);

        thread3.start(); // start the first thread

        thread4.start();
//                thread1.join();  // wait for the first thread
// start the second thread
//        thread2.join();  // wait for the second thread

//        System.out.println(counter.getValue()); // it prints 2
    }
}