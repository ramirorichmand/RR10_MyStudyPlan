# Largest Rectangle in Histogram

## Problem Description

Given an array of integers `heights` representing the histogram's bar height where the width of each bar is 1, the task is to find the area of the largest rectangle in the histogram.

## Approach and Algorithm

To solve this problem, we can use the stack-based approach known as the "Monotonic Stack". The algorithm follows these steps:

1. Create an empty stack to store the indices of the bars in non-decreasing order of their heights.
2. Initialise a variable `maxArea` to store the maximum area found so far and set it to 0.
3. Iterate over each bar in the histogram:
   - If the stack is empty or the current bar's height is greater than or equal to the height of the bar at the top of the stack, push the index of the current bar onto the stack.
   - Otherwise, keep popping bars from the stack until a bar with a smaller height than the current bar is found. For each popped bar, calculate its area as the height multiplied by the width (the width is the difference between the current index and the index at the top of the stack or the leftmost bar if the stack is empty).
   - Update `maxArea` with the maximum of its current value and the area of the popped bar.
   - Push the index of the current bar onto the stack.
4. After the iteration, if there are any bars remaining in the stack, repeat the popping and area calculation process for each remaining bar.
5. Return `maxArea` as the result.

## Complexity Analysis

The time complexity of this algorithm is O(N), where N is the number of bars in the histogram. This is because we process each bar once and perform constant-time operations for each bar.

The space complexity is O(N), as the stack can store at most N indices in the worst case.

## Conclusion

Using the Monotonic Stack approach, we can efficiently find the area of the largest rectangle in a histogram. By maintaining a stack of indices in non-decreasing order of bar heights, we can identify the largest rectangular area by calculating the areas of the popped bars. This algorithm provides an optimal solution to the problem, ensuring the maximum area is found without unnecessary comparisons.
