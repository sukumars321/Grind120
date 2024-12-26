/*
 * @lc app=leetcode id=876 lang=java
 *
 * [876] Middle of the Linked List
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    // another standard fast and slow two-pointer problem
    public ListNode middleNode(ListNode head) {
        if (head == null ||  head.next == null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        
        // the idea is that when we do fast and slow pointers
        // at the end of fast pointer slow will pointing to middle
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
// @lc code=end

