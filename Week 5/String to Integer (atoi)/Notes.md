# String to Integer (atoi)

## Problem Description

Implement the `myAtoi(string s)` function, which converts a string to a 32-bit signed integer (similar to C/C++'s `atoi` function).

The algorithm for `myAtoi(string s)` is as follows:

1. Read in and ignore any leading whitespace.
2. Check if the next character (if not already at the end of the string) is '-' or '+'. Read this character in if it is either. This determines if the final result is negative or positive respectively. Assume the result is positive if neither is present.
3. Read in the next characters until the next non-digit character or the end of the input is reached. The rest of the string is ignored.
4. Convert these digits into an integer (e.g., "123" -> 123, "0032" -> 32). If no digits were read, then the integer is 0. Change the sign as necessary (from step 2).
5. If the integer is out of the 32-bit signed integer range [-2^31, 2^31 - 1], then clamp the integer so that it remains in the range. Specifically, integers less than -2^31 should be clamped to -2^31, and integers greater than 2^31 - 1 should be clamped to 2^31 - 1.
6. Return the integer as the final result.

**Note:**
- Only the space character ' ' is considered a whitespace character.
- Do not ignore any characters other than the leading whitespace or the rest of the string after the digits.

## Approach and Algorithm

To solve this problem, we can follow the steps mentioned in the problem description.

1. We first need to trim the leading whitespace from the input string `s` and keep track of the sign (positive or negative).
2. Then, we iterate through the remaining characters in `s` and check if each character is a digit.
   - If it is a digit, we append it to a temporary result variable.
   - If it is not a digit, we break the loop as we have encountered a non-digit character.
3. Finally, we convert the temporary result to an integer, apply the sign, and clamp the integer if it is out of the 32-bit signed integer range.

## Complexity Analysis

The time complexity of this approach is O(n), where n is the length of the input string `s`. We iterate through each character in the string once.
The space complexity is O(1) as we use only a few variables to store the result and temporary values.

## Conclusion

The "String to Integer (atoi)" problem can be solved by following the algorithm mentioned in the problem description. By implementing the steps, we can convert the given string to a 32-bit signed integer.
