DROP TABLE employee_14072018;
DROP TABLE department_14072018;

CREATE TABLE department_14072018 (
  department_id SERIAL PRIMARY KEY,
  name          VARCHAR(64),
  location      VARCHAR(64)
);

CREATE TABLE employee_14072018 (
  employee_id   SERIAL PRIMARY KEY,
  name          VARCHAR(64),
  job           VARCHAR(64),
  manager_id    INT,
  hiredate      TIMESTAMP,
  salary        INT,
  commissions   INT,
  department_id INT REFERENCES department_14072018 (department_id)
);

INSERT INTO department_14072018 VALUES (10, 'ACCOUNTING', 'NEW YORK');
INSERT INTO department_14072018 VALUES (20, 'RESEARCH', 'DALLAS');
INSERT INTO department_14072018 VALUES (30, 'SALES', 'CHICAGO');
INSERT INTO department_14072018 VALUES (40, 'OPERATIONS', 'BOSTON');

INSERT INTO employee_14072018 VALUES
  (7369, 'SMITH', 'CLERK', 7902,
   TO_DATE('17-12-1980', 'DD-MM-YYYY'), 800, NULL, 20);
INSERT INTO employee_14072018 VALUES
  (7499, 'ALLEN', 'SALESMAN', 7698,
   TO_DATE('20-02-1981', 'DD-MM-YYYY'), 1600, 300, 30);
INSERT INTO employee_14072018 VALUES
  (7521, 'WARD', 'SALESMAN', 7698,
   TO_DATE('22-02-1981', 'DD-MM-YYYY'), 1250, 500, 30);
INSERT INTO employee_14072018 VALUES
  (7566, 'JONES', 'MANAGER', 7839,
   TO_DATE('2-04-1981', 'DD-MM-YYYY'), 2975, NULL, 20);
INSERT INTO employee_14072018 VALUES
  (7654, 'MARTIN', 'SALESMAN', 7698,
   TO_DATE('28-09-1981', 'DD-MM-YYYY'), 1250, 1400, 30);
INSERT INTO employee_14072018 VALUES
  (7698, 'BLAKE', 'MANAGER', 7839,
   TO_DATE('1-05-1981', 'DD-MM-YYYY'), 2850, NULL, 30);
INSERT INTO employee_14072018 VALUES
  (7782, 'CLARK', 'MANAGER', 7839,
   TO_DATE('9-06-1981', 'DD-MM-YYYY'), 2450, NULL, 10);
INSERT INTO employee_14072018 VALUES
  (7788, 'SCOTT', 'ANALYST', 7566,
   TO_DATE('09-12-1982', 'DD-MM-YYYY'), 3000, NULL, 20);
INSERT INTO employee_14072018 VALUES
  (7839, 'KING', 'PRESIDENT', NULL,
   TO_DATE('17-11-1981', 'DD-MM-YYYY'), 5000, NULL, 10);
INSERT INTO employee_14072018 VALUES
  (7844, 'TURNER', 'SALESMAN', 7698,
   TO_DATE('8-09-1981', 'DD-MM-YYYY'), 1500, 0, 30);
INSERT INTO employee_14072018 VALUES
  (7876, 'ADAMS', 'CLERK', 7788,
   TO_DATE('12-01-1983', 'DD-MM-YYYY'), 1100, NULL, 20);
INSERT INTO employee_14072018 VALUES
  (7900, 'JAMES', 'CLERK', 7698,
   TO_DATE('3-12-1981', 'DD-MM-YYYY'), 950, NULL, 30);
INSERT INTO employee_14072018 VALUES
  (7902, 'FORD', 'ANALYST', 7566,
   TO_DATE('3-12-1981', 'DD-MM-YYYY'), 3000, NULL, 20);
INSERT INTO employee_14072018 VALUES
  (7934, 'MILLER', 'CLERK', 7782,
   TO_DATE('23-01-1982', 'DD-MM-YYYY'), 1300, NULL, 10);

ALTER TABLE employee_14072018
  ADD CONSTRAINT employee_14072018_manager_id_fkey FOREIGN KEY (employee_id) REFERENCES employee_14072018;

SELECT
  name,
  salary
FROM employee_14072018
WHERE salary > 2850;

SELECT
  name,
  department_id
FROM employee_14072018
WHERE employee_id = 7566;

SELECT
  name,
  salary
FROM employee_14072018
WHERE salary NOT IN (1500, 2850);

SELECT
  name,
  job,
  hiredate
FROM employee_14072018
WHERE hiredate BETWEEN '1981-02-20' AND '1981-05-01'
ORDER BY hiredate;

SELECT
  name,
  department_id
FROM employee_14072018
WHERE department_id IN (10, 30)
ORDER BY name;

SELECT
  name   AS "Employee",
  salary AS "Monthly Salary"
FROM employee_14072018
WHERE salary > 1500 AND department_id IN (10, 30);

SELECT
  name,
  hiredate
FROM employee_14072018
WHERE hiredate BETWEEN '1982-01-01' AND '1982-12-31';

SELECT
  name,
  job
FROM employee_14072018
WHERE manager_id IS NULL;

SELECT
  name,
  salary,
  commissions
FROM employee_14072018
WHERE commissions IS NOT NULL
ORDER BY salary DESC, commissions DESC;

SELECT name
FROM employee_14072018
WHERE name LIKE '__A%';

SELECT name
FROM employee_14072018
WHERE name LIKE '%LL%' and department_id = 30 OR manager_id = 7782;

SELECT
  name,
  job,
  salary
FROM employee_14072018
WHERE job = 'CLERK' OR job = 'ANALYST' AND salary NOT IN (1000, 3000, 5000);

SELECT
  name,
  salary,
  commissions
FROM employee_14072018
WHERE commissions > salary * 1.1;