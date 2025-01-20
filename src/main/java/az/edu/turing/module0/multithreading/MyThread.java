package az.edu.turing.module0.multithreading;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("My thread started");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("My thread ended");

    }

    public static void main(String[] args) {
        Thread thread = new MyThread();
        thread.start();
    }
}
