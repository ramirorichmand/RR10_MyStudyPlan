# 36. Valid Sudoku

## Problem Description

The problem asks us to determine whether a given 9x9 Sudoku board is valid. The validity is based on the following rules:

1. Each row must contain the digits 1-9 without repetition.
2. Each column must contain the digits 1-9 without repetition.
3. Each of the nine 3x3 sub-boxes of the grid must contain the digits 1-9 without repetition.

Note: A Sudoku board (partially filled) could be valid but not necessarily solvable. Only the filled cells need to be validated according to the mentioned rules.

## Example

Given the following Sudoku board:

[
["5","3",".",".","7",".",".",".","."],
["6",".",".","1","9","5",".",".","."],
[".","9","8",".",".",".",".","6","."],
["8",".",".",".","6",".",".",".","3"],
["4",".",".","8",".","3",".",".","1"],
["7",".",".",".","2",".",".",".","6"],
[".","6",".",".",".",".","2","8","."],
[".",".",".","4","1","9",".",".","5"],
[".",".",".",".","8",".",".","7","9"]
]


The output would be `true` since the board is a valid Sudoku configuration.

## Constraints

- `board.length == 9`
- `board[i].length == 9`
- `board[i][j]` is a digit 1-9 or '.'.

## Approach and Algorithm

To determine whether a Sudoku board is valid, we can iterate through each cell and check if the current value violates the rules. We'll use three sets to keep track of the digits in each row, column, and 3x3 sub-box. If a digit is already present in the corresponding set, it means the board is invalid.

1. Initialise three sets: `rows`, `cols`, and `boxes`.
2. Iterate through each cell in the board.
3. For each cell, check if the digit is already in the corresponding set `rows`, `cols`, or `boxes`.
4. If the digit is already present, return `false`.
5. Otherwise, add the digit to the corresponding set.
6. If all cells pass the validation, return `true`.

## Complexity Analysis

The time complexity for this approach is O(1) since the board size is fixed (9x9). The space complexity is also O(1) because we are using three sets of constant size.

## Conclusion

The problem asks us to determine the validity of a Sudoku board based on specific rules. By iterating through each cell and keeping track of digits in each row, column, and sub-box, we can efficiently check the validity of the board.
