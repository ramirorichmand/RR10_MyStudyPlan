# Problem Explanation

In this problem, we are given two strings: `ransomNote` and `magazine`. We need to determine whether we can construct the `ransomNote` string using the letters from the `magazine` string. However, each letter in the `magazine` can only be used once in the `ransomNote`.

To solve this problem, we need to check if all the letters in `ransomNote` are present in `magazine` and if their frequencies do not exceed the frequencies in `magazine`.
# Approach to Solve

1. Initialise a frequency count dictionary or array to keep track of the frequency of characters in the `magazine` string.

2. Iterate over each character `c` in the `magazine` string:
   - Increment the frequency count for character `c` in the dictionary or array.

3. Iterate over each character `c` in the `ransomNote` string:
   - Decrement the frequency count for character `c` in the dictionary or array.
   - If the frequency count becomes negative or the character `c` is not present in the dictionary or array, return `false`.

4. If we successfully iterate through all the characters in the `ransomNote` string without any issues, return `true`.

This approach ensures that we check the availability and frequency of each character required to construct the `ransomNote` string from the `magazine` string.

By following this approach, we can determine whether the `ransomNote` can be constructed using the letters from the `magazine` string.

# Complexities:

## Time Complexity: 
The time complexity of this solution is O(m + n), where m is the length of the magazine string and n is the length of the ransomNote string. This is because we iterate over both strings once to build the frequency count dictionary or array and then iterate over the ransomNote string to check the frequency counts. Both iterations have a linear time complexity.

## Space Complexity: 
The space complexity of this solution is O(1) since the space used for the frequency count dictionary or array is proportional to the number of unique characters in the magazine string, which is constant for a given language's

