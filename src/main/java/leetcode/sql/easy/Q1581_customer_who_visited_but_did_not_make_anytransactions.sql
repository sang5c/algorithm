-- https://leetcode.com/problems/customer-who-visited-but-did-not-make-any-transactions/
-- Date: 2022-04-21
SELECT customer_id, COUNT(*) AS count_no_trans
FROM visits v LEFT JOIN transactions t ON v.visit_id = t.visit_id
WHERE transaction_id IS NULL
GROUP BY customer_id
