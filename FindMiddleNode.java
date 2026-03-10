//Q-41 Find middle node of a linked list
//Logic: Use slow and fast pointers. Slow moves 1 step, fast moves 2 steps. When fast reaches end, slow is at middle
public class FindMiddleNode {
        static class ListNode {
                int val;
                ListNode next;

                ListNode(int val) {
                        this.val = val;
                }
        }

        public static ListNode middleNode(ListNode head) {
                ListNode slow = head, fast = head;
                while (fast != null && fast.next != null) {
                        slow = slow.next;
                        fast = fast.next.next;
                }
                return slow; // slow is now at middle
        }

        public static void main(String[] args) {
                // Build: 1 -> 2 -> 3 -> 4 -> 5
                ListNode head = new ListNode(1);
                head.next = new ListNode(2);
                head.next.next = new ListNode(3);
                head.next.next.next = new ListNode(4);
                head.next.next.next.next = new ListNode(5);

                ListNode mid = middleNode(head);
                // Print from middle
                while (mid != null) {
                        System.out.print(mid.val + " ");
                        mid = mid.next;
                }
                // Output: 3 4 5
        }
}
