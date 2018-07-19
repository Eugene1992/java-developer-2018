DROP TABLE employee_19072018;
DROP TABLE department_19072018;

CREATE TABLE department_19072018 (
  department_id SERIAL PRIMARY KEY,
  name          VARCHAR(64),
  country       VARCHAR(64)
);

INSERT INTO department_19072018 VALUES (10, 'ACCOUNTING', 'NEW YORK');
INSERT INTO department_19072018 VALUES (20, 'RESEARCH', 'DALLAS');
INSERT INTO department_19072018 VALUES (30, 'SALES', 'CHICAGO');
INSERT INTO department_19072018 VALUES (40, 'OPERATIONS', 'BOSTON');

CREATE TABLE employee_19072018 (
  emplyee_id    SERIAL PRIMARY KEY,
  name          VARCHAR(64),
  job           VARCHAR(64),
  manager_id    INT,
  hiredate      TIMESTAMP,
  salary        DOUBLE PRECISION,
  commissions   INT,
  department_id INT REFERENCES department_19072018 (department_id)
);

INSERT INTO employee_19072018 VALUES (7369, 'SMITH', 'CLERK', 7902, TO_DATE('17-12-1980', 'DD-MM-YYYY'), 800, NULL, 20);
INSERT INTO employee_19072018
VALUES (7499, 'ALLEN', 'SALESMAN', 7698, TO_DATE('20-02-1981', 'DD-MM-YYYY'), 1600, 300, 30);
INSERT INTO employee_19072018
VALUES (7521, 'WARD', 'SALESMAN', 7698, TO_DATE('22-02-1981', 'DD-MM-YYYY'), 1250, 500, 30);
INSERT INTO employee_19072018
VALUES (7566, 'JONES', 'MANAGER', 7839, TO_DATE('2-04-1981', 'DD-MM-YYYY'), 2975, NULL, 20);
INSERT INTO employee_19072018
VALUES (7654, 'MARTIN', 'SALESMAN', 7698, TO_DATE('28-09-1981', 'DD-MM-YYYY'), 1250, 1400, 30);
INSERT INTO employee_19072018
VALUES (7698, 'BLAKE', 'MANAGER', 7839, TO_DATE('1-05-1981', 'DD-MM-YYYY'), 2850, NULL, 30);
INSERT INTO employee_19072018
VALUES (7782, 'CLARK', 'MANAGER', 7839, TO_DATE('9-06-1981', 'DD-MM-YYYY'), 2450, NULL, 10);
INSERT INTO employee_19072018
VALUES (7788, 'SCOTT', 'ANALYST', 7566, TO_DATE('09-12-1982', 'DD-MM-YYYY'), 3000, NULL, 20);
INSERT INTO employee_19072018
VALUES (7839, 'KING', 'PRESIDENT', NULL, TO_DATE('17-11-1981', 'DD-MM-YYYY'), 5000, NULL, 10);
INSERT INTO employee_19072018
VALUES (7844, 'TURNER', 'SALESMAN', 7698, TO_DATE('8-09-1981', 'DD-MM-YYYY'), 1500, 0, 30);
INSERT INTO employee_19072018
VALUES (7876, 'ADAMS', 'CLERK', 7788, TO_DATE('12-01-1983', 'DD-MM-YYYY'), 1100, NULL, 20);
INSERT INTO employee_19072018 VALUES (7900, 'JAMES', 'CLERK', 7698, TO_DATE('3-12-1981', 'DD-MM-YYYY'), 950, NULL, 30);
INSERT INTO employee_19072018
VALUES (7902, 'FORD', 'ANALYST', 7566, TO_DATE('3-12-1981', 'DD-MM-YYYY'), 3000, NULL, 20);
INSERT INTO employee_19072018
VALUES (7934, 'MILLER', 'CLERK', 7782, TO_DATE('23-01-1982', 'DD-MM-YYYY'), 1300, NULL, 10);

-- 1. Display average employees salary.

SELECT avg(salary)
FROM employee_19072018;

-- 2. Display average employees salary whose job is 'Clerk'.

SELECT avg(salary)
FROM employee_19072018
WHERE job = 'CLERK';

-- 3. Display max employees salary.

SELECT max(salary)
FROM employee_19072018;

-- 3. Display max salary of employees who receive commissions.

SELECT max(salary)
FROM employee_19072018
WHERE commissions > 0;

-- 4. Display min employees salary.

SELECT min(salary)
FROM employee_19072018;

-- 5. Display min  salary of  employees whose job is  'Manager'  or  'Clerk'.

SELECT min(salary)
FROM employee_19072018
WHERE job IN ('CLERK', 'MANAGER');

-- 6. Display summary employees salary.

SELECT sum(salary)
FROM employee_19072018;

-- 7.  Display summary employees salary whose department number is 30.

SELECT sum(e.salary)
FROM employee_19072018 e
JOIN department_19072018 d on e.department_id = d.department_id
WHERE d.department_id = 30;

-- 8. Convert to uppercase and display employees name column.

UPDATE employee_19072018 SET name = upper(name);
SELECT name FROM employee_19072018;

--10. Convert to uppercase and display employees names that contains 'S' or 'R' symbols.

UPDATE employee_19072018 SET name = upper(name);
SELECT name FROM employee_19072018 WHERE position('S' IN name) > 0 OR position('R' IN name) > 0;

-- 11. Convert to lowercase and display employees name column.

UPDATE employee_19072018 SET name = lower(name);
SELECT name FROM employee_19072018;

-- 12. Convert to lowercase and display employees names that ends with 'ES' or 'ER'.

UPDATE employee_19072018 SET name = lower(name);
SELECT name FROM employee_19072018 WHERE name LIKE '%es' OR name LIKE '%er';

-- 13. Display names and five first symbols of employees JOB column.

SELECT name,left(job,5) FROM employee_19072018;

-- 14. Display employees names and names length

SELECT name,length(name) FROM employee_19072018;

-- 15. Display employees names and names length

SELECT name FROM employee_19072018 WHERE length(name) > 5;

-- 16. Display employees names, salaries and salaries rounded to integers.

SELECT name,salary,round(salary) FROM employee_19072018;

-- ???17. Display employees names, salaries and salaries rounded to the hundredths.

SELECT name,salary,ceil(salary) FROM employee_19072018;

-- ???18. Display employees names, salaries and salaries rounded to nearest thousand.

SELECT name,salary,ceil(salary) FROM employee_19072018;

-- 19. Display current date.

SELECT clock_timestamp();

-- ???20. Display employees names and hiredates in following format

SELECT name,to_date(hiredate,'DD-MM-YYYY') FROM employee_19072018;
