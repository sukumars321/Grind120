/*
 * @lc app=leetcode id=572 lang=java
 *
 * [572] Subtree of Another Tree
 */

// @lc code=start

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    // this question was a bit tricky even though it uses the same
    // sameTree logic
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null){
            return false;
        }
        // we have to tree  == here as potential anwer and check if we have any further answers
        // if we get false here
        if (root.val == subRoot.val && isSameTree(root, subRoot)){
            return true;
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
    
    private static boolean isSameTree(TreeNode a, TreeNode b){
        if(a == null && b == null){
            return true;
        }

        if (a == null || b == null || a.val != b.val){
            return false;
        }

        return isSameTree(a.left, b.left) && isSameTree(a.right, b.right);
    }
}
// @lc code=end

