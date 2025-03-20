import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectionMapExample1 {
    public static void main(String args[])
    {
        HashMap<String,Integer>hm=new HashMap<>();
        hm.put("panney",12);
        hm.put("panney",12);
        hm.put("rahul",123);
        hm.put("reekha",34);
        List<Map.Entry<String, Integer>> list=hm.entrySet().stream()
                .distinct()
                .collect(Collectors.toList());
                System.out.println("list:"+list);

       }
}
