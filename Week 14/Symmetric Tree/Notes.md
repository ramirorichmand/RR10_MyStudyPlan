# Symmetric Tree

## Task Description
Given the root of a binary tree, the task is to check whether it is a mirror of itself, meaning it is symmetric around its center.

## Approach and Algorithm
To check if a binary tree is symmetric, a recursive approach can be used. Here's how to do it:

1. Create a helper function that takes two nodes as parameters.
2. In the helper function, check if both nodes are null. If they are, return True (base case).
3. If one of the nodes is null and the other is not, return False (the tree is not symmetric).
4. If both nodes have values, check if their values are equal. If not, return False.
5. Recursively call the helper function with the left subtree of the first node and the right subtree of the second node, and vice versa.
6. If all recursive calls return True, the tree is symmetric, so return True.

## Complexity Analysis
### Time Complexity
The time complexity of this recursive approach is O(n), where n is the number of nodes in the binary tree. This is because we visit each node once.

### Space Complexity
The space complexity is O(h), where h is the height of the binary tree. In the worst case, where the tree is completely unbalanced (skewed), the space complexity is O(n) as we may have to store all nodes in the recursion stack. In a balanced tree, the space complexity is O(log(n)).

## Conclusion
The recursive approach described above can efficiently determine whether a binary tree is symmetric or not. It has a time complexity of O(n) and a space complexity of O(h), making it suitable for checking the symmetry of binary trees with up to 1000 nodes.
