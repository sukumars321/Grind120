/*
 * @lc app=leetcode id=110 lang=java
 *
 * [110] Balanced Binary Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode third
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

    // the answer lies in the definition of the height-balanced btree
    // A height-balanced binary tree is a binary tree in which the depth of the two subtrees of every node never differs by more than one.
    // you can see the above line converted exactly to code in line 32
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        return Math.abs(dfs(root.left) - dfs(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    private static int dfs(TreeNode root) {
        if (root != null) {
            int leftDepth = dfs(root.left);
            int rightDepth = dfs(root.right);
            // i got confused on what needs to be return
            // we have return the max since thats how know how many
            // we have under the level
            int current = Math.max(leftDepth, rightDepth) + 1;
            return current;
        }
        return 0;
    }
    // see below for better implementation
}
// @lc code=end


class Solution2 {

    /**

     * Determines if a binary tree is balanced.

     * In a balanced tree, the height of the two subtrees of any node never differ by more than one.

     *

     * @param root The root of the binary tree.

     * @return true if the tree is balanced, false otherwise.

     */

    public boolean isBalanced(TreeNode root) {

        // A non-negative height indicates that the tree is balanced,

        // while -1 represents an imbalance.

        return calculateHeight(root) >= 0;

    }


    /**

     * Recursively calculates the height of a binary tree.

     * Returns -1 if the subtree is unbalanced.

     *

     * @param node The node to calculate height of.

     * @return The height of the tree if balanced, otherwise -1.

     */

    private int calculateHeight(TreeNode node) {

        // Tree with no nodes has height 0.

        if (node == null) {

            return 0;

        }


        // Recursively find the height of the left and right subtrees.

        int leftHeight = calculateHeight(node.left);

        int rightHeight = calculateHeight(node.right);

      

        // Check if left or right subtree is unbalanced or if they differ in height by more than 1.

        if (leftHeight == -1 || rightHeight == -1 || Math.abs(leftHeight - rightHeight) > 1) {

            return -1; // Tree is not balanced.

        }

      

        // Current node height is max of left and right subtree heights plus 1 (for the current node).

        return 1 + Math.max(leftHeight, rightHeight);

    }

}