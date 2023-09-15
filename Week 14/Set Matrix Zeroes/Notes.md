# Set Matrix Zeroes

## Task Description
Given an m x n integer matrix `matrix`, the task is to set the entire row and column to 0 if an element in the matrix is 0. The operation should be done in place.

## Approach and Algorithm
To set the matrix zeroes in place, we can use the following approach:

1. Create two boolean arrays, `rows` and `cols`, of length `m` and `n` respectively, initialized to False. These arrays will be used to mark which rows and columns need to be zeroed out.

2. Iterate through the matrix, and for each element `matrix[i][j]`:
   - If `matrix[i][j]` is 0, set `rows[i]` and `cols[j]` to True.

3. Iterate through the matrix again, and for each element `matrix[i][j]`:
   - If either `rows[i]` or `cols[j]` is True, set `matrix[i][j]` to 0.

4. The matrix will now have rows and columns zeroed out wherever there was a 0 in the original matrix.

## Complexity Analysis
### Time Complexity
The time complexity of this approach is O(m * n), where `m` is the number of rows and `n` is the number of columns in the matrix. We iterate through the matrix twice.

### Space Complexity
The space complexity is O(m + n) as we use two boolean arrays of length `m` and `n`.

## Conclusion
This approach efficiently sets the entire row and column to 0 for elements that are 0 in the original matrix. It uses additional space for two boolean arrays but does the operation in place. The algorithm works for matrices with up to 200 rows and columns and values within the range [-2^31, 2^31 - 1].
