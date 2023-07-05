# Task Scheduler

## Problem Description

Given an array of characters `tasks` representing the tasks a CPU needs to do, where each letter represents a different task. Tasks can be done in any order. Each task is done in one unit of time. There is a non-negative integer `n` that represents the cooldown period between two same tasks. This means that there must be at least `n` units of time between any two same tasks.

The task is to determine the least number of units of time that the CPU will take to finish all the given tasks.

## Approach and Algorithm

To solve this problem, we can use a greedy algorithm. Here are the steps of the algorithm:

1. Count the frequency of each task in the given array `tasks` and store it in a frequency map.
2. Sort the frequencies of the tasks in descending order.
3. Initialize a variable `maxFreq` to store the maximum frequency of a task.
4. Iterate through the sorted frequencies:
   - Increment the result by `maxFreq` since we need at least `maxFreq` units of time to complete the tasks with the highest frequency.
   - Decrement the frequency of the task by 1.
   - Decrement `n` by 1 to account for the cooldown period.
   - Update `maxFreq` to be the maximum between `maxFreq` and the updated frequency.
5. After the loop, return the result plus the remaining value of `n` if it is greater than 0.

## Complexity Analysis

Let `m` be the number of tasks and `k` be the number of unique tasks.

Counting the frequency of each task takes O(m) time.

Sorting the frequencies takes O(k log k) time.

The iteration through the sorted frequencies takes O(k) time.

Therefore, the overall time complexity of the algorithm is O(m + k log k).

The space complexity is O(k) since we store the frequency map.

## Conclusion

By using a greedy algorithm, we can determine the least number of units of time that the CPU will take to finish all the given tasks. The algorithm counts the frequencies of the tasks, sorts them, and then iterates through the sorted frequencies to calculate the minimum time required. The algorithm has a time complexity of O(m + k log k) and a space complexity of O(k).
