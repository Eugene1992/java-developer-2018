CREATE TABLE customer (
  id      SERIAL PRIMARY KEY,
  name    VARCHAR(30),
  country VARCHAR(30)
);

CREATE TABLE employee (
  id          SERIAL PRIMARY KEY,
  first_name  VARCHAR(30),
  last_name   VARCHAR(30),
  age         INT,
  email       VARCHAR(30),
  gender      VARCHAR(30),
  salary      INT,
  customer_id INT REFERENCES customer (id)
);

INSERT INTO customer (id, name, country) VALUES (1, 'Rolex', 'Switzerland');
INSERT INTO customer (id, name, country) VALUES (2, 'Lego', 'Denmark');
INSERT INTO customer (id, name, country) VALUES (3, 'Google', 'USA');
INSERT INTO customer (id, name, country) VALUES (4, 'Canon', 'Japan');
INSERT INTO customer (id, name, country) VALUES (5, 'Bosch', 'Germany');
INSERT INTO customer (id, name, country) VALUES (6, 'Sony', 'Japan');
INSERT INTO customer (id, name, country) VALUES (7, 'Intel', 'USA');
INSERT INTO customer (id, name, country) VALUES (8, 'Rolls-Royce', 'UK');
INSERT INTO customer (id, name, country) VALUES (9, 'Adidas', 'Germany');
INSERT INTO customer (id, name, country) VALUES (10, 'Christian Dior', 'France');

