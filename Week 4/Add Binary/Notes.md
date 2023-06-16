# Add Binary - Problem Solving Explanation

## Problem:
The problem is to add two binary strings and return the sum as a binary string.

## Approach and Algorithm:
To solve this problem, I used the following approach:

1. Initialize an empty string `result` to store the binary sum.
2. Start from the least significant bit (rightmost) of both strings and iterate backwards.
3. Initialize carry as 0.
4. For each bit position:
   - Convert the current bits of `a` and `b` to integers.
   - Calculate the sum of the bits and the carry.
   - Append the least significant bit of the sum to the `result` string.
   - Update the carry to the most significant bit of the sum.
5. After the iteration, check if there is a remaining carry.
   - If there is a carry, append it to the `result` string.
6. Reverse the `result` string to obtain the correct order of bits.
7. Return the `result` string as the binary sum of `a` and `b`.

## Complexity Analysis:
- The approach has a time complexity of O(max(n, m)), where n and m are the lengths of the input strings `a` and `b`, respectively. This is because we iterate over the longer string to perform the addition.
- The space complexity is O(max(n, m)) as well, considering the space needed to store the `result` string.

## Conclusion:
By iterating through the binary strings from right to left and performing bit addition with carry, we can obtain the binary sum of `a` and `b`. The approach provides an efficient solution for the problem.
