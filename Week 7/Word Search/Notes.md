# Word Search

## Problem Description

Given an m x n grid of characters `board` and a string `word`, the task is to determine if the `word` exists in the grid. The `word` can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. However, the same letter cell may not be used more than once.

## Approach and Algorithm

To solve this problem, we can use a backtracking approach. We start by iterating through each cell in the grid. For each cell, we perform a depth-first search (DFS) to check if the current cell's letter matches the first letter of the `word`. If it does, we recursively explore the neighboring cells in the grid to find the remaining letters of the `word`. During the DFS, we mark the visited cells to avoid revisiting them and backtrack if the current path does not lead to a valid solution.

The algorithm follows these steps:

1. Implement a recursive backtracking function with the following parameters:
   - `row`: The current row index.
   - `col`: The current column index.
   - `index`: The index of the current letter in the `word` being searched.
2. Check if the indices `row` and `col` are out of bounds or if the current cell does not match the letter at `index` in the `word`. If any of these conditions are true, return `false`.
3. If `index` is equal to the length of the `word` minus one, it means we have found all the letters of the `word`, so return `true`.
4. Mark the current cell as visited (e.g., by changing its value to a special character).
5. Recursively call the backtracking function for the neighboring cells (up, down, left, and right) with the updated `index`.
6. After the recursive calls, backtrack by marking the current cell as unvisited (restoring its original value).
7. Iterate through each cell in the grid and call the backtracking function to check if the `word` exists.
8. If the backtracking function returns `true` for any cell, it means the `word` exists in the grid, so return `true`. Otherwise, return `false`.

## Complexity Analysis

Let m be the number of rows in the grid and n be the number of columns. Let k be the length of the `word`.

The backtracking algorithm explores all possible paths in the grid in a depth-first manner. In the worst case, it can visit all cells, resulting in a time complexity of O(m * n * 4^k) since each cell has four neighboring cells.

The space complexity is O(k) due to the recursive calls and the depth of the backtracking stack.

## Conclusion

By using a backtracking approach, we can determine if a given `word` exists in an m x n grid. The algorithm performs a depth-first search, exploring all possible paths and backtracking as needed. This approach allows us to efficiently search for the `word` by considering the neighboring cells and avoiding revisiting previously visited cells.
