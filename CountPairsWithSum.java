
//Q-22 Count pairs whose sum equals target
//Logic: Use HashMap to count frequency of each number, then for each number check if (target - num) exists
import java.util.HashMap;

public class CountPairsWithSum {
        public static int countPairs(int[] arr, int target) {
                HashMap<Integer, Integer> map = new HashMap<>();
                int count = 0;

                for (int num : arr) {
                        int complement = target - num;
                        // If complement exists, those many pairs can be formed
                        if (map.containsKey(complement))
                                count += map.get(complement);
                        map.put(num, map.getOrDefault(num, 0) + 1);
                }
                return count;
        }

        public static void main(String[] args) {
                int[] arr = { 1, 5, 7, -1, 5 };
                System.out.println(countPairs(arr, 6)); // Output: 3
        }
}
