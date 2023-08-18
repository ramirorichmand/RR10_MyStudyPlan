# Random Pick with Weight

## Task Description
The task is to implement the `pickIndex()` function that randomly picks an index in the range `[0, w.length - 1]` (inclusive) based on the given weights.

## Approach and Algorithm
To solve this problem, I will use the concept of prefix sum and binary search.

1. Compute the prefix sum of the input weights `w` such that `prefixSum[i]` represents the sum of weights up to index `i`.
2. Generate a random number `target` in the range `[0, totalSum - 1]`, where `totalSum` is the sum of all weights.
3. Perform binary search on the `prefixSum` array to find the index `i` where `prefixSum[i]` is the smallest value that is greater than or equal to `target`.
4. Return the index `i`.

## Complexity Analysis
- Let `n` be the length of the input weights array `w`.
- The time complexity of initializing the prefix sum array is O(n).
- The time complexity of the binary search is O(log n).
- The space complexity is O(n) for the prefix sum array.
- In conclusion, the algorithm efficiently picks an index based on the given weights using a combination of prefix sum and binary search with a time complexity of O(n + log n) and a space complexity of O(n).

