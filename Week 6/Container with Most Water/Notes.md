# Container With Most Water

## Problem Description

Given an integer array `height` of length `n`, where `height[i]` represents the height of the vertical line at position `i`, the task is to find two lines that, together with the x-axis, form a container that can hold the most water. Return the maximum amount of water that can be stored in the container.

## Approach and Algorithm

To solve this problem, we can use a two-pointer approach. We start with two pointers, `left` and `right`, pointing to the leftmost and rightmost elements of the array, respectively. We calculate the area of the container using the formula `area = min(height[left], height[right]) * (right - left)`, which represents the height of the shorter line multiplied by the width between the lines.

The algorithm follows these steps:

1. Initialize `left` to 0 and `right` to `n - 1`, where `n` is the length of the `height` array.
2. Initialize a variable `maxArea` to 0 to store the maximum area found so far.
3. While `left` is less than `right`, do the following:
   - Calculate the current area using the formula `area = min(height[left], height[right]) * (right - left)`.
   - Update `maxArea` if the current area is greater than `maxArea`.
   - Move the pointer that corresponds to the shorter line inward. If `height[left]` is less than `height[right]`, increment `left` by 1; otherwise, decrement `right` by 1.
4. After the loop, return `maxArea`.

## Complexity Analysis

The time complexity of this algorithm is O(n), where n is the length of the `height` array. We iterate through the array once using the two-pointer approach.

The space complexity is O(1) since we only use a constant amount of extra space to store the pointers and variables.

## Conclusion

By using the two-pointer approach, we can efficiently find the container with the most water. The algorithm iterates through the array, gradually moving the pointers towards the center while calculating the area at each step. This approach allows us to find the maximum amount of water that can be stored in the container in linear time.
