import java.util.Arrays;
import java.util.List;

public class Cube {
    public static void main(String args[])
    {
        List<Integer> list=  Arrays.asList(12,34,1,2,3,44,7,5);
        list.stream()
                .map(i->i*i*i)
                .filter(i->i>50)
                .forEach(System.out::println);


    }
}
