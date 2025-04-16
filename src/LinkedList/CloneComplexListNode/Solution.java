package LinkedList.CloneComplexListNode;

import utils.ComplexListNode;

public class Solution {
    ComplexListNode cloneComplexListNode(ComplexListNode head) {
        if (head == null) {
            return null;
        }
        cloneNodes(head);
        connectSiblingNodes(head);
        return reconnectNodes(head);
    }

    void cloneNodes(ComplexListNode head) {
        ComplexListNode clonedNode = head;
        clonedNode.value = head.value;
        clonedNode.next = head.next;
        head.next = clonedNode;
        while (head.next != null) {
            ComplexListNode node = head.next;
            cloneNodes(node);
        }
    }

    void connectSiblingNodes(ComplexListNode head) {
        ComplexListNode clonedNode = head;
        if (head.sibling == null) {
            clonedNode.sibling = null;
        } else {
            ComplexListNode siblingNode = head.sibling;
            clonedNode.sibling = siblingNode.next;
        }

        while (head.next != null) {
            connectSiblingNodes(head.next);
        }
    }

    ComplexListNode reconnectNodes(ComplexListNode head) {
        ComplexListNode node = head;
        ComplexListNode clonedHead = null;
        ComplexListNode clonedNode = null;

        if (node != null) {
            clonedNode = node.next;
            clonedHead = clonedNode;
            node.next = clonedNode.next;
            node = clonedNode.next;
        }

        while (node != null) {
            clonedNode.next = node.next;
            clonedNode = clonedNode.next;
            node.next = clonedNode.next;
            node = node.next;
        }

        return clonedHead;
        
    }
}
