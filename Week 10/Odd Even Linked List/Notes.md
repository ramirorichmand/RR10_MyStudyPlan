# Odd Even Linked List

## Task Description:
Given the head of a singly linked list, the task is to group all the nodes with odd indices together, followed by the nodes with even indices, and return the reordered list. The first node is considered odd, the second node is even, and so on. The relative order inside both the even and odd groups should remain as it was in the input.

## Approach and Algorithm:
To solve this problem, I will use a two-pointer approach to separate the odd and even nodes and then merge them back while maintaining their relative order.

1. I will initialize two pointers `odd` and `even` to point to the first and second nodes, respectively.
2. I will also initialize a pointer `evenHead` to keep track of the head of the even nodes.
3. I will then iterate through the linked list and keep adjusting the pointers:
   - I will link the `odd` node to the next odd node (i.e., skip one even node).
   - I will link the `even` node to the next even node (i.e., skip one odd node).
4. After iterating, I will connect the last odd node to the `evenHead`, effectively merging the odd and even lists.

The result will be a linked list with odd-indexed nodes followed by even-indexed nodes, maintaining their relative order.

## Complexity Analysis:
- Let `n` be the number of nodes in the linked list.
- The time complexity of the algorithm is O(n) because I iterate through the linked list once.
- The space complexity is O(1) as I use constant extra space to keep track of pointers.
- In conclusion, the two-pointer approach allows me to reorder the linked list in O(n) time complexity and O(1) extra space complexity. The algorithm preserves the relative order of odd and even nodes within the list, as required by the problem statement.
