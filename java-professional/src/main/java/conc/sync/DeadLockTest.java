package conc.sync;

public class DeadLockTest {
    public static Object lock1 = new Object();
    public static Object lock2 = new Object();

    public static void main(String args[]) {
        ThreadOne firstThread = new ThreadOne();
        ThreadTwo secondThread = new ThreadTwo();
        firstThread.start();
        secondThread.start();
    }

    private static class ThreadOne extends Thread {
        public void run() {
            synchronized (lock1) {
                System.out.println("Thread 1: Holding lock1 1...");

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                }
                System.out.println("Thread 1: Waiting for lock1 2...");

                synchronized (lock2) {
                    System.out.println("Thread 1: Holding lock1 1 & 2...");
                }
            }
        }
    }

    private static class ThreadTwo extends Thread {
        public void run() {
            synchronized (lock2) {
                System.out.println("Thread 2: Holding lock1 2...");

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                }
                System.out.println("Thread 2: Waiting for lock1 1...");

                synchronized (lock1) {
                    System.out.println("Thread 2: Holding lock1 1 & 2...");
                }
            }
        }
    }
}
