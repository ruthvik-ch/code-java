package LearnStreams;
import java.awt.im.InputContext;
import java.util.*;
import java.util.stream.Collectors;

public class StreamAdvMap {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "bat", "banana", "ball", "apricot", "cat");

        Map<Character, List<String>> m1 = new HashMap();
        Map<Character, Set<String>> m2 = new HashMap();
        Map<Character, Long> m3 = new HashMap();
        m1 = words.stream()
                .collect(Collectors.groupingBy(word->word.charAt(0)));

        m2 = words.stream()
                .collect(Collectors.groupingBy(word->word.charAt(0), Collectors.toSet()));

        m3 = words.stream()
                .collect(Collectors.groupingBy(word->word.charAt(0), Collectors.counting()));


        System.out.println(m1);
    }

}
