package az.edu.turing.module0.multithreading.basic;

public class MyRunnabl implements Runnable{
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
        Thread thread = new Thread(new MyRunnabl());
        thread.start();
    }
}
