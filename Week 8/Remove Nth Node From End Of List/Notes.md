# Remove Nth Node From End of List

## Problem Description

Given the head of a linked list, remove the `n`th node from the end of the list and return its head.

## Example

Input:
head = [1,2,3,4,5]
n = 2

Output:
[1,2,3,5]


## Approach

To remove the `n`th node from the end of the linked list, I will use the following approach:

1. Initialise two pointers, `fast` and `slow`, both pointing to the head of the linked list.
2. Move the `fast` pointer `n` steps ahead.
3. If the `fast` pointer reaches the end of the list (i.e., it becomes `null`), it means the `n`th node from the end is the head of the list. In this case, we simply update the head to be the second node and return the new head.
4. Otherwise, while the `fast` pointer is not `null`, move both the `fast` and `slow` pointers one step at a time.
5. When the `fast` pointer reaches the end of the list, the `slow` pointer will be pointing to the node just before the `n`th node from the end.
6. Update the `slow` pointer to skip the `n`th node by modifying its `next` pointer to skip the `n`th node.
7. Return the original head of the linked list.

## Complexity Analysis

The time complexity for this approach is O(L), where L is the length of the linked list. We only iterate through the list once.

The space complexity is O(1) since we are using a constant amount of additional space.

## Conclusion

The solution effectively removes the `n`th node from the end of the linked list. By using two pointers, we can find the node to be removed and update the pointers accordingly. This approach allows us to solve the problem in one pass through the linked list.

