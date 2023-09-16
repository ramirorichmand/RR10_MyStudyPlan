# All Nodes Distance K in Binary Tree

## Task Description
Given the root of a binary tree, a target node value `target`, and an integer `k`, the task is to find and return an array of values of all nodes that have a distance `k` from the target node in the binary tree.

## Approach and Algorithm
To find nodes at a distance `k` from the target node in a binary tree, depth-first search (DFS) can be used. Here's the approach:

1. First, perform a depth-first search from the root to find the target node `target`. During this traversal, keep track of the parent of each node encountered and store this information in a dictionary.

2. Once the target node `target` is found, perform another DFS to find all nodes at a distance `k` from the target node. This time, we consider the binary tree as an undirected graph. We start the DFS from the target node, and if the distance from the current node to the target node is `k`, we add its value to the result list.

3. To find nodes at distance `k`, we can consider three cases:
   - Nodes in the subtree rooted at the target node's left child with a depth of `k - 1`.
   - Nodes in the subtree rooted at the target node's right child with a depth of `k - 1`.
   - Nodes that are `k` levels above the target node in the parent direction.

4. Continue the DFS until all nodes at distance `k` are visited.

## Complexity Analysis
### Time Complexity
The time complexity of this approach is O(n), where `n` is the number of nodes in the binary tree. We perform two DFS traversals, each with a time complexity of O(n).

### Space Complexity
The space complexity is O(n) as well. We use a dictionary to store parent information, and the recursion stack for DFS can have up to `n` nodes.

## Conclusion
This approach efficiently finds all nodes at distance `k` from the target node in a binary tree. It works for binary trees with up to 500 nodes and values in the range [0, 500].
