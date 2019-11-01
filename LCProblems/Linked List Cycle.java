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
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode walk = head, run = head;
        while (run.next != null && run.next.next != null) {
            walk = walk.next;
            run = run.next.next;
            if (walk == run) return true;
        }
        return false;
    }
}