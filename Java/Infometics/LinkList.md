# Link List

## Sample code

Here one point to notice is that you need iterator to iterate throught the link list. And for more information you can check out this youtube video [09 LinkedList & The Iterator](https://www.youtube.com/watch?v=kOcLQdKl8x0&ab_channel=AlexSmith). Nicely explained how to use these iterators.

```java
import java.util.LinkedList;
import java.util.Iterator;

LinkedList<data_type> list = new LinkedList<data_type>();

Iterator<String> it = ll.iterator();

while (it.hasNext()) {
    System.out.println((String)it.next());
}

for (String a : ll) {
    System.out.println(a);
}
```

## Functions

### Methods for performing CRUD functions

| Method               | Explanation                                                                                                       | Return type |
| -------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------- |
| add(Object o)        | Add element o to the end of the list                                                                              | boolean     |
| add(int i, Object o) | Insert element o in list i                                                                                        | void        |
| get(int i)           | Return the ith element of a list                                                                                  | E           |
| set(int i, Object o) | Replace the i-th element of the list with element o (the return value returns the element before the replacement) | E           |
| remove(int i)        | Delete the ith element in the list (the return value returns the deleted element)                                 | E           |

### Methods for primary use

| Method    | Explanation                             | Return type |
| --------- | --------------------------------------- | ----------- |
| isEmpty() | Determine if a list is empty            | boolean     |
| size()    | Return the number of elements in a list | int         |
| clear()   | Delete all elements of a list           | void        |

### Some other useful methods to check out

| Method                | Explanation                                                                                            | Return type |
| --------------------- | ------------------------------------------------------------------------------------------------------ | ----------- |
| toArray()             | Return a list as an array                                                                              | Object[]    |
| clone()               | Return a copy of an ArrayList                                                                          | Object      |
| contains(Object o)    | Determine if an element o exists in the list                                                           | boolean     |
| lastIndexOf(Object o) | Returns the index at which the element o is the last occurrence in the list (returns -1 if not found)  | int         |
| indexOf(Object o)     | Returns the index at which the element o is the first occurrence in the list (returns -1 if not found) | int         |
