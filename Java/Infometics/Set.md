# Sets

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
