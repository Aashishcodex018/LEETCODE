/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/


class Solution {
    public Node flatten(Node head) {

        Node curr = head;

        while (curr != null) {

            if (curr.child != null) {

                Node nextNode = curr.next;

                Node childNode = flatten(curr.child);

                curr.next = childNode;
                childNode.prev = curr;
                curr.child = null;

                Node temp = childNode;

                while (temp.next != null) {
                    temp = temp.next;
                }

                temp.next = nextNode;

                if (nextNode != null) {
                    nextNode.prev = temp;
                }
            }

            curr = curr.next;
        }

        return head;
    }
}
