# Combination Sum

## Problem Description

In this problem, you are given an array of distinct integers `candidates` and a target integer `target`. Your task is to find all unique combinations of numbers from the `candidates` array where the chosen numbers sum up to the `target`. The same number from the `candidates` array can be chosen multiple times to form a combination.

You need to return a list of all the unique combinations that satisfy the given condition. The order of the combinations does not matter.

## Approach and Algorithm

To solve this problem, you can use a recursive backtracking algorithm. Here's how you can approach it:

1. Sort the `candidates` array in ascending order. This will help in avoiding duplicate combinations.
2. Define a helper function, let's call it `backtrack`, that takes the following parameters:
   - `target` - The remaining target value to be achieved.
   - `start` - The index to start the search from in the `candidates` array.
   - `combination` - The current combination of numbers that sum up to the target.
   - `result` - The list to store the valid combinations.
3. Inside the `backtrack` function, perform the following steps:
   - If the `target` is equal to 0, it means we have found a valid combination. Add the `combination` to the `result` list.
   - Iterate over the `candidates` array starting from the `start` index:
     - If the current number is greater than the remaining `target`, break out of the loop as further numbers will also be greater.
     - Add the current number to the `combination`.
     - Call the `backtrack` function recursively with the updated `target` (subtracting the current number), `start` (to consider the current number again), and the updated `combination`.
     - Remove the last added number from the `combination` to backtrack and explore other possibilities.
4. Finally, initialise an empty list called `result` to store the valid combinations.
5. Call the `backtrack` function with the initial values of `target`, `start`, `combination`, and `result`.
6. Return the `result` list.

## Complexity Analysis

The time complexity of this approach is dependent on the number of valid combinations that sum up to the target. In the worst case, when there are many valid combinations, the time complexity can be exponential.

The space complexity is also dependent on the number of valid combinations. In the worst case, when there are many valid combinations, the space complexity can be exponential as well.

## Conclusion

The "Combination Sum" problem can be solved using a recursive backtracking algorithm to find all unique combinations of numbers that sum up to the target.

By following the steps outlined above, you should be able to implement a solution that returns all the valid combinations.

Remember to handle the edge cases and invalid inputs according to the problem constraints.

