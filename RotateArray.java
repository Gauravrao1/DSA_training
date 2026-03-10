
//Q-20 Rotate array to the right by k steps
//Logic: Reverse entire array, reverse first k elements, reverse remaining elements
import java.util.Arrays;

public class RotateArray {
        static void reverse(int[] arr, int start, int end) {
                while (start < end) {
                        int temp = arr[start];
                        arr[start] = arr[end];
                        arr[end] = temp;
                        start++;
                        end--;
                }
        }

        public static void main(String[] args) {
                int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
                int k = 3;
                k = k % nums.length; // handle k > array length
                reverse(nums, 0, nums.length - 1); // reverse all
                reverse(nums, 0, k - 1); // reverse first k
                reverse(nums, k, nums.length - 1); // reverse rest
                System.out.println(Arrays.toString(nums)); // [5, 6, 7, 1, 2, 3, 4]
        }
}
