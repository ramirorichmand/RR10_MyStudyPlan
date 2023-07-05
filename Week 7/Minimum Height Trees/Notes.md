# Minimum Height Trees

## Problem Description

Given a tree with `n` nodes labeled from 0 to `n - 1` and an array of `n - 1` edges, where `edges[i] = [ai, bi]` represents an undirected edge between nodes `ai` and `bi`, the task is to find all the minimum height trees (MHTs) in the tree.

A minimum height tree is a rooted tree with the minimum possible height among all possible rooted trees in the given tree.

## Approach and Algorithm

To solve this problem, we can use a topological sorting approach. Here are the steps of the algorithm:

1. If the number of nodes in the tree is 1 or 2, return all the nodes as the result since any node can be the root of a minimum height tree.
2. Create an adjacency list to represent the tree based on the given edges.
3. Initialize a queue and enqueue all the leaf nodes (nodes with only one neighbor) into the queue.
4. Remove the leaf nodes from the tree by updating their neighbors' adjacency lists and removing the edges connected to them.
5. After removing the leaf nodes, some nodes may become new leaf nodes. Enqueue these new leaf nodes into the queue.
6. Repeat steps 4 and 5 until there are fewer than or equal to 2 nodes left in the tree.
7. The remaining nodes in the tree after the above steps are the roots of the minimum height trees. Return these nodes as the result.

## Complexity Analysis

Let n be the number of nodes in the tree.

Building the adjacency list takes O(n) time since we iterate through the edges once.

The topological sorting process iterates through each node once and removes the corresponding edges. Therefore, this process takes O(n) time.

Overall, the algorithm has a time complexity of O(n).

The space complexity is O(n) since we store the adjacency list.

## Conclusion

By using a topological sorting approach, we can find all the minimum height trees in the given tree. The algorithm iteratively removes the leaf nodes from the tree until there are fewer than or equal to 2 nodes left, and the remaining nodes are the roots of the minimum height trees. This approach allows us to solve the problem with a time complexity of O(n) and a space complexity of O(n).
