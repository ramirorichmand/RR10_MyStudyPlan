# Search in Rotated Sorted Array

## Problem Description

In this problem, you are given an integer array `nums` that is sorted in ascending order (with distinct values). However, the array may be rotated at an unknown pivot index `k` such that the resulting array becomes [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).

You need to find the index of a given target value `target` in the array `nums`. If the target is not present in `nums`, you should return -1.

## Approach and Algorithm

To solve this problem, you can use the following approach:

1. initialise two pointers, `left` and `right`, to the start and end of the array, respectively.
2. Perform a modified binary search by repeatedly dividing the search space in half:
   - Calculate the mid index as `mid = (left + right) // 2`.
   - Check if the target is equal to the value at the mid index (`nums[mid] == target`). If true, return `mid`.
   - Check if the left half of the array is sorted (nums[left] <= nums[mid]). If true, perform the following sub-steps:
     - Check if the target is within the left half (`nums[left] <= target < nums[mid]`). If true, update `right = mid - 1` to search the left half.
     - Otherwise, update `left = mid + 1` to search the right half.
   - If the left half is not sorted, then the right half must be sorted. Perform the following sub-steps:
     - Check if the target is within the right half (`nums[mid] < target <= nums[right]`). If true, update `left = mid + 1` to search the right half.
     - Otherwise, update `right = mid - 1` to search the left half.
3. If the target is not found during the binary search, return -1.

## Complexity Analysis

The time complexity of this approach is O(log n), where n is the number of elements in the array `nums`. This is because the binary search reduces the search space by half in each iteration.

The space complexity is O(1) since we are using a constant amount of space.

## Conclusion

The "Search in Rotated Sorted Array" problem can be solved using a modified binary search algorithm to find the target value in the given rotated sorted array.

By following the steps outlined above, you should be able to implement a solution that returns the index of the target if it is present in the array `nums`, or -1 if it is not present.

Remember to handle the edge cases and invalid inputs according to the problem constraints.

