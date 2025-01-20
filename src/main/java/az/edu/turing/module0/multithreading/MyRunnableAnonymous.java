package az.edu.turing.module0.multithreading;

public class MyRunnableAnonymous {
    public static void main(String[] args) {
        Runnable myRunnable = new Runnable() {

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
        };

        Thread thread = new Thread(myRunnable);
        thread.start();

    }
}
