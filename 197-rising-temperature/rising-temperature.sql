# Write your MySQL query statement below
select id from Weather w where temperature > (select temperature from Weather where recordDate=w.recordDate - INTERVAL 1 DAY);