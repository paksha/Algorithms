/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode current = head;
        boolean add1 = false;
        
        while (l1!=null || l2!=null) {
            int sum = 0;
            
            if (l1==null) {
                sum = l2.val;
                l2 = l2.next;
            } else if (l2 == null) {
                sum = l1.val;
                l1 = l1.next;
            } else {
                sum = l1.val+l2.val;
                l1 = l1.next;
                l2 = l2.next;
            }
            
            if (add1) {
                sum++;
            }
            
            if (sum>= 10) {
                sum -= 10;
                add1 = true;
            } else {
                add1 = false;
            }
            
            current.next = new ListNode(sum);
            current = current.next;
        }
        
        if (add1) {
            current.next = new ListNode(1);
        }
        
        return head.next;
    }
}