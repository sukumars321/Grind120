34. [67] Add Binary - https://algo.monster/liteproblems/67
    Simple traversing from the end logic is enough and we can easily compute the current answer digit and carry using %2 and /2. I have to remember this.

35. [338] Counting Bits - https://algo.monster/liteproblems/338
    This literally has so many solution, and under the hood its DP question, so understanding the pattern is very important,  see the solution for different approaches

36. [191] Number of 1 Bits - https://algo.monster/liteproblems/191
    simple case of removing LSB using n & (n-1) and counting no of removal would give the ans, Brian Kernighan’s Algorithm:

37. [136] Single Number - https://algo.monster/liteproblems/136
    This ques basically asks us to use ^ operator to find the no thats occuring one time.

38. [268] Missing Number - https://algo.monster/liteproblems/268
    This also uses XOR operator property, first we iterate 1 to n to get all value xored then we do the same with actual values, in the end everything we will cancel out except the missing number.

39. [190] Reverse Bits - https://algo.monster/liteproblems/190
    This is a 'bit' trickier, get it? so we can use left shit and right shift op to move the orginal valule right side and new val left side and if we have 1 LSB add 1 to answer. very nice question.