# Collections

## Sample code

```java
//Here Person is the class name

class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.age - o2.age;
    }

}

// Or for Arrays
// From :- https://youtu.be/P1-N5Zt--BY
class Person implements Comparable<Person> {

    @Override
    public int compareTo(Person o2) {
        return this.age - o2.age;
    }

}

```

## Functions

| Method                      | Explanation                            |
| --------------------------- | -------------------------------------- |
| Collections.sort(List a)    | Sort the elements of a                 |
| Collections.reverse(List a) | Reverse the order of the elements of a |
| Collections.min(List a)     | Return the smallest element in a       |
| Collections.max(List a)     | Return the largest element in a        |
| Collections.shuffle(List a) | Shuffle the sequence of elements in a  |
