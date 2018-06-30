package conc.interapt;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        final MyThread myThread = new MyThread();
        myThread.start();

        Thread.sleep(100);
        myThread.interrupt();
    }

    static class MyThread extends Thread {

        @Override
        public void run() {
            int count = 0;
            while (!isInterrupted()) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(++count);
            }
        }
    }
}
