import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindoccuranceWord {
    public static void main(String args[])
    {
        List<String> strings = Arrays.asList("java scala ruby", "java react scala spring java");
        Map<String, Long> wordCount = strings.stream()
                .flatMap(s -> Arrays.stream(s.split("\\s+")))
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));


        wordCount.forEach((word, count) -> System.out.println(word + ": " + count));
    }

}
//List<String> strings = Arrays.asList("java scala ruby", "java react scala spring java");

//How to count the number of occurrences of each word in a list of strings using Java 8?