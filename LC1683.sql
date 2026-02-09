

--Problem: LC1683
--Description: Invalid Tweets
-- Link : https://leetcode.com/problems/invalid-tweets/description/




-- LC1683.sql
SELECT tweet_id FROM Tweets WHERE LENGTH(content) > 15;