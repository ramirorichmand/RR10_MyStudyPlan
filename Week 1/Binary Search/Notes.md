# Intuition
Binary search is an efficient algorithm for searching for a specific target value within a sorted array. The basic idea is to repeatedly divide the search interval in half until the target value is found or the interval is empty. By using this approach, we can quickly eliminate half of the remaining search space at each iteration, resulting in a time complexity of O(log n).

# Approach
The algorithm starts by comparing the target value to the middle element of the sorted array. If the target is equal to the middle element, we return the index of the middle element. If the target is less than the middle element, we repeat the search on the left half of the array. If the target is greater than the middle element, we repeat the search on the right half of the array. We continue this process until either the target is found or the search interval is empty.

Initialise left and right pointers to the beginning and end of the array, respectively.

While the left pointer is less than or equal to the right pointer:

a. Calculate the middle index as the average of the left and right pointers.
b. If the middle element is equal to the target, return the index of the middle element.
c. If the middle element is less than the target, update the left pointer to mid + 1.
d. If the middle element is greater than the target, update the right pointer to mid - 1.

If the target is not found, return -1.

# Complexity
## Time complexity: 
O(logn) - Since binary search reduces the search space by half at each step, the maximum number of iterations required to find the target is log base 2 of n, where n is the size of the array. Therefore, the time complexity of binary search is O(logn).

## Space complexity: 
O(1) - Binary search only uses a constant amount of additional space for the two pointers and the middle index variable, so the space complexity is O(1).

### Note that the above complexity analysis assumes that the array is already sorted. If the array needs to be sorted first, then the time complexity would be dominated by the sorting algorithm, which is typically O(nlogn) for comparison-based sorts.