CREATE TABLE department(
department_id  INT  PRIMARY KEY ,
department_name VARCHAR (50),
department_location VARCHAR (50)
);

CREATE table employee (
employee_id INT PRIMARY KEY ,
employee_name VARCHAR (40),
employee_job VARCHAR (40),
employee_manager_id INT,
employee_hiredate DATE ,
employee_salary INT,
employee_commisions INT,
department_id INT  references department (department_id)
);

INSERT INTO department VALUES (10, 'ACCOUNTING', 'NEW YORK');
INSERT INTO department VALUES (20, 'RESEARCH', 'DALLAS');
INSERT INTO department VALUES (30, 'SALES', 'CHICAGO');
INSERT INTO department VALUES (40, 'OPERATIONS', 'BOSTON');


INSERT INTO employee VALUES (7369, 'SMITH', 'CLERK', 7902, TO_DATE('17-12-1980', 'DD-MM-YYYY'), 800, NULL, 20);
INSERT INTO employee VALUES(7499, 'ALLEN', 'SALESMAN', 7698, TO_DATE('20-02-1981', 'DD-MM-YYYY'), 1600, 300, 30);
INSERT INTO employee VALUES (7521, 'WARD', 'SALESMAN', 7698, TO_DATE('22-02-1981', 'DD-MM-YYYY'), 1250, 500, 30);
INSERT INTO employee VALUES(7566, 'JONES', 'MANAGER', 7839,TO_DATE('2-04-1981', 'DD-MM-YYYY'), 2975, NULL, 20);
INSERT INTO employee VALUES (7654, 'MARTIN', 'SALESMAN', 7698, TO_DATE('28-09-1981', 'DD-MM-YYYY'), 1250, 1400, 30);
INSERT INTO employee VALUES  (7698, 'BLAKE', 'MANAGER', 7839,TO_DATE('1-05-1981', 'DD-MM-YYYY'), 2850, NULL, 30);
INSERT INTO employee VALUES(7782, 'CLARK', 'MANAGER', 7839,TO_DATE('9-06-1981', 'DD-MM-YYYY'), 2450, NULL, 10);
INSERT INTO employee VALUES (7788, 'SCOTT', 'ANALYST', 7566,TO_DATE('09-12-1982', 'DD-MM-YYYY'), 3000, NULL, 20);
INSERT INTO employee VALUES (7839, 'KING', 'PRESIDENT', NULL, TO_DATE('17-11-1981', 'DD-MM-YYYY'), 5000, NULL, 10);
INSERT INTO employee VALUES (7844, 'TURNER', 'SALESMAN', 7698, TO_DATE('8-09-1981', 'DD-MM-YYYY'), 1500, 0, 30);
INSERT INTO employee VALUES (7876, 'ADAMS', 'CLERK', 7788,TO_DATE('12-01-1983', 'DD-MM-YYYY'), 1100, NULL, 20);
INSERT INTO employee VALUES (7900, 'JAMES', 'CLERK', 7698, TO_DATE('3-12-1981', 'DD-MM-YYYY'), 950, NULL, 30);
INSERT INTO employee VALUES (7902, 'FORD', 'ANALYST', 7566, TO_DATE('3-12-1981', 'DD-MM-YYYY'), 3000, NULL, 20);
INSERT INTO employee VALUES (7934, 'MILLER', 'CLERK', 7782, TO_DATE('23-01-1982', 'DD-MM-YYYY'), 1300, NULL, 10);

 ALTER TABLE employee
  ADD CONSTRAINT emp_fk_dept FOREIGN KEY (department_id) REFERENCES department;

-- Display average employees salary.
SELECT avg(employee_salary) from employee;

-- Display average employees salary whose job is 'Clerk'.
SELECT avg(employee_salary) from employee WHERE employee.employee_job = 'CLERK';

-- Display max employees salary.
SELECT max(employee_salary) from employee;

-- Display max salary of employees who receive commissions.
SELECT max(employee_salary) from employee where employee.employee_commisions IS not NULL;

-- Display min employees salary.

SELECT min(employee_salary) from employee;

-- Display min  salary of  employees whose job is  'Manager'  or  'Clerk'.

SELECT min(employee_salary) from employee where employee_job IN ('MANAGER', 'CLERK');

-- Display summary employees salary.
SELECT sum(employee_salary) from employee;

-- Display summary employees salary whose department number is 30.
SELECT sum(employee_salary) from employee
join department ON employee.department_id = department.department_id
WHERE employee.department_id = 30;

-- Convert to uppercase and display employees name column.
select UPPER(employee_name)from employee ;

-- Convert to uppercase and display employees names that contains 'S' or 'R' symbols.
select upper(employee_name) from employee  where employee_name  LIKE '%S%'Or employee_name like '%R%';

-- Convert to lowercase and display employees name column.
select LOWER (employee_name)from employee ;

-- Convert to lowercase and display employees names that ends with 'ES' or 'ER'.
select lower(employee_name) from employee  where employee_name  LIKE '%ES'Or employee_name like '%ER';

-- Display names and five first symbols of employees JOB column.

SELECT LEFT (employee_job, 5 ), employee_name FROM employee;

-- Display employees names and names length.

SELECT employee_name, length(employee_name) from employee;

-- Display employees names whose length is more then 5 characters.

SELECT employee_name from employee where length (employee_name) >5;

-- Display employees names, salaries and salaries rounded to integers.

SELECT employee_name,employee_salary, round(employee_salary) As "ROUNDED BY" from employee;

-- 18. Display employees names, salaries and salaries rounded to nearest thousand.

SELECT employee_name,employee_salary, round(employee_salary,1000) As "ROUNDED BY" from employee;

-- 19. Display current date.

SELECT Now() ;

-- 20. Display employees names and hiredates in following format:


SELECT employee_name ,upper (to_char("employee_hiredate", 'MM-YYYY')) FROM employee



