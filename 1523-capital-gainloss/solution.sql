# Write your MySQL query statement below
SELECT stock_name, Sum(CASE when operation='Sell' then price else -price END) as capital_gain_loss
from stocks
group by stock_name
