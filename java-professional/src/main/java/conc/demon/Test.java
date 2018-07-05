package conc.demon;

public class Test {
    public static void main(String[ ] args) {
        Runnable runnable = () -> {
            try {
                if (Thread.currentThread().isDaemon()) {
                    Thread.sleep(5_000);
                    System.out.println("Print from demon");
                } else {
                    System.out.println("Print from simple thread");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Thread simple = new Thread(runnable);
        Thread deamon = new Thread(runnable);
//        demon.setDaemon(true);
        simple.start();
        deamon.start();
        System.out.println("main end");
    }
}
