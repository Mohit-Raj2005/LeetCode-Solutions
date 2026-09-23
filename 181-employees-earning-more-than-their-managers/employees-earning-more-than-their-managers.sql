# Write your MySQL query statement below
select name as Employee from Employee E where E.salary > (select salary from Employee as E2 where E.managerId = E2.id);