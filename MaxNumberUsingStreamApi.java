import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.Collections.max;

public class MaxNumberUsingStreamApi {
    public static void main(String args[]) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        Optional<Integer> max = numbers.stream()
                .max(Integer::compareTo);

        //.min(Integer::compareTo);
               // .max((a, b) -> a.compareTo(b));


        max.ifPresent(value -> System.out.println("Maximum number: " + value));
    }
}
