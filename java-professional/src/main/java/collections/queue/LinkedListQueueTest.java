package collections.queue;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListQueueTest {
    public static void main(String[] args) {
        Deque<Integer> stringQueue = new LinkedList<>();

        stringQueue.add(12);
        stringQueue.add(4);
        stringQueue.add(32);
        stringQueue.add(22);
        stringQueue.add(533);

        System.out.println(stringQueue.getFirst());


    }
}
