## 15. 3Sum

**Difficulty: Medium**

**Problem:**
Given an integer array `nums`, return all the triplets `[nums[i], nums[j], nums[k]]` such that `i != j`, `i != k`, and `j != k`, and `nums[i] + nums[j] + nums[k] == 0`.

Notice that the solution set must not contain duplicate triplets.


**Approach:**

To solve this problem, we can use the two-pointer technique. Here's an outline of the approach:

1. Sort the input array `nums` in ascending order.
2. Initialise an empty list `result` to store the triplets.
3. Iterate over the array `nums` up to the second-to-last element (i.e., `i` from 0 to `len(nums)-3`):
   - If the current element is greater than 0, break the loop because we won't find any triplets with a sum of zero.
   - If the current element is the same as the previous element, continue to the next iteration to avoid duplicates.
   - Set two pointers, `left` and `right`, initially pointing to the elements after `nums[i]` and the last element, respectively.
   - While `left` is less than `right`:
     - Calculate the sum of `nums[i]`, `nums[left]`, and `nums[right]`.
     - If the sum is equal to 0, append `[nums[i], nums[left], nums[right]]` to `result`.
     - If the sum is less than 0, increment `left` to move towards a larger element.
     - If the sum is greater than 0, decrement `right` to move towards a smaller element.
     - Skip duplicate elements by incrementing `left` and decrementing `right` if the next elements are the same as the current ones.
4. Return `result`.

**Complexity Analysis:**

- Time Complexity: O(n^2), where n is the length of the input array `nums`.
- Space Complexity: O(1) (excluding the space required for the output list).

