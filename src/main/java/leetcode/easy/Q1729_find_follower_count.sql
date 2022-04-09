-- https://leetcode.com/problems/find-followers-count/
-- Date: 2022-04-09
SELECT user_id, COUNT(follower_id) as followers_count
FROM FOLLOWERS
GROUP BY user_id
ORDER BY user_id
