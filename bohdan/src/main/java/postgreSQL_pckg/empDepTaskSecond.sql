--******--
--1
SELECT
  e.name          ename,
  d.department_id deptnum,
  d.name          deptname
FROM employee e
  INNER JOIN department d ON e.departmant_id = d.department_id
ORDER BY deptnum;
--2
SELECT DISTINCT
  e.job,
  d.location
FROM employee e
  INNER JOIN department d ON e.departmant_id = d.department_id
WHERE d.department_id = 30;
--3
SELECT
  e.name emp_name,
  d.name dept_name,
  d.location
FROM employee e
  INNER JOIN department d ON e.departmant_id = d.department_id
WHERE e.commissions IS NOT NULL;
--4
SELECT
  e.name emp_name,
  d.name dept_name
FROM employee e
  INNER JOIN department d ON e.departmant_id = d.department_id
WHERE e.name IS NOT NULL
ORDER BY d.name;
--5
SELECT
  e.name          ename,
  e.job,
  d.department_id dept_num,
  d.name          dept_name
FROM employee e
  INNER JOIN department d ON e.departmant_id = d.department_id
WHERE d.location = 'DALLAS';
--6
SELECT
  e.name        employee,
  e.employee_id "emp#",
  m.name        manager,
  m.employee_id "mgr#"
FROM employee e
  INNER JOIN employee AS m ON m.employee_id = e.manager_id
ORDER BY manager;
--7
SELECT
  e.name        employee,
  e.employee_id "emp#",
  m.name        manager,
  m.employee_id "mgr#"
FROM employee e
  LEFT JOIN employee AS m ON m.employee_id = e.manager_id
ORDER BY manager;
--8
SELECT
  d.department_id department,
  e.name          employee,
  e2.name         collegue
FROM employee e
  INNER JOIN department D ON e.departmant_id = D.department_id
  CROSS JOIN employee e2
GROUP BY department, employee, collegue, e2.departmant_id, e.departmant_id, e2.employee_id, e.employee_id
HAVING e2.departmant_id = e.departmant_id AND e2.employee_id != e.employee_id
ORDER BY department, employee;
--10
SELECT
  e.name ename,
  e.hiredate
FROM employee e
WHERE e.hiredate > (SELECT e.hiredate
                    FROM employee e
                    WHERE e.name = 'BLAKE');
--11
SELECT
  e.name     employee,
  e.hiredate emp_hiredate,
  m.name     manager,
  m.hiredate mgr_hiredate
FROM employee e
  INNER JOIN employee AS m ON m.employee_id = e.manager_id
WHERE e.hiredate < m.hiredate
ORDER BY manager;