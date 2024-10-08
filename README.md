# LeetCode
WORKING OF PRIORITY QUEUE:
Priority Queue is a special type of queue in which each element is associated with priority.
-> Elements are removed based on their priority, rather than isertion order where the element with highest priority removed first.
-> In the context of findiing the k closest points to the origin, priority queue can be useful for efficiently maintaining the closest points.

1. Initialization:
   'PriorityQueue<int[]> pq' initializes the priority queue named pq that stores array of integers 'int[]'.

2. PriorityQueue Construction Parameters:
   (k, (a, b) -> {...}) -> Constructor initializes the priority queue with a maximum size 'k' and a comparator '(a, b) -> {...}'

3. Custom Comprator:
   '(a, b) -> {...}' -> Lambda Expression used as a comparator to compare two elements 'a' and 'b' in the priority queue.
   'return Double.compare(distance1, distance2)' compares 'distance1' and 'distance2' using 'Double.compare' and returns:
   -> -1 if distance1 < distance2
   -> 0 if distance1 = distance2
   -> 1 if distance1 > distance2