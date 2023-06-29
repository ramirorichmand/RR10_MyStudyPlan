# Unique Paths

## Problem Description

Given an m x n grid, where a robot is initially located at the top-left corner and needs to reach the bottom-right corner, the task is to find the number of unique paths the robot can take to reach its destination. The robot can only move either down or right at any point in time.

## Approach and Algorithm

To solve this problem, we can use dynamic programming. We'll create a 2D array `dp` of size m x n, where `dp[i][j]` represents the number of unique paths to reach the cell at row i and column j.

The algorithm follows these steps:

1. Initialize the first row and first column of `dp` to 1 since there's only one way to reach any cell in the first row or first column (by moving only right or down, respectively).
2. Iterate through each cell in the grid starting from (1, 1) to (m-1, n-1).
   - At each cell (i, j), the number of unique paths is the sum of the number of paths from the cell above (i-1, j) and the cell to the left (i, j-1). This is because the robot can only move down or right.
   - Update `dp[i][j]` with the calculated value.
3. Return `dp[m-1][n-1]`, which represents the number of unique paths to reach the bottom-right corner.

## Complexity Analysis

The time complexity of this algorithm is O(m * n) since we iterate through all the cells in the grid.

The space complexity is also O(m * n) because we use a 2D array `dp` of the same size to store the number of unique paths for each cell.

## Conclusion

By utilizing dynamic programming, we can efficiently compute the number of unique paths for a robot to reach the bottom-right corner in an m x n grid. The algorithm takes advantage of the fact that the robot can only move down or right and uses a 2D array to store the intermediate results. This approach provides an optimal solution to the problem, allowing us to determine the number of unique paths in a time-efficient manner.
