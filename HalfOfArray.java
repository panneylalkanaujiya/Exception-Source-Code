
import java.util.HashMap;
public class HalfOfArray {
    public static void main(String args[]) {
        String s1 = "aaaaabbbccaab";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            Character ch = s1.charAt(i);

            if (map.containsKey(ch))
            {
                int count = map.get(ch);
                count++;
                map.replace(ch,count);
            }
            else
            {
                for (Character key : map.keySet())
                {
                    System.out.println(key + "" + map.get(key));
                }

            }

        }

    }
}
//[3,3,3,3,5,5,5,2,2,7]Output: 2
//output-3,5,2,7
/*
aaaaabbbccaab
5a3b2c2a1b
 */
