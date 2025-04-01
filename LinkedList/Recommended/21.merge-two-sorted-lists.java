/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
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

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }
        
        // from algomonster -  We start by creating a dummy node, 
        // which is a typical technique used in linked list operations where the head of the result list is unknown
        ListNode dummyHead = new ListNode();
        ListNode curr = dummyHead;

        while (list1 != null && list2 != null) {
            if (list2.val <= list1.val) {
                curr.next = list2;
                list2 = list2.next;
            } else {
                curr.next = list1;
                list1 = list1.next;
            }
            curr= curr.next;
        }
        curr.next = (list1 == null) ? list2 : list1;
        // this is where the actual head is 
        return dummyHead.next;
    }
}
// @lc code=end
