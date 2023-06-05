## 3. Longest Substring Without Repeating Characters

**Difficulty: Medium**

**Problem:**
Given a string `s`, find the length of the longest substring without repeating characters.

**Example:**
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

**Approach:**

To solve this problem, we can use the sliding window technique. Here's an outline of the approach:

1. Initialise a set to keep track of unique characters in the current window.
2. Initialise two pointers, `start` and `end`, representing the left and right boundaries of the current window.
3. Initialise a variable `maxLen` to store the maximum length of the substring without repeating characters.
4. Iterate through the string `s`:
   - Move the `end` pointer to the right and add the character at the `end` position to the set.
   - If the character at the `end` position is already in the set, it means we have a repeating character. In this case, we need to shrink the window from the left until the repeating character is no longer included.
   - Update the `maxLen` if the current window's length is greater than `maxLen`.
5. Return the value of `maxLen`.

**Complexity Analysis:**

- Time Complexity: O(n), where n is the length of the input string `s`.
- Space Complexity: O(min(n, m)), where m is the number of unique characters in `s`.

