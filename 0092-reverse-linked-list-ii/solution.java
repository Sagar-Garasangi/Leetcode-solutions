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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode current=head;
        ListNode leftb=null;
        ListNode prev=null;
        ListNode temp;
        int count=1;
        while(count!=left){
            leftb=current;
            current=current.next;
            count++;
        }
        count=left;
         ListNode tail=current;
        while(count<=right){
   
            temp=current.next;
            current.next=prev;
            prev=current;
            current=temp;
            count++;
        }
        if (leftb == null) {
    head = prev;
} else {
    leftb.next = prev;
}

tail.next = current;

return head;
}
}
