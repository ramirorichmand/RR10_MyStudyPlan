# Binary Tree Right Side View

## Problem Description

Given the root of a binary tree, imagine yourself standing on the right side of it. You need to return the values of the nodes you can see from the right side, ordered from top to bottom.

## Approach and Algorithm

To solve this problem, we can use the Breadth-First Search (BFS) algorithm to traverse the binary tree level by level. By keeping track of the last node at each level, we can obtain the right side view of the tree.

1. We start with an empty list `result` to store the values of the nodes in the right side view.
2. We initialise a queue `queue` and enqueue the root node.
3. While the queue is not empty:
   - Get the size of the current level (`levelSize`).
   - Iterate through the nodes in the current level:
     - Dequeue a node from the queue.
     - If it is the last node in the current level, add its value to the `result` list.
     - Enqueue its left and right child nodes if they exist.
4. Finally, we return the `result` list, which contains the values of the nodes in the right side view of the binary tree.

## Complexity Analysis

The time complexity of this approach is O(n), where n is the number of nodes in the binary tree. We visit each node once during the BFS traversal.
The space complexity is O(w), where w is the maximum width of the binary tree (i.e., the maximum number of nodes at any level). In the worst case, the maximum width can be n/2, so the space complexity is O(n).

## Conclusion

The "Binary Tree Right Side View" problem can be solved by performing a Breadth-First Search (BFS) traversal of the binary tree. By following the algorithm mentioned above, we can obtain the values of the nodes in the right side view of the tree.
