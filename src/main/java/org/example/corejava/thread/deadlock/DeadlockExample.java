package org.example.corejava.thread.deadlock;

public class DeadlockExample {
    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread1: Holding lock1...");
                try { Thread.sleep(100); } catch (InterruptedException e) {}
                System.out.println("Thread1: Waiting for lock2...");
                synchronized (lock2) {
                    System.out.println("Thread1: Holding lock1 & lock2...");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread2: Holding lock2...");
                try { Thread.sleep(100); } catch (InterruptedException e) {}
                System.out.println("Thread2: Waiting for lock1...");
                synchronized (lock1) {
                    System.out.println("Thread2: Holding lock2 & lock1...");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
