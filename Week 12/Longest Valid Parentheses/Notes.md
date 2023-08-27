# Longest Valid Parentheses

## Task Description
The task is to find the length of the longest valid parentheses substring in a given string containing only '(' and ')' characters.

## Approach and Algorithm
To solve this problem, I will use a stack to keep track of the indices of '(' characters in the string. The idea is to iterate through the string and perform the following steps:
1. Initialize an empty stack and a variable `max_length` to keep track of the maximum length of valid parentheses substring.
2. Iterate through each character in the string:
   - If the character is '(', push its index onto the stack.
   - If the character is ')', pop an index from the stack if it's not empty:
      - If the stack becomes empty, calculate the length of the valid substring using the difference between the current index and the start index of the current valid substring. Update `max_length` if needed.
      - If the stack is not empty, calculate the length of the valid substring using the difference between the current index and the index popped from the stack. Update `max_length` if needed.
3. After iterating through the string, `max_length` will contain the length of the longest valid parentheses substring.

## Complexity Analysis
- Let `n` be the length of the input string `s`.
- The time complexity of the algorithm is O(n) as I iterate through the string only once.
- The space complexity is O(n) as the stack can contain at most `n` indices.
- In conclusion, the stack-based approach efficiently finds the length of the longest valid parentheses substring in the input string with a time complexity of O(n) and a space complexity of O(n).

