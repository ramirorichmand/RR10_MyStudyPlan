# Validate Binary Search Tree

## Problem Description

In this problem, you are given the root of a binary tree, and your task is to determine if it is a valid binary search tree (BST).

A valid BST is defined as follows:
- The left subtree of a node contains only nodes with keys less than the node's key.
- The right subtree of a node contains only nodes with keys greater than the node's key.
- Both the left and right subtrees must also be binary search trees.

## Approach and Algorithm

To solve this problem, you can use the following approach:

1. Initialize a helper function `isValidBSTHelper(node, min_val, max_val)` that takes a node, along with the minimum and maximum values that the node's key can take.
2. Base Case: If the node is null, return `True` since an empty tree is considered a valid BST.
3. Recursive Steps:
   - Check if the node's key is within the range defined by `min_val` and `max_val`. If not, return `False` as it violates the BST property.
   - Recursively call `isValidBSTHelper` for the left subtree with updated `max_val` as the current node's key (since all nodes in the left subtree must be less than the current node).
   - Recursively call `isValidBSTHelper` for the right subtree with updated `min_val` as the current node's key (since all nodes in the right subtree must be greater than the current node).
   - If any of the recursive calls return `False`, propagate the `False` value up the call stack.
4. Call the `isValidBSTHelper` function with the root node and initial `min_val` and `max_val` as negative and positive infinity, respectively.
5. Return the result obtained from the `isValidBSTHelper` function.

## Complexity Analysis

The time complexity of this approach is O(n), where n is the number of nodes in the binary tree. This is because we need to visit each node once to validate the BST property.

The space complexity is O(n) in the worst case, considering the recursive call stack. However, in the average case, the space complexity is O(log n) for a balanced binary tree, as we only need to store the call stack for the height of the tree.

## Conclusion

The "Validate Binary Search Tree" problem can be solved recursively by performing a depth-first search (DFS) and validating the BST property at each node.

By following the steps outlined above, you should be able to implement a solution that determines whether a given binary tree is a valid binary search tree.

Remember to handle the edge case of an empty tree by considering it as a valid BST.

