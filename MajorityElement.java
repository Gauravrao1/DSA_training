//Q-24 Find majority element (appears more than n/2 times)
//Logic: Boyer-Moore Voting Algorithm - maintain a candidate and count
public class MajorityElement {
        public static int majorityElement(int[] nums) {
                int candidate = nums[0], count = 1;
                // Phase 1: Find candidate
                for (int i = 1; i < nums.length; i++) {
                        if (count == 0) {
                                candidate = nums[i];
                                count = 1;
                        } else if (nums[i] == candidate)
                                count++;
                        else
                                count--;
                }
                return candidate; // guaranteed to exist as per problem
        }

        public static void main(String[] args) {
                int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
                System.out.println(majorityElement(nums)); // Output: 2
        }
}
