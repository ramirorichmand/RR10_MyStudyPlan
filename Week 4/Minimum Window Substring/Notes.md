# Minimum Window Substring

## Problem Description

In this problem, you are given two strings `s` and `t`. You need to find the minimum window substring of `s` that contains all the characters from `t` (including duplicates).

You need to return the minimum window substring, and if there is no such substring, return an empty string `""`.

## Approach and Algorithm

To solve this problem, you can use the sliding window technique.

Here's how you can approach it:

1. Create two hash maps: `required` and `window`.
   - `required` stores the count of each character in `t`.
   - `window` stores the count of each character in the current window of `s`.
2. Initialize two pointers, `left` and `right`, to track the window boundaries.
3. Initialize `formed` to keep track of the characters in `t` that are present in the current window.
4. Initialize `minLen` and `minStart` to store the minimum window length and its starting index.
5. Move the `right` pointer to expand the window until it includes all the characters from `t`.
   - Increment the count of the character at the `right` pointer in the `window` hash map.
   - If the count of this character in `window` is equal to or greater than its count in `required`, increment `formed` by 1.
6. Once all the characters from `t` are included in the window, start moving the `left` pointer to minimize the window length while still maintaining the condition of including all characters from `t`.
   - Check if the current window length is smaller than the minimum window length. If it is, update `minLen` and `minStart`.
   - Decrement the count of the character at the `left` pointer in the `window` hash map.
   - If the count of this character in `window` becomes less than its count in `required`, decrement `formed` by 1.
   - Move the `left` pointer to the right.
7. Repeat steps 5 and 6 until the `right` pointer reaches the end of `s`.
8. Return the minimum window substring using the `minStart` and `minLen` values.
   - If no such substring is found, return an empty string `""`.

## Complexity Analysis

The time complexity of this approach is O(m + n), where m and n are the lengths of strings `s` and `t`, respectively. This is because we traverse both strings once.

The space complexity is O(m + n), as we use two hash maps to store the counts of characters.

## Conclusion

The "Minimum Window Substring" problem can be solved using the sliding window technique. By following the steps outlined above, you can find the minimum window substring that contains all the characters from `t`.

Remember to handle the edge cases, such as empty strings or when no such substring exists.

