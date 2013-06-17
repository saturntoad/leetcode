/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (head == null || n <= 0)
            return head;
        int count = 0;
        ListNode cur = head, last = null;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        if (n > count)
            return head;
        if (n == count)
            return head.next;
        cur = head;
        for (int i = 0 ; i < count - n ; ++i) {
            last = cur;
            cur = cur.next;
        }
        last.next = cur.next;
        return head;
    }
}