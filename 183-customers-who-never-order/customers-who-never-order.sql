# Write your MySQL query statement below
select c.name as Customers from 
Customers c LEFT JOIN Orders o
on c.id=o.customerId 
where o.id is null;