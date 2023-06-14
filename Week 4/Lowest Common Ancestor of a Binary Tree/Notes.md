# Lowest Common Ancestor of a Binary Tree

## Problem Description

In this problem, you are given a binary tree and two nodes `p` and `q`. Your task is to find the lowest common ancestor (LCA) of the two given nodes in the tree.

The LCA is defined as the lowest node in the tree that has both `p` and `q` as descendants. It is allowed for a node to be a descendant of itself.

## Approach and Algorithm

To solve this problem, you can use a recursive approach. Here's how you can approach it:

1. Define a helper function, let's call it `lowestCommonAncestorHelper`, that takes the following parameters:
   - `node` - The current node being visited in the recursive process.
   - `p` - The first given node.
   - `q` - The second given node.
2. Inside the `lowestCommonAncestorHelper` function, perform the following steps:
   - If `node` is `None`, it means we have reached the end of a branch. Return `None`.
   - If `node` is equal to either `p` or `q`, it means we have found one of the nodes. Return `node`.
   - Recursively call the `lowestCommonAncestorHelper` function for the left and right subtrees of `node`. Store the results in variables `left` and `right`, respectively.
   - If both `left` and `right` are not `None`, it means `p` and `q` are present in different subtrees of `node`. Return `node` as the lowest common ancestor.
   - If `left` is `None` and `right` is not `None`, it means both `p` and `q` are present in the right subtree. Return `right`.
   - If `left` is not `None` and `right` is `None`, it means both `p` and `q` are present in the left subtree. Return `left`.
   - If both `left` and `right` are `None`, it means neither `p` nor `q` are present in `node` or its subtrees. Return `None`.
3. Finally, call the `lowestCommonAncestorHelper` function with the root of the binary tree and the given nodes `p` and `q`.
4. Return the result of the `lowestCommonAncestorHelper` function.

## Complexity Analysis

The time complexity of this approach is O(N), where N is the number of nodes in the binary tree. In the worst case, we may need to visit all the nodes of the tree.

The space complexity is O(N) as well. In the worst case, the recursion stack can have N function calls.

## Conclusion

The "Lowest Common Ancestor of a Binary Tree" problem can be solved using a recursive approach to find the lowest common ancestor of two given nodes in the binary tree.

By following the steps outlined above, you should be able to implement a solution that returns the lowest common ancestor.

Remember to handle the edge cases and invalid inputs according to the problem constraints.

