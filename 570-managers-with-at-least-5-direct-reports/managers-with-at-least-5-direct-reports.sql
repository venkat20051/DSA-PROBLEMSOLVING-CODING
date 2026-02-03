# Write your MySQL query statement below
select e.name from Employee e JOIN Employee e1 on e.id = e1.managerID group by e.id having count(*)>=5;