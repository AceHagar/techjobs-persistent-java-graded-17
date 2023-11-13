--Part 1
  --`id` int NOT NULL,
  --`employer` varchar(255) DEFAULT NULL,
  --`name` varchar(100) DEFAULT NULL,
  --`skills` varchar(100) DEFAULT NULL,
--Part 2
SELECT name
FROM employer
WHERE location = "St. Louis City";
--Part 3
DROP TABLE job;
--Part 4
SELECT DISTINCT name
FROM skill
INNER JOIN job_skills ON skill.id = job_skills.skills_id
WHERE job_skills.jobs_id IS NOT NULL














