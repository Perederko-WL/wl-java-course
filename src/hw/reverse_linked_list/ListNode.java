package hw.reverse_linked_list;

/// Definition for singly-linked list.
public class ListNode {
    /// Node value.
    int val;

    /// Next node in list. 'null' for las node in list.
    ListNode next;

    /// Class constructor.
    ListNode() {
    }

    /// Class constructor specifying value of object to create.
    ///
    /// @param val Node value.
    ListNode(int val) {
        this.val = val;
    }

    /// Class constructor specifying value of object to create and next node in list.
    ///
    /// @param val  Node value.
    /// @param next Next node in list.
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
