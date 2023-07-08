# LRU Cache

## Problem Description

The problem is to design a data structure that follows the constraints of a Least Recently Used (LRU) cache. The cache should support the following operations:

- `LRUCache(int capacity)`: Initialise the LRU cache with a positive size `capacity`.
- `int get(int key)`: Return the value of the key if it exists in the cache, otherwise return -1.
- `void put(int key, int value)`: Update the value of the key if it exists. Otherwise, add the key-value pair to the cache. If the number of keys exceeds the capacity from this operation, evict the least recently used key.

The `get` and `put` operations should each run in O(1) average time complexity.

## Approach and Algorithm

To implement the LRU cache, we can use a combination of a doubly linked list and a hash map.

1. We can use a doubly linked list to maintain the order of the keys based on their recent usage. The most recently used key will be at the front of the list, and the least recently used key will be at the end of the list.
2. We can use a hash map to store the key-value pairs for quick access. The keys in the hash map will point to the corresponding nodes in the doubly linked list.
3. When we perform a `get` operation, we first check if the key exists in the hash map. If it does, we move the corresponding node to the front of the list to indicate its recent usage and return the value.
4. When we perform a `put` operation, we check if the key exists in the hash map. If it does, we update the value and move the corresponding node to the front of the list. If the key doesn't exist, we create a new node, add it to the front of the list, and insert the key-value pair into the hash map. If the size of the cache exceeds the capacity, we remove the node at the end of the list (least recently used) and remove its corresponding entry from the hash map.

## Complexity Analysis

The `get` and `put` operations both run in O(1) average time complexity since accessing a node in the doubly linked list and inserting or deleting an entry in the hash map take constant time.

The space complexity is O(capacity) since the cache can store a maximum of `capacity` key-value pairs.

## Conclusion

By using a combination of a doubly linked list and a hash map, we can implement an LRU cache that supports efficient `get` and `put` operations with O(1) average time complexity. The cache maintains the order of the keys based on their recent usage and evicts the least recently used key when the capacity is exceeded. The algorithm has a space complexity of O(capacity).
