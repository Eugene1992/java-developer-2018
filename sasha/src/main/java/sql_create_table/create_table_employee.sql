DROP TABLE employee;

CREATE TABLE employee
(
    id serial PRIMARY KEY,
    first_name VARCHAR(64),
    last_name VARCHAR(64),
    age INT,
    salary INT,
    is_married BOOLEAN,
    position VARCHAR(64),
    birthday TIMESTAMP
);

INSERT INTO employee VALUES (1,'firstname_1','lastname_1',20,10000,FALSE,'QA','1998-03-12');
INSERT INTO employee VALUES (2,'firstname_2','lastname_2',22,10000,FALSE,'QA','1996-03-01');
INSERT INTO employee VALUES (3,'firstname_3','lastname_3',30,20000,TRUE ,'DEV','1988-06-25');
INSERT INTO employee VALUES (4,'firstname_4','lastname_4',24,20000,FALSE,'DEV','1994-01-14');
INSERT INTO employee VALUES (5,'firstname_5','lastname_5',19,20000,FALSE,'DEV','1999-09-25');
INSERT INTO employee VALUES (6,'firstname_6','lastname_6',18,10000,FALSE,'QA','2000-08-04');
INSERT INTO employee VALUES (7,'firstname_7','lastname_7',21,20000,FALSE,'DEV','1997-08-16');
INSERT INTO employee VALUES (8,'firstname_8','lastname_8',25,20000,TRUE ,'DEV','1993-05-11');
INSERT INTO employee VALUES (9,'firstname_9','lastname_9',23,20000,FALSE,'DEV','1995-02-20');
INSERT INTO employee VALUES (10,'firstname_10','lastname_10',33,30000,TRUE ,'QA Lead','1985-07-19');
INSERT INTO employee VALUES (11,'firstname_11','lastname_11',31,30000,TRUE ,'DEV Lead','1987-06-09');
INSERT INTO employee VALUES (12,'firstname_12','lastname_12',26,10000,TRUE ,'QA','1992-04-01');
INSERT INTO employee VALUES (13,'firstname_13','lastname_13',40,50000,TRUE ,'CTO','1978-10-23');
INSERT INTO employee VALUES (14,'firstname_14','lastname_14',38,50000,TRUE ,'COO','1980-11-07');
INSERT INTO employee VALUES (15,'firstname_15','lastname_15',35,40000,TRUE ,'PO','1983-12-25');
INSERT INTO employee VALUES (16,'firstname_16','lastname_16',19,10000,FALSE,'QA','1999-11-26');
INSERT INTO employee VALUES (17,'firstname_17','lastname_17',23,20000,FALSE,'DEV','1995-02-03');
INSERT INTO employee VALUES (18,'firstname_18','lastname_18',26,20000,TRUE ,'DEV','1992-04-26');
INSERT INTO employee VALUES (19,'firstname_19','lastname_19',36,30000,TRUE ,'PM','1982-03-30');
INSERT INTO employee VALUES (20,'firstname_20','lastname_20',42,100000,FALSE,'CEO','1976-07-29');
INSERT INTO employee VALUES (21,'firstname_21','lastname_21',27,20000,TRUE,'DEV','1991-02-24');
INSERT INTO employee VALUES (22,'firstname_22','lastname_22',33,20000,TRUE,'DEV','1985-01-29');
INSERT INTO employee VALUES (23,'firstname_23','lastname_23',37,10000,TRUE,'QA','1981-06-18');
INSERT INTO employee VALUES (24,'firstname_24','lastname_24',22,20000,FALSE,'DEV','1996-03-18');
INSERT INTO employee VALUES (25,'firstname_25','lastname_25',18,20000,FALSE,'DEV','2000-09-16');
INSERT INTO employee VALUES (26,'firstname_26','lastname_26',22,15000,FALSE,'Office-Manager','1996-08-15');
INSERT INTO employee VALUES (27,'firstname_27','lastname_27',32,15000,TRUE,'Support','1986-04-09');
INSERT INTO employee VALUES (28,'firstname_28','lastname_28',36,30000,TRUE,'Head of Support','1982-08-29');
INSERT INTO employee VALUES (29,'firstname_29','lastname_29',26,15000,TRUE,'Support','1992-12-04');
INSERT INTO employee VALUES (30,'firstname_30','lastname_30',19,15000,FALSE,'Support','1999-11-11');

SELECT * FROM employee;
