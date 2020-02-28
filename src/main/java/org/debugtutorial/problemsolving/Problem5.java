package org.debugtutorial.problemsolving;

public class Problem5
{
    public static Object lock1 = new Object();
    public static Object lock2 = new Object();

    public static void main(String args[]) {
        CustomThread1 t1 = new CustomThread1();
        CustomThread2 t2 = new CustomThread2();
        t1.start();
        t2.start();
    }

    private static class CustomThread1 extends Thread {
        public void run() {
            synchronized (lock1)
            {
                System.out.println("Thread 1: Holding lock 1...");

                try { Thread.sleep(10); }
                catch (InterruptedException e) {}
                System.out.println("Thread 1: Waiting for lock 2...");

                synchronized (lock2) {
                    System.out.println("Thread 1: Holding lock 1 & 2...");
                }
            }
        }
    }
    private static class CustomThread2 extends Thread {
        public void run() {
            synchronized (lock2) {
                System.out.println("Thread 2: Holding lock 2...");

                try { Thread.sleep(10); }
                catch (InterruptedException e) {}
                System.out.println("Thread 2: Waiting for lock 1...");

                synchronized (lock1) {
                    System.out.println("Thread 2: Holding lock 1 & 2...");
                }
            }
        }
    }
}
