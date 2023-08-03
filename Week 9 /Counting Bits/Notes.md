# Counting Bits

## Task Description:
Given an integer `n`, the task is to return an array `ans` of length `n + 1` such that for each `i` (0 <= i <= n), `ans[i]` is the number of 1's in the binary representation of `i`.

## Approach and Algorithm:
To solve this problem, I will use dynamic programming. I will initialize the `ans` array with all elements set to 0. Then, I will traverse through the numbers from 1 to `n` and update the `ans` array based on the count of 1's in their binary representation.

For each number `i`, the count of 1's in its binary representation can be obtained by counting the number of 1's in the binary representation of `i` without its rightmost bit (`i >> 1`) and adding the rightmost bit itself (`i & 1`).

The dynamic programming approach will involve filling the `ans` array from the lower numbers to the higher numbers. For each `i`, we can use the previously calculated counts for `i >> 1` to get the count for `i` in constant time. This way, we can achieve a linear time complexity O(n) and compute the counts in a single pass.

## Complexity Analysis:
- Let `n` be the given integer.
- The time complexity of the algorithm is O(n) as we traverse through all numbers from 1 to `n` to calculate the counts.
- The space complexity is O(n) to store the `ans` array.
- In conclusion, we can compute the array `ans` with counts of 1's in the binary representation of numbers from 0 to `n` in linear time O(n) and single pass, with O(n) space complexity. Additionally, we don't need any built-in functions for this approach.
