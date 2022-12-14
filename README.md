# Queue

Implemented own Queue collection

### Method Summary
| Return type | Method | Description |
| --- | --- | --- |
| int | `size()` | Returns the number of elements in the queue |
| void | `add(E value)` | Adds element e to the queue at the end (tail) of the queue. |
| E | `peek()` | Returns the head (front) of the queue without removing it. |
| E | `element()`	| Performs the same operation as the peek () method. Throws NoSuchElementException when the queue is empty.|
| E | `remove()` | Removes the head of the queue and returns it. Throws NoSuchElementException if queue is empty. |
| E | `poll()` | Removes the head of the queue and returns it. If the queue is empty, it returns null. |
| boolean | `contains(Object o)` | Returns true if this collection contains the specified element. |



