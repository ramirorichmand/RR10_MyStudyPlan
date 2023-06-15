# Longest Palindrome

## Problem Description

In this problem, you are given a string `s` consisting of lowercase or uppercase letters. You need to find the length of the longest palindrome that can be built using the letters in the string.

## Approach and Algorithm

To solve this problem, we can use the following approach:

1. initialise a variable `count` to 0. This variable will keep track of the count of characters that have an odd frequency in the string.
2. initialise an array `charCount` of size 52 (26 lowercase letters + 26 uppercase letters) to store the frequency of each character in the string. initialise all elements of the array to 0.
3. Iterate over each character `c` in the string `s`.
     - If `c` is a lowercase letter, increment `charCount[c - 'a']` by 1.
     - If `c` is an uppercase letter, increment `charCount[c - 'A' + 26]` by 1.
     - If `charCount[c]` becomes odd (i.e., `charCount[c] % 2 == 1`), increment `count` by 1.
     - If `charCount[c]` becomes even (i.e., `charCount[c] % 2 == 0`), decrement `count` by 1.
4. After the iteration is complete, `count` will represent the number of characters in `s` that have an odd frequency.
5. The length of the longest palindrome that can be built using the characters in `s` is `(s.length() - count) + (count > 0 ? 1 : 0)`.

## Complexity Analysis

The time complexity of this approach is O(n), where n is the length of the string `s`. This is because we iterate over each character in the string once.

The space complexity is O(1) since the size of the `charCount` array is constant (52) and does not depend on the length of the input string.

## Conclusion

The "Longest Palindrome" problem can be solved efficiently by counting the frequency of each character and calculating the length of the longest palindrome based on the count of characters with odd frequency.

By following the steps outlined above, we are able to find the length of the longest palindrome that can be built using the characters in the given string.

It's important to note that the key idea here is to recognize that a palindrome can be formed by pairing characters with even frequencies and including one character with an odd frequency if available.

