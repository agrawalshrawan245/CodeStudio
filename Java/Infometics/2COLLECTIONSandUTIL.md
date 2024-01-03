# Collections

## Functions

| Method                                            | Explanation                            |
| ------------------------------------------------- | -------------------------------------- |
| Collections.sort(List a, (a,b) -> b.compareTo(a)) | Sort the elements of a                 |
| Collections.reverse(List a)                       | Reverse the order of the elements of a |
| Collections.min(List a)                           | Return the smallest element in a       |
| Collections.max(List a)                           | Return the largest element in a        |
| Collections.shuffle(List a)                       | Shuffle the sequence of elements in a  |
| Collections.binarySearch(list, key)               |                                        |

## java.lang.\* class

1. String
2. Arrays
3. Math

## Strings

| Method                | Description                                |
| --------------------- | ------------------------------------------ |
| str.length()          | returns length of str                      |
| str.toCharArray()     | returns <Character> array                  |
| str.comparesTo(str2)  | returns an integer measure of compare      |
| str.equals(str2)      | return true if str = str2 ottherwise false |
| str.split(" ")        | split the string at spaces                 |
| new String(charArray) | returns <Character> array                  |

| Method                    | Description                            |
| ------------------------- | -------------------------------------- |
| str.charAt(position)      | returns char at that position          |
| str.indexOf(str2)         | retuns index of the substring 2 in str |
| str.substring(pos1, pos2) | returns substring from pos1 to pos2    |
| str.contains(str2)        | return true or false                   |

## Arrays

Arrays.sort(arr, (a,b)-> a.no - b.no)
Arrays.toString(arr)
Arrays.equals(arr1, arr2)
Arrays.asList(arr)
Arrays.binarySearch(arr, key)

```java
ArrayList<String> list = new ArrayList<>();
list.toArray();

String[] array = { "apple", "banana", "orange" };
// By default array list is returned.
List<String> list = Arrays.asList(array);
```

## Math

Consts :- E, PI
abs(), ceil, floor, round, min(a,b), max(a,b), random()
floorMod(x,y), log(x), log10(x), pow(a, b), exp(x)
sqrt(x), cbrt(x)
sin(), cos(), atan(), toRadians(), toDegrees()
