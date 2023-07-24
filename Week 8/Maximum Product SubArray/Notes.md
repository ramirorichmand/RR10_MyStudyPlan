# 152. Maximum Product Subarray

## Problem Description

The problem asks us to find a subarray in an integer array that has the largest product and return the product. We need to consider all possible subarrays and find the one with the maximum product.

## Example

Given the following input:

nums = [2,3,-2,4]


The expected output is:

6


## Approach and Algorithm

To solve this problem, we can use a dynamic programming approach. We'll keep track of the maximum product ending at each position in the array. We'll also keep track of the minimum product ending at each position since a negative number can turn into a positive number when multiplied by another negative number. 

1. Initialise the variables `maxProduct` and `minProduct` as the first element of the array `nums[0]`.
2. Initialise the variable `result` as `maxProduct`.
3. Iterate through the array starting from the second element:
     - Calculate the new `maxProduct` and `minProduct` by taking the maximum or minimum of the current element multiplied by the previous `maxProduct` or `minProduct` respectively.
     - Update the `result` as the maximum of `result` and the new `maxProduct`.
4. Return the `result`.

## Complexity Analysis

The time complexity for this approach is O(N), where N is the length of the array `nums`, as we iterate through the entire array once. The space complexity is O(1) as we only use a constant amount of extra space.

## Conclusion

The problem asks us to find the maximum product of a subarray in an integer array. By using a dynamic programming approach, we can efficiently calculate the maximum product at each position and find the overall maximum product. The algorithm has a time complexity of O(N), where N is the length of the array.
