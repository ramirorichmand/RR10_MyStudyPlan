# 844. Backspace String Compare

## Problem Description

Given two strings `s` and `t`, you need to determine if they are equal when both are typed into empty text editors. The character '#' represents a backspace.

Note that after applying backspaces, an empty text will remain empty.

## Approach and Algorithm

To solve this problem, we can use a stack to process the strings `s` and `t`. We iterate through each character in the strings and perform the following steps:
- If the current character is not '#', we push it onto the stack.
- If the current character is '#', we pop an element from the stack (if the stack is not empty).

After processing both strings, we compare the resulting stacks to check if they are equal. If the stacks are equal, it means that the original strings `s` and `t` are equal after applying backspaces.

Here is the algorithm:
1. Initialise two empty stacks, `stackS` and `stackT`.
2. Iterate through each character in string `s`.
   - If the current character is not '#', push it onto `stackS`.
   - If the current character is '#', pop an element from `stackS` (if it's not empty).
3. Iterate through each character in string `t`.
   - If the current character is not '#', push it onto `stackT`.
   - If the current character is '#', pop an element from `stackT` (if it's not empty).
4. If `stackS` and `stackT` are equal, return `true`; otherwise, return `false`.

## Complexity Analysis

The time complexity for this approach is O(n), where n is the length of the longer string between `s` and `t`. We iterate through each character once. The space complexity is O(n) as well since we use stacks to store the characters.

## Conclusion

By using stacks to simulate typing into empty text editors and applying the backspace logic, we can determine if two strings are equal after backspacing. The algorithm has a time complexity of O(n) and provides an efficient solution to the problem.

