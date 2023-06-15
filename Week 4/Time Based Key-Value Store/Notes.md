# Time Based Key-Value Store

## Problem Description

In this problem, you need to design a time-based key-value data structure that can store multiple values for the same key at different timestamps and retrieve the value associated with a certain timestamp.

You are given two main operations to implement:

1. `set(key, value, timestamp)`: Stores the key `key` with the value `value` at the given timestamp `timestamp`.
2. `get(key, timestamp)`: Returns a value such that `set` was called previously with `timestamp_prev <= timestamp`. If there are multiple such values, it returns the value associated with the largest `timestamp_prev`. If there are no values, it returns an empty string (`""`).

## Approach and Algorithm

To solve this problem, you can use a HashMap to store the key-value pairs, where the key is the key name and the value is a list of pairs `(timestamp, value)`.

Here's how you can approach it:

1. initialise an empty HashMap to store the key-value pairs.
2. Implement the `set` operation as follows:
   - If the key is not present in the HashMap, create a new list and add the pair `(timestamp, value)` to it. Then, add the key and the list to the HashMap.
   - If the key is already present, retrieve the list from the HashMap and add the pair `(timestamp, value)` to it.
3. Implement the `get` operation as follows:
   - If the key is not present in the HashMap, return an empty string (`""`).
   - If the key is present, retrieve the list from the HashMap.
   - Iterate over the list from the end and find the first pair with a timestamp less than or equal to the given timestamp. Return the corresponding value.
   - If no such pair is found, return an empty string (`""`).

## Complexity Analysis

The time complexity for the `set` operation is O(1) as it involves only HashMap operations.

The time complexity for the `get` operation is O(log N) on average, where N is the number of elements in the list associated with the key. This is because we perform a binary search on the list to find the correct pair.

The space complexity is O(N), where N is the total number of key-value pairs stored in the HashMap.

## Conclusion

The "Time Based Key-Value Store" problem can be solved by using a HashMap to store the key-value pairs and implementing the `set` and `get` operations accordingly.

By following the steps outlined above, you should be able to implement a solution that correctly stores and retrieves the key-value pairs based on the given timestamps.

Remember to handle the edge cases and invalid inputs according to the problem constraints.

