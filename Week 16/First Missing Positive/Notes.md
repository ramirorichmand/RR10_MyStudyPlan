# First Missing Positive

## Task Description
Given an unsorted integer array nums, return the smallest missing positive integer. Implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

## Approach
To find the smallest missing positive integer, we can rearrange the array in-place to put each number in its correct position. After rearranging, we iterate through the array to find the first index where the value is not equal to its index. The missing positive integer is then the current index + 1.

The algorithm follows these steps:
1. Iterate through the array and move each number to its correct position by swapping.
2. After rearranging, iterate through the array to find the first index where the value is not equal to its index.
3. Return the current index + 1 as the smallest missing positive integer.

## Complexity Analysis
- Time Complexity: O(n), where n is the length of the input array. We perform a constant amount of work for each element in the array.
- Space Complexity: O(1), as we use constant auxiliary space for swapping elements in-place.

## Conclusion
The algorithm efficiently finds the smallest missing positive integer by rearranging the array in-place. It ensures the desired time and space complexity requirements.
