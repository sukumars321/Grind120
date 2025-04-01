[Essantial]

1. [1] TwoSum
    Use hashmap to store previous elements and its index, when looking at current index get (target - current element) and check if we have that in the map, if yes return the two indexes.

2. [121] Best Time to Buy and Sell Stock - https://algo.monster/liteproblems/121
    This question is based on greedy algorithm
    for each price from the array we need to decide wether to take current price as buy or sell, if we its the lowest price we take as buyprice and skip computing profit, if its not buyprice then we check if the profit (current price - buyprice) is greater than previous profit max.

44. [238] Product of Array Except Self - https://algo.monster/liteproblems/238
    This problem involves multiple iteration of array trick, since we can't use division we need compute prefix and suffix of product for i-th position and multiply both to get the answer.

[Recommended]

48. [11] Container With Most Water - https://algo.monster/liteproblems/11
    I was very worried about this problem cuz this has 35 min time limit but i was able solve it just like that after using pen and paper, I need keep follow this pen and paper strategy. this problem is basically two-pointer and greedly choice of max height at each iteration.

43. [15] 3Sum - https://algo.monster/liteproblems/15
    This extends twoSum and we can use twosum as subroutine to solve this problem. The main issue is finding triplets without duplicates, so to effectively solve this we need sort the input and use two pointer technique. I used set to handle the duplicates but we can add conditions to the code (a little complex) to skip the duplicates, see algo monster solution.

69. [33] Search in Rotated Sorted Array - https://algo.monster/liteproblems/33
    pre-determining solution approach before coming up with own think made this problem hard to solve. I knew the idea but still Couldn’t solve.

4. [217] ContainsDuplicate - https://algo.monster/liteproblems/217
    The most simple solution is to use set and keep track of previously occured element and see if current element has appeared before. 