# Number of Islands

## Problem Description

In this problem, you are given a 2D binary grid representing a map of '1's (land) and '0's (water). Your task is to count the number of islands in the grid.

An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You can assume that all four edges of the grid are surrounded by water.

## Approach and Algorithm

To solve this problem, you can use the following approach:

1. initialise a variable `numIslands` to store the count of islands.
2. Iterate over each cell in the grid.
3. If the current cell is '1', perform a depth-first search (DFS) to explore the island.
   - In the DFS, mark the current cell as visited by changing its value to '0'.
   - Recursively visit the neighboring cells (up, down, left, right) that are valid and equal to '1'.
4. After the DFS completes, increment `numIslands` by 1, as we have found an island.
5. Continue the iteration until all cells in the grid have been visited.
6. Finally, return the value of `numIslands`.

## Complexity Analysis

The time complexity of this approach is O(m * n), where m is the number of rows and n is the number of columns in the grid. This is because we need to visit each cell in the grid once.

The space complexity is O(m * n) in the worst case, considering the recursive call stack. However, in the average case, the space complexity is O(min(m, n)) for a balanced grid.

## Conclusion

The "Number of Islands" problem can be solved using a depth-first search (DFS) approach to explore and count the connected islands in the grid.

By following the steps outlined above, you should be able to implement a solution that counts the number of islands in the given binary grid.

Remember to handle the edge cases of an empty grid and invalid inputs according to the problem constraints.

