# Product of Array Except Self

## Problem Description

In this problem, you are given an integer array `nums`. You need to calculate an array `answer` where `answer[i]` is equal to the product of all the elements of `nums` except `nums[i]`.

## Approach and Algorithm

To solve this problem, we can use two pass approach. Here are the steps:

1. initialise an array `answer` of the same size as `nums` and initialise all its values to 1. This array will store the product of all elements except the current element.
2. Calculate the prefix product of `nums` and store it in `answer`. Iterate over `nums` from left to right, and for each element at index `i`, set `answer[i]` to the product of `answer[i-1]` and `nums[i-1]`. This step calculates the product of all elements to the left of the current element.
3. Calculate the suffix product of `nums`. Iterate over `nums` from right to left, and for each element at index `i`, set `answer[i]` to the product of `answer[i]` and the product of all elements to the right of the current element. Keep a running product variable `suffixProduct` initialised to 1, and for each element at index `i`, update `suffixProduct` as `suffixProduct * nums[i]`.
4. Finally, return the `answer` array, which contains the product of all elements except the current element.

## Complexity Analysis

The time complexity of this approach is O(n), where n is the length of the input array `nums`. This is because we perform two passes over the array.

The space complexity is O(1) since we are using the output array `answer` to store the results.

## Conclusion

The "Product of Array Except Self" problem can be solved using a two-pass approach. By following the steps outlined above, you should be able to calculate the product of all elements except the current element in O(n) time and without using the division operation.

It's important to note that by using prefix and suffix products, we can calculate the desired result efficiently. This approach eliminates the need for division and ensures that the product of any prefix or suffix of `nums` is guaranteed to fit in a 32-bit integer.

