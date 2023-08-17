# Asteroid Collision

## Task Description
Given an array `asteroids` representing asteroids in a row, where the absolute value represents its size and the sign represents its direction (positive meaning right, negative meaning left), the task is to find the state of the asteroids after all collisions.

## Approach and Algorithm
To solve this problem, I will use a stack data structure to simulate the asteroid collisions.

1. Initialize an empty stack to simulate the state of asteroids after collisions.
2. Iterate through the array `asteroids`:
   - For each asteroid, check its direction:
     - If the stack is empty or the asteroid is moving to the right (positive), push it onto the stack.
     - If the asteroid is moving to the left (negative), keep popping elements from the stack while there are elements and the top element is moving to the right and its absolute value is less than the absolute value of the current asteroid.
     - If the stack is empty after popping elements or the top element is moving to the left (negative), push the current asteroid onto the stack.
3. The remaining elements in the stack represent the state of asteroids after collisions.

## Complexity Analysis
- Let `n` be the length of the array `asteroids`.
- The time complexity of the algorithm is O(n) as we iterate through the array once and perform constant time operations for each element.
- The space complexity is O(n) due to the stack used to simulate the asteroid collisions.
- In conclusion, the algorithm efficiently finds the state of the asteroids after collisions using a stack-based approach with a time complexity of O(n) and a space complexity of O(n).

