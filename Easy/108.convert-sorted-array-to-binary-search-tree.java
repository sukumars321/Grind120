/*
 * @lc app=leetcode id=108 lang=java
 *
 * [108] Convert Sorted Array to Binary Search Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildBST(0, nums.length - 1, nums);
    }

    private static TreeNode buildBST(int start, int end, int[] nums) {
        // Same logic as binary search but instead of searching for a target 
        // we build the entire tree using left and right subarray we split
        if (start <= end) {
            int mid = start + (end - start) / 2;
            TreeNode node = new TreeNode(nums[mid]);
            node.left = buildBST(start, mid - 1, nums);
            node.right = buildBST(mid + 1, end, nums);
            return node;
        }
        return null;
    }
}
// @lc code=end
