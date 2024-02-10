
### ArrayList vs LinkedList ###
While an ArrayList is implemented on top of an array, a LinkedList is a doubly linked list.

Both implement all of List's methods, but the LinkedList **also** implements the Queue and the Stack methods as well.


#### Single vs double ended queues ####
Single ended queues always process elements from the start of the queue.
A double ended queue allows access to both the start and the end of the queue.

### Iterator vs ListIterator ###
Iterator is only forwards and only supports **remove** method.
A ListIterator can be used to go both forwards and backwards.
And in addition to the **remove** method, it also supports the **add** and **set** methods. 
