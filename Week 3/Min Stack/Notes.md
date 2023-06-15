# Min Stack

## Problem Description

In this problem, you need to design a stack that supports the following operations:
- `push(int val)`: Pushes the element `val` onto the stack.
- `pop()`: Removes the element on the top of the stack.
- `top()`: Returns the top element of the stack.
- `getMin()`: Retrieves the minimum element in the stack.

The goal is to implement a solution with O(1) time complexity for each operation.

## Approach and Algorithm

To solve this problem, we can use the following approach:

1. initialise two stacks: `mainStack` and `minStack`. `mainStack` will store all the elements, while `minStack` will keep track of the minimum element at each step.
2. When pushing an element `val` onto the stack, push it onto `mainStack` as usual.
3. If `minStack` is empty or `val` is less than or equal to the top element of `minStack`, push `val` onto `minStack` as well. This ensures that `minStack` always contains the minimum element at the top.
4. When popping an element from the stack, pop it from both `mainStack` and `minStack`.
5. To get the top element of the stack, simply return the top element of `mainStack`.
6. To get the minimum element in the stack, return the top element of `minStack`.

## Complexity Analysis

The time complexity of each operation in this approach is O(1), as all operations involve constant-time operations on the stacks.

The space complexity is O(n), where n is the number of elements pushed onto the stack. This is because both `mainStack` and `minStack` can potentially store all the elements.

## Conclusion

The "Min Stack" problem can be solved by using two stacks: one stack to store all the elements and another stack to keep track of the minimum element at each step.

By following the steps outlined above, you should be able to implement a stack that supports push, pop, top, and getMin operations with O(1) time complexity.

It's important to note that the key idea here is to use an additional stack (`minStack`) to keep track of the minimum element. By doing so, we can retrieve the minimum element in constant time without sacrificing the time complexity of other operations.

