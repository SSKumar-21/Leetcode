# Write your MySQL query statement below
select customer_number
from Orders
group by customer_number
HAVING COUNT(*) = (
    SELECT MAX(order_count)
    FROM (
        SELECT COUNT(*) AS order_count
        FROM Orders
        GROUP BY customer_number
    ) AS t
);
