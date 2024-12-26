
17. Invert Binary Tree - https://algo.monster/liteproblems/226
    This is a classic question asked FAANGs involing Tree DFS, I was able to come up with the solution relatively quickly.

18. Balanced Binary Tree - https://algo.monster/liteproblems/110
    This problem is one of the "Implementation" questions, you can basically solve the problem with dfs doing the definition of height balanced.

19. Diameter of Binary Tree - https://algo.monster/liteproblems/543
    This also uses the finding height technique but on top of it, it also calculates the dia at each level and keeps track of the max using global variables. this was bit hard to implement even though I understood the question. 

20. Maximum Depth of Binary Tree - https://algo.monster/liteproblems/104
    We need to find max of the depth of left and right subtree and return that value adding one. pretty straight forward question.

21.  Same Tree - https://algo.monster/liteproblems/100
     we basically check if root is equal if yes we check if left and right subtree is equal, this question helps with understanding btree and recursion better.

22. [101] Symmetric Tree - https://algo.monster/liteproblems/101
    This is jusy building on top of the previous question, the main trick is to take two pointers for left and right subtree and compare leftchild with rightchild and viceversa.

23. [572] Subtree of Another Tree - https://algo.monster/liteproblems/572
    This question uses Same Tree concept as sub-problem, we have to find the potential root of subtree in first try and check if they both are eqaal
    if they are return true, otherwise we may have another potential answers below.