//Q-42 Merge two sorted linked lists into one sorted list
//Logic: Compare heads of both lists, pick smaller one, advance that pointer
public class MergeSortedLinkedLists {
        static class ListNode {
                int val;
                ListNode next;

                ListNode(int val) {
                        this.val = val;
                }
        }

        public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
                ListNode dummy = new ListNode(0); // dummy head
                ListNode curr = dummy;

                while (l1 != null && l2 != null) {
                        if (l1.val <= l2.val) {
                                curr.next = l1;
                                l1 = l1.next;
                        } else {
                                curr.next = l2;
                                l2 = l2.next;
                        }
                        curr = curr.next;
                }
                // Attach remaining nodes
                curr.next = (l1 != null) ? l1 : l2;
                return dummy.next;
        }

        public static void main(String[] args) {
                // List1: 1 -> 2 -> 4
                ListNode l1 = new ListNode(1);
                l1.next = new ListNode(2);
                l1.next.next = new ListNode(4);

                // List2: 1 -> 3 -> 4
                ListNode l2 = new ListNode(1);
                l2.next = new ListNode(3);
                l2.next.next = new ListNode(4);

                ListNode merged = mergeTwoLists(l1, l2);
                while (merged != null) {
                        System.out.print(merged.val + " ");
                        merged = merged.next;
                }
                // Output: 1 1 2 3 4 4
        }
}
