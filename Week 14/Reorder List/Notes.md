# Reorder List

## Task Description
Given the head of a singly linked-list, the task is to reorder the list so that it follows a specific pattern. The list should be reordered such that the first element is followed by the last element, then the second element is followed by the second-to-last element, and so on.

## Approach and Algorithm
To reorder the linked list, I can use the following approach:

1. Find the middle of the linked list using the two-pointer technique. One pointer moves one step at a time, and the other moves two steps at a time. When the faster pointer reaches the end of the list, the slower pointer will be at the middle.

2. Split the linked list into two halves at the middle point.

3. Reverse the second half of the linked list.

4. Merge the two halves by taking one node from each half alternately.

## Complexity Analysis
### Time Complexity
The time complexity of this approach is O(n), where n is the number of nodes in the linked list. This is because we traverse the entire list twice: once to find the middle and once to reverse the second half.

### Space Complexity
The space complexity is O(1) as we use a constant amount of extra space for the pointers.

## Conclusion
This approach efficiently reorders the linked list as specified, without modifying the values in the nodes. It works for linked lists with up to 5 * 10^4 nodes and values between 1 and 1000.
