# Rotate List

## Task Description
Given the head of a linked list, the task is to rotate the list to the right by k places.

## Approach and Algorithm
To rotate the linked list to the right by k places, we can follow these steps:

1. Find the length of the linked list.
2. Calculate the actual rotation index as `k % length`, where `length` is the length of the linked list.
3. If `k` is 0 or `length` is 0, return the original head as there is no rotation needed.
4. Traverse the linked list to find the new tail node, which is at position `length - actualRotationIndex`.
5. Break the list at the new tail node, making it the new head.
6. Update the previous node of the original head to point to `null`, effectively making it the new tail.
7. Return the new head of the rotated linked list.

## Complexity Analysis
### Time Complexity
The time complexity of this approach is O(n), where `n` is the number of nodes in the linked list. We need to traverse the entire list once to find the new tail and perform the rotation.

### Space Complexity
The space complexity is O(1) because we use only a constant amount of extra space.

## Conclusion
This approach efficiently rotates the linked list to the right by `k` places. It works for linked lists with up to 500 nodes and values in the range [-100, 100].
