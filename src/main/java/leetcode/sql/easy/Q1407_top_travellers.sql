-- https://leetcode.com/problems/top-travellers/
-- Date: 2022-04-26
SELECT u.name,
       IF(r.distance IS NOT NULL, SUM(r.distance), 0) AS travelled_distance
FROM Users u
         LEFT OUTER JOIN Rides r ON u.id = r.user_id
GROUP BY u.name
ORDER BY SUM(r.distance) DESC,
         u.name ASC
