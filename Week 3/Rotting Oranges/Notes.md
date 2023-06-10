# Rotting Oranges

## Problem Description

In this problem, you are given an m x n grid representing a collection of oranges. Each cell in the grid can have one of three values:

- 0: representing an empty cell.
- 1: representing a fresh orange.
- 2: representing a rotten orange.

Every minute, any fresh orange that is 4-directionally adjacent to a rotten orange becomes rotten. You need to find the minimum number of minutes that must elapse until no cell has a fresh orange. If this is impossible, return -1.

## Approach and Algorithm

To solve this problem, you can use the following approach:

1. Initialize a queue to store the position of rotten oranges.
2. Initialize variables `freshOranges` and `minutes` to keep track of the number of fresh oranges and the number of minutes passed, respectively.
3. Iterate over the grid and perform the following steps:
   - If the current cell contains a rotten orange (value 2), add its position to the queue.
   - If the current cell contains a fresh orange (value 1), increment `freshOranges` by 1.
4. If there are no fresh oranges (`freshOranges == 0`), return 0, as there are no minutes needed.
5. While the queue is not empty, perform the following steps:
   - Increment `minutes` by 1 to simulate the passing of time.
   - Get the size of the queue (`queueSize`).
   - Iterate `queueSize` number of times to process all the oranges in the current minute:
     - Pop the front element from the queue and obtain its position.
     - Check the neighboring cells (up, down, left, right) and if they contain a fresh orange, change its value to 2 (rotten) and decrement `freshOranges` by 1. Add the position of the newly rotten orange to the queue.
6. After the while loop ends, if there are still fresh oranges remaining (`freshOranges > 0`), return -1, as it is impossible to rot all the oranges.
7. Otherwise, return `minutes - 1`, as the last iteration of the while loop is not counted as a minute.

## Complexity Analysis

The time complexity of this approach is O(m * n), where m is the number of rows and n is the number of columns in the grid. This is because we need to visit each cell in the grid once.

The space complexity is O(m * n) in the worst case, as the entire grid can be filled with fresh oranges, and they will be added to the queue.

## Conclusion

The "Rotting Oranges" problem can be solved using a breadth-first search (BFS) approach to simulate the rotting process of the oranges. By maintaining a queue and iterating over the oranges, you can track the minutes and the changes in the orange's states.

By following the steps outlined above, you should be able to implement a solution that returns the minimum number of minutes needed to rot all the oranges in the given grid.

Remember to handle the edge cases and invalid inputs according to the problem constraints.

