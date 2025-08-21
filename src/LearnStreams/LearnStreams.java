package LearnStreams;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

public class LearnStreams {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(13);
        list.add(41);
        list.add(32);
        list.add(42);
        list.add(33);
        list.add(45);
        list.add(37);
        list.add(40);
        Stream<Integer>s = list.stream()
                .filter(n -> {
                    System.out.println("Jaswanth Alla");
                    return n % 2 == 0;}).map((x)->{
                    System.out.println("Ruth");
                    return 2*x ;});
        System.out.println(s.reduce(0,(c,a)-> c+a));;
    }

}