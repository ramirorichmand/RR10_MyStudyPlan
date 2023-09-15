# Decode Ways

## Task Description
Given a string `s` containing only digits, the task is to return the number of ways to decode it. Each digit can be mapped to a letter according to the provided mapping.

## Approach and Algorithm
To count the number of ways to decode the string, dynamic programming can be used. Here's how to do it:

1. Initialize an array `dp` of length `n+1` (where `n` is the length of the input string `s`).
2. Set `dp[0]` to 1, as there is one way to decode an empty string.
3. Iterate through the characters of the input string `s` from index 1 to `n`.
   - For each character `s[i]`, check if it can be mapped to a single letter (i.e., `s[i] != '0'`).
     - If yes, add the value of `dp[i-1]` to `dp[i]`, as it contributes to the number of ways to decode at this position.
   - Check if the previous character `s[i-1]` and the current character `s[i]` together can be mapped to a letter (i.e., `s[i-1] == '1'` or (`s[i-1] == '2'` and `s[i] <= '6'`).
     - If yes, add the value of `dp[i-2]` to `dp[i`], as they contribute to the number of ways to decode at this position.
4. The final value in `dp[n]` represents the total number of ways to decode the entire string.

## Complexity Analysis
### Time Complexity
The time complexity of this approach is O(n), where `n` is the length of the input string `s`. This is because we iterate through the string once.

### Space Complexity
The space complexity is O(n) as we use an additional array `dp` of length `n+1` to store the intermediate results.

## Conclusion
This dynamic programming approach efficiently counts the number of ways to decode the given string `s` with a time complexity of O(n) and a space complexity of O(n). It works for strings of length up to 100 and handles leading zeros appropriately.
