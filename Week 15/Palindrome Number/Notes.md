# Palindrome Number

## Task Description
Given an integer `x`, the task is to determine if `x` is a palindrome. A palindrome is a number that reads the same forwards and backwards.

## Approach and Algorithm
To check if an integer is a palindrome without converting it to a string, I can use the following approach:

1. Handle the special cases:
   - If `x` is negative, it can't be a palindrome because the negative sign (-) is not considered in a palindrome. Return `false` in this case.
   - If `x` is 0, it is a palindrome because any single-digit number is a palindrome. Return `true` in this case.

2. Initialize two variables, `original` and `reversed`, both initially set to 0.

3. Create a copy of `x` called `temp_x` to avoid modifying the original value of `x`.

4. While `temp_x` is greater than 0:
   - Extract the last digit of `temp_x` using the modulo operator (`temp_x % 10`) and store it in a variable `digit`.
   - Add `digit` to `reversed` after multiplying it by 10 (to shift the current value of `reversed` one position to the left).
   - Remove the last digit from `temp_x` by dividing it by 10 (`temp_x = temp_x / 10`).

5. After the loop, `reversed` will contain the reverse of the original number.

6. Compare `x` with `reversed`. If they are equal, `x` is a palindrome, so return `true`. Otherwise, return `false`.

## Complexity Analysis
### Time Complexity
The time complexity of this approach is O(log10(x)), where `x` is the input integer. We iterate through the digits of `x` by dividing it by 10 in each iteration.

### Space Complexity
The space complexity is O(1) because we use a constant amount of extra space.

## Conclusion
This approach efficiently checks whether an integer is a palindrome without converting it to a string. It works for integers in the range [-2^31, 2^31 - 1].
