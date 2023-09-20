# Reverse Bits

## Task Description
Given a 32-bit unsigned integer represented as a binary string, the task is to reverse the bits of the integer and return the resulting integer.

## Approach and Algorithm
To reverse the bits of a 32-bit integer, you can use bit manipulation. Here's the approach:

1. Initialize a variable `result` to store the reversed bits. Set it initially to 0.

2. Iterate through each bit position from 0 to 31 (since it's a 32-bit integer):
   - Right-shift the input integer `n` by the current bit position using `n >> i & 1` to get the value of the current bit.
   - Left-shift the current bit by `31 - i` positions to place it in the reversed position.
   - OR the result with the shifted bit to set the corresponding bit in the `result`.

3. After the loop, the `result` variable will contain the reversed bits of the input integer.

4. Return the `result`.

## Complexity Analysis
### Time Complexity
The time complexity of this approach is O(1) because we iterate through a fixed number of bits (32 bits) in constant time.

### Space Complexity
The space complexity is O(1) because we use a constant amount of extra space.

## Conclusion
This approach efficiently reverses the bits of a 32-bit unsigned integer represented as a binary string. It works for all 32-bit integers.
