# Basic SQL

single quotes for values and backticks for identifiers like `table1` or `field1`

## Aggregator functions

```sql
SELECT username, COUNT(DISTINCT f_name), SUM(), ROUND(AVG(), 2), MIN(), MAX() FROM `table` GROUP BY username HAVING max(age) > 25;
-- IF statement exampple
sum(if(status rlike '^cancelled.*$',1,0))
-- HAVING CLAUSE is likw WHERE clause of GROUP BY function
```

## Joins

```sql
(SELECT username, COUNT() AS count FROM `table1`
INNER JOIN `table2` ON table1.table2_id = table2.id
WHERE table1.age > 80)
UNION / INTERSECT / EXCEPT
(SELECT * FROM table1);

-- Union operators
-- UNION / INTERSECT / EXCEPT
```

## Commands

```sql
CREATE TABLE XXX(
    data_a  data_type,
    PRIMARY KEY(id),
    unique(abc),
    FOREIGN KEY(id) REFERENCES table2(id)
);

DROP TABLE XXX;

INSERT INTO table1(field1, field2) VALUES ('value1', 'value2'), ('value1', 'value2');

UPDATE table1 SET email = 'xyz@gmail.com' WHERE id = 1234;

DELETE FROM table1 where id = 1234;
```

## Imp commands

```sql
WHERE (condition1 OR condition2) AND condition3;
-- condition operators =,>,<,<=,>=,<> or !=, IS NOT NULL

-- regex condition
WHERE email RLIKE "^(fl|c)at[catd]{,5}.*+?\.com$" OR age > 25;
-- between condition
WHERE age between 22 and 25;

SELECT DISTINCT email AS user_email from table1;
```

```sql
ORDER BY age ASC/DESC;

LIMIT 10;
```
