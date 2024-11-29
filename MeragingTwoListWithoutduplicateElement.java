import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MeragingTwoListWithoutduplicateElement {
    public static void main(String args[])

    {
        List<Integer> list1= Arrays.asList(1, 22, 3, 4, 4, 5, 8);
        List<Integer>list2=Arrays.asList(12,43,56,1,2,4);
        List<Integer> mearged= Stream.concat(list1.stream(),list2.stream())
                .distinct()
                .collect(Collectors.toList());
                System.out.println("mearged:"+mearged);
    }
}
