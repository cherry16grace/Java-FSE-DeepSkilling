DSA is important because

Handles large inventory efficiently
Fast search, update, delete operations
Scales for real-world warehouse systems


| Operation | Time Complexity |
| --------- | --------------- |
| Add       | O(1)            |
| Update    | O(1)            |
| Delete    | O(1)            |
| Search    | O(1)            |


ArrayList:
Search = O(n)
Slow for large inventory

HashMap:
Direct access using productId
Fast operations (O(1))

Optimization Ideas:

Use database instead of memory (MySQL)
Use indexing for faster search
Use caching for frequent products
Use concurrency control for multiple users