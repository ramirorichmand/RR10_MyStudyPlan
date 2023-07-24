# 31. Next Permutation

## Problem Description

Given an array of integers `nums`, you need to find the next permutation of `nums` in-place.

The next permutation is the next lexicographically greater permutation of the given array. If such an arrangement is not possible, the array must be rearranged to the lowest possible order, i.e., sorted in ascending order.

## Approach and Algorithm

To find the next permutation, we follow these steps:

1. Find the largest index `i` such that `nums[i] < nums[i+1]`. If no such index exists, the array is already in descending order, and we simply reverse the array to get the lowest possible order.
2. Find the largest index `j` greater than `i` such that `nums[j] > nums[i]`.
3. Swap `nums[i]` with `nums[j]`.
4. Reverse the subarray from index `i+1` to the end of the array.

This algorithm guarantees the next lexicographically greater permutation.

## Complexity Analysis

The time complexity of this algorithm is O(n), where n is the length of the input array `nums`, as we iterate through the array twice. The space complexity is O(1) as we perform the operation in-place.

## Conclusion

The next permutation problem can be solved efficiently by following the algorithm described above. By understanding the concept of lexicographic ordering and applying the steps in the algorithm, we can find the next permutation of an array in-place.
