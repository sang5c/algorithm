-- https://leetcode.com/problems/sales-analysis-iii/
-- Date: 2022-04-12
SELECT p.product_id, p.product_name
FROM PRODUCT p, SALES s
WHERE p.product_id = s.product_id
GROUP BY product_id
HAVING MIN(sale_date) >= '2019-01-01' AND MAX(sale_date) <= '2019-03-31';
