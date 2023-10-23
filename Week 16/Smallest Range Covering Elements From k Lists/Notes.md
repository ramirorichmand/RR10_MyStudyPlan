# Smallest Range Covering Elements from K Lists

## Task Description
Given k lists of sorted integers in non-decreasing order, the goal is to find the smallest range that includes at least one number from each of the k lists. The range [a, b] is considered smaller than [c, d] if b - a < d - c or a < c if b - a == d - c.

## Approach
The algorithm can use a min heap to efficiently explore the smallest range. We start by adding the first element from each list to the heap. At each step, we extract the minimum element from the heap and calculate the range. We then add the next element from the list containing the extracted element to the heap. The process continues until one of the lists is exhausted. The algorithm maintains the minimum range during this process.

## Complexity Analysis
- Time Complexity: O(n log k), where n is the total number of elements across all lists, and k is the number of lists. The algorithm processes each element once and performs log k operations for each element when maintaining the min heap.
- Space Complexity: O(k), where k is the number of lists. The algorithm uses a min heap of size k to track the smallest element from each list.

## Conclusion
The algorithm efficiently finds the smallest range covering elements from k lists using a min heap. It ensures the desired time and space complexity requirements.
