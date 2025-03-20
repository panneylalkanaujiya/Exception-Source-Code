import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ReverseWord {
    public static void main(String args[])
    {
        List<String> list= Arrays.asList("my name is panney","my name is rahul");
        Map<String,Long> wordcount= list.stream()
                .flatMap(s->Arrays.stream(s.split("\\s")))
                .collect(Collectors.groupingBy(word->word,Collectors.counting()));
        wordcount.forEach((word,count)->System.out.println(word+":"+count));
    }}