INSERT INTO employee (id, first_name, last_name, age, email, gender, salary, customer_id)
VALUES (1, 'Kendal', 'O''Murtagh', 62, 'komurtagh0@walmart.com', 'Male', 18338, 8);
INSERT INTO employee (id, first_name, last_name, age, email, gender, salary, customer_id)
VALUES (2, 'Bonny', 'Plessing', 60, 'bplessing1@reddit.com', 'Female', 77194, 5);
INSERT INTO employee (id, first_name, last_name, age, email, gender, salary, customer_id)
VALUES (3, 'Jordon', 'Dilgarno', 34, 'jdilgarno2@kickstarter.com', 'Male', 96680, 9);
INSERT INTO employee (id, first_name, last_name, age, email, gender, salary, customer_id)
VALUES (4, 'Samantha', 'Alldread', 38, 'salldread3@dailymotion.com', 'Female', 61294, 9);
INSERT INTO employee (id, first_name, last_name, age, email, gender, salary, customer_id)
VALUES (5, 'Tillie', 'Weddup', 68, 'tweddup4@blinklist.com', 'Female', 35704, 4);
INSERT INTO employee (id, first_name, last_name, age, email, gender, salary, customer_id)
VALUES (6, 'Tyrone', 'Oldfield', 76, 'toldfield5@stumbleupon.com', 'Male', 28021, 9);
INSERT INTO employee (id, first_name, last_name, age, email, gender, salary, customer_id)
VALUES (7, 'Bondie', 'Quiney', 42, 'bquiney6@ezinearticles.com', 'Male', 92640, 5);
INSERT INTO employee (id, first_name, last_name, age, email, gender, salary, customer_id)
VALUES (8, 'Evvy', 'Peterson', 50, 'epeterson7@sbwire.com', 'Female', 15700, 2);
INSERT INTO employee (id, first_name, last_name, age, email, gender, salary, customer_id)
VALUES (9, 'Norris', 'Hurran', 19, 'nhurran8@amazonaws.com', 'Male', 10790, 6);
INSERT INTO employee (id, first_name, last_name, age, email, gender, salary, customer_id)
VALUES (10, 'Salim', 'Alker', 60, 'salker9@sciencedirect.com', 'Male', 66950, 8);
INSERT INTO employee (id, first_name, last_name, age, email, gender, salary, customer_id)
VALUES (11, 'Cherice', 'Boor', 42, 'cboora@examiner.com', 'Female', 5250, 4);
INSERT INTO employee (id, first_name, last_name, age, email, gender, salary, customer_id)
VALUES (12, 'Lavinie', 'Dear', 43, 'ldearb@jugem.jp', 'Female', 21772, 1);
INSERT INTO employee (id, first_name, last_name, age, email, gender, salary, customer_id)
VALUES (13, 'Sanders', 'Hampshire', 19, 'shampshirec@imgur.com', 'Male', 14386, 7);
INSERT INTO employee (id, first_name, last_name, age, email, gender, salary, customer_id)
VALUES (14, 'Riva', 'Fairebrother', 46, 'rfairebrotherd@1und1.de', 'Female', 93853, 1);
INSERT INTO employee (id, first_name, last_name, age, email, gender, salary, customer_id)
VALUES (15, 'Cristian', 'Dredge', 31, 'cdredgee@google.co.jp', 'Male', 47961, 2);
INSERT INTO employee (id, first_name, last_name, age, email, gender, salary, customer_id)
VALUES (16, 'Lisette', 'Hinge', 49, 'lhingef@mapy.cz', 'Female', 53020, 6);
INSERT INTO employee (id, first_name, last_name, age, email, gender, salary, customer_id)
VALUES (17, 'Kevan', 'Frantzeni', 30, 'kfrantzenig@skype.com', 'Male', 23356, 3);
INSERT INTO employee (id, first_name, last_name, age, email, gender, salary, customer_id)
VALUES (18, 'Giffie', 'Wason', 38, 'gwasonh@blogger.com', 'Male', 31833, 6);
INSERT INTO employee (id, first_name, last_name, age, email, gender, salary, customer_id)
VALUES (19, 'Yves', 'Lagne', 30, 'ylagnei@bluehost.com', 'Male', 64984, 9);
INSERT INTO employee (id, first_name, last_name, age, email, gender, salary, customer_id)
VALUES (20, 'Fabio', 'McKeevers', 66, 'fmckeeversj@photobucket.com', 'Male', 89484, 4);
INSERT INTO employee (id, first_name, last_name, age, email, gender, salary, customer_id)
VALUES (21, 'Whit', 'Huller', 50, 'whullerk@twitpic.com', 'Male', 58066, 4);
INSERT INTO employee (id, first_name, last_name, age, email, gender, salary, customer_id)
VALUES (22, 'Bridgette', 'Watsham', 80, 'bwatshaml@uiuc.edu', 'Female', 40596, 5);
INSERT INTO employee (id, first_name, last_name, age, email, gender, salary, customer_id)
VALUES (23, 'Biron', 'Hurry', 38, 'bhurrym@home.pl', 'Male', 42342, 8);
INSERT INTO employee (id, first_name, last_name, age, email, gender, salary, customer_id)
VALUES (24, 'Berny', 'Fintoph', 67, 'bfintophn@disqus.com', 'Female', 28987, 5);
INSERT INTO employee (id, first_name, last_name, age, email, gender, salary, customer_id)
VALUES (25, 'Nikaniki', 'Starzaker', 27, 'nstarzakero@comcast.net', 'Female', 61094, 4);
INSERT INTO employee (id, first_name, last_name, age, email, gender, salary, customer_id)
VALUES (26, 'Saundra', 'Benfell', 55, 'sbenfellp@mac.com', 'Male', 11354, 3);
INSERT INTO employee (id, first_name, last_name, age, email, gender, salary, customer_id)
VALUES (27, 'Carney', 'O''Corren', 30, 'cocorrenq@wiley.com', 'Male', 88079, 2);
INSERT INTO employee (id, first_name, last_name, age, email, gender, salary, customer_id)
VALUES (28, 'Petey', 'Caselick', 70, 'pcaselickr@dedecms.com', 'Male', 91860, 8);
INSERT INTO employee (id, first_name, last_name, age, email, gender, salary, customer_id)
VALUES (29, 'Carolina', 'Sutterby', 47, 'csutterbys@house.gov', 'Female', 7635, 3);
INSERT INTO employee (id, first_name, last_name, age, email, gender, salary, customer_id)
VALUES (30, 'Taddeusz', 'Dalzell', 76, 'tdalzellt@posterous.com', 'Male', 28601, 7);
INSERT INTO employee (id, first_name, last_name, age, email, gender, salary, customer_id)
VALUES (31, 'Gwenneth', 'Gregoraci', 34, 'ggregoraciu@mit.edu', 'Female', 5214, 5);
INSERT INTO employee (id, first_name, last_name, age, email, gender, salary, customer_id)
VALUES (32, 'Debbi', 'Montague', 57, 'dmontaguev@sitemeter.com', 'Female', 96055, 6);
INSERT INTO employee (id, first_name, last_name, age, email, gender, salary, customer_id)
VALUES (33, 'Ab', 'Urion', 26, 'aurionw@tmall.com', 'Male', 31674, 5);
INSERT INTO employee (id, first_name, last_name, age, email, gender, salary, customer_id)
VALUES (34, 'Zsazsa', 'Flew', 26, 'zflewx@sourceforge.net', 'Female', 46127, 4);
INSERT INTO employee (id, first_name, last_name, age, email, gender, salary, customer_id)
VALUES (35, 'Ayn', 'Applegarth', 52, 'aapplegarthy@tumblr.com', 'Female', 47148, 9);
INSERT INTO employee (id, first_name, last_name, age, email, gender, salary, customer_id)
VALUES (36, 'Reagen', 'Pampling', 77, 'rpamplingz@cyberchimps.com', 'Male', 48410, 6);
INSERT INTO employee (id, first_name, last_name, age, email, gender, salary, customer_id)
VALUES (37, 'Cleopatra', 'Greyes', 63, 'cgreyes10@nifty.com', 'Female', 58597, 2);
INSERT INTO employee (id, first_name, last_name, age, email, gender, salary, customer_id)
VALUES (38, 'Valaria', 'Mabbe', 19, 'vmabbe11@who.int', 'Female', 64959, 7);
INSERT INTO employee (id, first_name, last_name, age, email, gender, salary, customer_id)
VALUES (39, 'Vanessa', 'Clorley', 19, 'vclorley12@networkadvertising.org', 'Female', 58751, 10);
INSERT INTO employee (id, first_name, last_name, age, email, gender, salary, customer_id)
VALUES (40, 'Benedicta', 'Brooks', 76, 'bbrooks13@goo.ne.jp', 'Female', 7508, 1);
INSERT INTO employee (id, first_name, last_name, age, email, gender, salary, customer_id)
VALUES (41, 'Cymbre', 'Nelligan', 39, 'cnelligan14@senate.gov', 'Female', 89920, 10);
INSERT INTO employee (id, first_name, last_name, age, email, gender, salary, customer_id)
VALUES (42, 'Vittorio', 'Delicate', 24, 'vdelicate15@behance.net', 'Male', 2494, 8);
INSERT INTO employee (id, first_name, last_name, age, email, gender, salary, customer_id)
VALUES (43, 'Roscoe', 'Trower', 44, 'rtrower16@biglobe.ne.jp', 'Male', 25211, 2);
INSERT INTO employee (id, first_name, last_name, age, email, gender, salary, customer_id)
VALUES (44, 'Prisca', 'Paley', 35, 'ppaley17@unblog.fr', 'Female', 82522, 3);
INSERT INTO employee (id, first_name, last_name, age, email, gender, salary, customer_id)
VALUES (45, 'Jerrilee', 'Bealton', 49, 'jbealton18@ycombinator.com', 'Female', 24163, 4);
INSERT INTO employee (id, first_name, last_name, age, email, gender, salary, customer_id)
VALUES (46, 'Chad', 'Tuny', 36, 'ctuny19@51.la', 'Male', 78601, 8);
INSERT INTO employee (id, first_name, last_name, age, email, gender, salary, customer_id)
VALUES (47, 'Cloe', 'Giannasi', 66, 'cgiannasi1a@naver.com', 'Female', 31719, 1);
INSERT INTO employee (id, first_name, last_name, age, email, gender, salary, customer_id)
VALUES (48, 'Cassius', 'Margaret', 69, 'cmargaret1b@globo.com', 'Male', 84209, 8);
INSERT INTO employee (id, first_name, last_name, age, email, gender, salary, customer_id)
VALUES (49, 'Chiquita', 'Wrench', 58, 'cwrench1c@vistaprint.com', 'Female', 97332, 4);
INSERT INTO employee (id, first_name, last_name, age, email, gender, salary, customer_id)
VALUES (50, 'Cord', 'Comiskey', 58, 'ccomiskey1d@yellowbook.com', 'Male', 94092, 1);

