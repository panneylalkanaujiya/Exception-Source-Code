import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenandOddNumber {
    public static void main(String args[])
    {
        List<Integer> num= Arrays.asList(12,34,76,98,3,1,7);
        List<Integer>even=num.stream()
                .filter(num1->num1%2==0)
                .collect(Collectors.toList());
        System.out.println("even:"+even);
        List<Integer>odd=num.stream()
                .filter(num1->num1%2!=0)
                .collect(Collectors.toList());
        System.out.println("odd:"+odd);

    }
}
