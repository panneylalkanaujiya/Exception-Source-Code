import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import java.util.stream.Collectors;

public class FindwordInlist {
    public static  void main(String args[])
    {
        List<String> strings= Arrays.asList("java scala ruby", "java react scala spring java");
        Map<String,Long> wordcount=strings.stream()
                .flatMap(s->Arrays.stream(s.split("\\s+")))
                .collect(Collectors.groupingBy(word->word, Collectors.counting()));

        wordcount.forEach((word, count)->System.out.println(word+ ":"+count));

    }
}
