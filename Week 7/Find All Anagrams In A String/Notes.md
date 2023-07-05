# Find All Anagrams in a String

## Problem Description

Given two strings `s` and `p`, the task is to find all the start indices in `s` where anagrams of `p` exist. An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

## Approach and Algorithm

To solve this problem, we can use a sliding window approach with a frequency map. Here are the steps of the algorithm:

1. Initialize an empty result list to store the start indices of anagrams.
2. Create a frequency map for the string `p`, which counts the occurrences of each character.
3. Initialize two pointers, `left` and `right`, both pointing to the beginning of `s`.
4. While the `right` pointer is less than the length of `s`:
   - Decrease the frequency of the character at the `right` pointer in the frequency map.
   - If the frequency of the character becomes zero, decrement a counter variable by 1.
   - Move the `right` pointer to the right by one step.
   - If the counter variable becomes zero, it means all the characters of `p` have been matched. Add the `left` pointer to the result list.
   - At this point, we need to consider the next window, so increase the frequency of the character at the `left` pointer and increment the counter variable by 1.
   - Move the `left` pointer to the right by one step.
5. Return the result list.

## Complexity Analysis

Let n be the length of string `s` and m be the length of string `p`.

The algorithm uses a sliding window approach and iterates through each character in `s` once. Therefore, the time complexity is O(n).

The space complexity is O(1) since the frequency map has a fixed size of 26 (for lowercase English letters) regardless of the input size.

## Conclusion

By using a sliding window approach and a frequency map, we can efficiently find all the start indices in `s` where anagrams of `p` exist. The algorithm iterates through `s`, maintaining a window of characters and updating the frequency map accordingly. It checks if the frequency map matches the frequency map of `p` to identify anagrams. This approach allows us to solve the problem with a time complexity of O(n) and a constant amount of additional space.
