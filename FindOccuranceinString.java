import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;



public class FindOccuranceinString {
    public static void main(String args[])
    {
        String str="My name is panneylal";
        Map<Character, Long> occurrences = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        occurrences.forEach((character, count) -> System.out.println(character + " : " + count));

    }

}
