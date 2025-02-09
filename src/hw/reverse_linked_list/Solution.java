package hw.reverse_linked_list;

/// HW possible solutions.
///
/// @link [Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/description/)
public class Solution {
    /// Main.
    ///
    /// @param args Arguments list.
    public static void main(String[] args) {
        ListNode node_1 = new ListNode(5);
        ListNode node_2 = new ListNode(4, node_1);
        ListNode node_3 = new ListNode(3, node_2);
        ListNode node_4 = new ListNode(2, node_3);
        ListNode node_5 = new ListNode(1, node_4);

//        ListNode node = node_5;
//        ListNode node = reverseList(node_5);
        ListNode node = reverseListRecursion(node_5);
        do {
            System.out.println(node.val);
            node = node.next;
        } while (null != node);
    }

    /// Reverse list iteratively.
    ///
    /// @param head ListNode
    /// @return ListNode
    public static ListNode reverseList(ListNode head) {
        ListNode next = null;
        while (null != head) {
            ListNode newHead = head.next;
            head.next = next;
            next = head;
            head = newHead;
        }

        return next;
    }

    /// Reverse list recursively.
    ///
    /// @param head ListNode
    /// @return ListNode
    public static ListNode reverseListRecursion(ListNode head) {
        if (null == head || null == head.next) {
            return head;
        }
        ListNode newHead = reverseListRecursion(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }
}
