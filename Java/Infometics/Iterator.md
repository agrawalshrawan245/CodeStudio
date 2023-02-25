# Iterator

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
