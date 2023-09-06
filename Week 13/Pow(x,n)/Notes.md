# Pow(x, n)

## Task Description
The task is to implement a function that calculates x raised to the power n (i.e., x^n).

## Approach and Algorithm
To compute x^n, I will use a recursive approach. Here are the steps:

1. If n is 0, return 1, as any number raised to the power of 0 is 1.

2. If n is negative, I will calculate the reciprocal of x and negate n (to make n positive). This is because x^(-n) is equal to (1/x)^n.

3. To compute x^n, I will recursively calculate (x^(n/2))^2, which reduces the number of multiplications required.

4. To handle both even and odd values of n:
   - If n is even, I will return (x^(n/2))^2.
   - If n is odd, I will return x * (x^(n/2))^2.

5. I will keep reducing the value of n by half in each recursive call until n becomes 0.

6. Finally, I will return the result obtained from the recursive calls.

## Complexity Analysis
- The time complexity of this algorithm is O(log n) because the value of n is halved in each recursive call.
- The space complexity is O(log n) as well due to the recursive stack.
- In conclusion, this approach efficiently computes x^n with a time complexity of O(log n) and a space complexity of O(log n).

