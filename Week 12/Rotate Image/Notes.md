# Rotate Image

## Task Description
Given an n x n 2D matrix representing an image, the task is to rotate the image by 90 degrees clockwise. The rotation should be done in-place, which means you have to modify the input 2D matrix directly without allocating another 2D matrix.

## Approach and Algorithm
To solve this problem, I will perform the rotation in layers, starting from the outermost layer and moving inwards. Each layer can be visualized as a square within the matrix.

Here are the steps:

1. Initialize variables `top`, `bottom`, `left`, and `right` to represent the boundaries of the current layer. Initially, `top = 0`, `bottom = n - 1`, `left = 0`, and `right = n - 1`.
2. Iterate through the layers, starting from the outermost layer:
   - For each layer, perform the rotation of elements in four steps:
     - Move the elements from the top row to the right column.
     - Move the elements from the right column to the bottom row.
     - Move the elements from the bottom row to the left column.
     - Move the elements from the left column to the top row.
     - Update the values of `top`, `bottom`, `left`, and `right` to move to the next inner layer.
3. Continue this process until `top` is greater than or equal to `bottom`, indicating that all layers have been rotated.

## Complexity Analysis
- Let `n` be the number of rows (or columns) in the matrix.
- The time complexity of the algorithm is O(n^2) because we iterate through all elements in the matrix, and each element is moved once during the rotation.
- The space complexity is O(1) as we perform the rotation in-place without using additional data structures.
- In conclusion, this approach allows us to rotate the image by 90 degrees clockwise in-place with a time complexity of O(n^2) and a space complexity of O(1).

