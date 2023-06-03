## Intuition:
A balanced binary tree is a binary tree in which the heights of the two subtrees of any node differ by at most one. We need to check if the given binary tree is height-balanced.

## Approach:
To determine if a binary tree is height-balanced, we can use a recursive approach. The idea is to calculate the height of the left and right subtrees of each node and check if the difference in heights is greater than 1. If it is, then the tree is not height-balanced. We can perform this check recursively for all nodes in the tree.


1. Create a helper function getHeight that takes a node as input and returns its height.
    - If the node is null, return 0.
    - Recursively calculate the height of the left and right subtrees using the getHeight function.
    - Return the maximum height of the left and right subtrees, plus 1 (to account for the current node).
2. Create another helper function isBalanced that takes a node as input and checks if the tree rooted at that node is height-balanced.
    - If the node is null, return true.
    - Calculate the heights of the left and right subtrees using the getHeight function.
    - If the absolute difference between the heights is greater than 1, return false.
    - Recursively check if the left and right subtrees are height-balanced using the isBalanced function.
    - If both subtrees are height-balanced, return true; otherwise, return false.
3. In the main function, call the isBalanced function with the root of the binary tree and return its result.

## Complexity:

The <b> time complexity </b> of this approach is O(n^2), where n is the number of nodes in the tree. In the worst case, the algorithm visits each node and calculates its height, resulting in a quadratic time complexity. However, if the tree is balanced, the algorithm can terminate early, resulting in a better average-case time complexity.

<b> Space Complexity: </b>
The space complexity of this approach is O(n), where n is the number of nodes in the tree. The space is used for the recursive call stack, which can go as deep as the height of the tree. In the worst case, the tree can be skewed, resulting in a height of n, and hence the space complexity of O(n).