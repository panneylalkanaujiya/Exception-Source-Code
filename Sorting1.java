import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Sorting1
{
    public static  void main(String args[])
    {
        List<Integer> list= Arrays.asList(12,3,4,5,589,65,90,32,66,13,43);
        List<Integer> sortingdata= list.stream()
            .sorted()
            .collect(Collectors.toList());
                System.out.println("sortingdata:"+sortingdata);
    }
}