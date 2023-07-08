# Contains Duplicate

## Problem Description

Given an integer array `nums`, the task is to determine whether any value appears at least twice in the array. If any element is repeated, return `true`; otherwise, return `false`.

## Approach and Algorithm

To solve this problem, we can use a hash set data structure to keep track of the elements we have encountered so far. The algorithm follows these steps:

1. Initialise an empty hash set.
2. Iterate through each element `num` in the array `nums`.
   - If `num` is already present in the hash set, return `true` (as we have found a duplicate).
   - Otherwise, add `num` to the hash set.
3. After iterating through all the elements, return `false` (as there are no duplicates).

## Complexity Analysis

The time complexity of this algorithm is O(N), where N is the length of the `nums` array. In the worst case, we need to iterate through all the elements in the array to determine the presence of duplicates.

The space complexity is also O(N) because, in the worst case, we may need to store all the elements of the `nums` array in the hash set.

## Conclusion

Using a hash set, we can efficiently determine whether any value appears at least twice in the given array. By keeping track of the elements we have encountered so far, we can identify duplicates and return the appropriate result. This algorithm provides a simple and effective solution to the problem, allowing us to quickly check for the presence of duplicates in an array of integers.
