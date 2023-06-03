## Intuition
In the first place when i understood the problem description it was clear that i have to use DFS ofcourse and as it is based on Binary Search Tree (BST), i got to an interesting observation that we know ancestor will be that node at which the two given nodes p and q will split or wont be a part of same subtree after that particular node.

## Approach
The approach is quite straight forward. The Algorithm will check if p and q falls under same subtree i.e the left one or right one then it will recursively call that subtree to search the ancestor.
Otherwise if p and q are separated and they belongs to different subtree then that particular node is the ancestor.

For example

p = 3
q = 5
lets say current node = 6 then we know that the p and q will fall under left subtree of this particular node.
Again lets say the current node = 2 then we know that p and q will fall under right subtree of the particular node.

For above these situations we will search through that particular subtree recursively.
Now if these conditions doesn't satisfied, there will be 2 cases and we will simply return that current node.

## Cases:

The current node is equals to any of p or q.
If the current node = 4 then p will belongs to left subtree and q will belongs to right subtree and vice-verse.
In any of these two cases we will simply return current node as our answer.
This is how the algorithm will work to find the common ancestor.

## Complexity
Time complexity: O(h)
h is the height of the tree.
Space complexity: O(h)
Total h stack spaces in recursive calls.


