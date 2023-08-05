# Path Sum II

## Task Description:
Given the root of a binary tree and an integer `targetSum`, the task is to return all root-to-leaf paths where the sum of the node values in the path equals `targetSum`. Each path should be returned as a list of the node values, not node references.

## Approach and Algorithm:
To solve this problem, I will use a depth-first search (DFS) approach. I will define a recursive function called `findPaths` that takes the current node, the current path, and the current sum as inputs.

Starting from the root of the binary tree, I will recursively traverse down the tree and update the current path and sum accordingly. At each node, I will check if it is a leaf node (i.e., has no children). If it is a leaf node, I will check if the current sum is equal to the `targetSum`. If it is, I will add the current path to the list of result paths.

During the recursive traversal, I will keep track of the current path using a list. I will append the value of the current node to the path at each step. After processing the current node, I will remove its value from the path before moving back up the tree.

The recursion will explore all possible root-to-leaf paths in the binary tree, and the result will be a list of lists, where each inner list represents a root-to-leaf path that satisfies the sum condition.

## Complexity Analysis:
- Let `n` be the number of nodes in the binary tree.
- The time complexity of the algorithm is O(n) as we visit each node once during the recursive traversal.
- The space complexity is O(n) as the maximum depth of the call stack during the recursion is limited by the height of the binary tree.
- In conclusion, the depth-first search (DFS) approach can find all root-to-leaf paths with a sum equal to `targetSum` in O(n) time and O(n) space. The algorithm returns the paths as lists of node values, satisfying the conditions specified in the problem statement.
