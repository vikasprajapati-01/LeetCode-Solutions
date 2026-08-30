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
        if(head == null || left == right) {
            return head;
        }
        ListNode cur = head;
        ListNode prev = null;

        for(int i = 1; cur != null && i<left; i++) {
            prev = cur;
            cur = cur.next;
        }

        ListNode last = prev;
        ListNode newEnd = cur;

        ListNode next = cur.next;
        for(int i = 0; cur != null && i<right - left + 1; i++) {
            cur.next = prev;
            prev = cur;
            cur = next;
            if(next != null) {
                next = next.next;
            }
        }

        if (last != null) {
            last.next = prev;
        }
        else {
            head = prev;
        }
        newEnd.next = cur;

        return head;
    }
}