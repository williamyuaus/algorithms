package LinkedList.getTheLastKNode;

import utils.ListNode;

public class Solution {
    public ListNode findKthToTail(ListNode head, int k) {
        if (head == null || k == 0) {
            return null;
        }
        //int i = 0;
        ListNode firstNode = head;
        ListNode secondNode = head;
        for (int i = 0; i < k - 1; ++i) {
            if (firstNode.next != null) {
                firstNode = firstNode.next;
            } else {
                return null;
            }
        }

        while (firstNode.next != null) {
            firstNode = firstNode.next;
            secondNode = secondNode.next;
        }

        return secondNode;
    }
}
