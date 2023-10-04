import java.util.*;

class Solution {

    // Based on the 3 examples given by LeetCode, we can derive 3 conditions where str1 + str2 = palindrome.
    // Case 1: If there is str1 "", and str2 that is palindrome, then str1 + str2 ("" + palindrome) is still a palindrome.
    //         From Example 3: words = ["a",""]
    //                         str1 = "", str2 = "a" (a palindrome), so str1 + str2 = "a" (a palindrome).
    //
    // Case 2: If str1 is the reverse of str2, then str1 + str2 and str2 + str1 are both palindromes.
    //         From Example 2: words = ["bat"*,"tab"*,"cat"]
    //                         str1 = "bat, str2 = "tab", str1 is the reverse of str2,
    //                         so str1 + str2 = "battab", and str2 + str1 = "tabbat".
    //
    // Case 3: If str1 is the reverse of a part of str2 (sub1 + sub2), and the second part is a palindrome, then the following:
    //         A. If str1 is the reverse of sub1, and sub2 is palindrome, then str2 + str1 = palindrome.
    //         B. If str1 is the reverse of sub2, and sub1 is palindrome, then str1 + str2 = palindrome.
    //         From Example 1: words = ["abcd","dcba","lls"*,"s"*,"sssll"*]
    //                         A. Not shown here.
    //                         B. str1 = "s", str2 = "lls" (sub1 = "ll", sub2 = "s"), or
    //                            str1 = "lls", str2 = "sssll" (sub1 = "ss", sub2 = "sll")
    //                         Both cases, str1 is the reverse of sub2, and sub1 is a palindrome.
    //

    public List<List<Integer>> palindromePairs(String[] words) {

        // For this palindromePairs method to work, we need to write two other methods, namely:
        //      1. isPalindrome() to check if a given input is a palindrome.
        //      2. reverseStr() to return the reversed string.

        // First instantiate the result list. Don't worry about the List<Integer> within,
        // as we will instantiate the list of index pair when we found the concatenated palindrome pair.
        List<List<Integer>> result = new ArrayList<>();

        // Check if the words input is null or empty.
        if (words == null || words.length == 0) {
            return result;
        }

        // Use a hashmap (dictionary) to record the key-value pair (String-index pair).
        Map<String, Integer> dictionary = new HashMap<>();

        // Use an array to keep track of the string length and its occurrences.
        // Why? To lower the time complexity needed when checking the dictionary for a particular string,
        //      by first checking if string of this length is in 'words'.
        int[] hasLength = new int[5000 + 1];

        // Traverse the 'words', to record String and index in the dictionary, and the String length occurrence in hasLength.
        for (int i = 0; i < words.length; i++) {
            dictionary.put(words[i], i);
            hasLength[words[i].length()]++;
        }

        // Case 1: If there is str1 "", and str2 that is palindrome.
        // If "" is in 'words', then it can combine with any palindrome string, in both orderings, to form a palindrome.
        if (dictionary.containsKey("")) {
            int emptyStrIndex = dictionary.get("");
            // Check for all the palindromes.
            for (int i = 0; i < words.length; i++) {
                if (isPalindrome(words[i], 0, words[i].length() - 1)) {
                    // This to make sure we combine emptyStrIndex with itself.
                    if (i == emptyStrIndex) {
                        continue;
                    }
                    // Add to result, both str1 + str2 and str2 + str1 combinations.
                    result.add(Arrays.asList(emptyStrIndex, i));
                    result.add(Arrays.asList(i, emptyStrIndex));
                }
            }
        }

        // Case 2: If str1 is the reverse of str2.
        // For each string in 'words', we check if the reversed string (str2) is identical to the string (str1).
        for (int i = 0; i < words.length; i++) {
            // Call the reverseStr() method to reverse the string.
            String reversedStr = reverseStr(words[i]);
            // Find if the reverseStr is in the dictionary. If it is, we get the index.
            if (dictionary.containsKey(reversedStr)) {
                int reversedStrIndex = dictionary.get(reversedStr);
                // This is to make sure we check for palindromes, so we don't combine palindrome with itself.
                if (i == reversedStrIndex) {
                    continue;
                }
                // Else, add to result.
                result.add(Arrays.asList(i, reversedStrIndex));
            }
        }

        // Case 3: If str1 is the reverse of a part of str2 (sub1 + sub2), and the second part is a palindrome.
        // Checking for every string in 'words'.
        for (int i = 0; i < words.length; i++) {
            String currentStr = words[i];

            // Each string, check for all the possible substrings, using sliceIndex to traverse each string.
            for (int sliceIndex = 1; sliceIndex < currentStr.length(); sliceIndex++) {

                // A. If str1 is the reverse of sub1, and sub2 is palindrome, then str2 + str1 = palindrome.
                // First check is sub1 length in hasLength, and check sub2 if is palindrome.
                if (hasLength[sliceIndex] > 0
                        && isPalindrome(currentStr, sliceIndex, currentStr.length() - 1)) {

                    // Reverse sub1 to check if str1 is in the dictionary.
                    String reversedSubStr = reverseStr(currentStr.substring(0,sliceIndex));
                    if (dictionary.containsKey(reversedSubStr)) {
                        int reversedStrIndex = dictionary.get(reversedSubStr);
                        // This is to check for palindromes, when sliceIndex is in the middle of the palindrome.
                        if (reversedStrIndex == i) {
                            continue;
                        }
                        // str2 (sub1 + sub2 (palindrome)) + str1 (reverse of sub1)
                        result.add(Arrays.asList(i, reversedStrIndex));
                    }
                }

                // B. If str1 is the reverse of sub2, and sub1 is palindrome, then str1 + str2 = palindrome.
                // First check is sub2 length in hasLength, and check sub1 if is palindrome.
                if (hasLength[currentStr.length() - sliceIndex] > 0
                        && isPalindrome(currentStr, 0, sliceIndex - 1)) {

                    // Reverse sub2 to check if str1 is in the dictionary.
                    String reversedSubStr = reverseStr(currentStr.substring(sliceIndex, currentStr.length()));
                    if (dictionary.containsKey(reversedSubStr)) {
                        int reversedStrIndex = dictionary.get(reversedSubStr);
                        // This is to check for palindromes, when sliceIndex is in the middle of the palindrome.
                        if (reversedStrIndex == i) {
                            continue;
                        }
                        // str1 (reverse of sub2) + str2 (sub1 (palindrome) + sub2)
                        result.add(Arrays.asList(reversedStrIndex, i));
                    }
                }
            }
        }
        return result;
    }

    // Method 1:
    // To check if given string is a palindrome. Use 2 pointers (front and back) as input,
    // as we might check if the substring is a palindrome, not the whole string.
    private boolean isPalindrome(String str, int front, int back) {
        while (front < back) {
            if (str.charAt(front) != str.charAt(back)) {
                return false;
            }
            front++;
            back--;
        }
        return true;
    }

    // Method 2:
    // To return the reversed string.
    private String reverseStr(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString();
    }

}