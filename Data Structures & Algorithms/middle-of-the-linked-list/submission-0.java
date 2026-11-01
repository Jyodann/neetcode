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
    public ListNode middleNode(ListNode head) {
        ListNode tortise = head;
        ListNode hare = head;

        while (hare != null && hare.next != null) {
            tortise = tortise.next;
            hare = hare.next.next; 
        }

        return tortise;
    }
}