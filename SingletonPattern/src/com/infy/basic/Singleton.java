package com.infy.basic;

import java.util.concurrent.CountDownLatch;


public class Singleton {

    private static Singleton theSingleton;

    private Singleton() {
        System.out.println("Getting instance");
    }

    public static Singleton getInstance() {
        if (theSingleton == null) {
            try {
                Thread.sleep(100); // force race condition
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            theSingleton = new Singleton();
        }
        return theSingleton;
    }

    public static void main(String[] args) {

        CountDownLatch latch = new CountDownLatch(1);

        Runnable task = () -> {
            try {
                latch.await();
            } catch (Exception e) {
                e.printStackTrace();
            }

            Singleton instance = getInstance();
            System.out.println(Thread.currentThread().getName() + " -> " + instance);
        };

        for (int i = 0; i < 20; i++) {
            new Thread(task).start();
        }

        latch.countDown();
    }
}