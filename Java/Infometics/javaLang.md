# java.lang.\* class

1. String
2. Arrays
3. Math

## Strings

| Method                | Description                                |
| --------------------- | ------------------------------------------ |
| str.length()          | returns length of str                      |
| toCharArray()         | returns character array                    |
| str.comparesTo(str2)  | returns an integer measure of compare      |
| str.equals(str2)      | return true if str = str2 ottherwise false |
| str.split(" ")        | split the string at spaces                 |
| new String(charArray) | returns char array                         |

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

```java
ArrayList<String> list = new ArrayList<>();
list.toArray();
```


## Math

Consts :- E, PI
abs(), ceil, floor, round, min(a,b), max(a,b), random()
floorMod(x,y), log(x), log10(x), pow(a, b), exp(x)
sqrt(x), cbrt(x)
sin(), cos(), atan(), toRadians(), toDegrees()
