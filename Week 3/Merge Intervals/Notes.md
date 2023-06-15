# Permutations

## Problem Description

In this problem, you are given an array of distinct integers `nums`. Your task is to generate all possible permutations of the elements in `nums` and return them as a list. Each permutation should contain all the elements from the input array.

The order of the permutations does not matter.

## Approach and Algorithm

To solve this problem, you can use a recursive backtracking algorithm. Here's how you can approach it:

1. Define a helper function, let's call it `permuteHelper`, that takes the following parameters:
   - `nums` - The input array of distinct integers.
   - `current` - The current permutation being formed.
   - `visited` - A boolean array to keep track of the visited elements in `nums`.
   - `result` - The list to store the permutations.
2. Inside the `permuteHelper` function, perform the following steps:
   - If the length of `current` is equal to the length of `nums`, it means we have formed a valid permutation. Add the `current` permutation to the `result` list.
   - Iterate over the `nums` array:
     - If the current element is not visited:
       - Mark the current element as visited by updating the `visited` array.
       - Add the current element to the `current` permutation.
       - Call the `permuteHelper` function recursively with the updated `current` permutation and `visited` array.
       - Remove the last added element from the `current` permutation and mark it as unvisited to backtrack and explore other possibilities.
3. Finally, initialise an empty list called `result` to store the permutations.
4. initialise a boolean array called `visited` with `False` values, representing that no elements have been visited yet.
5. Call the `permuteHelper` function with the initial values of `nums`, an empty `current` permutation, `visited`, and `result`.
6. Return the `result` list.

## Complexity Analysis

The time complexity of this approach is dependent on the number of permutations generated. In the worst case, when there are many permutations, the time complexity can be exponential.

The space complexity is also dependent on the number of permutations. In the worst case, when there are many permutations, the space complexity can be exponential as well.

## Conclusion

The "Permutations" problem can be solved using a recursive backtracking algorithm to generate all possible permutations of the given input array.

By following the steps outlined above, you should be able to implement a solution that returns all the permutations.

Remember to handle the edge cases and invalid inputs according to the problem constraints.

