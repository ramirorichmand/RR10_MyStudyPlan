# Construct Binary Tree from Preorder and Inorder Traversal

## Problem Description

Given two integer arrays `preorder` and `inorder`, where `preorder` represents the preorder traversal of a binary tree and `inorder` represents the inorder traversal of the same tree, the task is to construct and return the binary tree.

## Approach and Algorithm

To solve this problem, we can use a recursive approach.

The algorithm follows these steps:

1. Create a helper function `buildTree` that takes the following parameters:
   - `preorder` - the preorder traversal array
   - `inorder` - the inorder traversal array
   - `preStart` - the starting index of the preorder array
   - `inStart` - the starting index of the inorder array
   - `inEnd` - the ending index of the inorder array
2. If `inStart` is greater than `inEnd`, return `null` since there are no more nodes to construct.
3. Create a new node with the value at `preorder[preStart]` and assign it to `root`.
4. Find the index of `root.val` in the `inorder` array. Let's call this index `inIndex`.
5. Calculate the number of elements in the left subtree by subtracting `inStart` from `inIndex`.
6. Recursively call `buildTree` to construct the left subtree:
   - Set `root.left` to `buildTree(preorder, inorder, preStart + 1, inStart, inIndex - 1)`.
7. Recursively call `buildTree` to construct the right subtree:
   - Set `root.right` to `buildTree(preorder, inorder, preStart + inIndex - inStart + 1, inIndex + 1, inEnd)`.
8. Return `root`.
9. Finally, call `buildTree` with the appropriate initial parameters (`preorder`, `inorder`, 0, 0, `inorder.length - 1`) to construct the binary tree.

## Complexity Analysis

The time complexity of this algorithm is O(n), where n is the number of nodes in the binary tree. This is because we visit each node exactly once during the construction process.

The space complexity is O(n) as well. This is because we use the recursive stack space during the construction process, and in the worst case, the height of the binary tree is n.

## Conclusion

By using a recursive approach, we can construct a binary tree from its preorder and inorder traversals. The algorithm takes advantage of the properties of preorder and inorder traversals and builds the tree recursively based on the given arrays. It provides an efficient solution to the problem, allowing us to construct the binary tree in a time and space-efficient manner.
