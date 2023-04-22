/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0, head);
        ListNode curr = dummy;
        while (curr.next != null) { //curr.next = head (1)
            if (curr.next.val == val) { // 1 == 1
                curr.next = curr.next.next; // curr.next = 2 increment 대신 curr.next가 알아서 앞으로 옴
            } else {
                curr = curr.next; // curr = 0 -> 2 
            }
        }
        return dummy.next;
    }
}
