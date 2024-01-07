# Other imp

## Date and time

```java
// Library used
import java.text.*;

// Number to unix time
Date d = new Date(1600334000000);

// date formatter
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss w");
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
