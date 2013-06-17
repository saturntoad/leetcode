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
    public ListNode swapPairs(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (head == null || head.next == null)
            return head;
        ListNode newHead = null, curNode = head, temp = null, lastNode = null;
        while (curNode != null && curNode.next != null) {
            if (newHead == null) {
                newHead = curNode.next;
                temp = curNode.next.next;
                curNode.next.next = curNode;
                curNode.next = temp;
            }
            else {
                lastNode.next = curNode.next;
                temp = curNode.next.next;
                curNode.next.next = curNode;
                curNode.next = temp;
            }
            lastNode = curNode;
            curNode = curNode.next;
        }
        return newHead;
    }
}