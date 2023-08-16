# Sort List

## Task Description
Given the head of a linked list, the task is to return the list after sorting it in ascending order.

## Approach and Algorithm
To solve this problem, I will use the Merge Sort algorithm to sort the linked list. The idea is to divide the linked list into two halves, recursively sort each half, and then merge the sorted halves back together.

1. Define a recursive function `mergeSort` that takes the head of a linked list as an input.
2. In the recursive function:
   - Base case: If the linked list has zero or one nodes, return the head as it is already sorted.
   - Divide the linked list into two halves by finding the middle using the slow and fast pointer technique.
   - Recursively call `mergeSort` on both halves to sort them.
   - Merge the sorted halves using a helper function `merge`.
3. In the `merge` function:
   - Compare the values of the two halves' nodes and merge them in ascending order.
4. Call the `mergeSort` function with the given head of the linked list.
5. Return the sorted linked list.

## Complexity Analysis
- Let `n` be the number of nodes in the linked list.
- The time complexity of the Merge Sort algorithm is O(n log n).
- The space complexity is O(log n) due to the recursive calls.
- In conclusion, the algorithm efficiently sorts the linked list in ascending order using the Merge Sort algorithm with a time complexity of O(n log n) and a space complexity of O(log n).

