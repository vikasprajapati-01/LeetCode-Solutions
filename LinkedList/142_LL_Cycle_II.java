/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        int len = getCycle(head);
        if(len == 0) {
            return null;
        }

        ListNode temp = head;
        while(len > 0) {
            temp = temp.next;
            len--;
        }

        while(temp != head) {
            temp = temp.next;
            head = head.next;
        }

        return head;
    }

    public int getCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                break;
            }
        }
        if(fast == null || fast.next == null) {
            return 0;
        }

        int len = 0;
        do {
            len++;
            slow = slow.next;
        } while(slow != fast);

        return len;
    }
}