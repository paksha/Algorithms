/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class ListComparator implements Comparator<ListNode> { 
        public int compare(ListNode s1, ListNode s2) { 
            if (s1.val < s2.val) return -1; 
            else if (s1.val > s2.val) return 1; 
            return 0; 
        }
} 

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        int numLists = lists.length;
        if (numLists == 0) return null;
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>(numLists, new ListComparator());
        ListNode first = new ListNode(0);
        ListNode head = first; 
        for (int i = 0; i < numLists; ++i) {
            // add first elements of each
            if (lists[i] == null) continue; 
            minHeap.add(lists[i]);
        }
        
        while (minHeap.size() > 0) {
            ListNode nextAdd = minHeap.poll();
            if (nextAdd.next != null) {
                minHeap.add(nextAdd.next);
            }
            head.next = nextAdd;
            head = head.next;
        }
        
        return first.next;
    }
}