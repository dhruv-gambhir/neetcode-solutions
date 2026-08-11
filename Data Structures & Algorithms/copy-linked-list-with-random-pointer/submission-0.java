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
        HashMap<Node, Node> copy= new HashMap();

        Node newHead = head;
        while(newHead != null) {
            Node cur = new Node(newHead.val);
            copy.put(newHead, cur);
            newHead = newHead.next;

        }

        newHead = head;
        while(newHead != null){
            Node cur = copy.get(newHead);
            cur.next = copy.get(newHead.next);
            cur.random = copy.get(newHead.random);
            newHead = newHead.next;
        }

        return copy.get(head);
    }
}

