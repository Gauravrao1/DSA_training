//Q-18 Find the duplicate number in array of N+1 elements (values 1 to N)
//Logic: Use Floyd's cycle detection (tortoise and hare) on array indices
public class FindDuplicate {
        public static int findDuplicate(int[] nums) {
                // Phase 1: Find intersection point
                int slow = nums[0], fast = nums[0];
                do {
                        slow = nums[slow];
                        fast = nums[nums[fast]];
                } while (slow != fast);

                // Phase 2: Find entrance of cycle (duplicate)
                slow = nums[0];
                while (slow != fast) {
                        slow = nums[slow];
                        fast = nums[fast];
                }
                return slow;
        }

        public static void main(String[] args) {
                int[] arr = { 1, 3, 4, 2, 2 };
                System.out.println(findDuplicate(arr)); // Output: 2
        }
}
