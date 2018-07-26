CREATE TABLE department (
  department_id INT PRIMARY KEY,
  name          VARCHAR(50),
  location      VARCHAR(50)
);

CREATE TABLE employee (
  employee_id   INT PRIMARY KEY,
  name          VARCHAR(30),
  job           VARCHAR(30),
  manager_id    INT,
  hiredate      DATE,
  salary        INT,
  commissions   INT,
  departmant_id INT REFERENCES department (department_id)
);

INSERT INTO department VALUES (10, 'ACCOUNTING', 'NEW YORK');
INSERT INTO department VALUES (20, 'RESEARCH', 'DALLAS');
INSERT INTO department VALUES (30, 'SALES', 'CHICAGO');
INSERT INTO department VALUES (40, 'OPERATIONS', 'BOSTON');

INSERT INTO employee VALUES
  (7369, 'SMITH', 'CLERK', 7902,
   TO_DATE('17-12-1980', 'DD-MM-YYYY'), 800, NULL, 20);
INSERT INTO employee VALUES
  (7499, 'ALLEN', 'SALESMAN', 7698,
   TO_DATE('20-02-1981', 'DD-MM-YYYY'), 1600, 300, 30);
INSERT INTO employee VALUES
  (7521, 'WARD', 'SALESMAN', 7698,
   TO_DATE('22-02-1981', 'DD-MM-YYYY'), 1250, 500, 30);
INSERT INTO employee VALUES
  (7566, 'JONES', 'MANAGER', 7839,
   TO_DATE('2-04-1981', 'DD-MM-YYYY'), 2975, NULL, 20);
INSERT INTO employee VALUES
  (7654, 'MARTIN', 'SALESMAN', 7698,
   TO_DATE('28-09-1981', 'DD-MM-YYYY'), 1250, 1400, 30);
INSERT INTO employee VALUES
  (7698, 'BLAKE', 'MANAGER', 7839,
   TO_DATE('1-05-1981', 'DD-MM-YYYY'), 2850, NULL, 30);
INSERT INTO employee VALUES
  (7782, 'CLARK', 'MANAGER', 7839,
   TO_DATE('9-06-1981', 'DD-MM-YYYY'), 2450, NULL, 10);
INSERT INTO employee VALUES
  (7788, 'SCOTT', 'ANALYST', 7566,
   TO_DATE('09-12-1982', 'DD-MM-YYYY'), 3000, NULL, 20);
INSERT INTO employee VALUES
  (7839, 'KING', 'PRESIDENT', NULL,
   TO_DATE('17-11-1981', 'DD-MM-YYYY'), 5000, NULL, 10);
INSERT INTO employee VALUES
  (7844, 'TURNER', 'SALESMAN', 7698,
   TO_DATE('8-09-1981', 'DD-MM-YYYY'), 1500, 0, 30);
INSERT INTO employee VALUES
  (7876, 'ADAMS', 'CLERK', 7788,
   TO_DATE('12-01-1983', 'DD-MM-YYYY'), 1100, NULL, 20);
INSERT INTO employee VALUES
  (7900, 'JAMES', 'CLERK', 7698,
   TO_DATE('3-12-1981', 'DD-MM-YYYY'), 950, NULL, 30);
INSERT INTO employee VALUES
  (7902, 'FORD', 'ANALYST', 7566,
   TO_DATE('3-12-1981', 'DD-MM-YYYY'), 3000, NULL, 20);
INSERT INTO employee VALUES
  (7934, 'MILLER', 'CLERK', 7782,
   TO_DATE('23-01-1982', 'DD-MM-YYYY'), 1300, NULL, 10);

-- ALTER TABLE employee
--     ADD CONSTRAINT emp_fk_dept FOREIGN KEY (departmant_id) REFERENCES department
ALTER TABLE employee
  ADD CONSTRAINT emp_fk_manag FOREIGN KEY (employee_id) REFERENCES employee;

-- QUERIES
-- 1
SELECT
  name   AS ename,
  salary AS salary
FROM employee
WHERE salary > 2850
ORDER BY salary DESC;
--2
SELECT
  name          ename,
  departmant_id deptnum
FROM employee
WHERE employee_id = 7566;
--3
SELECT
  name   AS ename,
  salary AS salary
FROM employee
WHERE salary NOT BETWEEN 1500 AND 2850
ORDER BY salary DESC;
--4
SELECT
  name ename,
  job,
  hiredate
FROM employee
WHERE hiredate BETWEEN '1981-02-20' AND '1981-05-01'
ORDER BY hiredate ASC;
--5
SELECT
  name          ename,
  departmant_id deptnum
FROM employee
WHERE departmant_id IN (10, 30)
ORDER BY name;
--6
SELECT
  name   "employee",
  salary "monthly salary"
FROM employee
WHERE departmant_id IN (10, 30) AND salary > 1500
ORDER BY name;
--7
SELECT
  name ename,
  hiredate
FROM employee
WHERE hiredate BETWEEN '1982-01-01' AND '1982-12-31';
--8
SELECT
  name ename,
  job
FROM employee
WHERE manager_id IS NULL;
--9
SELECT
  name ename,
  salary,
  commissions
FROM employee
WHERE commissions IS NOT NULL
ORDER BY salary DESC, commissions DESC;
--10
SELECT name ename
FROM employee
WHERE name LIKE '__A%';
--11
SELECT name ename
FROM employee
WHERE name LIKE '%LL%' AND (departmant_id = 30 OR manager_id = 7782);
--12
SELECT
  name ename,
  job,
  salary
FROM employee
WHERE (job IN ('CLERK', 'ANALYST')) AND salary NOT IN (1000, 3000, 5000);
--13
SELECT
  name ename,
  salary,
  commissions
FROM employee
WHERE commissions > salary * 1.1;
