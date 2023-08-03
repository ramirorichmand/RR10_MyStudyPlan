# Top K Frequent Words

## Task Description:
Given an array of strings `words` and an integer `k`, the task is to find the `k` most frequent strings in the array and return them in descending order of frequency. If multiple words have the same frequency, sort them lexicographically.

## Approach and Algorithm:
To solve this problem, I will use a combination of data structures: a hashmap to store the frequency of each word and a min-heap to keep track of the top `k` most frequent words. I will follow these steps:

1. Create a hashmap to store the frequency count of each word in the array `words`.
2. Traverse through the array `words` and populate the hashmap.
3. Initialize a min-heap with the first `k` words (or less if there are fewer unique words than `k`) along with their frequencies.
4. For each word in the hashmap, if its frequency is greater than the frequency of the word at the top of the min-heap, replace the top element with the current word.
5. If the frequencies are the same, compare the words lexicographically and keep the smaller word.
6. After processing all words, the min-heap will contain the `k` most frequent words.

## Complexity Analysis:
- Let `n` be the number of words in the array and `m` be the number of unique words in the array (m <= n).
- Building the hashmap takes O(n) time and O(m) space.
- Initializing the min-heap with `k` elements takes O(k log k) time and O(k) space.
- For each word (n-m words) in the hashmap, we perform heap operations which take O(log k) time each. Therefore, the total time complexity for processing these words is O((n-m) log k).
- The final result contains the top `k` most frequent words, which takes O(k log k) time to sort them.
- Hence, the overall time complexity is O(n log k).
- The space complexity is O(n) for the hashmap and O(k) for the min-heap.
- In conclusion, we can find the `k` most frequent words in O(n log k) time and O(n) extra space.
