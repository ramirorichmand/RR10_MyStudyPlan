## Intuition:
To find the distance of the nearest 0 for each cell in the given binary matrix, we can perform a breadth-first search (BFS) starting from each 0 cell. We'll traverse the matrix and update the distance of each cell from its nearest 0 cell.

## Approach:
1. initialise a queue to store the cell indices.
2. Traverse the matrix to find all the 0 cells and enqueue their indices into the queue.
3. initialise a distance matrix of the same size as the input matrix, filled with maximum distances.
4. For each 0 cell, set its distance to 0 in the distance matrix and enqueue its indices into the queue.
5. While the queue is not empty:
    - Dequeue the indices of a cell from the front of the queue.
    - Explore the adjacent cells (up, down, left, right) and check if their distance can be updated to a smaller value.
    - If the distance of a neighboring cell is updated, enqueue its indices into the queue.
6. Return the distance matrix.

## Complexity:
### Time Complexity: 
The time complexity of this approach is O(m * n) since we visit each cell once during the breadth-first search.
### Space Complexity: 
The space complexity is O(m * n) as we need to store the distance matrix and the queue, both of which can grow up to the size of the input matrix.
