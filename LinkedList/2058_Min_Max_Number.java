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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return new int[]{-1, -1};
        }

        ListNode prev = head;
        ListNode cur = head.next;
        int min = Integer.MAX_VALUE;
        int max = -1;

        int first = -1;
        int second = -1;
        int ind = 1;
        while(cur.next != null) {
            int prevVal = prev.val;
            int curVal = cur.val;
            int nextVal = cur.next.val;
            if((curVal > prevVal && curVal > nextVal) || (curVal < prevVal && curVal < nextVal)) {
                if(first == -1) {
                    first = ind;
                }
                else {
                    min = Math.min(min, ind - second);
                    max = ind - first;
                }
                second = ind;
            }
            ind++;
            prev = cur;
            cur = cur.next;
        }

        if(first == -1 || first == second) {
            return new int[]{-1, -1};
        }

        return new int[]{min, max};
    }
}