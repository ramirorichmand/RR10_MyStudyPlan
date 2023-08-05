# Longest Consecutive Sequence

## Task Description:
Given an unsorted array of integers `nums`, the task is to return the length of the longest consecutive elements sequence.

## Approach and Algorithm:
To solve this problem, I will use a hash set to efficiently find the longest consecutive sequence of elements.

I will start by adding all the elements of the array `nums` into a hash set to ensure constant time lookup for each element. Then, I will iterate through the elements in `nums` and for each element `num`, I will check if `num - 1` is not in the hash set. If `num - 1` is not in the hash set, it means that `num` is the starting element of a possible consecutive sequence.

Next, I will keep incrementing `num` by 1 and checking if the next element (`num + 1`) is in the hash set. If `num + 1` is in the hash set, it means that the consecutive sequence can be extended further. I will keep track of the length of the current consecutive sequence, and whenever I find a longer sequence, I will update the maximum length.

By repeating this process for all elements in `nums`, I will find the length of the longest consecutive sequence of elements in the array.

## Complexity Analysis:
- Let `n` be the number of elements in the input array `nums`.
- The time complexity of the algorithm is O(n) because I iterate through the elements in `nums` once and perform constant time operations (adding elements to the hash set and checking for elements in the hash set).
- The space complexity is also O(n) because I use a hash set to store the elements from `nums`.
- In conclusion, the algorithm can find the length of the longest consecutive sequence in the unsorted array `nums` in O(n) time and O(n) space. The approach utilizes a hash set to efficiently check for consecutive elements and track the maximum sequence length.
