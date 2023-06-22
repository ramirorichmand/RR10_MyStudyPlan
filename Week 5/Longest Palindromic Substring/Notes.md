# Longest Palindromic Substring

## Problem Description

Given a string `s`, you need to find the longest palindromic substring in `s`.

## Approach and Algorithm

To solve this problem, we can use the dynamic programming approach. We define a boolean 2D array `dp` of size n x n, where `dp[i][j]` indicates whether the substring from index `i` to index `j` is a palindrome.

The algorithm follows these steps:

1. Initialize the 2D array `dp` with `false` values.
2. Initialize two variables `start` and `maxLen` to keep track of the starting index and length of the longest palindromic substring found so far.
3. Iterate through the string `s` from the last character to the first character:
   - Set `dp[i][i]` to `true` (single characters are palindromes).
   - Iterate from `i+1` to `n-1`:
     - If `s[i]` is equal to `s[j]` and `dp[i+1][j-1]` is `true` (the substring between `i+1` and `j-1` is a palindrome), then set `dp[i][j]` to `true`.
     - If `s[i]` is equal to `s[j]` and `j-i+1` is greater than `maxLen`, update `start` to `i` and `maxLen` to `j-i+1`.
4. Return the substring of `s` from index `start` to index `start + maxLen - 1`, which represents the longest palindromic substring found.

## Complexity Analysis

The time complexity of this approach is O(n^2), where n is the length of the input string `s`. This is because we iterate through all possible substrings of `s` and check whether they are palindromes using the `dp` array.
The space complexity is O(n^2) as well since we use the `dp` array of size n x n.

## Conclusion

The "Longest Palindromic Substring" problem can be solved using the dynamic programming approach. By following the algorithm mentioned above, we can find the longest palindromic substring in the given string `s`.
