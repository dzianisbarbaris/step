package by.savik.L08_12_2025;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    static int counter = 0;

    //Лучше использовать AtomicInteger, а не synchronized;
    static AtomicInteger secondCounter = new AtomicInteger(0);


    static final Object lockA = new Object();
    static final Object lockB = new Object();
    public static synchronized void increment(){
        counter++;
    }
    public static void main(String[] args) throws InterruptedException {

        /*MyThread myThread = new MyThread();
        myThread.run();

        Thread secondThread = new Thread(() ->
        {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        secondThread.start();

        Thread workerA = new Thread(() ->
        {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Работник А");
            }
        });
        Thread workerB = new Thread(() ->
        {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Работник B");
            }
        });
        workerA.start();
        workerA.join();
        workerB.start();

    Thread sleepingThread = new Thread(() -> {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException("Меня разбудили");
        }
        System.out.println("Я проснулся сам");
    });
        sleepingThread.start();
        Thread.sleep(1000);
        sleepingThread.interrupt();*/



        /*Runnable task = () -> {
            for (int i = 0; i < 1000; i++){
                increment();
                secondCounter.incrementAndGet();
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("counter = " + counter);
        System.out.println("atomicCounter = " + secondCounter);*/

        Thread t3 = new Thread(() -> {
            synchronized (lockA) {
                System.out.println("t3 взял А");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lockB) {
                    System.out.println("t1 взял B");
                }
            }
        });

        Thread t4 = new Thread(() -> {
            synchronized (lockB) {
                System.out.println("t4 взял B");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lockA) {
                    System.out.println("t4 взял A");
                }
            }
        });

        t3.start();
        t4.start();
    }
}
