package LearnCollections;

import java.util.PriorityQueue;

public class LearnPriorityQueue {

    public static void main(String[] args) {
        PriorityQueue<Integer> p1 = new PriorityQueue<>();

        p1.offer(10);
        p1.offer(19);
        p1.offer(1);
        System.out.println(p1.peek());
        System.out.println(p1.poll());
        System.out.println(p1);
    }
}
