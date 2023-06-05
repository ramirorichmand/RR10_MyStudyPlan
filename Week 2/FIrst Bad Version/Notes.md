# 278. First Bad Version - Explanation and Approach

## Problem Description

Given a series of versions [1, 2, ..., n], where a "bad" version occurs after a certain point. The task is to find the first bad version using the provided API `isBadVersion(version)`.

The API `isBadVersion(version)` returns a boolean value indicating whether a given version is bad or not. All the versions after a bad version are also considered bad.

Implement a function that finds the first bad version while minimising the number of API calls.

## Approach

The problem can be solved using Binary Search. Binary Search is an efficient algorithm for finding an element in a sorted list by repeatedly dividing the search interval in half.

1. Initialise two pointers, `left` and `right`, to the first and last versions respectively: `left = 1` and `right = n`.
2. Perform a binary search by iterating while `left <= right`:
   - Compute the middle version as `mid = left + (right - left) / 2`.
   - Use the API call `isBadVersion(mid)` to check if the middle version is bad.
   - If `isBadVersion(mid)` returns `true`, it means the first bad version is on or before `mid`, so we update `right = mid - 1`.
   - If `isBadVersion(mid)` returns `false`, it means the first bad version is after `mid`, so we update `left = mid + 1`.
3. Repeat step 2 until `left > right`. At this point, the first bad version will be stored in the `left` pointer.
4. Return the value of `left` as the first bad version.

By using the binary search approach, the number of API calls is minimized, resulting in an efficient solution to the problem.

## Complexity Analysis

The time complexity of the binary search algorithm is O(log n) since we repeatedly divide the search interval in half.
The space complexity is O(1) as we only use a constant amount of extra space for the pointers.

## Summary

The problem involves finding the first bad version using an API `isBadVersion(version)`. By applying the binary search algorithm, we can efficiently locate the first bad version while minimizing the number of API calls. The binary search approach reduces the time complexity and provides an optimal solution for the problem.

