# Clone Graph

## Problem Description

Given a reference of a node in a connected undirected graph, you need to return a deep copy (clone) of the graph. Each node in the graph contains a value (int) and a list (List[Node]) of its neighbors.

The graph is represented using an adjacency list, where each node is assigned a unique value. The task is to clone the graph and return the reference to the cloned graph.

## Approach and Algorithm

To solve this problem, we can use a depth-first search (DFS) or breadth-first search (BFS) algorithm. Here, we'll use a DFS approach.

The idea is to traverse the original graph and create a clone of each node and its neighbors. We'll use a HashMap to keep track of the cloned nodes. The key will be the original node, and the value will be the corresponding cloned node.

We'll start by creating a recursive helper function that takes a node from the original graph as input. The function will perform the following steps:

1. Create a new cloned node with the same value as the original node.
2. Add the cloned node to the HashMap, using the original node as the key.
3. Iterate through the neighbors of the original node.
   - If a neighbor is already present in the HashMap, retrieve its cloned version from the HashMap.
   - If a neighbor is not present in the HashMap, recursively call the helper function on the neighbor and assign the cloned neighbor to the cloned node's neighbors list.
4. Return the cloned node.

To solve the problem, we'll follow these steps:

1. Create an empty HashMap to store the cloned nodes.
2. Check if the given node is null. If it is, return null.
3. If the given node is not null, call the recursive helper function on the given node to clone the graph.
4. Return the cloned node obtained from the helper function.

## Complexity Analysis

The time complexity for this approach is O(N), where N is the total number of nodes in the graph. We visit each node exactly once.

The space complexity is also O(N) because we use additional space to store the cloned nodes in the HashMap.
