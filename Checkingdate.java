import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Checkingdate {
    public static void main(String args[]) {
      List<Integer> list=Arrays.asList(2,3,4,5,6,7 ,12,13,14 ,20,21,22,23,24 ,25,26,27,28);
        List<Integer> values=list.stream()
                .collect(Collectors.toList());
                System.out.println("numbers:"+values);
    }
}
