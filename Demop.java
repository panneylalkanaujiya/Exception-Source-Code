import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Demop {
    public static void main(String args[])
    {
       // arr[] = {1, 2, 3, 6, 3, 6, 1}


        List<Integer>list= Arrays.asList(1, 2, 3, 6, 3, 6, 1);
        Optional<Integer>second=list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
        .findFirst();
        second.ifPresent(secondno->System.out.println("secondno:"+second));


    }
}
