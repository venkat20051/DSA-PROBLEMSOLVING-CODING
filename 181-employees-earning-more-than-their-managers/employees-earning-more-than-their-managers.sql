# Write your MySQL query statement below
select e.name as Employee from Employee e JOIN Employee r on e.managerId=r.id where e.salary>r.salary;