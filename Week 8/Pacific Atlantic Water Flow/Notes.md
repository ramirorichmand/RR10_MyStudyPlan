# Pacific Atlantic Water Flow

## Problem Description

There is an `m x n` rectangular island that borders both the Pacific Ocean and Atlantic Ocean. The Pacific Ocean touches the island's left and top edges, and the Atlantic Ocean touches the island's right and bottom edges.

The island is partitioned into a grid of square cells. You are given an `m x n` integer matrix `heights` where `heights[r][c]` represents the height above sea level of the cell at coordinate `(r, c)`.

The island receives a lot of rain, and the rainwater can flow to neighboring cells directly north, south, east, and west if the neighboring cell's height is less than or equal to the current cell's height. Water can flow from any cell adjacent to an ocean into the ocean.

Your task is to find the cells from which rainwater can flow to both the Pacific and Atlantic oceans.

## Example

Input:
heights = [[1,2,2,3,5],
[3,2,3,4,4],
[2,4,5,3,1],
[6,7,1,4,5],
[5,1,1,2,4]]


Output:
[[0,4],[1,3],[1,4],[2,2],[3,0],[3,1],[4,0]]


## Approach

To solve this problem, we can use a depth-first search (DFS) algorithm to explore the island from each ocean separately.

1. Create two boolean matrices, one for the Pacific ocean and one for the Atlantic ocean, to keep track of visited cells.
2. Start from the cells in the first row and the first column and perform DFS to mark all cells that can be reached by water from the Pacific ocean. Repeat the process for the cells in the last row and the last column to mark all cells that can be reached by water from the Atlantic ocean.
3. Finally, iterate through all the cells and check if a cell is marked as reachable from both oceans. If yes, add it to the result.

## Complexity Analysis

The time complexity for this approach is O(m * n) since we visit each cell once during the DFS traversal.

The space complexity is O(m * n) as well, considering the boolean matrices used to mark the visited cells.

## Conclusion

The solution effectively identifies the cells from which rainwater can flow to both the Pacific and Atlantic oceans. By utilizing depth-first search, we can mark cells reachable from each ocean separately and then find the cells that are reachable from both.
