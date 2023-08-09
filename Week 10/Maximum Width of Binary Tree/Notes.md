# Maximum Width of Binary Tree

## Task Description:
Given the root of a binary tree, the task is to return the maximum width of the given tree. The maximum width of a tree is the maximum width among all levels. The width of one level is defined as the length between the end-nodes (the leftmost and rightmost non-null nodes), where the null nodes between the end-nodes that would be present in a complete binary tree extending down to that level are also counted into the length calculation.

## Approach and Algorithm:
To solve this problem, I will perform a level-order traversal of the binary tree and keep track of the indices of the nodes at each level. I will then calculate the width of each level based on the indices of the leftmost and rightmost nodes and update the maximum width as needed.

1. I will initialize a queue for level-order traversal and add the root node to the queue along with its index, which is 0.
2. I will initialize two variables `maxWidth` and `levelWidth` to keep track of the maximum width and the width of the current level, respectively.
3. While the queue is not empty:
   - I will get the size of the current level (number of nodes in the queue) and initialize `levelStart` with the index of the first node in the current level.
   - I will iterate through the nodes in the current level and update their indices by subtracting `levelStart` from each index.
   - I will update the `levelWidth` as the difference between the index of the last node and the index of the first node plus 1.
   - I will update `maxWidth` with the maximum of `maxWidth` and `levelWidth`.
   - I will remove the nodes from the queue.
4. After completing the traversal, I will return `maxWidth` as the result.

The result will be the maximum width of the given binary tree.

## Complexity Analysis:
- Let `n` be the number of nodes in the binary tree.
- The time complexity of the algorithm is O(n) because I perform a level-order traversal, visiting each node once.
- The space complexity is O(m), where `m` is the maximum number of nodes in a level. In the worst case, the last level of the tree is a complete level, so `m` can be half of `n`. Therefore, the space complexity is O(n/2), which is O(n).
- In conclusion, the level-order traversal approach allows me to find the maximum width of the given binary tree in O(n) time complexity and O(n) space complexity. The algorithm efficiently tracks the indices of nodes at each level to calculate the width and update the maximum width as needed.
