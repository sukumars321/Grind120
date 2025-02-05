9. Valid Anagram - https://algo.monster/liteproblems/242
    This basic string manipulation, we need use char counting array of size 26 to find freq of elements occuring, one the thing to note is that the failing case for freq is !=0 because it can be negative too.

24. [383] Ransom Note - https://algo.monster/liteproblems/383
    Simple use of counting the alphabets frequencies, especially for this question we can intelligently return the answer mid way if we count freq for magazine first and check that against ransomnote (see code).

57. [3] Longest Substring Without Repeating Characters - https://algo.monster/liteproblems/3
    This problem was very easy when dry runned with examples, classic dynamic sliding window problem  

58. [8] String to Integer (atoi) - https://algo.monster/liteproblems/8
    One of the simulation questions, you need to code the instructions given, the main blocker is handling integer overflow, I couldn’t come up with logic to efficiently check for positive and negative overflows. Look at the algo solution for overflow handling 

61. [49] Group Anagrams - https://algo.monster/liteproblems/49
    Its basically solvable with Map, all you have to do is figure out what to use as key to group the anagrams, that is done by sorting the string and the finding the right group.

63. [179] Largest Number - https://leetcode.com/problems/largest-number/solutions/5783508/largest-number/
    I was very close but I tried to treat the nums as integer but the solution is to convert them to strings and do string comparison with two strings concatenated.

64. Encode and Decode String - https://algo.monster/liteproblems/271
    to make it easier to decode we need embed the length info into the encoded string by appending length before the actual string, see the solution.