# Write your MySQL query statement below
select c.name as Customers
from Customers c,
( select distinct(c.id)
from Customers c
except 
select distinct(o.customerId)
from Orders o ) as ids
where c.id = ids.id
