# Decode String

## Task Description:
Given an encoded string, the task is to return its decoded string based on the encoding rule: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly `k` times. The input string is guaranteed to be valid, and the original data does not contain any digits other than those used for repeat numbers `k`.

## Approach and Algorithm:
To solve this problem, I will use a stack to keep track of characters and numbers while decoding the string.

1. I will initialize an empty stack to store characters and numbers.
2. I will iterate through each character in the encoded string `s`.
   - If the character is a digit, I will extract the complete number and push it onto the stack.
   - If the character is an open square bracket '[', I will push an empty string onto the stack.
   - If the character is a lowercase letter, I will append it to the string at the top of the stack.
   - If the character is a closing square bracket ']', I will pop the top element from the stack (which is a string) and the previous element from the stack (which is a number).
     - I will then repeat the popped string `k` times and append it to the string at the top of the stack.
3. After iterating through the entire string, I will join the strings in the stack to get the final decoded string.

The result will be the decoded string as per the given encoding rule.

## Complexity Analysis:
- Let `n` be the length of the input encoded string `s`.
- The time complexity of the algorithm is O(n) because I iterate through the string once.
- The space complexity is O(n) in the worst case if all characters are letters and numbers.
- In conclusion, the stack-based approach allows me to decode the given encoded string in O(n) time complexity and O(n) space complexity. The algorithm processes each character to reconstruct the original string by following the provided encoding rule.
