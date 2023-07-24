# 49. Group Anagrams

## Problem Description

The problem asks us to group anagrams together given an array of strings. An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, using all the original letters exactly once. We need to group the strings that are anagrams of each other.

## Example

Given the following input:

strs = ["eat","tea","tan","ate","nat","bat"]


The expected output is:

[["bat"],["nat","tan"],["ate","eat","tea"]]


## Approach and Algorithm

To solve this problem, we can use a hashmap where the key is the sorted string and the value is a list of anagrams. 

1. Initialise an empty hashmap.
2. Iterate through each string in the input array.
3. Sort the string and use it as a key to retrieve the corresponding list of anagrams from the hashmap.
4. If the list doesn't exist, create a new list and add it to the hashmap with the sorted string as the key.
5. Add the current string to the list of anagrams.
6. Repeat steps 3-5 for all strings in the input array.
7. Return the values of the hashmap, which represent the grouped anagrams.

## Complexity Analysis

The time complexity for this approach is O(NKlogK), where N is the number of strings and K is the maximum length of a string. The sorting operation takes O(KlogK) time for each string. The space complexity is O(NK) as we need to store the grouped anagrams in the hashmap.

## Conclusion

The problem asks us to group anagrams together. By using a hashmap with sorted strings as keys, we can efficiently group the anagrams. The algorithm has a time complexity of O(NKlogK), where N is the number of strings and K is the maximum length of a string.
