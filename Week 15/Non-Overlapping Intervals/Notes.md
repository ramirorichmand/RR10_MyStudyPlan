# Minimum Number of Intervals to Remove for Non-overlapping Intervals

## Task Description
Given an array of intervals `intervals` where `intervals[i] = [starti, endi]`, you need to return the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping.

## Approach
To find the minimum number of intervals to remove, we can use a greedy approach. The idea is to sort the intervals by their ending points in ascending order. This sorting ensures that we have a clear view of the intervals with smaller ending points, making it easier to make decisions.

1. Sort the intervals based on their ending points.

2. Initialize a variable `count` to keep track of the number of intervals to remove. Also, initialize two variables, `prevEnd` and `currentEnd`, to keep track of the ending points of intervals.

3. Iterate through the sorted intervals:
   - If the starting point of the current interval is less than or equal to `prevEnd`, it means there is an overlap with the previous interval. In this case, we need to remove one of the intervals to make them non-overlapping. We increment `count` and update `currentEnd` to the minimum of `currentEnd` and the ending point of the current interval.
   - If there is no overlap, update `prevEnd` to `currentEnd`, and `currentEnd` to the ending point of the current interval.

4. The value of `count` represents the minimum number of intervals to remove.

## Complexity Analysis
- Time Complexity: O(n*log(n)), where n is the number of intervals. The most time-consuming operation is the sorting of intervals.
- Space Complexity: O(1), as we are using only a few extra variables.

## Conclusion
Using a greedy approach and sorting the intervals by their ending points allows us to efficiently find the minimum number of intervals to remove to make the rest of the intervals non-overlapping.
