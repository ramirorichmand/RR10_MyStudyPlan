# Implement Trie (Prefix Tree)

## Problem Description

In this problem, you are required to implement a Trie (prefix tree) data structure that supports the following operations:

- `insert(String word)`: Inserts the string `word` into the trie.
- `search(String word)`: Returns `true` if the string `word` is in the trie (i.e., was inserted before), and `false` otherwise.
- `startsWith(String prefix)`: Returns `true` if there is a previously inserted string `word` that has the prefix `prefix`, and `false` otherwise.

## Approach and Algorithm

To solve this problem, we can implement the Trie data structure using a class. Here are the steps:

1. Create a class named `Trie` to represent the Trie data structure.
2. Inside the `Trie` class, create an inner class named `TrieNode` to represent each node in the Trie. Each `TrieNode` should contain the following properties:
   - A boolean flag `isEndOfWord` to indicate if the current node represents the end of a word.
   - An array `children` of size 26 (to represent the lowercase English letters), where each element is either `null` or a reference to another `TrieNode`.
3. initialise the root of the Trie as an empty `TrieNode`.
4. Implement the `insert` operation as follows:
   - Start from the root node.
   - For each character in the word, check if the current node has a child corresponding to that character. If not, create a new child node for that character.
   - Move to the child node and repeat the process for the next character.
   - After processing all the characters, mark the last node as the end of a word.
5. Implement the `search` operation as follows:
   - Start from the root node.
   - For each character in the word, check if the current node has a child corresponding to that character. If not, the word does not exist in the Trie.
   - If all characters are found and the last node is marked as the end of a word, return `true`; otherwise, return `false`.
6. Implement the `startsWith` operation as follows:
   - Start from the root node.
   - For each character in the prefix, check if the current node has a child corresponding to that character. If not, the prefix does not exist in the Trie.
   - If all characters are found, return `true`; otherwise, return `false`.

## Complexity Analysis

The time complexity for inserting a word into the Trie is O(m), where m is the length of the word. This is because we iterate through each character in the word to find or create the corresponding nodes in the Trie.

The time complexity for searching a word or a prefix in the Trie is also O(m), where m is the length of the word or prefix. This is because we traverse the Trie based on the characters in the word or prefix.

The space complexity of the Trie is O(n * m), where n is the total number of words inserted into the Trie and m is the average length of the words. This is because we need to store the characters for each word in separate nodes.

## Conclusion

The "Implement Trie (Prefix Tree)" problem can be solved by implementing the Trie data structure and supporting the required operations. By following the steps outlined above, you should be able to implement the Trie class and perform the insert, search, and startsWith operations efficiently.

Remember to properly structure the Trie using TrieNodes and handle the traversal of characters while inserting, searching, or checking prefixes.

