# Search a 2D Matrix

## Task Description
Given an m x n integer matrix where each row is sorted in non-decreasing order and the first integer of each row is greater than the last integer of the previous row, determine if a target integer exists in the matrix. The task is to implement a solution with O(log(m * n)) time complexity.

## Approach and Algorithm
To efficiently search for the target integer, I will use binary search. Here's the algorithm I will follow:

1. Initialize two pointers, `left` and `right`, to represent the leftmost and rightmost indices of the flattened matrix (treated as a 1D array).

2. Calculate the total number of elements in the matrix, which is `m * n`.

3. Perform binary search in the flattened matrix:
   - Calculate the middle index as `mid = (left + right) / 2`.
   - Convert the `mid` index back to 2D coordinates as `row = mid / n` and `col = mid % n`.
   - Compare the matrix element `matrix[row][col]` with the target:
     - If `matrix[row][col]` is equal to the target, return `true` as the target is found.
     - If `matrix[row][col]` is greater than the target, update `right = mid - 1` to search in the left half of the remaining elements.
     - If `matrix[row][col]` is less than the target, update `left = mid + 1` to search in the right half of the remaining elements.

4. If the binary search completes without finding the target, return `false` as the target is not in the matrix.

## Complexity Analysis
- Time Complexity: The binary search takes O(log(m * n)) time since we are effectively searching in a flattened matrix.
- Space Complexity: The algorithm uses only a constant amount of space for variables, resulting in O(1) space complexity.

In conclusion, this approach efficiently searches for a target integer in the given matrix with a time complexity of O(log(m * n)) and a space complexity of O(1).

