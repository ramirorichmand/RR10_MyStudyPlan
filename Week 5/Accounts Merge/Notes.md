# Accounts Merge - Problem Solving Explanation

## Problem:
The problem is to merge a list of accounts, where each account consists of a name and a list of emails. Two accounts are considered to belong to the same person if they share at least one common email address. The goal is to merge the accounts and return them in the specified format.

## Approach and Algorithm:
To solve this problem, I used the following approach:

1. Create an empty `emailToName` dictionary to map each email address to its corresponding name.
2. Create an empty `graph` dictionary to represent the graph structure of connected emails.
3. Traverse each account in the given list of accounts:
   - Extract the name from the account.
   - Iterate over the emails in the account, starting from the second email (index 1).
     - Add the email to the `emailToName` dictionary and map it to the name.
     - If the email is not already present in the `graph` dictionary, add it as a key with an empty set as its value.
     - If the previous email exists, add an edge between the current email and the previous email in the `graph`.
     - Add an edge between the previous email and the current email in the `graph`.
4. Create an empty `visited` set to keep track of visited emails during the graph traversal.
5. Initialise an empty `mergedAccounts` list to store the merged accounts.
6. Iterate over each email in the `graph` dictionary:
   - If the email is not present in the `visited` set:
     - Perform a depth-first search (DFS) starting from the current email.
     - During the DFS, keep adding the visited emails to a `currentAccount` set.
     - Sort the emails in the `currentAccount` set.
     - Get the name corresponding to the email from the `emailToName` dictionary.
     - Append the merged account as a list with the name and sorted emails to the `mergedAccounts` list.
     - Add all the visited emails from the `currentAccount` set to the `visited` set.
7. Return the `mergedAccounts` list as the final result.

## Complexity Analysis:
- The time complexity of the approach is O(n * m * log(m)), where n is the number of accounts and m is the average number of emails per account. This is because we iterate over each account and sort the emails in each merged account.
- The space complexity is O(n * m), as we store the `emailToName` dictionary and the `graph` dictionary, both of which can have a maximum of n * m entries.

## Conclusion:
By using a graph-based approach and performing depth-first search (DFS), we can merge the accounts efficiently. The approach provides a solution that merges the accounts based on shared email addresses, and returns the merged accounts in the desired format.
