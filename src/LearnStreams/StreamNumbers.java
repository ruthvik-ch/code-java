package LearnStreams;
import java.util.*;

public class StreamNumbers {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5, 10, 20, 25, 40, 50);
        int ans = nums.stream()
                .filter(n -> n%2==0)
                .reduce(0,(a,c)->a+c);
        Optional<Integer> ans2 = nums.stream()
                .filter(n -> n%2==0)
                .reduce(Integer::sum);
        System.out.println(ans + ans2.toString());
    }


}
