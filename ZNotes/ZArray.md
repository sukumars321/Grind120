44. [238] Product of Array Except Self - https://algo.monster/liteproblems/238
    This problem involves multiple iteration of array trick, since we can't use division we need compute prefix and suffix of product for i-th position and multiply both to get the answer.

51. [189] Rotate Array - https://algo.monster/liteproblems/189
    Main idea is to smartly reverse the arrays three times in place to achieve SC O(1) and TC O(n). 

52. [525] Contiguous Array - https://leetcode.com/problems/contiguous-array/solutions/127452/contiguous-array/
    This is problem was very interesting, and can't be solved in sliding window, we need keep the count of 1 and 0s occured till the index using map and get the diff of indexes if we finde same count twice.

53. [[560] Subarray Sum Equals K - https://leetcode.com/problems/subarray-sum-equals-k/editorial/
    We need to use the idea of above solution to this as well. it seems there is hashmap pattern here.

56. [435] Non-overlapping Intervals - https://algo.monster/liteproblems/435
    we need to sort the intervals by end time to know to group the intervals that are ending by the same time (possibly), then we compare the last non-overlaping intervals end to start of the current.