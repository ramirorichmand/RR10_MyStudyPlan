# 139. Word Break

## Problem Description
Given a string `s` and a dictionary of strings `wordDict`, the task is to determine if `s` can be segmented into a sequence of one or more words from `wordDict`. The words in `wordDict` can be reused multiple times.

## Approach and Algorithm
To solve this problem, we can use a dynamic programming approach. We will create a boolean array `dp` of size `n+1`, where `n` is the length of the input string `s`. The value `dp[i]` will represent whether the substring `s[0:i]` can be segmented into words from `wordDict`.

We start by initializing `dp[0]` as `true`, indicating that an empty string can be segmented. Then, for each index `i` from 1 to `n`, we iterate over all possible substrings `s[0:j]` where `j` ranges from 0 to `i-1`. If `dp[j]` is `true` and the substring `s[j:i]` is present in `wordDict`, then we set `dp[i]` as `true`, indicating that the substring `s[0:i]` can be segmented.

Finally, we return the value of `dp[n]`, which indicates whether the entire string `s` can be segmented.

## Complexity Analysis
The time complexity of this approach is O(n^3), where n is the length of the input string `s`. This is because we have two nested loops, and for each iteration, we perform a substring lookup operation which takes O(n) time.

The space complexity is O(n), as we use an additional boolean array `dp` of size `n+1`.

## Conclusion
The problem of determining whether a string can be segmented into words from a dictionary can be solved efficiently using dynamic programming. By breaking down the problem into subproblems and using a boolean array to keep track of the segmentation possibilities, we can solve the problem in polynomial time.
