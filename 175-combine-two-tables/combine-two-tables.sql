# Write your MySQL query statement below
select f.firstName,f.lastName,a.city,a.state from Person f LEFT OUTER JOIN Address a on
f.personId=a.personId;