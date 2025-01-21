package az.edu.turing.module0.multithreading;

public class CountDown extends Thread {

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        for (int i = 5; i > 0; i--) {
            System.out.println(name + " " + i);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        CountDown c1 = new CountDown();
        CountDown c2 = new CountDown();

        c1.start();

        c1.join();

        c2.start();

        c2.join();

        System.out.println("Program finished");
    }
}
