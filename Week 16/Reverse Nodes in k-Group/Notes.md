# Reverse Nodes in k-Group

## Task Description
Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.

## Approach
To reverse nodes in k-group, we can follow these steps:

1. Count the total number of nodes in the linked list.
2. Iterate through the linked list in groups of k.
   - For each group, reverse the nodes.
   - Keep track of the new head and tail of each reversed group.
   - Connect the reversed groups.
3. Return the new head of the modified linked list.

## Complexity Analysis
- Time Complexity: O(n), where n is the number of nodes in the linked list. We traverse each node once.
- Space Complexity: O(1), as we use constant extra space.

## Conclusion
Reversing nodes in k-group involves traversing the linked list and reversing each group of k nodes. The approach ensures that the linked list is modified in-place without altering the values of the nodes.
