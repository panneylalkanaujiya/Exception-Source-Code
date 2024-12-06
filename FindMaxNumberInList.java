import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMaxNumberInList {
    public static void main(String args[])
    {
        List<Integer> number= Arrays.asList(12,3,4,455,6777);
        Optional<Integer> maxnumber=number.stream()
                .max((a,   b)->a.compareTo(b));

            System.out.println(maxnumber.get());
               // .max(Integer::compareTo);
        //maxnumber.ifPresent(max->System.out.println("maxnumber is:"+max));


    }
}
