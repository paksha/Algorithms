/*
Reverse a singly linked list.

Example:

Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL
Follow up:

A linked list can be reversed either iteratively or recursively. Could you implement both?
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode prev = head.next;
        ListNode curr = head;
        head.next = null;
        
        while (prev != null) {
            ListNode tmp = prev;
            prev = prev.next;
            tmp.next = curr;
            curr = tmp;
            head = curr;
        }
        
        return head;
    }
}