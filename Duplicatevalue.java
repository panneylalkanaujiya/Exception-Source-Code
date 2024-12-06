import java.util.*;

import static java.util.Locale.filter;

public class Duplicatevalue {
    public static void main(String args[])
    {  List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 2, 6, 3, 7, 8, 1);

        // Find and print duplicate values
        Set<Integer> seen = new HashSet<>();
        numbers.stream()
                .filter(n -> !seen.add(n)) // Returns true if the element is already in the set
                .distinct() // Ensure each duplicate is printed only once
                .forEach(System.out::println);
    }


    }

