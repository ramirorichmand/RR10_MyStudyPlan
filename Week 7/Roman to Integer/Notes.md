# 13. Roman to Integer

## Problem Description

Roman numerals are represented by seven different symbols: I, V, X, L, C, D, and M. Each symbol corresponds to a specific value:

- I: 1
- V: 5
- X: 10
- L: 50
- C: 100
- D: 500
- M: 1000

Roman numerals are usually written largest to smallest from left to right. However, there are specific cases where a smaller numeral is placed before a larger one to represent subtraction. For example, IV represents 4 (5 - 1) and IX represents 9 (10 - 1).

Given a Roman numeral as a string, your task is to convert it to an integer.

## Approach and Algorithm

To solve this problem, we can iterate through the Roman numeral string from left to right. We compare the value of the current symbol with the value of the next symbol. If the current symbol has a smaller value, we subtract it from the total. Otherwise, we add it to the total. By doing this, we account for the subtraction cases. Finally, we return the total value.

Here is the algorithm:
1. Initialise a variable `total` to 0.
2. Iterate through the Roman numeral string from left to right.
3. If the current symbol has a smaller value than the next symbol, subtract its value from the total.
4. Otherwise, add its value to the total.
5. Return the total value.

## Complexity Analysis

The time complexity for this approach is O(n), where n is the length of the Roman numeral string. We iterate through the string once to convert it to an integer. The space complexity is O(1) since we use a constant amount of extra space to store the total value.

## Conclusion

By iterating through the Roman numeral string and applying the appropriate rules for addition and subtraction, we can convert it to an integer. The algorithm has a time complexity of O(n) and provides an efficient solution to the problem.

