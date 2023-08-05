# Swap Nodes in Pairs

## Task Description:
Given a linked list, the task is to swap every two adjacent nodes and return its head. The values in the list's nodes should not be modified, only the nodes themselves may be changed.

## Approach and Algorithm:
To solve this problem, I will use a recursive approach. I will define a function called `swapPairs` that takes the head of the linked list as an input and returns the new head of the modified linked list.

The base case of the recursion will be when there are no nodes or only one node in the linked list. In such cases, I will simply return the head as it is.

For the general case (when there are at least two nodes), I will swap the first two nodes and then recursively call the `swapPairs` function on the remaining linked list (starting from the third node). I will link the new head of the swapped pairs to the result obtained from the recursive call.

The swapping of two nodes can be done by modifying their `next` pointers. For example, if we have nodes `A`, `B`, and `C` in the linked list and we want to swap `A` and `B`, we will set `A.next` to `C` and `B.next` to `A`. The final step will be to set the `next` pointer of the previous node (before `A`) to `B`.

The recursion will handle swapping pairs of nodes throughout the linked list until the end, and the final result will be the head of the modified linked list.

## Complexity Analysis:
- Let `n` be the number of nodes in the linked list.
- The time complexity of the algorithm is O(n) as we visit each node once during the recursion.
- The space complexity is O(n) as the maximum depth of the call stack during the recursion is limited by the number of nodes in the linked list.
- In conclusion, the recursive approach can swap every two adjacent nodes in the linked list in O(n) time and O(n) space. The algorithm does not modify the values in the list's nodes, only the nodes themselves are changed to achieve the swapping.
