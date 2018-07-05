package conc.join;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main start");
        final Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread work!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
        thread.join();
        System.out.println("main end");
    }
}
