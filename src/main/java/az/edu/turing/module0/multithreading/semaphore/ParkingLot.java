package az.edu.turing.module0.multithreading.semaphore;

import java.util.concurrent.Semaphore;

public class ParkingLot {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(2);
        for (int i = 0; i < 50; ++i) {
            Car car = new Car("Car #" + i, sem, 3000L);
            car.goShopping();
        }
    }
}
class Car extends Thread {
    private final Semaphore semaphore;
    private final long timeout; // ms

    public Car(String name, Semaphore semaphore, long timeout) {
        super(name);
        this.semaphore = semaphore;
        this.timeout = timeout;
    }
    
    public void goShopping() {
        start();
    }

    @Override
    public void run() {
        try {
            if (!semaphore.tryAcquire()) {
                System.out.println(Thread.currentThread().getName() + " waits for parking");
                semaphore.acquire();
            }
            System.out.println(Thread.currentThread().getName() + " parked");
            Thread.sleep(timeout); // shopping
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + ": shopping was interrupted");
            e.printStackTrace();
        } finally {
            System.out.println(Thread.currentThread().getName() + " left");
            semaphore.release();
        }
    }
}
