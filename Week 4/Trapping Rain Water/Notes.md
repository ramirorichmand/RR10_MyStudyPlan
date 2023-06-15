# Problem: Trapping Rain Water

## Problem Description

Given an elevation map represented by a list of non-negative integers, where each integer represents the height of a bar and the width of each bar is 1, compute how much water can be trapped after raining.

### Example:

Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The elevation map (black section) is represented by the array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rainwater (blue section) are being trapped.

Input: height = [4,2,0,3,2,5]
Output: 9

## Approach and Algorithm

To solve this problem, I used the following approach:

1. initialise variables to keep track of the total trapped water and the maximum heights on the left and right sides.
2. Iterate over each bar in the elevation map from left to right.
3. For each bar, calculate the maximum height on the left side by comparing the current bar's height with the previous maximum height.
4. Iterate over each bar again, but this time from right to left.
5. For each bar, calculate the maximum height on the right side by comparing the current bar's height with the previous maximum height.
6. Iterate over each bar in the elevation map.
7. Calculate the amount of water that can be trapped at each bar by taking the minimum of the maximum heights on the left and right sides and subtracting the height of the current bar.
8. Add the calculated amount of trapped water to the total trapped water variable.
9. Return the total trapped water as the final result.

## Complexity Analysis

The time complexity of this approach is O(n), where n is the number of bars in the elevation map. This is because we iterate over the elevation map three times: once from left to right, once from right to left, and once to calculate the trapped water at each bar.

The space complexity is O(1) because we only use a constant amount of extra space to store the variables for the total trapped water and the maximum heights on the left and right sides.

## Conclusion

By following the approach outlined above, we can efficiently compute the amount of water that can be trapped after raining on the given elevation map. The algorithm has a linear time complexity and a constant space complexity, making it an optimal solution for the problem.
