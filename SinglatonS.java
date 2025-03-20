import java.text.Collator;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SinglatonS {

        public static void main(String[] args)
        {
            List<String> fruits= Arrays.asList("Mango","Banana","Apple","orange","avada");

            List<String> name=fruits.stream()
                    .filter(str->str.length()>4)
                    .map(String::toUpperCase)
                   .filter(str->str.startsWith("A"))
                .collect(Collectors.toList());
                       // .forEach(System.out::println);
                System.out.println("name of :"+name);



        }
    }

