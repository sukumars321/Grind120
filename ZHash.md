1. TwoSum
    Use hashmap to store previous elements and its index, when looking at current index get (target - current element) and check if we have that in the map, if yes return the two indexes.

9. Valid Anagram - https://algo.monster/liteproblems/242
    This basic string manipulation, we need use char counting array of size 26 to find freq of elements occuring, one the thing to note is that the failing case for freq is !=0 because it can be negative too.

24. [383] Ransom Note - https://algo.monster/liteproblems/383
    Simple use of counting the alphabets frequencies, especially for this question we can intelligently return the answer mid way if we count freq for magazine first and check that against ransomnote (see code). 