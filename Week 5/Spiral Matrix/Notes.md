# Spiral Matrix

## Problem Description

Given an m x n matrix, you need to return all elements of the matrix in spiral order.

## Approach and Algorithm

To solve this problem, we can use the concept of layers and iterate through the matrix in a spiral order.

1. We initialize four variables: `top`, `bottom`, `left`, and `right`, which represent the boundaries of the current layer.
2. We start with `top = 0`, `bottom = m - 1`, `left = 0`, and `right = n - 1`, where `m` is the number of rows and `n` is the number of columns in the matrix.
3. We iterate through the matrix in a spiral order by following these steps:
   - Iterate from `left` to `right` and add the elements in the top row to the result.
   - Increment `top` to move to the next layer.
   - Iterate from `top` to `bottom` and add the elements in the rightmost column to the result.
   - Decrement `right` to move to the next layer.
   - Check if `top <= bottom` to ensure that there is a valid row range for the remaining steps.
   - Iterate from `right` to `left` and add the elements in the bottom row to the result.
   - Decrement `bottom` to move to the next layer.
   - Check if `left <= right` to ensure that there is a valid column range for the remaining steps.
   - Iterate from `bottom` to `top` and add the elements in the leftmost column to the result.
   - Increment `left` to move to the next layer.
4. Finally, we return the result, which contains all the elements of the matrix in spiral order.

## Complexity Analysis

The time complexity of this approach is O(m * n), where `m` is the number of rows and `n` is the number of columns in the matrix. We need to iterate through every element in the matrix.
The space complexity is O(1) as we only need a few variables to store the boundaries and the result.

## Conclusion

The "Spiral Matrix" problem can be solved by iterating through the matrix in a spiral order. By following the algorithm mentioned above, we can return all elements of the matrix in the required order.
