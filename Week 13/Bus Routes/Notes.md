# Bus Routes

## Task Description
I am given an array `routes` representing bus routes, where `routes[i]` is a bus route that the ith bus repeats forever. For example, if `routes[0] = [1, 5, 7]`, this means that the 0th bus travels in the sequence 1 -> 5 -> 7 -> 1 -> 5 -> 7 -> 1 -> ... forever.

I want to start at the bus stop `source` (I am not on any bus initially) and go to the bus stop `target`. I can travel between bus stops by buses only.

My goal is to return the least number of buses I must take to travel from `source` to `target`. If it is not possible to reach the target, I should return -1.

## Approach and Algorithm
To solve this problem, I will use Breadth-First Search (BFS) along with a hashmap to efficiently find the minimum number of buses required to reach the target.

Here's the step-by-step approach:
1. Create a hashmap where the key is a bus stop, and the value is a list of bus routes that pass through that stop.
2. Initialize a BFS queue and a set to keep track of visited bus routes.
3. Enqueue the source bus stop into the BFS queue along with the number of buses taken (initially 0) and mark it as visited.
4. While the BFS queue is not empty:
   a. Dequeue a bus stop from the queue.
   b. If it is the target bus stop, return the number of buses taken.
   c. Iterate through the bus routes that pass through this bus stop:
      i. If the bus route has not been visited, mark it as visited and enqueue all bus stops on that route along with the updated number of buses taken.
5. If the target bus stop is not reached during BFS, return -1.

## Complexity Analysis
- Time Complexity: The BFS traversal explores each bus stop and route once, so the time complexity is O(N + R), where N is the total number of bus stops and R is the total number of bus routes.
- Space Complexity: The space complexity is determined by the data structures used for BFS, which include the queue and the set. Therefore, the space complexity is O(N).

## Conclusion
This approach effectively finds the least number of buses required to reach the target bus stop using Breadth-First Search. It provides an optimal solution given the constraints.
