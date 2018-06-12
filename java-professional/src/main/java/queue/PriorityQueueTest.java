package queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        Queue<Integer> stringQueue = new PriorityQueue<>();

        stringQueue.add(12);
        stringQueue.add(4);
        stringQueue.add(32);
        stringQueue.add(22);
        stringQueue.add(533);

        System.out.println(stringQueue);
        System.out.println(stringQueue.poll());
        System.out.println(stringQueue.poll());
        System.out.println(stringQueue.poll());


    }
}
