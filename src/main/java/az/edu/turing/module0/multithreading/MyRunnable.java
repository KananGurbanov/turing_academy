package az.edu.turing.module0.multithreading;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("My runnable started");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("My runnable finished");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }
}
