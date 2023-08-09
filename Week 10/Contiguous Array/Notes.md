# Contiguous Array

## Task Description:
Given a binary array `nums`, the task is to return the maximum length of a contiguous subarray with an equal number of 0 and 1.

## Approach and Algorithm:
To solve this problem, I will use a hashmap to keep track of the cumulative sum of elements in the binary array and their corresponding indices.

1. I will iterate through the binary array `nums` and change all the 0s to -1s, effectively turning the problem into finding the longest subarray with a sum of 0.
2. I will initialize a hashmap `sumToIndex` with an initial entry `(0, -1)`, where 0 represents the cumulative sum and -1 represents the index before the beginning of the array.
3. I will initialize two variables `maxLen` and `currSum` to keep track of the maximum length and the current cumulative sum, respectively.
4. I will iterate through the modified array, updating `currSum` and checking if `currSum` is already in the `sumToIndex` hashmap:
   - If `currSum` is in the hashmap, I will update `maxLen` with the maximum of `maxLen` and `i - sumToIndex[currSum]`, where `i` is the current index.
   - If `currSum` is not in the hashmap, I will add an entry `(currSum, i)` to the hashmap.
5. After iterating through the array, I will return `maxLen` as the result.

The result will be the maximum length of a contiguous subarray with an equal number of 0 and 1.

## Complexity Analysis:
- Let `n` be the length of the input binary array `nums`.
- The time complexity of the algorithm is O(n) because I iterate through the array once.
- The space complexity is O(n) due to the use of the hashmap to store cumulative sums and indices.
- In conclusion, the hashmap-based approach allows me to find the maximum length of a contiguous subarray with equal numbers of 0 and 1 in O(n) time complexity and O(n) space complexity. The algorithm efficiently keeps track of cumulative sums and indices to determine the longest subarray satisfying the condition.
