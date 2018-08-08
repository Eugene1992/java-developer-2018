
DROP TABLE employee;
CREATE TABLE employee (
  id INT PRIMARY KEY,
  first_name VARCHAR(20),
  last_name VARCHAR (20),
  position VARCHAR (20),
  is_married VARCHAR (20),
  salary INT
);
INSERT INTO employee VALUES (1,'Ivan','Ivanov','trainee','divorced',1200);
INSERT INTO employee VALUES (2,'Taras','Tarasov','Junior','yes',1400);
INSERT INTO employee VALUES (3,'Ruslan','Ruslanovich','Lead', 'yes',5000);
INSERT INTO employee VALUES (4,'Stepan','Stepanovich', 'Tester', 'no',1200);
INSERT INTO employee VALUES (5, 'ihor', 'Ihorovich', 'Project manager', 'divorced',1500);
INSERT INTO employee VALUES (6,'Andriy', 'Andriyivuch','Recruiter','widowed',500);
INSERT INTO employee VALUES (7,'Vitaliy', 'Vitaliyovych','General manager','yes',1000);
INSERT INTO employee VALUES (8,'Andriy', 'Andriyivuch','Personal Assitant','yes',450);
INSERT INTO employee VALUES (9,'Petro', 'Petrovych','QA','no',700);
INSERT INTO employee VALUES (10,'Dmytro', 'Dmytrovych','BI Analyst','yes',1378);
INSERT INTO employee VALUES (11,'Oleksandr', 'Oleksandrovych','Python Dev','no',3000);
INSERT INTO employee VALUES (12,'Oksana', 'Oksanivna','HR','divorced',1260);
INSERT INTO employee VALUES (13,'Pavlo', 'Andriyivuch','Recruiter','no',390);
INSERT INTO employee VALUES (14,'Anna', 'petrivna','Office manager','divorced',500);
INSERT INTO employee VALUES (15,'Taras', 'Ivanovych','Java Dev','yes',2000);
INSERT INTO employee VALUES (16,'Oleg', 'Petrovych','Scala Developer','yes',3000);
INSERT INTO employee VALUES (17,'Mykola', 'Stepanovych','DevOps','yes',1700);
INSERT INTO employee VALUES (18,'Andriy', 'Ivanovych','QA','widowed',1500);
INSERT INTO employee VALUES (19,'Andriy', 'Tarasovych','CEO','yes',7000);
INSERT INTO employee VALUES (20,'Dmytro', 'Andriyivuch','CMO','yes',4500);
INSERT INTO employee VALUES (21,'Victor', 'Olegovych','Big Data ','no',3000);
INSERT INTO employee VALUES (22,'Hryhoriy', 'Andriyivuch','Recruiter','divorced',1100);
INSERT INTO employee VALUES (23,'Andriy', 'Andriyivuch','QA','no',500);
INSERT INTO employee VALUES (24,'Stepan', 'Petrovych','Tester','no',900);
INSERT INTO employee VALUES (25,'Mykola', 'Andriyivuch','JS Developer','no',1900);
INSERT INTO employee VALUES (26,'Anna', 'Andriivna','Recruiter','no',1000);
INSERT INTO employee VALUES (27,'Tanya', 'Petrivna','Recruiter','yes',1100);
INSERT INTO employee VALUES (28,'Andriy', 'Andriyivuch','DevOps','yes',2500);
INSERT INTO employee VALUES (39,'Anna', 'Ostapivna','CTO','yes',5000);
INSERT INTO employee VALUES (30,'Oleg', 'Andriyivuch','JavaDev','widowed',500);
INSERT INTO employee VALUES (31,'Taras', 'Olegovych','JavaDev','widowed',500);
INSERT INTO employee VALUES (32,'Petro', 'Andriyivuch','JavaDev','widowed',500);
INSERT INTO employee VALUES (33,'Mykola', 'Olegovych','JavaDev','widowed',500);
INSERT INTO employee VALUES (34,'Pavlo', 'Andriyivuch','JavaDev','widowed',500);
INSERT INTO employee VALUES (35,'Stepan', 'Andriyivuch','JavaDev','widowed',500);