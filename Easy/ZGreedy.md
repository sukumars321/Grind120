2. Best Time to Buy and Sell Stock
    This question is based on greedy algorithm
    for each price from the array we need to decide wether to take current price as buy or sell, if we its the lowest price we take as buyprice and skip computing profit, if its not buyprice then we check if the profit (current price - buyprice) is greater than previous profit max.

3. Majority Element 
    This Question is exact Moore Voting Algorithm.
    The main idea is majority element appears more athan n/2 which means when we count the frequency using count it must outscore all other elements, so we use two variables count and candidate, count is track count and candidate is chosen when count = 0 meaning either we are starting the process or the previous element is not the majority element so its freq is reduced to 0.

10. Longest Palindrome - https://algo.monster/liteproblems/409
    We need to count the frequency of all the charatcers and take even freq of all chars but we can't take odd chars as it is we need to subtract one to make it even and then add 1 to ans to have a center element.
    The algorithm greedily decides what to with each freq.