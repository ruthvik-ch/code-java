package LearnCollections;

import java.util.*;

public class LearnList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(10);
        list.add(20);
        list.set(4, 400);
        list.add(5,50);
        list.remove(4);

        list.getFirst();
        list.indexOf(400);

        List<Integer> list2 = new ArrayList<>();
        list2.add(200);
        list2.add(40);
        list2.add(10);

        list.contains(200);



    }
}
