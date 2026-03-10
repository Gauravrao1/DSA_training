//Q-40 Detect if a linked list has a cycle
//Logic: Floyd's cycle detection - slow moves 1 step, fast moves 2 steps. If they meet, cycle exists
public class DetectLoopLinkedList {
        static class ListNode {
                int val;
                ListNode next;

                ListNode(int val) {
                        this.val = val;
                }
        }

        public static boolean hasCycle(ListNode head) {
                ListNode slow = head, fast = head;
                while (fast != null && fast.next != null) {
                        slow = slow.next; // move 1 step
                        fast = fast.next.next; // move 2 steps
                        if (slow == fast)
                                return true; // cycle detected
                }
                return false;
        }

        public static void main(String[] args) {
                // Build: 3 -> 2 -> 0 -> -4 -> (back to 2)
                ListNode head = new ListNode(3);
                ListNode second = new ListNode(2);
                head.next = second;
                head.next.next = new ListNode(0);
                head.next.next.next = new ListNode(-4);
                head.next.next.next.next = second; // create cycle

                System.out.println(hasCycle(head)); // true
        }
}
