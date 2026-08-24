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
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        // moving next to left-1
        for(int i=1; i<left; i++){
            prev = prev.next;
        }

        // reverse
        ListNode curr = prev.next;
        for(int i=0; i<right-left; i++){
            ListNode next = curr.next;
            curr.next = next.next; // remove next
            next.next = prev.next; // point to curr front
            prev.next = next; // insert after prev
        }
        return dummy.next;
    }
}