1. TwoSum
    Use hashmap to store previous elements and its index, when looking at current index get (target - current element) and check if we have that in the map, if yes return the two indexes.


2. Best Time to Buy and Sell Stock - https://algo.monster/liteproblems/121
    This question is based on greedy algorithm
    for each price from the array we need to decide wether to take current price as buy or sell, if we its the lowest price we take as buyprice and skip computing profit, if its not buyprice then we check if the profit (current price - buyprice) is greater than previous profit max.

3. Majority Element - https://algo.monster/liteproblems/169
    This Question is exact Moore Voting Algorithm.
    The main idea is majority element appears more athan n/2 which means when we count the frequency using count it must outscore all other elements, so we use two variables count and candidate, count is track count and candidate is chosen when count = 0 meaning either we are starting the process or the previous element is not the majority element so its freq is reduced to 0.

4. ContainsDuplicate - https://algo.monster/liteproblems/217
    The most simple solution is to use set and keep track of previously occured element and see if current element has appeared before.

5. MeetingRooms - https://algo.monster/liteproblems/252
    This is precursor to merge intervals, this is pretty easy once we sort the 2D array based on start time.
    I need to remember how to sort 2D array on top of my mind. we can use build in sort or use bubble or selection sort other sorts would be way more complex

6. Move Zeros - https://algo.monster/liteproblems/283
    This is simple two pointer problem, but I could not solve it efficiently passing all edge cases, main idea is keeping track of where to move the nonzero elements which will move the zeros to right.

7. Squares of a sorted array - https://algo.monster/liteproblems/977
    the main idea is to build the ans from right by finding the biggest squre possible comparing start and end, I tried something similar to merge function of the mergesort but couldn't pass all the test cases, one thing that pops to mind is that if its similar to sorting then may be sorting techniques can be used.

8. Valid Palindrome - https://algo.monster/liteproblems/125
    Another classic two pointer question, once we figure out how to convert and check if Characters are equal we are done with the problem.

9. Valid Anagram - https://algo.monster/liteproblems/242
    This basic string manipulation, we need use char counting array of size 26 to find freq of elements occuring, one the thing to note is that the failing case for freq is !=0 because it can be negative too.

10. Longest Palindrome - https://algo.monster/liteproblems/409
    We need to count the frequency of all the charatcers and take even freq of all chars but we can't take odd chars as it is we need to subtract one to make it even and then add 1 to ans to have a center element.
    The algorithm greedily decides what to with each freq.

11. Longest Common Prefix - https://algo.monster/liteproblems/14
    This is very similar to matrix traversal but with strings, if we are not using the sorting solution (see the code), algorithm basically needs to find the shortest string and then find the common prefix between the shortest string vs all other elements. if all elements present shortest string is the answer if no we return the substring of shortest string we matched so for.

12. Binary Search - https://algo.monster/liteproblems/704
    Basic BS no further explanation is needed, but i forgot the syntax to calculate mid without integer overflowing 

13. First Bad Version - https://algo.monster/liteproblems/278
    This is exactly same binary search except you have decide the reducing the end differently, see the commented best approach

14. Flood Fill - https://algo.monster/liteproblems/733
     This is matrix DFS where we need check for out of bound and then simply fill the pixels as new color, I tried the new directions approach and got it right.
    
15. lowest Common Ancestor - https://algo.monster/liteproblems/235
    We need to take advantage of the BST property that everything in the left side of the node is smaller and everything on the right side should be bigger so move the curr based on the value of p and q.  So we need to find only one element thats on top cuz from the question we know both values exist.

16. Convert Sorted Array to Binary Search Tree - https://algo.monster/liteproblems/108
    This is basically BinarySearch but instead of finding target, we generate BST Nodes using left and right sub-arrays after splitting in middle each at each recursion.

17. Invert Binary Tree - https://algo.monster/liteproblems/226
    This is a classic question asked FAANGs involing Tree DFS, I was able to come up with the solution relatively quickly.
    
18. Balanced Binary Tree - https://algo.monster/liteproblems/110
    This problem is one of the "Implementation" questions, you can basically solve the problem with dfs doing the definition of height balanced. you find the height of the left and right subtree and check if they are balanced.

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

24. [383] Ransom Note - https://algo.monster/liteproblems/383
    Simple use of counting the alphabets frequencies, especially for this question we can intelligently return the answer mid way if we count freq for magazine first and check that against ransomnote (see code). 

25. [21] Merge Two Sorted Lists - https://algo.monster/liteproblems/21
    I struggled solve this problem, i figured out what needs to be done but couldn't do it in code. the main reason is that i didn't learn why they use dummyhead in linkedlist questions and this problem uses that. apart from the standard solution my idea of pointing the elements in between would work too, but haven't tried it. we use curr to keep track of the last element and update the small value as next at each iteration like merge sort.

26. [141] Linked List Cycle - https://algo.monster/liteproblems/21
    This uses the standard Floyd's cycle-finding algorithm to detect the cycle. this is also a two pointer question

27. [206] Reverse Linked List - https://algo.monster/liteproblems/206
    Use standard iterative solution of using 3 pointers for easy solution, recursion solution is simpler in code but requires some additional understanding
    
28. [876] Middle of the Linked List - https://algo.monster/liteproblems/876
    Another fast and slow pointer question, nothing more

29. [234] Palindrome Linked List - https://algo.monster/liteproblems/234
    This problem is basically combination of above to problem and and one extra comparison of values, I got confused on starting element of second half, need to correct that.

30. [20] Valid Parentheses - https://algo.monster/liteproblems/20
     Even though I know the solution by heart, I still made mistake because of my hurry and not working through examples, we have check if stack is empty before poping to cover edge cases.

31. [232] Implement Queue using Stacks - https://algo.monster/liteproblems/232
    Straight forward question use first queue to push elements and whenever doing pop or peek call the copy funtion if second stack is empty
    I thought we need to copy the elements to first if first is empty but that's unnecessary and it distrupt order of elements

32. [844] Backspace String Compare - https://algo.monster/liteproblems/844
    Very easy to solve with stack but there is a little tricky O(1) space solution we can do by iterating from the end
    and skipping backspace and associated chars.

33. [70] Climbing Stairs - https://algo.monster/liteproblems/70
    I need revise my DP knowledge before moving any further, I got the bare recursion solution with bad code but it TLEed.
    after referring the solution i was able to write it myself.

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

40. [13] Roman to Integer - https://algo.monster/liteproblems/13
    This is just simulation question, the main trick is to subtract value if we find the subtraction case and use a map to store the values

41. [9] Palindrome Number - https://algo.monster/liteproblems/9
    No explanation is needed for this one, one better aproach is to reverse only the second half and compare, see the algo solution copied.