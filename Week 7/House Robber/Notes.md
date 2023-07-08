# House Robber

## Problem Description

The problem is to determine the maximum amount of money you can rob from houses along a street. Each house has a certain amount of money stashed, but adjacent houses have security systems connected. If two adjacent houses are robbed on the same night, the police will be alerted.

Given an array of integers representing the amount of money in each house, we need to calculate the maximum amount that can be robbed without alerting the police.

## Approach and Algorithm

We can solve this problem using dynamic programming. Let's define an array dp, where dp[i] represents the maximum amount of money that can be robbed up to the ith house.

The recursive formula to calculate dp[i] is as follows:

dp[i] = max(dp[i-2] + nums[i], dp[i-1])

The idea is that we can either rob the current house (nums[i]) and add the amount to the maximum amount robbed from the previous non-adjacent house (dp[i-2]), or we can skip the current house and take the maximum amount robbed from the previous house (dp[i-1]).

We initialise dp[0] = nums[0] (robbing the first house) and dp[1] = max(nums[0], nums[1]) (robbing either the first or second house, whichever has more money).

Finally, the maximum amount that can be robbed without alerting the police is given by dp[n-1], where n is the number of houses.

## Complexity Analysis

The time complexity of this approach is O(n), where n is the number of houses. We iterate through the array once to calculate the maximum amount that can be robbed.

The space complexity is O(n) as well, where n is the number of houses. We use an array of size n to store the maximum amounts.

## Conclusion

By using dynamic programming, we can efficiently solve the House Robber problem and determine the maximum amount of money that can be robbed from the houses. The algorithm has a time complexity of O(n) and a space complexity of O(n).
