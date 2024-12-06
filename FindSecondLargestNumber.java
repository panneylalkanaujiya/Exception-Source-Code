import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindSecondLargestNumber {
    public static void main(String args[])
    {
        List<Integer> num= Arrays.asList(12,34,54,56,7,8,90,87,43);
        Optional<Integer> duplicateno=num.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        duplicateno.ifPresent(num1->System.out.println("second largest number:"+num1));

    }
}
