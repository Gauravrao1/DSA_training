//Q-39 Reverse a singly linked list
//Logic: Use 3 pointers (prev, current, next). Point each node's next to previous node
public class ReverseLinkedList {
        static class ListNode {
                int val;
                ListNode next;

                ListNode(int val) {
                        this.val = val;
                }
        }

        public static ListNode reverse(ListNode head) {
                ListNode prev = null, curr = head;
                while (curr != null) {
                        ListNode next = curr.next; // save next
                        curr.next = prev; // reverse link
                        prev = curr; // move prev forward
                        curr = next; // move curr forward
                }
                return prev;
        }

        public static void main(String[] args) {
                // Build: 1 -> 2 -> 3 -> 4 -> 5
                ListNode head = new ListNode(1);
                head.next = new ListNode(2);
                head.next.next = new ListNode(3);
                head.next.next.next = new ListNode(4);
                head.next.next.next.next = new ListNode(5);

                head = reverse(head);
                // Print reversed list
                ListNode temp = head;
                while (temp != null) {
                        System.out.print(temp.val + " ");
                        temp = temp.next;
                }
                // Output: 5 4 3 2 1
        }
}
