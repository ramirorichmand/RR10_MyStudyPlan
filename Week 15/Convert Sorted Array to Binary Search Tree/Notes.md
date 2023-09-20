# Convert Sorted Array to Binary Search Tree

## Task Description
Given an integer array `nums` where the elements are sorted in ascending order, the task is to convert it into a height-balanced binary search tree (BST).

## Approach and Algorithm
To convert a sorted array into a height-balanced BST, we can use a recursive approach. Here's the approach:

1. Determine the middle element of the sorted array `nums`. This element will be the root of the BST. The middle element can be found at index `mid`, where `mid = (left + right) / 2` (integer division).

2. Create a new TreeNode with the value `nums[mid]` as the root of the current subtree.

3. Recursively build the left subtree by calling the function with `left` and `mid - 1` as the new indices. This will create a balanced left subtree.

4. Recursively build the right subtree by calling the function with `mid + 1` and `right` as the new indices. This will create a balanced right subtree.

5. Return the root node of the current subtree.

6. The recursion stops when `left > right`, indicating an empty subarray. In this case, return `null`.

## Complexity Analysis
### Time Complexity
The time complexity of this approach is O(n), where `n` is the number of elements in the `nums` array. Each element is visited once during the construction of the BST.

### Space Complexity
The space complexity is O(log n) on the recursion stack. In the worst case, when the array is perfectly balanced, the maximum depth of recursion is log2(n).

## Conclusion
This approach efficiently converts a sorted array into a height-balanced binary search tree. It works for arrays of up to 10^4 elements, each with values in the range [-10^4, 10^4].
