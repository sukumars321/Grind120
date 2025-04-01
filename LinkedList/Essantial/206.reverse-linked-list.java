/*
 * @lc app=leetcode id=206 lang=java
 *
 * [206] Reverse Linked List
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
    public ListNode reverseList(ListNode head) {
        // iteration
        // if (head == null || head.next == null) {
        // return head;
        // }
        // ListNode prev = null;
        // ListNode curr = head;
        // ListNode next;

        // while (curr != null) {
        // next = curr.next;
        // curr.next = prev;
        // prev = curr;
        // curr = next;
        // }
        // return prev;
        
        // recursive solution
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newhead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newhead;
    }
}
// @lc code=end
