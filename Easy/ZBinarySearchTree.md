15. lowestCommonAncestor - https://algo.monster/liteproblems/235
    We need to take advantage of the BST property that everything in the left side of the node is smaller and everything on the right side should be bigger so move the curr based on the value of p and q.  So we need to find only one element thats on top cuz from the question we know both values exist.

16. Convert Sorted Array to Binary Search Tree - https://algo.monster/liteproblems/108
    This is basically BinarySearch but instead of finding target, we generate BST Nodes using left and right sub-arrays after splitting in middle each at each recursion.
    