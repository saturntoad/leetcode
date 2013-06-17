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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ListNode head=null, cur=null;
        int carry = 0;
        while(l1 != null || l2 != null) {
            if(l1 != null) {
                carry += l1.val;
                l1 = l1.next;
            }
            if(l2 != null) {
                carry += l2.val;
                l2 = l2.next;
            }
            if(head == null) {
                if(carry >= 10) {
                    head = cur = new ListNode(carry - 10);
                    carry = 1;
                }
                else {
                    head = cur = new ListNode(carry);
                    carry = 0;
                }
                continue;
            }
            if(carry >= 10) {
                cur.next = new ListNode(carry - 10);
                carry = 1;
            }
            else {
                cur.next = new ListNode(carry);
                carry = 0;
            }
            cur = cur.next;
        }
        if(carry > 0) {
            cur.next = new ListNode(1);
        }
        return head;
    }
}