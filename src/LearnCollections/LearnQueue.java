package LearnCollections;

import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();

        q1.offer(10);
        q1.offer(25);
        System.out.println(q1.peek());
        System.out.println(q1.poll());
    }
}
