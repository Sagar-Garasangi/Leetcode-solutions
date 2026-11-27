/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode oddDummy = new ListNode(-1);
        ListNode evenDummy = new ListNode(-1);

        ListNode oddTail = oddDummy;
        ListNode evenTail = evenDummy;

        ListNode current = head;
        int position = 1;

        while (current != null) {
            ListNode temp = current.next;
            current.next = null;

            if (position % 2 == 0) {
                evenTail.next = current;
                evenTail = current;
            } else {
                oddTail.next = current;
                oddTail = current;
            }

            current = temp;
            position++;
        }

        oddTail.next = evenDummy.next;

        return oddDummy.next;
    }
}
