package conc.states;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> System.out.println("Welcome from Thread!"));

        System.out.println(thread.getState());

        thread.start();

        System.out.println(thread.getState());

        thread.join();

        System.out.println(thread.getState());

        thread.interrupt();

        Thread.sleep(3000);

        System.out.println(thread.getState());

    }


}
