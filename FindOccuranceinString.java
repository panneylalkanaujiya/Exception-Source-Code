import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;



public class FindOccuranceinString {
    public static void main(String args[])
    {
        String str="panneylal";
        Map<String, Long> occurrences = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy( Function.identity(),Collectors.counting()));
        System.out.println("find occurance:"+occurrences);
    }

}
