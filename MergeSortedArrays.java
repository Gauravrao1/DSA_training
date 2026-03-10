
//Q-19 Merge two sorted arrays into one sorted array
//Logic: Start filling from the end of nums1, comparing largest elements first
import java.util.Arrays;

public class MergeSortedArrays {
        public static void merge(int[] nums1, int m, int[] nums2, int n) {
                int i = m - 1, j = n - 1, k = m + n - 1;
                // Fill from back: place the larger element at the end
                while (i >= 0 && j >= 0) {
                        if (nums1[i] > nums2[j])
                                nums1[k--] = nums1[i--];
                        else
                                nums1[k--] = nums2[j--];
                }
                // Copy remaining elements from nums2
                while (j >= 0)
                        nums1[k--] = nums2[j--];
        }

        public static void main(String[] args) {
                int[] nums1 = { 1, 2, 3, 0, 0, 0 };
                int[] nums2 = { 2, 5, 6 };
                merge(nums1, 3, nums2, 3);
                System.out.println(Arrays.toString(nums1)); // [1, 2, 2, 3, 5, 6]
        }
}
