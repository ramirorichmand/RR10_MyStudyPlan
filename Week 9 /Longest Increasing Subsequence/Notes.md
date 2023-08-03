# Longest Increasing Subsequence

## Task Description:
Given an integer array `nums`, the task is to return the length of the longest strictly increasing subsequence.

## Approach and Algorithm:
To find the length of the longest strictly increasing subsequence, I will use dynamic programming. I will create an array `dp` of the same length as `nums`, where `dp[i]` will store the length of the longest strictly increasing subsequence ending at index `i`.

For each index `i` in `nums`, I will iterate through all the previous indices (from 0 to `i-1`) and check if the value at index `i` is greater than the value at index `j` (where `j` ranges from 0 to `i-1`). If it is greater, I will update the value of `dp[i]` to be the maximum of `dp[i]` and `dp[j] + 1`. This is because the longest increasing subsequence ending at index `i` can be formed by extending the longest increasing subsequence ending at index `j` if the value at index `i` is greater than the value at index `j`.

Finally, the answer will be the maximum value in the `dp` array, which represents the length of the longest strictly increasing subsequence in the original array.

## Complexity Analysis:
- Let `n` be the length of the input array `nums`.
- The time complexity of the algorithm is O(n^2) because for each index `i` in `nums`, we iterate through all previous indices (from 0 to `i-1`) to update the `dp` array.
- The space complexity is O(n) to store the `dp` array.
- The dynamic programming approach described above takes O(n^2) time, but we can optimize it to O(n log n) time using binary search.
- In conclusion, the length of the longest strictly increasing subsequence in the array `nums` can be found in O(n^2) time and O(n) space using dynamic programming, or it can be optimized to O(n log n) time using binary search.
