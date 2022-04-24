-- https://leetcode.com/problems/combine-two-tables/
-- Date: 2022-04-24
SELECT p.firstName, p.lastName, a.city, a.state
FROM person p LEFT OUTER JOIN address a ON p.personId = a.personId
