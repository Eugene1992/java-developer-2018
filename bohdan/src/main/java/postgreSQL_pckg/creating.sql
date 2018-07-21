CREATE TABLE employee (
  id SERIAL PRIMARY KEY,
  first_name VARCHAR(30),
  last_name VARCHAR(30),
  age INT,
  salary INT,
  is_married BOOLEAN,
  birthdate DATE,
  position VARCHAR(50)
);


UPDATE employee SET position = 'Senior Architect' WHERE position = 'Architect senior';


INSERT INTO employee (first_name, last_name, age, salary, is_married, birthdate, position)
VALUES ('Barbara', 'Straza', 25, 15000, TRUE, '1993-03-27', 'HR');
INSERT INTO employee (first_name, last_name, age, salary, is_married, birthdate, position)
VALUES ('Sabrina', 'Catson', 26, 16420, FALSE, '1992-02-24', 'HR');
INSERT INTO employee (first_name, last_name, age, salary, is_married, birthdate, position)
VALUES ('Tyler', 'Tulls', 23, 22140, TRUE, '1994-11-08', 'DevOps');
INSERT INTO employee (first_name, last_name, age, salary, is_married, birthdate, position)
VALUES ('Franklin', 'Bablos', 27, 26700, FALSE, '1991-06-06', 'DevOps');