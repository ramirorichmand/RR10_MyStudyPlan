# 134. Gas Station

## Problem Description

You are given `n` gas stations along a circular route, represented by the amount of gas at each station (`gas` array). You also have the cost of gas required to travel from each station to the next station (`cost` array). The goal is to find the starting gas station's index from where you can travel around the circuit once in the clockwise direction.

If there is a solution, it is guaranteed to be unique.

## Approach and Algorithm

To solve this problem, we can use the following algorithm:

1. Initialise `start` and `total` variables to 0. `start` will store the starting gas station's index, and `total` will store the total gas available.
2. Initialise `tank` variable to 0. `tank` will represent the gas in the tank at the current station.
3. Iterate through each gas station:
   - Update `tank` by adding the gas at the current station and subtracting the cost to travel to the next station.
   - If `tank` is negative, it means we can't reach the next station from the current station. Reset `tank` to 0 and update `start` to the next station's index.
   - Add the gas at the current station to `total`.
4. Finally, check if `total` is greater than or equal to 0. If it is, return the `start` index; otherwise, return -1.

## Complexity Analysis

The time complexity for this approach is O(n), where n is the number of gas stations. We iterate through each gas station once. The space complexity is O(1) since we only use a few variables to store the results.

## Conclusion

By simulating the circular route and tracking the gas in the tank, we can find the starting gas station from where we can travel around the circuit once. The algorithm has a time complexity of O(n) and provides an efficient solution to the problem.
