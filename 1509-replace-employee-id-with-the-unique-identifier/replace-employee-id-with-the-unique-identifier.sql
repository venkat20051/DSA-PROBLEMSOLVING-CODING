# Write your MySQL query statement below
SELECT e.name, COALESCE(u.unique_id, NULL) AS unique_id
FROM Employees e
LEFT JOIN EmployeeUNI u 
ON e.id = u.id;
