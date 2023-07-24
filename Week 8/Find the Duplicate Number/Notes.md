# Find the Duplicate Number

## Problem Description

Given an array of integers `nums` containing `n + 1` integers, where each integer is in the range [1, n] inclusive. There is only one repeated number in `nums`, and we need to find this repeated number.

## Example

Input:
nums = [1,3,4,2,2]

Output:
2

## Approach

To solve this problem without modifying the array `nums` and using only constant extra space, I will use the following approach:

1. Use the **Floyd's Tortoise and Hare algorithm** to detect the cycle in the array.
2. Initialise two pointers, `slow` and `fast`, both pointing to the first element of the array.
3. Move `slow` one step at a time and `fast` two steps at a time until they meet.
4. Once they meet, reset `slow` to the first element and keep `fast` at the meeting point.
5. Move both `slow` and `fast` one step at a time until they meet again.
6. The meeting point is the duplicate number in the array.

## Complexity Analysis

The time complexity for this approach is O(n), where n is the length of the array `nums`. In the worst case, we may need to iterate through the entire array.

The space complexity is O(1) since we are using only constant extra space.

## Conclusion

The solution effectively finds the duplicate number in the given array `nums`. By utilizing the Floyd's Tortoise and Hare algorithm, we can detect the cycle and find the duplicate number in linear runtime complexity and constant space.
