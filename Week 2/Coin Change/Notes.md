# Coin Change

## Problem Description

In this problem, you are given an array `coins` representing coins of different denominations and an integer `amount` representing a total amount of money. You need to find the fewest number of coins needed to make up that amount. If it's not possible to make up the amount using the given coins, you should return -1.

## Approach and Algorithm

To solve this problem, we can use a dynamic programming approach. Here are the steps:

1. Create an array `dp` of size `amount + 1` and initialize all the values to `amount + 1`. This represents the minimum number of coins needed to make up each amount from 0 to `amount`.
2. Set `dp[0]` to 0 since we don't need any coins to make up an amount of 0.
3. Iterate over the coins array:
   - For each coin, iterate over the amount from the current coin value to `amount`:
     - Calculate the minimum number of coins needed to make up the current amount by taking the minimum between the current value of `dp[amount]` and `dp[amount - coin] + 1`. The `+1` represents using one coin of the current denomination.
4. Finally, check if `dp[amount]` is still greater than `amount`. If so, it means it's not possible to make up the amount using the given coins, and we return -1. Otherwise, we return `dp[amount]`, which represents the fewest number of coins needed to make up the amount.

## Complexity Analysis

The time complexity of this approach is O(amount * n), where n is the number of coins. This is because we iterate over each coin for each amount from 1 to `amount`.

The space complexity is O(amount) because we use an array `dp` of size `amount + 1` to store the minimum number of coins needed for each amount.

## Conclusion

The "Coin Change" problem can be solved using dynamic programming. By following the steps outlined above, we should be able to find the fewest number of coins needed to make up the given amount. Remember to properly initialize the `dp` array and iterate over the coins and amounts to calculate the minimum number of coins.

It's important to note that dynamic programming is a powerful technique for solving optimization problems like this, where we can break down the problem into smaller subproblems and build up the solution iteratively.

