6. Move Zeros
    This is simple two pointer problem, but I could not solve it efficiently passing all edge cases, main idea is keeping track of where to move the nonzero elements which will move the zeros to right.

8. Valid Palindrome - https://algo.monster/liteproblems/125
    Another classic two pointer question, once we figure out how to convert and check if Characters are equal we are done with the problem.

43. [15] 3Sum - https://algo.monster/liteproblems/15
    This extends twoSum and we can use twosum as subroutine to solve this problem. The main issue is finding triplets without duplicates, so to effectively solve this we need sort the input and use two pointer technique. I used set to handle the duplicates but we can add conditions to the code (a little complex) to skip the duplicates, see algo monster solution 

48. [11] Container With Most Water - https://algo.monster/liteproblems/11
    I was very worried about this problem cuz this has 35 min time limit but i was able solve it just like that after using pen and paper, I need keep follow this pen and paper strategy. this problem is basically two-pointer and greedly choice of max height at each iteration.

55. [16] 3Sum Closest - https://algo.monster/liteproblems/16
    I was able come up with solution with the hint of using two-pointer for this ques, rest of the problem was understandable from the question, sorting and looking for triplets is the trick with checking the diff of target was currentSum.

59. [5] Longest Palindromic Substring - https://algo.monster/liteproblems/5
    I dont have the thinking process to do DP solution, so i am gonna learn DP. but I am able to come up with the gist of the problem based expanding around the center. the actual solution uses the same concepts in a better way