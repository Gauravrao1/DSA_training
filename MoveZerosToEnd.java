
//Q-23 Move all zeros to end while keeping non-zero order
//Logic: Use a pointer to track position for non-zero elements, then fill rest with zeros
import java.util.Arrays;

public class MoveZerosToEnd {
        public static void moveZeroes(int[] nums) {
                int pos = 0; // position to place next non-zero element
                for (int num : nums)
                        if (num != 0)
                                nums[pos++] = num;
                // Fill remaining positions with 0
                while (pos < nums.length)
                        nums[pos++] = 0;
        }

        public static void main(String[] args) {
                int[] nums = { 0, 1, 0, 3, 12 };
                moveZeroes(nums);
                System.out.println(Arrays.toString(nums)); // [1, 3, 12, 0, 0]
        }
}
