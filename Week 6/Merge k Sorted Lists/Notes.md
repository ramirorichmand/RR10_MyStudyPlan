# Merge k Sorted Lists

## Problem Description

Given an array of `k` linked-lists `lists`, each linked-list is sorted in ascending order. The task is to merge all the linked-lists into one sorted linked-list and return it.

## Approach and Algorithm

To solve this problem, we can use a min-heap or priority queue data structure to efficiently merge the linked-lists. The algorithm follows these steps:

1. Create a min-heap or priority queue to store the nodes from all the linked-lists.
2. Iterate over each linked-list in the array `lists` and insert the head node of each linked-list into the min-heap or priority queue.
3. Initialise a dummy node and a pointer `current` to keep track of the merged linked-list.
4. While the min-heap or priority queue is not empty, do the following:
   - Pop the minimum node from the min-heap or priority queue.
   - Append the popped node to the merged linked-list using the `current` pointer.
   - If the popped node has a next node, insert the next node into the min-heap or priority queue.
5. Return the next of the dummy node, which is the head of the merged sorted linked-list.

## Complexity Analysis

The time complexity of this algorithm is O(N log k), where N is the total number of nodes in all the linked-lists and k is the number of linked-lists. This is because we perform k insertions and k deletions on the min-heap or priority queue, each taking O(log k) time.

The space complexity is O(k), as we store at most k nodes in the min-heap or priority queue.

## Conclusion

By utilizing a min-heap or priority queue, we can efficiently merge k sorted linked-lists into a single sorted linked-list. This algorithm provides an optimal solution, ensuring the merged linked-list is sorted without unnecessary comparisons between nodes.
