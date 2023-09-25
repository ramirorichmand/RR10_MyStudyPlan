# Find Minimum in Rotated Sorted Array

## Task Description
Given a sorted rotated array `nums` of unique elements, the task is to find the minimum element in this array. The array has been rotated between 1 and n times.

## Approach and Algorithm
To find the minimum element in the rotated sorted array, we can use a binary search algorithm. Here's how I would approach it:

1. Initialize two pointers, `left` and `right`, where `left = 0` and `right = n - 1`, where `n` is the length of the array.

2. While `left < right`, perform the following steps:

   a. Calculate the middle index as `mid = left + (right - left) // 2`.

   b. Check if `nums[mid] > nums[right]`. If true, it means the minimum element is in the right half of the array, so update `left = mid + 1`.

   c. If `nums[mid] <= nums[right]`, it means the minimum element is in the left half of the array, so update `right = mid`.

3. After the loop, `left` will point to the minimum element in the array.

4. Return `nums[left]` as the minimum element.

## Complexity Analysis
### Time Complexity
The time complexity of this approach is O(log n), where `n` is the length of the array. This is because we perform a binary search to find the minimum element.

### Space Complexity
The space complexity is O(1) because we use only a constant amount of extra space.

## Conclusion
This approach efficiently finds the minimum element in the rotated sorted array and works for arrays of up to 5000 elements with values in the range [-5000, 5000].
