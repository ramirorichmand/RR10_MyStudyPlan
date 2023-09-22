# Squares of a Sorted Array

## Task Description
Given an integer array `nums` sorted in non-decreasing order, the task is to return an array containing the squares of each number, sorted in non-decreasing order.

## Approach and Algorithm
To solve this problem efficiently, we can use a two-pointer approach. Here's how I would approach it:

1. Initialize two pointers, `left` and `right`, both initially pointing to the ends of the `nums` array.

2. Initialize an empty result array `squares` of the same length as `nums`.

3. Start a loop that runs from the end of `nums` to the beginning (from `n-1` to `0`), and in each iteration, do the following:
   - Calculate the squares of the values at the `left` and `right` pointers, i.e., `leftSquare = nums[left] * nums[left]` and `rightSquare = nums[right] * nums[right]`.

   - Compare `leftSquare` and `rightSquare`. If `leftSquare` is greater than or equal to `rightSquare`, add `leftSquare` to the result array `squares` at the current index and decrement the `left` pointer. Otherwise, add `rightSquare` to `squares` at the current index and decrement the `right` pointer.

4. Continue this loop until the `left` pointer is less than or equal to the `right` pointer.

5. After the loop, return the `squares` array, which now contains the squares of the numbers sorted in non-decreasing order.

## Complexity Analysis
### Time Complexity
The time complexity of this approach is O(n), where `n` is the number of elements in the `nums` array. We traverse the array once from both ends.

### Space Complexity
The space complexity is O(n) because we use an additional array of the same size as `nums` to store the squares.

## Conclusion
This approach efficiently computes the squares of the numbers in a sorted array and sorts them in non-decreasing order. It works for arrays of up to 10^4 elements, each with values in the range [-10^4, 10^4].
