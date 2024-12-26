30. [20] Valid Parentheses - https://algo.monster/liteproblems/20
     Even though I know the solution by heart, I still made mistake because of my hurry and not working through examples, we have check if stack is empty before poping to cover edge cases.

31. [232] Implement Queue using Stacks - https://algo.monster/liteproblems/232
    Straight forward question use first queue to push elements and whenever doing pop or peek call the copy funtion if second stack is empty
    I thought we need to copy the elements to first if first is empty but that's unnecessary and it distrupt order of elements

32. [844] Backspace String Compare - https://algo.monster/liteproblems/844
    Very easy to solve with stack but there is a little tricky O(1) space solution we can do by iterating from the end
    and skipping backspace and associated chars.