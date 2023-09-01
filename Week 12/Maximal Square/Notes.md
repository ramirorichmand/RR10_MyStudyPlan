# Maximal Square

## Task Description
Given an m x n binary matrix filled with 0's and 1's, the task is to find the largest square containing only 1's and return its area.

## Approach and Algorithm
To solve this problem, I will use dynamic programming. I will create a 2D array `dp` of the same size as the input matrix to store the side length of the largest square ending at that position.

Here are the steps:

1. Initialize a variable `maxSide` to keep track of the maximum side length of the square found so far.
2. Iterate through the binary matrix:
   - If the current cell contains '1':
     - Set `dp[i][j]` to the minimum of the values to the left, above, and diagonally left above `dp[i-1][j]`, `dp[i][j-1]`, and `dp[i-1][j-1]`, and then add 1 to it. This step ensures that we are considering the minimum side length that allows us to form a square at this cell.
     - Update `maxSide` with the maximum of its current value and `dp[i][j]`.
3. After completing the iteration, return `maxSide * maxSide` as the area of the largest square containing only 1's.

## Complexity Analysis
- Let `m` be the number of rows and `n` be the number of columns in the matrix.
- The time complexity of the algorithm is O(m * n) because we iterate through the entire matrix once.
- The space complexity is O(m * n) as we use an additional 2D array of the same size as the input matrix.
- In conclusion, this dynamic programming approach allows us to find the area of the largest square containing only 1's in the binary matrix with a time complexity of O(m * n) and a space complexity of O(m * n).

