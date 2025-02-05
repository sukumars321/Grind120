1. TwoSum
    Use hashmap to store previous elements and its index, when looking at current index get (target - current element) and check if we have that in the map, if yes return the two indexes.

9. Valid Anagram - https://algo.monster/liteproblems/242
    This basic string manipulation, we need use char counting array of size 26 to find freq of elements occuring, one the thing to note is that the failing case for freq is !=0 because it can be negative too.

24. [383] Ransom Note - https://algo.monster/liteproblems/383
    Simple use of counting the alphabets frequencies, especially for this question we can intelligently return the answer mid way if we count freq for magazine first and check that against ransomnote (see code). 

47. [75] Sort Colors - https://algo.monster/liteproblems/75
    Based on the solution approach uses a variant of the famous Dutch National Flag algorithm proposed by Edsger Dijkstra, we use 3 pointers to keep track of 0s, 1s, and 2s.

50. [128] Longest Consecutive Sequence - https://algo.monster/liteproblems/128
    This used to be hard solution!, but now its medium. I was very close to the idea but couldn't exactly figure out finding the starts of the sequences. but I was close, we need to use set to remove duplicates and get O(1) lookup time. Then we find the starts by checking for (num-1) and try to build a sequence with that.

52. [525] Contiguous Array - https://leetcode.com/problems/contiguous-array/solutions/127452/contiguous-array/
    This is problem was very interesting, and can't be solved in sliding window, we need keep the count of 1 and 0s occured till the index using map and get the diff of indexes if we finde same count twice.

53. [560] Subarray Sum Equals K - https://leetcode.com/problems/subarray-sum-equals-k/editorial/
    We need to use the idea of above solution to this as well. it seems there is hashmap pattern here.

54. Meeting Rooms II - https://neetcode.io/solutions/meeting-rooms-ii    https://leetcode.com/discuss/study-guide/2166045/line-sweep-algorithms
    This problem is based on sweep line algorithm, this can be solved using priorityQueue as well after sorting based on start time.

61. [49] Group Anagrams - https://algo.monster/liteproblems/49
    Its basically solvable with Map, all you have to do is figure out what to use as key to group the anagrams, that is done by sorting the string and the finding the right group.