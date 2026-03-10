
//Q-16 Find kth largest element in array without sorting
//Logic: Use a min-heap of size k. The top of heap is the kth largest
import java.util.PriorityQueue;

public class KthLargestElement {
        public static int findKthLargest(int[] nums, int k) {
                PriorityQueue<Integer> minHeap = new PriorityQueue<>();
                for (int num : nums) {
                        minHeap.add(num);
                        if (minHeap.size() > k)
                                minHeap.poll(); // remove smallest
                }
                return minHeap.peek(); // top is kth largest
        }

        public static void main(String[] args) {
                int[] nums = { 3, 2, 1, 5, 6, 4 };
                System.out.println(findKthLargest(nums, 2)); // Output: 5
        }
}
