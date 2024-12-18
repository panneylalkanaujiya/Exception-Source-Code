import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String args[])
    {
        List<String> strings= Arrays.asList("AABBCC", "ABC","CAB", "AAABC", "BCA", "ABBBC");
        List<String>processingStrings=strings.stream()
                .filter(s->s.length()>3)
                .sorted()
                .map(String::toUpperCase)
                .collect((Collectors.toList()));
        System.out.println(processingStrings);

    }
}
