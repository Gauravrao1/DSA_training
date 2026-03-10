
//Q-25 Find intersection of two arrays (unique elements only)
//Logic: Add first array to a HashSet, check if second array elements exist in it
import java.util.HashSet;
import java.util.Arrays;

public class IntersectionOfArrays {
        public static int[] intersection(int[] nums1, int[] nums2) {
                HashSet<Integer> set = new HashSet<>();
                for (int num : nums1)
                        set.add(num);

                HashSet<Integer> result = new HashSet<>();
                for (int num : nums2)
                        if (set.contains(num))
                                result.add(num);

                return result.stream().mapToInt(Integer::intValue).toArray();
        }

        public static void main(String[] args) {
                int[] nums1 = { 4, 9, 5 };
                int[] nums2 = { 9, 4, 9, 8, 4 };
                System.out.println(Arrays.toString(intersection(nums1, nums2))); // [4, 9]
        }
}
