/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> node_storage = new HashMap<>();
        Node dummy = new Node(0);
        Node n = head;
        Node dummy_head = dummy; 
        

        node_storage.put(head, dummy);
        
        while (n != null) {

            dummy_head.val = n.val;
            
            if (n.next != null) {
                Node next = new Node(n.next.val);
                node_storage.put(n.next, next);
                dummy_head.next = next;
            } else {
                dummy_head.next = null;
            }
            dummy_head = dummy_head.next;
            n = n.next;
        }

        n = head;
        dummy_head = dummy; 

        while (n != null) {
            if (n.random == null) {
                dummy_head.random = null;  
            } else {
                dummy_head.random = node_storage.get(n.random);
            } 

            dummy_head = dummy_head.next;
            n = n.next;
        }

        if (head == null) {
            dummy = null;
        }
        return dummy;
    }
}
