# Write your MySQL query statem
select customer_number
from Orders 
group by customer_number
order by count(*) desc
limit 1;