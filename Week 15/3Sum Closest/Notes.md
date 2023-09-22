# 3Sum Closest

## Task Description
Given an integer array `nums` of length `n` and an integer `target`, the task is to find three integers in `nums` such that their sum is closest to `target`. The goal is to return the sum of the three integers.

## Approach and Algorithm
To solve this problem, we can use a similar approach as the 3Sum problem. Here's how I would approach it:

1. Sort the `nums` array in non-decreasing order.

2. Initialize a variable `closestSum` to store the closest sum found so far. Initially, set it to a large positive value.

3. Iterate through the `nums` array using a loop that goes from `i = 0` to `n - 2`, where `n` is the length of the array. For each `i`, do the following:

   a. Initialize two pointers, `left` and `right`, where `left = i + 1` and `right = n - 1`.

   b. While `left < right`, calculate the current sum `currentSum` as `nums[i] + nums[left] + nums[right]`.

   c. Update `closestSum` based on the absolute difference between `currentSum` and `target`. If the absolute difference is smaller than the absolute difference between `closestSum` and `target`, update `closestSum` to `currentSum`.

   d. If `currentSum` is less than `target`, increment `left` to explore larger values.

   e. If `currentSum` is greater than `target`, decrement `right` to explore smaller values.

   f. If `currentSum` is equal to `target`, return `target` as the closest sum, as it cannot get closer than this.

4. After the loop completes, return `closestSum` as the closest sum found.

## Complexity Analysis
### Time Complexity
The time complexity of this approach is O(n^2), where `n` is the length of the `nums` array. The sorting step takes O(n * log(n)) time, and for each element in the sorted array, we perform a 2Sum-like operation, which takes O(n) time.

### Space Complexity
The space complexity is O(1) because we use only a constant amount of extra space.

## Conclusion
This approach efficiently finds the closest sum of three integers in the `nums` array to the `target`. It works for arrays of up to 500 elements, each with values in the range [-1000, 1000].
