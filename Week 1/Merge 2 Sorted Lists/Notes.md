# Intuition:
The problem requires us to merge two sorted linked lists into a new sorted linked list. We can achieve this by comparing the values of the head nodes of the two linked lists and adding the smaller one to our new merged linked list. We can repeat this process by advancing the pointer of the smaller element and comparing it with the other linked list's head node's value, and we continue this process until we exhaust all the nodes in both lists. This way, we can obtain a new linked list containing all the elements of both linked lists in a sorted order.

# Approach:
## Recursive Approach:
The recursive approach is based on the idea that we compare the values of the first nodes of the two lists, and whichever has the smaller value, we add that node to our merged linked list and call the same function recursively with the next node of that list and the other list's current node. We repeat this process until one of the lists exhausts, and we return the merged list.

## Iterative Approach:
The iterative approach is based on the same idea as the recursive approach. Here, we maintain three pointers: one for the merged linked list's head, one for the current node of the merged list, and one for the current node of each of the two input linked lists. We compare the two lists' head nodes and add the smaller one to our merged linked list and advance the pointer of that list. We continue this process until we exhaust one of the input lists, and then we add the remaining nodes of the other list to our merged linked list.

# Complexity:
## Time complexity: 
Both approaches take O(n+m) time, where n and m are the sizes of the two linked lists because we iterate through all the nodes of both linked lists at most once.

## Space complexity: 
Recursive approach has a space complexity of O(n+m) due to the recursive stack space, while the iterative approach has a space complexity of O(1) since we are using constant space for storing the merged linked list.