-- https://leetcode.com/problems/bank-account-summary-ii/
-- Date: 2022-04-08
SELECT u.name, SUM(amount) AS BALANCE
FROM USERS u, TRANSACTIONS t
WHERE u.account = t.account
GROUP BY t.account
HAVING SUM(amount) > 10000
