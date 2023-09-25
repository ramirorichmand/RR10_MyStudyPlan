# Basic Calculator II

## Task Description
Given a string `s` that represents a valid expression containing integers and operators ('+', '-', '*', '/'), evaluate this expression and return its value. The integer division should truncate toward zero.

## Approach and Algorithm
To evaluate the given expression, we can use a stack data structure to keep track of intermediate results. Here's how I would approach it:

1. Initialize two variables, `current_number` and `operator`, to store the current number and operator being processed.

2. Initialize an empty stack to store intermediate results.

3. Iterate through each character `c` in the string `s`:

   a. If `c` is a digit, convert it to an integer and update `current_number` accordingly.

   b. If `c` is an operator ('+', '-', '*', '/'), perform the following steps:
   
      i. Apply the current operator to the current number and push the result onto the stack.

      ii. Update the current operator to the new operator.

      iii. Reset the current number to 0.

4. After processing all characters in `s`, there may be one last number and operator left to be processed. Apply the final operator to the final number and push the result onto the stack.

5. Now, the stack contains the results of all operations. Pop and sum all elements from the stack to get the final result.

6. Return the final result.

## Complexity Analysis
### Time Complexity
The time complexity of this approach is O(n), where `n` is the length of the input string `s`. We iterate through each character once.

### Space Complexity
The space complexity is O(n) as well because in the worst case, the stack can contain all characters from the input string.

## Conclusion
This approach efficiently evaluates the given expression and handles operators correctly. It works for expressions of up to 3 * 10^5 characters, and the answer is guaranteed to fit in a 32-bit integer.
