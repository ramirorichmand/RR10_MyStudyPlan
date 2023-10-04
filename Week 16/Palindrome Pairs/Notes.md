# Palindrome Pairs

## Task Description
Given a 0-indexed array of unique strings `words`, find and return all palindrome pairs, i.e., pairs of indices (i, j) such that the concatenation of `words[i] + words[j]` forms a palindrome.

## Approach
To efficiently find palindrome pairs, we can use a Trie (prefix tree) combined with a hash table. The key insight is to leverage the symmetric property of palindromes.

1. Create an empty Trie to store the reversed prefixes of words.
2. Iterate through each word in the `words` array:
   - For each suffix of the word, check if the reversed prefix of that suffix exists in the Trie. If it does, and the remaining part of the suffix is a palindrome, we have found a valid palindrome pair.
   - Add the reversed prefix of the current word to the Trie.
3. Repeat the process for the original words as well. This step is necessary to handle cases where one word is the prefix of another word.
4. Return the list of palindrome pairs.

## Complexity Analysis
- Time Complexity: O(sum of words[i].length), where the sum is the total length of all words combined. This is because each character of each word is processed once.
- Space Complexity: O(number of unique prefixes in words), as we store the reversed prefixes in the Trie.

## Conclusion
Utilizing a Trie and checking for palindromes allows us to efficiently find all palindrome pairs in the given array of words with a linear runtime complexity.
