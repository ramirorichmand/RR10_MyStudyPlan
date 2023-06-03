## Intuition:
The problem asks for finding the maximum sum of a subarray within the given array. To solve this, we can use a technique called Kadane's algorithm.

## Approach:
1. initialise two variables, "max" and "meh," to keep track of the maximum sum found so far and the sum of the current subarray, respectively. Set "max" to the smallest possible integer value (INT_MIN) and "meh" to 0.
2. Iterate through the input array "nums" from left to right.
3. Add the current element to "meh" to extend the current subarray.
4. If "meh" is greater than "max," update "max" with the value of "meh" since we have found a new maximum subarray sum.
5. If "meh" becomes negative (indicating that the current subarray has a negative sum), reset "meh" to 0, as any negative sum would only decrease the sum of any future subarrays.
6. After iterating through the entire array, return the value of "max," which represents the maximum subarray sum.

## Complexity:
- The time complexity of this solution is O(n), where n is the size of the input array "nums." We iterate through the array once.
- The space complexity is O(1) since we only use a constant amount of additional space to store the variables "max" and "meh."