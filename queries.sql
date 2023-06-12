-- Part 1: Test it with SQL
--/*Table: job
--
--//Columns:
--id
--int PK
--employer
--varchar(255)
--name
--varchar(255)
--skills
--varchar(255)*/

-- Part 2: Test it with SQL

-- SELECT name FROM employer WHERE location = "St. Louis City";

-- Part 3: Test it with SQL
DROP TABLE job;
-- Part 4:



SELECT * skills,
FROM table skills,
INNER JOIN job_skills ON,
WHERE job_skills.jobs IS NOT NULL,
ORDER BY name ASC;