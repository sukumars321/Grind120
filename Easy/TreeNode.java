/*
 * @lc app=leetcode id=235 lang=java
 *
 * [235] Lowest Common Ancestor of a Binary Search Tree
 */

// @lc code=start
/**


 */

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        if (root.val > p.val && root.val > q.val) {
            return lowestCommonAncestor(root.left, p, q);
        } else if (root.val < p.val && root.val < q.val) {
            return lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        // This is code takes advantage of the BST property that everything in the left side of the node is smaller and everything on the right side should be bigger
        //  so move the curr based on the value of p and q. 
        //  So we need to find only one element thats on top cuz from the question we know both values exist
        TreeNode curr=root;
        while(curr!=null){
            if(p.val<curr.val && q.val<curr.val){
                curr=curr.left;
                }
            else if(p.val>curr.val && q.val>curr.val){
                curr=curr.right;
            }
            else{
                return curr;
                }
        }
        return null;
    }
}
// @lc code=end
