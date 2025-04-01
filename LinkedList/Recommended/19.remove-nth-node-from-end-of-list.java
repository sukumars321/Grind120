/*
 * @lc app=leetcode id=19 lang=java
 *
 * [19] Remove Nth Node From End of List
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || n == 0) {
            return head;
        }
        // create dummyHead to handle edge cases, list with 1 or 2 element
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
       
        // use fast and slow pointer
        ListNode fast = head;
        ListNode slow = dummyHead;
        // move fast ptr n steps ahead
        while (n-- > 0) {
            fast = fast.next;
        }
        // now till fast reaches end move fast and slow one step
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // now slow is pointing to the predecessor of the element we need to remove
        slow.next = slow.next.next;

        // return what ever happens to be the new head
        return dummyHead.next;
    }
    // TC: O(n), SC: O(1)
}
// @lc code=end
