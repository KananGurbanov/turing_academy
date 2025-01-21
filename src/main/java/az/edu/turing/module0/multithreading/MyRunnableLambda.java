package az.edu.turing.module0.multithreading;

public class MyRunnableLambda {
    public static void main(String[] args) throws InterruptedException {
        Runnable myRunnable = () -> {
            System.out.println("My runnable started");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("My runnable finished");
        };


        Thread t = new Thread(myRunnable, "My Thread");
        t.start();
        System.out.println("Sleep started");
        Thread.sleep(2000);

        t.join(3000);
        System.out.println("Sleep finished");

    }
}
