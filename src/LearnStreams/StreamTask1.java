package LearnStreams;
import java.util.*;
import java.util.stream.*;

public class StreamTask1 {
    public static void main(String[] args) {

        //String
        List<String> names = Arrays.asList("Ruthvik", "Chennapragada", "Raj", "Ravi", "Rakesh");

        // Q1: From this list, get all names starting with "R"
        //    and collect them into a new List.

        // TODO: Implement using streams
        List<String> s =  names.stream()
                .filter((name)->{return name.startsWith("R");})
                .collect(Collectors.toList());

        System.out.println(s);
        // Q2
        names.stream()
                .filter(name->name.startsWith("R"))
                .forEach((name)-> System.out.println(name));
        // Q3
        names.stream()
                .filter(name->name.startsWith("R"))
                .forEach((name)-> System.out.println(name.toUpperCase()));
        //Q4
        Set<String> s2 = names.stream()
                .filter(name->name.startsWith("R"))
                .map(name->name.toUpperCase())
                .collect(Collectors.toSet());
        //Q5
        List<String> l2 = names.stream()
                .filter(name->name.startsWith("R"))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());
        List<String> l3 = names.stream()
                .filter(name->name.startsWith("R"))
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}

