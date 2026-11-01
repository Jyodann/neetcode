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
    public boolean hasCycle(ListNode head) {

        if (head == null) {
            return false;
        }
        // rabit and tortise:
        ListNode tortise = head;

        if (head.next == null) {
            return false;
        }

        ListNode rabbit = head.next.next;

        while (tortise != null) {
            if (tortise == rabbit) {
                return true;
            }

            tortise = tortise.next; 
            
            if (rabbit != null) {
                if (rabbit.next == null) {
                    return false;
                }
                rabbit = rabbit.next.next;
            }
        }
        return false;
    }
}
