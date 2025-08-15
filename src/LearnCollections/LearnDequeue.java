package LearnCollections;

import java.util.ArrayDeque;

public class LearnDequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(10);
        adq.offerFirst(100);
        adq.offerLast(19);
        System.out.println(adq);

        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq.pollFirst());
        System.out.println(adq.pollLast());

        System.out.println(adq);
    }
}
