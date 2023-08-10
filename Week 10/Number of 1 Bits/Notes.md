# Counting Number of 1 Bits

## Task Description
The task is to write a function that takes the binary representation of an unsigned integer and returns the number of '1' bits it has, also known as the Hamming weight.

## Approach and Algorithm
To count the number of '1' bits in the binary representation of the given unsigned integer, we can use bit manipulation. The idea is to repeatedly perform bitwise AND operation with the value and a mask with a single '1' bit shifted to different positions. If the result is non-zero, it means the corresponding bit in the original value was '1'. We continue this process for all positions to count the total number of '1' bits.

1. Initialize a variable `count` to keep track of the number of '1' bits.
2. Iterate for 32 positions (since the input is a binary string of length 32):
   - Check if the least significant bit of the value is '1':
     - If true, increment the `count` by 1.
   - Right shift the value by 1 to move to the next bit position.
3. After the iteration, the `count` will contain the total number of '1' bits in the binary representation of the unsigned integer.

By performing the above steps using bit manipulation, we can efficiently count the number of '1' bits.

## Complexity Analysis
- The time complexity of the algorithm is O(1) because we are iterating a fixed number of times (32 iterations) to count the '1' bits.
- The space complexity is O(1) because we are using a constant amount of space to store the `count` variable.

In conclusion, the algorithm efficiently counts the number of '1' bits in the binary representation of the given unsigned integer using bit manipulation. It has a constant time complexity and minimal space requirements.

This approach ensures a quick and effective way to calculate the Hamming weight of the binary representation.
