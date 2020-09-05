package leetcode.easy;

/**
 * https://leetcode.com/problems/merge-two-sorted-lists/
 * Date: 2020-09-06
 */
public class Q21_merge_two_sorted_lists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newNode = new ListNode();
        ListNode header = newNode;

        ListNode firstNode = l1;
        ListNode secondNode = l2;

        while (firstNode != null && secondNode != null) {
            if (firstNode.val < secondNode.val) {
                header.next = firstNode;
                firstNode = firstNode.next;
            } else {
                header.next = secondNode;
                secondNode = secondNode.next;
            }
            header = header.next;
        }

        if (firstNode != null) {
            header.next = firstNode;
        }

        if (secondNode != null) {
            header.next = secondNode;
        }

        return newNode.next;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) { this.val = val; }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

    }

}
