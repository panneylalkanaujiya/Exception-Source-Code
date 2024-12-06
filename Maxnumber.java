import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Maxnumber {
    public static void main(String args[])
    {
        List<Integer> list= Arrays.asList(12,34,55,78,98);
        Optional<Integer> Maxnumber=list.stream()
        .max(Integer::compareTo);
        //.max((int a,int b)->(a.compareTo(b)))
        //.collect(Collectors.toList());
        Maxnumber.ifPresent(Maxnumber1->System.out.println("maxnumber is:"+Maxnumber1));
       // System.out.println(Maxnumber.get());
    }
}
