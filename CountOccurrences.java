
//Q-10 Count how many times each element occurs in array
//Logic: Use a HashMap to store element counts, then print
import java.util.LinkedHashMap;
import java.util.Map;

public class CountOccurrences {
        public static void main(String[] args) {
                int[] arr = { 1, 2, 3, 3, 4, 1, 4, 5, 1, 2 };
                Map<Integer, Integer> map = new LinkedHashMap<>();

                for (int num : arr)
                        map.put(num, map.getOrDefault(num, 0) + 1);

                for (Map.Entry<Integer, Integer> e : map.entrySet())
                        System.out.println(e.getKey() + " occurs " + e.getValue() + " times");
        }
}
