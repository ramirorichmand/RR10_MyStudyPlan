# N-Queens

## Task Description
The n-queens puzzle involves placing n queens on an n x n chessboard such that no two queens attack each other. Given an integer n, the goal is to find all distinct solutions to the n-queens puzzle. Each solution is represented as a board configuration with 'Q' indicating a queen and '.' indicating an empty space.

## Approach
To solve the n-queens puzzle, we can use backtracking. The idea is to try placing queens on each row while ensuring that no two queens attack each other. We maintain the current state of the board and recursively explore all possible placements. If a valid solution is found, it is added to the result.

The algorithm follows these steps:
1. Start with an empty board configuration.
2. Try placing a queen in the first row and recursively explore placements for subsequent rows.
3. If a valid solution is found, add it to the result.
4. Backtrack by undoing the queen placement and try other possibilities.

## Complexity Analysis
- Time Complexity: O(n!), where n is the number of queens. The backtracking approach explores all possible configurations.
- Space Complexity: O(n), as we use an array to represent the board and recursion stack during backtracking.

## Conclusion
The backtracking approach efficiently finds all distinct solutions to the n-queens puzzle. It ensures the desired time and space complexity requirements.
