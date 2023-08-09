# Find K Closest Elements

## Task Description:
Given a sorted integer array `arr`, two integers `k` and `x`, the task is to return the `k` closest integers to `x` in the array. The result should also be sorted in ascending order. An integer `a` is closer to `x` than an integer `b` if:

- |a - x| < |b - x|, or
- |a - x| == |b - x| and a < b

## Approach and Algorithm:
To solve this problem, I will use a two-pointer approach to find the `k` closest elements to `x` in the sorted array `arr`.

1. I will initialize two pointers `left` and `right` to 0 and `len(arr) - k`, respectively. These pointers will represent the range of `k` closest elements.
2. I will iterate while `k` is greater than 0:
   - I will calculate the absolute differences `diff1` and `diff2` between `arr[left]` and `x`, and `arr[right + k - 1]` and `x`, respectively.
   - If `diff1` is greater than or equal to `diff2`, I will increment `left` by 1, indicating that the `left` pointer moves towards the right.
   - Otherwise, I will decrement `right` by 1, indicating that the `right` pointer moves towards the left.
   - I will decrement `k` by 1 in each iteration.
3. After the loop, I will return the sublist `arr[left:left+k]` as the result, which contains the `k` closest elements.

The result will be the `k` closest integers to `x` in the array `arr`, sorted in ascending order.

## Complexity Analysis:
- Let `n` be the length of the array `arr`.
- The time complexity of the algorithm is O(n - k) because I perform a two-pointer traversal to find the `k` closest elements.
- The space complexity is O(k) because I store the sublist of `k` closest elements as the result.
- In conclusion, the two-pointer approach allows me to find the `k` closest integers to `x` in the sorted array `arr` with a time complexity of O(n - k) and a space complexity of O(k). The algorithm efficiently adjusts the range of pointers based on the absolute differences between elements and `x`, ensuring the result is sorted and contains the desired elements.
