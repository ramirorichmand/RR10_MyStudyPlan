# Word Ladder

## Problem Description

Given two words, `beginWord` and `endWord`, and a dictionary `wordList`, the task is to find the number of words in the shortest transformation sequence from `beginWord` to `endWord`, or 0 if no such sequence exists.

## Approach and Algorithm

To solve this problem, we can use the breadth-first search (BFS) algorithm. The idea is to start from the `beginWord` and explore all possible transformations by changing a single letter at a time. We continue exploring until we reach the `endWord` or exhaust all possible transformations.

The algorithm follows these steps:

1. Create a set `wordSet` from the `wordList` to facilitate constant-time lookup.
2. Initialise a queue `queue` and enqueue `beginWord`.
3. Initialise a set `visited` to keep track of visited words and add `beginWord` to `visited`.
4. Initialise a variable `level` to track the level of transformation and set it to 1.
5. While the `queue` is not empty:
   - Initialise a variable `size` to store the current size of the `queue`.
   - Iterate `size` times:
     - Dequeue a word from the front of the `queue`.
     - If the dequeued word is equal to `endWord`, return the current `level`.
     - Generate all possible transformations of the dequeued word by changing a single letter at a time.
     - For each transformed word:
       - If it is present in `wordSet` and not visited:
         - Add it to the `visited` set.
         - Enqueue it to the `queue`.
   - Increment the `level` by 1.
6. If the `endWord` is not reached, return 0 (no transformation sequence exists).

## Complexity Analysis

The time complexity of this approach is O(M^2 * N), where M is the length of each word and N is the total number of words in the `wordList`. For each word, we generate all possible transformations, which takes O(M) time. In the worst case, we need to generate transformations for all N words. The space complexity is O(M^2 * N) as well, considering the worst case scenario where all words have M^2 unique transformations.

## Conclusion

The "Word Ladder" problem can be solved using the breadth-first search (BFS) algorithm. By following the algorithm mentioned above, we can find the number of words in the shortest transformation sequence from `beginWord` to `endWord`. If no such sequence exists, we return 0.
