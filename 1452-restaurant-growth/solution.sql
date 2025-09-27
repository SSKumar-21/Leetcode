# Write your MySQL query statement below
-- select visited_on, 
-- (
--     select sum(amount) from Customer
--     where c.visited_on between date_sub(c.visited_on, interval 6 day)
--     and c.visited_on
-- ) as amount,
-- round((
--     select sum(amount)/7 from Customer
--     where c.visited_on between date_sub(c.visited_on, interval 6 day)
--     and c.visited_on
-- )) as average_amount
-- from Customer c
-- where visited_on >= (
--     select date_add(min(visited_on),interval 6 day)
-- )
-- group by visited_on
-- order by visited_on

# Write your MySQL query statement below
SELECT
    visited_on,
    (
        SELECT SUM(amount)
        FROM customer
        WHERE visited_on BETWEEN DATE_SUB(c.visited_on, INTERVAL 6 DAY) AND c.visited_on
    ) AS amount,
    ROUND(
        (
            SELECT SUM(amount) / 7
            FROM customer
            WHERE visited_on BETWEEN DATE_SUB(c.visited_on, INTERVAL 6 DAY) AND c.visited_on
        ),
        2
    ) AS average_amount
FROM customer c
WHERE visited_on >= (
        SELECT DATE_ADD(MIN(visited_on), INTERVAL 6 DAY)
        FROM customer
    )
GROUP BY visited_on;
