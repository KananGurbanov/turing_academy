package az.edu.turing.module0.multithreading;

public class Counter {

    private volatile int value = 0;

    public void increment() {
        value++;
    }

    public int getValue() {
        return value;
    }
}


class MyThreadNew extends Thread {

    private final Counter counter;

    public MyThreadNew(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        counter.increment();
    }

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        MyThreadNew thread1 = new MyThreadNew(counter);
        MyThreadNew thread2 = new MyThreadNew(counter);

        thread1.start(); // start the first thread
//        thread1.join();  // wait for the first thread

        thread2.start(); // start the second thread
//        thread2.join();  // wait for the second thread

        System.out.println(counter.getValue()); // it prints 2
    }
}