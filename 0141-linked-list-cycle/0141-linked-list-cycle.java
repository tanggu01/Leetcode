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
        ListNode current = head;
        Set<ListNode> set = new HashSet<>();
        while (current != null) {
            if (!set.add(current)) return true;
            current = current.next;            
        }
        return false;
    }
}
