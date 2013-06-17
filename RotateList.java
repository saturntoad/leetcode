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
    public ListNode rotateRight(ListNode head, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (head == null || n <= 0)
            return head;
        ListNode curNode = head, tail = null, newHead = null;
        int count = 0;
        while (curNode != null) {
            count++;
            tail = curNode;
            curNode = curNode.next;
        }
        n %= count;
        tail.next = head;
        curNode = head;
        for (int i = count - n ; i > 0 ; --i) {
            tail = curNode;
            curNode = curNode.next;
        }
        newHead = curNode;
        tail.next = null;
        return newHead;        
    }
}