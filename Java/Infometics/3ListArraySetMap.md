# Sets

| func              | Set              | Map                       | List                   | Array   | PriorityQueue            |
| ----------------- | ---------------- | ------------------------- | ---------------------- | ------- | ------------------------ |
| add               | .add(x)/all      | .put(x,y)                 | addFirst/Last(x)/all   | .add(x) | add(x)                   |
| remove            | remove(x)/all    | remove(x)                 | removeFirst/Last()/all | na      | poll() -> get and remove |
| get               | .contains(x)     | get(x)                    | getFirst/Last(i)       | get(i)  | peek() -> get            |
| floor, ceil       | .floor/ceiling() | .floor/ceilingKey/Value() |                        |         |                          |
| isEmpty(), size() |                  | keySet() valueSet()       |                        |         |                          |
| min max           | first/last()     | first/lastKey()           |                        |         |                          |

## Hash sets

```java
HashSet<type> data = new HashSet<type>((a, b) -> a.getAge() - b.getAge());
TreeSet<type> data = new TreeSet<type>((a, b) -> a.getAge() - b.getAge());

data.add(x);
data.addAll(x); // Union operator

data.remove(x);
data.removeAll(x); // Difference operator

data.size();

data.contains(x);
data.containsAll(x);

data.isEmpty();

// A way to skip iterators here
for (Person p : data) {
    System.out.println(p.getName() + " " + p.getAge());
}
```

## Hash map

```java
HashMap<type> data = new HashMap<type>((a, b) -> a.getAge() - b.getAge());
TreeMap<type> data = new TreeMap<type>((a, b) -> a.getAge() - b.getAge());

data.put(x,y);
data.get(x);
data.remove(x);

data.keySet();
data.valueSet();
data.entrySet();

data.size();
data.contains(x);

data.isEmpty();

// A way to skip iterators here
for (Person p : data) {
    System.out.println(p.getName() + " " + p.getAge());
}
```

## Tree set is a special case

1. When iterator is used with the tree set it will return elements in ascending order.
2. Both the sets will have unique elements duplicate elements can not be added.

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
