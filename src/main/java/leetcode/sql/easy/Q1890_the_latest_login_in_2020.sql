-- https://leetcode.com/problems/the-latest-login-in-2020/
-- Date: 2022-04-20
SELECT user_id, MAX(time_stamp) AS last_stamp
FROM Logins
WHERE YEAR(time_stamp) = 2020
GROUP BY user_id
