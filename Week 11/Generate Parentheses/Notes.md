# Generate Parentheses

## Task Description
Given `n` pairs of parentheses, the task is to generate all combinations of well-formed parentheses.

## Approach and Algorithm
To solve this problem, I will use a recursive approach to generate all valid combinations of parentheses. The idea is to start with an empty string and recursively add opening and closing parentheses while ensuring that the parentheses remain balanced.

1. Initialize an empty list `result` to store the generated combinations.
2. Define a recursive function `generateParentheses` that takes three parameters: the current string `current`, the number of opening parentheses `openCount`, and the number of closing parentheses `closeCount`.
3. In the recursive function:
   - If both `openCount` and `closeCount` are equal to `n`, add `current` to the `result` list.
   - If `openCount` is less than `n`, recursively call `generateParentheses` with `current + "("`, `openCount + 1`, and `closeCount`.
   - If `closeCount` is less than `openCount`, recursively call `generateParentheses` with `current + ")"`, `openCount`, and `closeCount + 1`.
4. Call the recursive function `generateParentheses` with an empty string and initial counts of opening and closing parentheses both set to 0.
5. Return the `result` list containing all valid combinations of parentheses.

## Complexity Analysis
- Let `N` be the total number of valid combinations of parentheses for a given `n`.
- The time complexity of the algorithm is O(N), as there are `N` valid combinations to generate.
- The space complexity is O(N), as the `result` list can contain at most `N` combinations.
- In conclusion, the algorithm efficiently generates all combinations of well-formed parentheses using a recursive approach. It ensures that the parentheses remain balanced and produces the desired output for the given value of `n`.
