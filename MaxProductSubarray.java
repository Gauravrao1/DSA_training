//Q-21 Find subarray with maximum product
//Logic: Track max and min product at each position (min needed because negative * negative = positive)
public class MaxProductSubarray {
        public static int maxProduct(int[] nums) {
                int maxProd = nums[0], minProd = nums[0], result = nums[0];

                for (int i = 1; i < nums.length; i++) {
                        // If negative, swap max and min (negative flips sign)
                        if (nums[i] < 0) {
                                int temp = maxProd;
                                maxProd = minProd;
                                minProd = temp;
                        }
                        maxProd = Math.max(nums[i], maxProd * nums[i]);
                        minProd = Math.min(nums[i], minProd * nums[i]);
                        result = Math.max(result, maxProd);
                }
                return result;
        }

        public static void main(String[] args) {
                int[] nums = { 2, 3, -2, 4 };
                System.out.println(maxProduct(nums)); // Output: 6
        }
}
