# Other imp

## Date and time

```java
// Library used
import java.text.*;

// Number to unix time
Date d = new Date(1600334000000L);

// date formatter
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E");
// *** format convert from int long date to String ***
String date = sdf.format(new Date());
// *** parse convert string to Date ***
Date date = sdf.parse("1994-07-23 21:32:23");
// date to Long
long time = date.getTime();

// *** Sometime need to handle exception for parse ***

try {
    // code
} catch (ParseException e) {
    System.err.println("Error parsing date: " + e.getMessage());
}

```

(y -> year), (M -> Momnth), (m -> minute), (d -> day), (H and h for 24 hour and 12 hour), (s -> second), (E -> week Name), (a -> AM/PM)

## Conversions

### Int to integer

```java
int a = 4;
Integer b = Integer.valueOf(a);
a = b.intValue();

Float c = b.floatValue();
char d = (char) b.intValue();
String s = "123";
b = Integer.parseInt(s);
```

### ArrayList to array

```java
Character[] ch2 = ch.toArray(new Character[0]);
ch = Arrays.asList(ch2);
```
