# Move Zeroes

## Task Description
Given an integer array `nums`, the task is to move all 0's to the end of the array while maintaining the relative order of the non-zero elements. You must do this in-place without making a copy of the array.

## Approach and Algorithm
To solve this problem, I will use the following approach:

1. Initialize a variable `nonZeroIndex` to keep track of the position where the next non-zero element should be placed.
2. Iterate through the array using a loop:
   - If the current element is non-zero, assign it to the position `nonZeroIndex` and increment `nonZeroIndex`.
3. After the loop completes, fill the remaining positions from `nonZeroIndex` to the end of the array with zeros.

Steps in detail:
1. Initialize `nonZeroIndex` to 0.
2. Iterate through the array using a loop with index `i`:
   - If `nums[i]` is not zero, assign `nums[i]` to `nums[nonZeroIndex]` and increment `nonZeroIndex`.
3. After the loop completes, fill the remaining positions in the array from `nonZeroIndex` to the end with zeros.

## Complexity Analysis
- Let `n` be the number of elements in the array.
- The time complexity of the algorithm is O(n) since we iterate through the array once.
- The space complexity is O(1) since we use a constant amount of extra space.
- In conclusion, this approach allows us to move all 0's to the end of the array while maintaining the relative order of non-zero elements in O(n) time and O(1) space.

