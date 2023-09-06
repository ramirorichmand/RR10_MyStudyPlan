# Path Sum III

## Task Description
Given the root of a binary tree and an integer targetSum, the task is to return the number of paths in the tree where the sum of the values along the path equals targetSum. The path does not need to start or end at the root or a leaf, but it must go downwards (i.e., traveling only from parent nodes to child nodes).

## Approach and Algorithm
To solve this problem, I will use a recursive approach to traverse the binary tree while keeping track of the current path and its sum. At each node, I will check if there are any subpaths that sum up to the targetSum. To do this efficiently, I will maintain a dictionary that stores the running sums of paths encountered so far.

Here are the steps of the algorithm:

1. Initialize a variable `count` to keep track of the number of valid paths found.

2. Define a recursive function `dfs` that takes the following parameters:
   - `node`: The current node being traversed.
   - `currentSum`: The sum of values along the current path.
   - `pathSum`: A dictionary that stores the running sums of paths encountered so far.

3. In the `dfs` function:
   - If `node` is None, return 0 (no valid paths from this point).

   - Update `currentSum` by adding the value of the current node.

   - Calculate the complement value (targetSum - currentSum) and check if it exists in the `pathSum` dictionary. If it exists, add the count of such complements to the `count` variable. This means that there are subpaths from previous nodes that sum up to the targetSum.

   - Update the `pathSum` dictionary with the `currentSum` as a key and its count as a value. This keeps track of running sums along the path.

   - Recursively call `dfs` on the left and right children of the current node, passing the updated `currentSum` and `pathSum` as parameters.

4. Start the traversal by calling `dfs` on the root node with `currentSum` initially set to 0 and an empty `pathSum` dictionary.

5. Finally, return the `count` variable, which contains the total number of valid paths.

## Complexity Analysis
- Let `n` be the number of nodes in the binary tree.
- The time complexity of the algorithm is O(n) because we visit each node once.
- The space complexity is O(n) in the worst case due to the `pathSum` dictionary, which can have at most n entries (for a skewed tree).
- In conclusion, this approach efficiently counts the number of paths with a sum equal to targetSum in a binary tree with a time complexity of O(n) and a space complexity of O(n).

