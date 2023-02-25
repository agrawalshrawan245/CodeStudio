# List

## Linked List

1. addFirst(def), addLast
2. addAll(collection)
3. removeFrist(def), removeLast
4. getFirst(), getLast
5. size(), isEmpty()

## Array List

1. add(object) -> add to the last
2. add(position, object), addAll(Collection\<T\>)
3. remove(position)
4. get(position)
5. set(position, object)
6. isEmpty(), size()

## Priority Queue

1. add(object)
2. peek() -> return maximum object
3. poll() -> return and remove maximum object
4. size(), isEmpty()

```java
PriorityQueue<CustomObject> pq = new PriorityQueue<>((a, b) -> a.getPriority() - b.getPriority());
```

## Iterator functions

1. next()
2. hasNext()
3. previous()
4. hasPrevious()
5. add(Object)
6. set(Object)
7. remove()

```java
import java.util.LinkedList;
import java.util.Iterator;

LinkedList<data_type> ll = new LinkedList<data_type>();

Iterator<String> it = ll.iterator();
// Iterator<String> it = ll.listIterator();

while (it.hasNext()) {
    System.out.println((String)it.next());
}

for (String a : ll) {
    System.out.println(a);
}
```
