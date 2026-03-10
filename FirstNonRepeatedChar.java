
//Q-33 Find first non-repeated character in a string
//Logic: Count frequency of each char, return first char with count 1
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedChar {
        public static char firstNonRepeated(String s) {
                LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
                for (char c : s.toCharArray())
                        map.put(c, map.getOrDefault(c, 0) + 1);
                for (Map.Entry<Character, Integer> e : map.entrySet())
                        if (e.getValue() == 1)
                                return e.getKey();
                return '\0';
        }

        public static void main(String[] args) {
                System.out.println(firstNonRepeated("swiss")); // Output: w
        }
}
