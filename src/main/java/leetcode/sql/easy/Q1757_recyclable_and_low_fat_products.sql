-- https://leetcode.com/problems/recyclable-and-low-fat-products/
-- Date: 2022-04-27
SELECT product_id
FROM Products
WHERE low_fats = 'Y' AND recyclable = 'Y'
