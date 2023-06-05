## Intuition:
The given problem is to detect if there is a cycle in the given linked list. To do so, we use the Floyd's Cycle detection algorithm, which is also known as the "Tortoise and Hare" algorithm.

## Approach:
We use two pointers, rabbit and tortoise, which start from the head of the linked list. The rabbit moves twice as fast as the tortoise, i.e., it moves two nodes at a time while the tortoise moves one node at a time.

If there is no cycle in the linked list, the rabbit will reach the end of the list, i.e., it will become NULL, and we can return false. However, if there is a cycle, the rabbit will eventually catch up with the tortoise, and both pointers will point to the same node. We return true in this case.

## Algorithm Steps:
1. Initialise two pointers, rabbit and tortoise, to the head of the linked list.
2. While the rabbit pointer is not NULL and its next pointer is not NULL, repeat steps 3-4.
3. Move the rabbit pointer two nodes ahead.
4. Move the tortoise pointer one node ahead.
5. If the rabbit and tortoise pointers point to the same node, return true.
6. If the rabbit pointer becomes NULL, return false.


## Complexity:
### Time complexity: 
O(n), where n is the number of nodes in the linked list. In the worst case scenario, we will need to traverse the entire list to determine if there is a cycle.
### Space complexity: 
O(1), as we are only using two pointers and not using any additional data structures.