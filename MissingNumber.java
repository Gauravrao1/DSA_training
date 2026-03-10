//Q-17 Find the missing number in range [0, n]
//Logic: Sum of 0 to n = n*(n+1)/2. Missing = expected sum - actual sum
public class MissingNumber {
        public static int missingNumber(int[] nums) {
                int n = nums.length;
                int expectedSum = n * (n + 1) / 2;
                int actualSum = 0;
                for (int num : nums)
                        actualSum += num;
                return expectedSum - actualSum;
        }

        public static void main(String[] args) {
                int[] nums = { 3, 0, 1 };
                System.out.println(missingNumber(nums)); // Output: 2
        }
}
