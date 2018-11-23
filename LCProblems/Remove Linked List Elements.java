/*
Remove all elements from a linked list of integers that have value val.

Example:

Input:  1->2->6->3->4->5->6, val = 6
Output: 1->2->3->4->5
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
    public ListNode removeElements(ListNode head, int val) {
        ListNode curr = head;
        ListNode prev = null;
        while (curr != null) {
            if (curr.val == val && prev == null) {
                curr = curr.next;
                head = curr;
            } else if (curr.val == val && prev != null) {
                ListNode temp = curr.next;
                prev.next = temp;
                curr = temp;
            } else {
                prev = curr;
                curr = curr.next;
            }
        }
        return head;
    }
}