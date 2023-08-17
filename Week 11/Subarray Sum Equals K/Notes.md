# Subarray Sum Equals K

## Task Description
Given an array of integers `nums` and an integer `k`, the task is to return the total number of subarrays whose sum equals `k`.

## Approach and Algorithm
To solve this problem, I will use the cumulative sum technique and a hash map to keep track of the cumulative sums and their frequencies.

1. Initialize a variable `count` to keep track of the total count of subarrays.
2. Initialize a variable `cumulativeSum` to keep track of the cumulative sum.
3. Create a hash map `cumulativeSumFreq` to store the frequency of each cumulative sum encountered so far.
4. Iterate through the array `nums`:
   - Update the `cumulativeSum` by adding the current element.
   - Check if `cumulativeSum - k` exists in the `cumulativeSumFreq` hash map. If it does, increment `count` by the frequency of `cumulativeSum - k`.
   - Increment the frequency of `cumulativeSum` in the `cumulativeSumFreq` hash map.
5. Return the total count of subarrays.

## Complexity Analysis
- Let `n` be the length of the array `nums`.
- The time complexity of the algorithm is O(n) as we iterate through the array once.
- The space complexity is O(n) due to the hash map used to store cumulative sums and their frequencies.
- In conclusion, the algorithm efficiently calculates the total number of subarrays whose sum equals `k` using the cumulative sum technique and a hash map with a time complexity of O(n) and a space complexity of O(n).

