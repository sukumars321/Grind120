/*
 * @lc app=leetcode id=141 lang=java
 *
 * [141] Linked List Cycle
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // my own implementation
        // if (head == null || head.next == null) {
        // return false;
        // }

        // ListNode slow = head;
        // ListNode fast = head.next;

        // while (slow != null && fast != null && fast.next != null) {
        // // ideally slow and fast meets if there is a cycle
        // if (slow == fast) {
        // return true;
        // }
        // // slow moves 1 step ahead
        // slow = slow.next;
        // // fast moves 2 steps ahead
        // fast = fast.next.next;
        // }
        // return false;

        // some improvements less code and more readable
        // from algomonster - this problem is based on 
        //  the "tortoise and the hare" algorithm, or Floyd's cycle-finding algorithm
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            // slow moves 1 step ahead
            slow = slow.next;
            // fast moves 2 steps ahead
            fast = fast.next.next;
            
            // ideally slow and fast meets if there is a cycle
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
// @lc code=end
