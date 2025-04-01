[Essantial]
  [225] Implement Stack using Queues - https://algo.monster/liteproblems/225
    we use 2 queue to simulate stack operations


[Recommended]

31. [232] Implement Queue using Stacks - https://algo.monster/liteproblems/232
    Straight forward question use first queue to push elements and whenever doing pop or peek call the copy funtion if second stack is empty
    I thought we need to copy the elements to first if first is empty but that's unnecessary and it distrupt order of elements

  [622] Design Circular Queue - https://algo.monster/liteproblems/622
    one of the design questions, simulating the workflow with pen and paper worked out great.
  
  HitCounter -  https://leetcode.ca/2016-11-26-362-Design-Hit-Counter/
    This uses queue to track timestamps and when looking up we reduce the queue to inculde last 300 seconds and return the size of the queue.