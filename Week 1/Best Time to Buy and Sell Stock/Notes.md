## Intuition:
The intuition behind this solution is to find the maximum profit by keeping track of the minimum price encountered so far. By iterating over the prices, we update the minimum price if we find a smaller price. Then, we calculate the profit by subtracting the minimum price from the current price, and update the maximum profit if it is larger.

## Approach:
1. initialise the variables `profit` and `minPrice` to 0 and INT_MAX respectively.
2. Iterate over the `prices` vector using a for loop, with index `i` ranging from 0 to `prices.size() - 1`.
3. Inside the loop, update the `minPrice` by taking the minimum of the current `minPrice` and the price at index `i`.
4. Calculate the profit by subtracting the `minPrice` from the price at index `i`.
5. Update the `profit` by taking the maximum of the current `profit` and the calculated profit.
6. After the loop ends, return the `profit`.

# Complexity:
The time complexity of this solution is O(n), where n is the size of the `prices` vector, as we iterate over the vector once.
The space complexity is O(1) as we only use a constant amount of additional space to store the variables `profit` and `minPrice`.