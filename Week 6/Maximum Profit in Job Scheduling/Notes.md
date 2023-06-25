# Maximum Profit in Job Scheduling

## Problem Description

Given `n` jobs, where each job `i` is scheduled to be done from `startTime[i]` to `endTime[i]` and has a profit of `profit[i]`, the task is to find the maximum profit that can be obtained by selecting a subset of jobs such that no two jobs in the subset have overlapping time ranges.

## Approach and Algorithm

To solve this problem, we can use a dynamic programming approach with the concept of memoization. The algorithm follows these steps:

1. Create a list of tuples `(startTime[i], endTime[i], profit[i])` to store the jobs.
2. Sort the list of jobs in ascending order based on the end time.
3. Create a memoization dictionary to store the maximum profit for a given end time.
4. Initialise the dictionary with a base case where the end time is 0 and the maximum profit is 0.
5. Iterate over each job in the sorted list:
   - Find the latest job that finishes before the start time of the current job.
   - Calculate the maximum profit by adding the profit of the current job with the maximum profit of the previous job.
   - Update the maximum profit in the memoization dictionary for the current end time.
6. Return the maximum profit for the last end time in the memoization dictionary.

## Complexity Analysis

The time complexity of this algorithm is O(nlogn), where n is the number of jobs. This is because we sort the list of jobs based on the end time, which takes O(nlogn) time.

The space complexity is O(n) for the memoization dictionary.

## Conclusion

By using a dynamic programming approach with memoization, we can efficiently find the maximum profit in job scheduling without selecting jobs that overlap in time. This algorithm provides an optimal solution to the problem, ensuring the highest profit is achieved while avoiding conflicting time ranges.
