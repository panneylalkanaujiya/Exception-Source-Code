import java.util.*;
import java.util.stream.Collectors;

public class OnlyDistinctElement {
    public static void main(String[] args)
    {
        List<Integer> num= Arrays.asList(1,1,2,2,3,4,45,89,76);
        Set<Integer> uniqueNumbers = new HashSet<>();
        List<Integer> distinctdata=num.stream()
                .filter(num1->!uniqueNumbers.add(num1))
                . distinct()
                .collect(Collectors.toList());

        System.out.println("distinctdata:"+distinctdata);
    }
}