--QUERIES
--1
SELECT
  first_name,
  last_name,
  salary
FROM employee AS emp
WHERE emp.salary < (SELECT AVG(salary)
                    FROM employee
                      INNER JOIN customer cust ON employee.customer_id = cust.id
                    WHERE name LIKE 'Google')
ORDER BY salary DESC;
--2
SELECT
  first_name,
  last_name
FROM employee
  INNER JOIN customer ON employee.customer_id = customer.id
WHERE customer.country LIKE 'USA' AND salary < (SELECT MAX(salary)
                                                FROM employee
                                                  INNER JOIN customer ON employee.customer_id = customer.id
                                                WHERE customer.name LIKE 'Bosch');
--3
UPDATE employee
SET salary = salary * 1.25
WHERE gender LIKE 'Female' AND salary > (SELECT AVG(salary)
                                         FROM employee
                                         WHERE gender LIKE 'Male') AND salary < 100000;
--4
DELETE FROM employee
WHERE id IN (SELECT id
             FROM employee
             WHERE age > 60);
--5
INSERT INTO employee (first_name, last_name, age, email, gender, salary, customer_id)
VALUES ('Akakiy', 'Kakashvilli', 25, 'Akakashvilli@gmail.com', 'Male', (SELECT AVG(salary)
                                                                        FROM employee
                                                                          INNER JOIN customer
                                                                            ON employee.customer_id = customer.id
                                                                        WHERE customer.name LIKE 'Google'), (SELECT id
                                                                                                             FROM
                                                                                                               customer
                                                                                                             WHERE
                                                                                                               name LIKE
                                                                                                               'Google'));