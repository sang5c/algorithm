-- https://leetcode.com/problems/employees-with-missing-information/
-- Date: 2022-04-14
SELECT T.employee_id
FROM (
    SELECT * FROM EMPLOYEES LEFT JOIN SALARIES USING(employee_id)
    UNION 
    SELECT * FROM EMPLOYEES RIGHT JOIN SALARIES USING(employee_id)
) AS T
WHERE T.salary IS NULL OR T.name IS NULL
ORDER BY employee_id;
