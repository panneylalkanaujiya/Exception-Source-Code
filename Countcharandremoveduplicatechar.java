import java.util.Map;
import java.util.stream.Collectors;

public class Countcharandremoveduplicatechar
{
public static void main(String[] args) {
    String str = "This is IS Birla birla";
    // Count occurrences of each character
    Map<Character, Long> charCount = str.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
    // Remove duplicate characters
    String uniqueChars = str.chars()
            .mapToObj(c -> (char) c)
            .distinct()
            .map(String::valueOf)
            .collect(Collectors.joining());
    // Print results
    System.out.println("Character Count: " + charCount);
    System.out.println("Unique Characters: " + uniqueChars);
}
}
