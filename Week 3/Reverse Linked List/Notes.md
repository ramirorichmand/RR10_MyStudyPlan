# Reverse Linked List

## Problem Description

In this problem, you are given the head of a singly linked list. Your task is to reverse the list and return the reversed list.

## Approach and Algorithm

To solve this problem, you can use the following approach:

1. initialise three pointers: `prev`, `curr`, and `next`.
   - `prev` will initially be set to `null`.
   - `curr` will be set to the `head` of the linked list.
   - `next` will be set to the `next` node of `curr`.
2. Traverse the linked list and update the pointers as follows:
   - Set `next` to the `next` node of `curr`.
   - Update the `next` pointer of `curr` to point to `prev` (reversing the link).
   - Move `prev` to `curr`.
   - Move `curr` to `next`.
3. Repeat steps 2 until `curr` becomes `null`.
4. After the traversal is complete, `prev` will be pointing to the new head of the reversed linked list.
5. Return `prev` as the new head of the reversed linked list.

## Complexity Analysis

The time complexity of this approach is O(n), where n is the number of nodes in the linked list. This is because we traverse the entire linked list once.

The space complexity is O(1) since we are using a constant amount of additional space for the three pointers.

## Conclusion

The "Reverse Linked List" problem can be solved iteratively by reversing the links between the nodes of the linked list.

By following the steps outlined above, you should be able to implement a solution that reverses a singly linked list.

It's important to note that there is also a recursive approach to solving this problem. In the recursive approach, we recursively reverse the rest of the list and then update the links. The recursive solution may have a higher space complexity due to the recursive function calls.

