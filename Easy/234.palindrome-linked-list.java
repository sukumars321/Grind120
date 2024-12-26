/*
 * @lc app=leetcode id=234 lang=java
 *
 * [234] Palindrome Linked List
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
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        // I got confused and broke the list into two halfs which was unnecassary and
        // started reversing from mid.next which is wrong, whther its odd or even length
        // we can reverse from mid itself and compare and it will automatically handle the case
        // since it will match the the element itself from the original list if its odd length
        ListNode mid = findMid(head, head);
        ListNode headSecondHalf = reverse(mid);

        while (head != null && headSecondHalf != null) {
            if (head.val != headSecondHalf.val) {
                return false;
            }
            head = head.next;
            headSecondHalf = headSecondHalf.next;
        }
        return true;
    }

    private ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = reverse(head.next);

        // we get [1] as ans and we make [1].next -> [2]
        // then we make [2].next = null to break getting from [2] to [1]
        // then we return [1] as the ans to parent call

        head.next.next = head;
        head.next = null;

        return newHead;
    }

    private ListNode findMid(ListNode slow, ListNode fast) {
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
// @lc code=end
