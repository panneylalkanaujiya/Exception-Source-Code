import java.util.*;

public class Onlyrepeatedvalue {
    public static void main(String args[])
    {
        String s1="panneylal";
        List<String> list=Arrays.asList(s1.split(""));
        Set<String>seen=new HashSet<>();
        list.stream()
                .filter(n->! seen.add(n))
                .distinct()

        .forEach(System.out::println);
    }
}
