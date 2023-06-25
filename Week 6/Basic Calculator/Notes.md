# Basic Calculator

## Problem Description

Given a string `s` representing a valid expression, the task is to implement a basic calculator to evaluate it and return the result of the evaluation. The expression can contain digits, '+', '-', '(', ')', and whitespace characters.

## Approach and Algorithm

To solve this problem, we can use the stack data structure and the concept of converting infix notation to postfix notation.

The algorithm follows these steps:

1. Initialise an empty stack to store operators and operands.
2. Initialise a variable `result` to store the final result.
3. Initialise a variable `operand` to store the current operand.
4. Iterate over each character in the string `s`:
     - If the character is a digit, append it to `operand` until the end of the number.
     - If the character is an operator ('+', '-', '(', ')'), do the following:
         - If `operand` is not empty, convert it to an integer and push it onto the stack.
         - Reset `operand` to an empty string.
         - If the current operator is ')', repeatedly pop operands and operators from the stack until a '(' is encountered. Evaluate the expression enclosed in the parentheses and push the result back onto the stack.
         - Otherwise, if the stack is not empty and the precedence of the current operator is less than or equal to the precedence of the top operator on the stack, pop the top operator and the last two operands from the stack, evaluate the expression, and push the result back onto the stack.
         - Push the current operator onto the stack.
5. After iterating over all characters, if `operand` is not empty, convert it to an integer and push it onto the stack.
6. While the stack is not empty, repeatedly pop operators and operands, evaluate the expressions, and push the result back onto the stack.
7. Finally, the stack should contain only the final result. Pop it from the stack and return as the output.

## Complexity Analysis

The time complexity of this algorithm is O(n), where n is the length of the input string `s`. This is because we iterate over each character in the string exactly once.

The space complexity is also O(n), as the stack can contain at most n/2 elements in the case of balanced parentheses.

## Conclusion

By using the stack data structure and the concept of infix to postfix conversion, we can evaluate a basic arithmetic expression and return the result. This algorithm provides an efficient solution to the problem without using any built-in functions for expression evaluation.
