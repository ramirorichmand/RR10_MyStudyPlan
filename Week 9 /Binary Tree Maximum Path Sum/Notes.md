# Binary Tree Maximum Path Sum

## Task Description:
Given the root of a binary tree, the task is to find the maximum sum of any non-empty path in the tree. A path is a sequence of nodes where each pair of adjacent nodes in the sequence has an edge connecting them. The path sum of a path is the sum of the node's values in the path.

## Approach and Algorithm:
To find the maximum path sum in the binary tree, I will use a recursive approach. For each node in the tree, I will calculate the maximum sum of the paths that pass through that node. This will involve considering four scenarios:

1. The maximum sum of the left subtree path that passes through the current node.
2. The maximum sum of the right subtree path that passes through the current node.
3. The maximum sum of the left subtree path starting from the current node (not passing through the parent node).
4. The maximum sum of the right subtree path starting from the current node (not passing through the parent node).

The maximum path sum at the current node will be the maximum value among these four scenarios. Additionally, we need to keep track of the global maximum path sum encountered during the traversal of the tree.

I will define a recursive function that returns the maximum sum of the path passing through the current node and updates the global maximum sum. The base case of the recursion will be when the current node is null, where the function will return 0.

The function will calculate the maximum sum of paths passing through the left and right subtrees and update the global maximum path sum accordingly. It will then return the maximum sum of the paths starting from the current node.

To obtain the final result, I will call this recursive function starting from the root node.

## Complexity Analysis:
- Let `n` be the number of nodes in the binary tree.
- The time complexity of the algorithm is O(n) since we visit each node once during the recursive traversal.
- The space complexity is O(h), where `h` is the height of the binary tree, as the maximum depth of the call stack during the recursive traversal is limited by the height of the tree.
- In conclusion, the algorithm can find the maximum path sum of any non-empty path in the binary tree with O(n) time complexity and O(h) space complexity.
