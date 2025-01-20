package az.edu.turing.module0.multithreading;

public class MyRunnableLambda {
    public static void main(String[] args) {
        Runnable myRunnable = () -> {
            System.out.println("My runnable started");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("My runnable finished");
        };

        new Thread(myRunnable, "My Thread").start();
    }
}
