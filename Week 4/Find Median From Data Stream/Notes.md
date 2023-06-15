# Find Median from Data Stream - Problem Solving Explanation

## Problem: 
The problem is to implement a `MedianFinder` class that can efficiently find the median of a data stream. The median is defined as the middle value in an ordered integer list. If the list has an even number of elements, the median is the average of the two middle values.

## Approach and Algorithm:
To solve this problem, I used the following approach:

1. initialise two heaps: a max-heap to store the lower half of the numbers and a min-heap to store the upper half of the numbers.
2. When a new number is added to the data stream:
    - Add the number to the max-heap if it's smaller than or equal to the current median.
    - Add the number to the min-heap if it's larger than the current median.
    - Balance the heaps by ensuring that the size difference between the max-heap and min-heap is at most 1.
3. To find the median:
    - If the number of elements is odd, the median is the top element of the larger heap.
    - If the number of elements is even, the median is the average of the top elements of both heaps.
   
## Complexity Analysis:
- Adding a number takes O(log n) time, where n is the total number of elements inserted.
- Finding the median takes O(1) time.
- Overall, the time complexity is O(log n) for adding a number and O(1) for finding the median.
- The space complexity is O(n) to store the elements in the heaps.

## Conclusion:
By using two heaps, a max-heap and a min-heap, we can efficiently find the median of a data stream. The algorithm has a logarithmic time complexity for adding numbers and constant time complexity for finding the median. The approach provides an optimized solution for the problem.
