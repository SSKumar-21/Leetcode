# Write your MySQL query statement below
-- select *
-- from Users
-- where mail REGEXP '^[a-zA-Z][a-zA-Z0-9_.-]*@leetcode[.]com$' and mail like '%@leetcode.com'

SELECT * 
FROM Users
WHERE REGEXP_LIKE(mail, '^[a-zA-Z][a-zA-Z0-9._-]*@leetcode\\.com$', 'c');
