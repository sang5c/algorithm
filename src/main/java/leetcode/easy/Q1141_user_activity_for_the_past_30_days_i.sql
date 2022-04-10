-- https://leetcode.com/problems/user-activity-for-the-past-30-days-i/
-- Date: 2022-04-10
SELECT activity_date as day, count(distinct(user_id)) as active_users
FROM ACTIVITY
GROUP BY activity_date
HAVING activity_date > ADDDATE('2019-07-27', -30)
