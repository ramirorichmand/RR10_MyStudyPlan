# Median of Two Sorted Arrays

## Task Description:
Given two sorted arrays `nums1` and `nums2` of sizes `m` and `n` respectively, the task is to find the median of the two sorted arrays.

## Approach and Algorithm:
To find the median of two sorted arrays, the binary search algorithm can be used. The idea is to perform binary search on the smaller array to partition both arrays in such a way that the elements on the left side are smaller or equal to the elements on the right side. This partitioning will ensure that the median lies in the correct position. The total number of elements on the left side should be equal to the total number of elements on the right side.

1. Binary search is performed on the smaller array among `nums1` and `nums2`.
2. The smaller array is partitioned at a certain index `partitionX`, and the corresponding index for the larger array is `partitionY = (m + n + 1) / 2 - partitionX`.
3. Four values are calculated: `maxLeftX`, `minRightX`, `maxLeftY`, and `minRightY`, where `maxLeftX` and `maxLeftY` are the maximum elements on the left side of their respective arrays, and `minRightX` and `minRightY` are the minimum elements on the right side of their respective arrays.
4. If `maxLeftX` is less than or equal to `minRightY` and `maxLeftY` is less than or equal to `minRightX`, then the correct partition is found, and the median is calculated based on whether the total number of elements is even or odd.
5. If `maxLeftX` is greater than `minRightY`, the partition is moved towards the left in the smaller array; otherwise, it is moved towards the right.
6. The binary search is repeated until the correct partition is found.

The median of the two sorted arrays is the average of the maximum element on the left side and the minimum element on the right side if the total number of elements is even, or it is the maximum element on the left side if the total number of elements is odd.

## Complexity Analysis:
- Let `m` be the length of `nums1` and `n` be the length of `nums2`.
- The binary search algorithm runs in O(log(min(m, n))) time complexity as binary search is performed on the smaller array.
- The space complexity is O(1) as only a constant amount of extra space is used.
- In conclusion, the binary search algorithm efficiently finds the median of two sorted arrays in O(log(min(m, n))) time with O(1) space complexity. The algorithm accurately partitions the arrays to find the correct position for the median.

This approach ensures that the median is found with the desired time complexity while handling partitioning and calculating the median value effectively.
