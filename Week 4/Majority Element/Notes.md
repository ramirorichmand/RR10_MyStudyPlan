# Majority Element - Problem Solving Explanation

## Problem: 
The problem is to find the majority element in an array, which is the element that appears more than n/2 times. The majority element is guaranteed to exist in the array.

## Approach and Algorithm:
To solve this problem, I used the following approach:

1. initialise a variable `count` and a variable `candidate`.
2. Iterate over each element in the array:
    - If the count is 0, set the current element as the candidate.
    - If the current element is equal to the candidate, increment the count.
    - If the current element is different from the candidate, decrement the count.
3. The majority element will be the candidate at the end of the iteration.

## Complexity Analysis:
- The approach uses a single pass over the array, resulting in a linear time complexity of O(n), where n is the size of the array.
- The space complexity is O(1) as we only need a constant amount of extra space to store the count and candidate variables.

## Conclusion:
By using a clever algorithm that utilises the property of the majority element appearing more than n/2 times, we can find the majority element in linear time and with constant space complexity. The approach provides an efficient solution for the problem.
