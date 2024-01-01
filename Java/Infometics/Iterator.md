# Iterator

## Iterator functions

1. next()
2. hasNext()
3. previous()
4. hasPrevious()
5. add(Object)
6. set(Object)
7. remove()

## Iterator for Maps

```java
Iterator<Map.Entry<Integer, String>> iterator = treeMap.entrySet().iterator();

while (iterator.hasNext()) {
    Map.Entry<Integer, String> entry = iterator.next();
    int key = entry.getKey();
    String value = entry.getValue();
}

// ----------------------- OR --------------------------

for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
    int key = entry.getKey();
    String value = entry.getValue();
}

```

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
