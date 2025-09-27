# Write your MySQL query statement below
select round(sum(if(ordate = didate,1,0)*100)/count(ordate),2) as immediate_percentage
from (
    select delivery_id , customer_id, 
    min(order_date) as ordate, 
    min(customer_pref_delivery_date) as didate 
    from Delivery
    group by customer_id
) as newTable
