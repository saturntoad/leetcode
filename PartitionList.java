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
    public ListNode partition(ListNode head, int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (head == null)
            return null;
        ListNode newHead = null, curNode = head, insertNode = null, tempNode = null, tail = null;
        while (curNode != null) {
            if (curNode.val < x) {
                if (newHead == null) {
                    newHead = tail = insertNode = new ListNode(curNode.val);
                }
                else {
                    if (insertNode == null) {
                        tempNode = newHead;
                        newHead = insertNode = new ListNode(curNode.val);
                        newHead.next = tempNode;
                    }
                    else {
                        tempNode = insertNode.next;
                        insertNode.next = new ListNode(curNode.val);
                        insertNode = insertNode.next;
                        insertNode.next = tempNode;
                        if (tempNode == null)
                            tail = tail.next;
                    }
                }
            }
            else {
                if (newHead == null) {
                    newHead = tail = new ListNode(curNode.val);
                }
                else {
                    tail.next = new ListNode(curNode.val);
                    tail = tail.next;
                }
            }
            curNode = curNode.next;
        }
        if (newHead == null)
            return head;
        return newHead;
    }
}