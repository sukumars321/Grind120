/*
 * @lc app=leetcode id=543 lang=java
 *
 * [543] Diameter of Binary Tree
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

    static int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;
    }

    // now i can make sense of the btree questions, once you know the basics well these are also
    // implementation type of questions, though i paid close attention to the question and figured out what
    // needs to be done, i was not able to fully convert that into code.

    // i realised i need to calculate height and dia but i coundn't figure out how to do that in 
    // a single recursion function but good practice to refresh concepts 

    // this implementation was corrected after i looked at the solution
    private static int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = height(node.left);
        int right = height(node.right);
        int dia = left + right;
        diameter = Math.max(diameter, dia);
        return Math.max(left, right) + 1;
    }

}
// @lc code=end
