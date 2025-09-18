# Write your MySQL query statement below
Select
user_id , Concat(ucase(substring(name,1, 1)) , lcase(substring(name , 2))) as name
from
Users  order by user_id;