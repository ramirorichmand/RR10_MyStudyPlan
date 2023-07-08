# Letter Combinations of a Phone Number

## Problem Description

Given a string `digits` containing digits from 2 to 9 inclusive, the task is to return all possible letter combinations that the number could represent. The mapping of digits to letters (like on a telephone buttons) is given below:

| Digit | Letters |
|-------|---------|
|   2   |   abc   |
|   3   |   def   |
|   4   |   ghi   |
|   5   |   jkl   |
|   6   |   mno   |
|   7   |   pqrs  |
|   8   |   tuv   |
|   9   |   wxyz  |

Note that 1 does not map to any letters.

## Approach and Algorithm

To solve this problem, we can use a recursive backtracking approach. We start with an empty string and recursively generate all possible letter combinations by iterating through each digit in the input string `digits`. For each digit, we iterate through its corresponding letters and append them to the current combination. We repeat this process for the remaining digits in `digits`, generating all possible combinations.

The algorithm follows these steps:

1. Define a mapping of digits to letters.
2. Initialise an empty list `combinations` to store the resulting combinations.
3. Implement a recursive backtracking function with the following parameters:
   - `currentCombination`: The current combination being generated.
   - `nextDigits`: The remaining digits to be processed.
4. If `nextDigits` is empty, add `currentCombination` to `combinations` and return.
5. Get the first digit from `nextDigits`.
6. Iterate through the letters corresponding to the first digit:
   - Append the letter to `currentCombination`.
   - Recursively call the backtracking function with the updated `currentCombination` and the remaining digits in `nextDigits`.
   - Remove the last letter from `currentCombination` to backtrack.
7. Call the backtracking function initially with an empty `currentCombination` and the input `digits`.
8. Return the list of `combinations`.

## Complexity Analysis

Let n be the length of the input string `digits`.

The total number of possible letter combinations can be exponential in n, as each digit can have multiple letters associated with it. However, the number of combinations we need to generate is still bounded by the total number of digits. Thus, the time complexity of the algorithm is O(3^n x 4^m), where m is the number of digits that have three associated letters and n is the number of digits that have four associated letters.

The space complexity is O(n) since we use recursion and store the resulting combinations.

## Conclusion

By using a recursive backtracking approach, we can generate all possible letter combinations of a given phone number. The algorithm explores all possible paths in a depth-first manner, appending letters and backtracking as needed. This approach allows us to generate the combinations efficiently, providing a solution to the problem.
