# Maximum Frequency Stack

## Task Description:
Design a stack-like data structure to push elements onto the stack and pop the most frequent element from the stack.

## Approach and Algorithm:
To implement the FreqStack class, I will use a combination of data structures to keep track of the elements and their frequencies. The main data structures I will use are:

1. A hashmap to store the frequency count of each element in the stack.
2. A hashmap of stacks to group elements with the same frequency together.

Here's how the algorithm will work:

1. Initialize the required data structures in the constructor of the FreqStack class.
2. When pushing an element into the stack (push function), increment its frequency in the frequency hashmap. Then, add the element to the corresponding frequency group in the stack hashmap.
3. When popping an element from the stack (pop function), find the element with the highest frequency by iterating through the frequency hashmap. If there is a tie, choose the element closest to the stack's top (the one in the most recently added group in the stack hashmap).
4. Decrement the frequency of the popped element in the frequency hashmap and remove it from the stack hashmap's corresponding frequency group.
5. Return the popped element as the result.

## Complexity Analysis:
- Let `n` be the number of elements pushed into the stack.
- The time complexity for pushing an element into the stack is O(1) since it only involves updating the hashmaps.
- The time complexity for popping the most frequent element is O(n) in the worst case. This is because we may need to iterate through all the elements in the frequency hashmap to find the most frequent element.
- The space complexity is O(n) to store the elements and their frequencies in the hashmaps.
- In conclusion, the FreqStack class provides a stack-like data structure with O(1) time complexity for push operations and O(n) time complexity for pop operations (in the worst case) with O(n) space complexity.
