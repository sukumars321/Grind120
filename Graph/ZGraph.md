[733] Flood Fill - https://algo.monster/liteproblems/733
     This is matrix DFS where we need check for out of bound and then simply fill the pixels as new color, I tried the new directions approach and got it right.

[542] 01 Matrix - https://algo.monster/liteproblems/542
    This question is based on finding the shortest path using BFS, we do this by marking all the cells that near to 0 as 1 and increment till we mark all the cells with the correct distance.

[200] Number of Islands - https://algo.monster/liteproblems/200
    we can find the island counts by starting with one island removing all its connected cells by marking them as '0'. we use can use either DFS or BFS. I have used BFS
    
[133] Clone Graph - https://algo.monster/liteproblems/133
    We can do both DFS and BFS for this problem, the main trick is to use Hashmap to track the elements

[994] Rotting Oranges - https://algo.monster/liteproblems/994
    This solvable in both ways but, its based on BFS finding shortest path.

    Minimum Knight Moves - https://algo.monster/liteproblems/1197
    BFS Practice question.

[417] Pacific Atlantic Water Flow - 
    This can be solved in both search but used dfs for simple implementation. if we use a naive approach we need to do dfs for all elements which would be O(mn)^2 TC, but by using the four edges as starting points we reduce it to O(mn)

GraphValidTree - https://algo.monster/liteproblems/261
    I solved this question by creating adjList and detecting if we have graph by doing dfs, but we need to apply UnionFind algorithm for this.

[207] Course Schedule - https://algo.monster/liteproblems/207
    This question's based on Khan's algo, we need to create a graph adjList and then bfs to see if we can take all the courses one by one. inDegree array helps with keep track of prerequisite count. this can be solved in DFS and BFS also since we have adjList all ready. but needs a bit of twist.

