-- https://leetcode.com/problems/not-boring-movies/
-- Date: 2022-04-29
SELECT *
FROM Cinema
WHERE description != 'boring' AND MOD(id, 2) = 1
ORDER BY rating DESC
