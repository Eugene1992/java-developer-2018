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

-- Create a query to display the name and salary of employees earning more than $2850.

SELECT employee_name from employee WHERE employee_salary >2850;

-- Create a query to display the employee name and department number for employee number 7566.

SELECT employee_name, employee.department_id FROM employee
INNER join department  on employee.department_id = department.department_id
where employee_id = 7566;

-- Create a query to display the name and salary for all employees whose salary is not in the
-- range of $1500 and $2850.

SELECT employee.employee_name, employee.employee_salary FROM employee
WHERE employee_salary Not BETWEEN 1500 and 2850;

-- Display the employee name, job and start date of employees hired between February 20, 1981,
--  and May 1, 1981.  Order the query in ascending order of start date.

SELECT employee.employee_name, employee.employee_job,employee.employee_hiredate
from employee where employee_hiredate
BETWEEN To_DATE ('1-02-1981','DD-MM-YYYY') AND To_DATE ('1-05-1981','DD-MM-YYYY')
ORDER By employee_hiredate  ASC ;

-- Display the employee name and department number of all employees in departments
-- 10 and 30 in alphabetical order by name.

SELECT employee.employee_name, employee.department_id FROM employee
WHERE department_id In (10, 30)  ORDER BY employee_name;

-- Display list the name and salary of employees who earn more than $1500 and are in department 10 or 30.
-- Label the columns Employee and Monthly Salary, respectively.

SELECT employee.employee_name As Employee, employee.employee_salary AS "Monthly Salary"
FROM employee
WHERE employee_salary > 1500 ANd employee.department_id In (10,30);

-- Display the name and hire date of every employee who was hired in 1982.

SELECT employee.employee_name  , employee.employee_hiredate
FROM employee WHERE employee_hiredate
BETWEEN To_DATE ('01-01-1982', 'DD-MM-YYYY') AND To_DAte ('31-12-1982', 'DD-MM-YYYY');

-- Display the name and job title of employees who do not have a manager.

SELECT employee.employee_name, employee.employee_job
FROM employee WHERE employee.employee_manager_id IS NULL ;

-- Display the name, salary, and commission for all employees who earn commissions.
-- Sort the data in descending order of salary and commissions (commission within salary).

SELECT employee.employee_name, employee.employee_salary,employee.employee_commisions
From employee WHERE employee_commisions IS NOt NULL
ORDER BY  employee_salary DESC, employee_commisions DESC;

-- Display the names of all employees where the third letter of their name is an A.

SELECT employee.employee_name FROM employee
Where employee_name LIKE '__A%';

-- Display the name of all employees that have two Ls in their
--  name and are in department 30 or their manager is 7782.

SELECT employee.employee_name FROM employee
WHERE employee.employee_name Like '%LL%'
AND employee.department_id = 30 OR employee.employee_manager_id = 7782;

-- Display the name, job, and salary for all employees whose job is Clerk or Analyst
--  and their salary is not equal to $1000, $3000, or $5000.

SELECT employee.employee_name, employee.employee_job, employee.employee_salary
FROM employee
WHERE (employee.employee_job IN ('CLERK', 'ANALYST'))
 AND employee_salary  NOT IN (1000,3000,5000)


--  Display the name, salary, and commission for all employees
--   whose commission amount is greater than their salary  increased by 10%.

SELECT employee.employee_name, employee.employee_salary, employee.employee_commisions
FROM employee
WHERE employee_salary < employee_commisions * 1.1


