# 211. Design Add and Search Words Data Structure

## Problem Description

The problem asks us to design a data structure that supports adding new words and searching for a match. The data structure should be able to handle search queries where the word can contain dots '.' which can be matched with any letter.

## Approach and Algorithm

To implement this data structure, we can use a trie (prefix tree) to store the words. Each node in the trie represents a character in the word, and we can use an array or a map to store the children nodes.

For adding a word, we traverse the trie from the root and create new nodes as needed until we reach the end of the word. We mark the last node as a word to indicate that it is a complete word.

For searching a word, we traverse the trie based on each character in the word. If we encounter a dot '.', we need to check all possible children nodes. Otherwise, we continue to the next character in the word. If we reach the end of the word and the last node is marked as a word, we found a match.

The time complexity for adding a word is O(L), where L is the length of the word. The time complexity for searching a word is O(L) in the best case and O(26^L) in the worst case if all possible children nodes need to be checked.

## Complexity Analysis

The space complexity of the data structure is O(N), where N is the total number of characters in all the words.

## Conclusion

By using a trie data structure, we can efficiently add new words and search for matches, even when the search queries contain dots that can match any letter. The trie provides an effective solution for this problem with a reasonable time and space complexity.
