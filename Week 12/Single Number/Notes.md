# Single Number

## Task Description
Given a non-empty array of integers `nums`, where every element appears twice except for one, the task is to find that single element. Implement a solution with linear runtime complexity and constant extra space.

## Approach and Algorithm
To solve this problem with linear runtime complexity and constant extra space, I will use the bitwise XOR operation. The idea is that XOR of a number with itself is 0, and XOR of a number with 0 is the number itself. Since all elements appear twice except for one, XORing all elements together will cancel out the pairs, leaving only the single element.

1. Initialize a variable `result` to 0.
2. Iterate through each element `num` in the array:
   - Update `result` by performing a bitwise XOR with `num`.
3. After iterating through the array, `result` will hold the value of the single element.

## Complexity Analysis
- Let `n` be the length of the input array `nums`.
- The time complexity of the algorithm is O(n) since I iterate through the array once.
- The space complexity is O(1) as I use a single variable to store the result.
- In conclusion, the bitwise XOR-based approach allows me to find the single element in the input array with linear runtime complexity of O(n) and constant extra space complexity of O(1).

