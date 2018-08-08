create table customer (
customer_id INT PRIMARY KEY ,
customer_name VARCHAR (50),
customer_country VARCHAR (50)
);

create table employee (
id INT ,
first_name VARCHAR (50),
last_name VARCHAR (50),
age INT,
email VARCHAR (50),
gender VARCHAR (50),
salary INT,
customer_id INT REFERENCES customer(customer_id)
);


insert into customer (customer_id, customer_name, customer_country) values (1, 'Rolex', 'Switzerland');
insert into customer (customer_id, customer_name, customer_country) values (2, 'Lego', 'Denmark');
insert into customer (customer_id, customer_name, customer_country) values (3, 'Google', 'USA');
insert into customer (customer_id, customer_name, customer_country) values (4, 'Canon', 'Japan');
insert into customer (customer_id, customer_name, customer_country) values (5, 'Bosch', 'Germany');
insert into customer (customer_id, customer_name, customer_country) values (6, 'Sony', 'Japan');
insert into customer (customer_id, customer_name, customer_country) values (7, 'Intel', 'USA');
insert into customer (customer_id, customer_name, customer_country) values (8, 'Rolls-Royce', 'UK');
insert into customer (customer_id, customer_name, customer_country) values (9, 'Adidas', 'Germany');
insert into customer (customer_id, customer_name, customer_country) values (10, 'Christian Dior', 'France');


insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (1, 'Kendal', 'O''Murtagh', 62, 'komurtagh0@walmart.com', 'Male', 18338, 8);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (2, 'Bonny', 'Plessing', 60, 'bplessing1@reddit.com', 'Female', 77194, 5);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (3, 'Jordon', 'Dilgarno', 34, 'jdilgarno2@kickstarter.com', 'Male', 96680, 9);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (4, 'Samantha', 'Alldread', 38, 'salldread3@dailymotion.com', 'Female', 61294, 9);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (5, 'Tillie', 'Weddup', 68, 'tweddup4@blinklist.com', 'Female', 35704, 4);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (6, 'Tyrone', 'Oldfield', 76, 'toldfield5@stumbleupon.com', 'Male', 28021, 9);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (7, 'Bondie', 'Quiney', 42, 'bquiney6@ezinearticles.com', 'Male', 92640, 5);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (8, 'Evvy', 'Peterson', 50, 'epeterson7@sbwire.com', 'Female', 15700, 2);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (9, 'Norris', 'Hurran', 19, 'nhurran8@amazonaws.com', 'Male', 10790, 6);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (10, 'Salim', 'Alker', 60, 'salker9@sciencedirect.com', 'Male', 66950, 8);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (11, 'Cherice', 'Boor', 42, 'cboora@examiner.com', 'Female', 5250, 4);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (12, 'Lavinie', 'Dear', 43, 'ldearb@jugem.jp', 'Female', 21772, 1);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (13, 'Sanders', 'Hampshire', 19, 'shampshirec@imgur.com', 'Male', 14386, 7);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (14, 'Riva', 'Fairebrother', 46, 'rfairebrotherd@1und1.de', 'Female', 93853, 1);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (15, 'Cristian', 'Dredge', 31, 'cdredgee@google.co.jp', 'Male', 47961, 2);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (16, 'Lisette', 'Hinge', 49, 'lhingef@mapy.cz', 'Female', 53020, 6);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (17, 'Kevan', 'Frantzeni', 30, 'kfrantzenig@skype.com', 'Male', 23356, 3);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (18, 'Giffie', 'Wason', 38, 'gwasonh@blogger.com', 'Male', 31833, 6);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (19, 'Yves', 'Lagne', 30, 'ylagnei@bluehost.com', 'Male', 64984, 9);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (20, 'Fabio', 'McKeevers', 66, 'fmckeeversj@photobucket.com', 'Male', 89484, 4);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (21, 'Whit', 'Huller', 50, 'whullerk@twitpic.com', 'Male', 58066, 4);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (22, 'Bridgette', 'Watsham', 80, 'bwatshaml@uiuc.edu', 'Female', 40596, 5);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (23, 'Biron', 'Hurry', 38, 'bhurrym@home.pl', 'Male', 42342, 8);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (24, 'Berny', 'Fintoph', 67, 'bfintophn@disqus.com', 'Female', 28987, 5);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (25, 'Nikaniki', 'Starzaker', 27, 'nstarzakero@comcast.net', 'Female', 61094, 4);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (26, 'Saundra', 'Benfell', 55, 'sbenfellp@mac.com', 'Male', 11354, 3);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (27, 'Carney', 'O''Corren', 30, 'cocorrenq@wiley.com', 'Male', 88079, 2);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (28, 'Petey', 'Caselick', 70, 'pcaselickr@dedecms.com', 'Male', 91860, 8);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (29, 'Carolina', 'Sutterby', 47, 'csutterbys@house.gov', 'Female', 7635, 3);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (30, 'Taddeusz', 'Dalzell', 76, 'tdalzellt@posterous.com', 'Male', 28601, 7);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (31, 'Gwenneth', 'Gregoraci', 34, 'ggregoraciu@mit.edu', 'Female', 5214, 5);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (32, 'Debbi', 'Montague', 57, 'dmontaguev@sitemeter.com', 'Female', 96055, 6);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (33, 'Ab', 'Urion', 26, 'aurionw@tmall.com', 'Male', 31674, 5);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (34, 'Zsazsa', 'Flew', 26, 'zflewx@sourceforge.net', 'Female', 46127, 4);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (35, 'Ayn', 'Applegarth', 52, 'aapplegarthy@tumblr.com', 'Female', 47148, 9);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (36, 'Reagen', 'Pampling', 77, 'rpamplingz@cyberchimps.com', 'Male', 48410, 6);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (37, 'Cleopatra', 'Greyes', 63, 'cgreyes10@nifty.com', 'Female', 58597, 2);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (38, 'Valaria', 'Mabbe', 19, 'vmabbe11@who.int', 'Female', 64959, 7);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (39, 'Vanessa', 'Clorley', 19, 'vclorley12@networkadvertising.org', 'Female', 58751, 10);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (40, 'Benedicta', 'Brooks', 76, 'bbrooks13@goo.ne.jp', 'Female', 7508, 1);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (41, 'Cymbre', 'Nelligan', 39, 'cnelligan14@senate.gov', 'Female', 89920, 10);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (42, 'Vittorio', 'Delicate', 24, 'vdelicate15@behance.net', 'Male', 2494, 8);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (43, 'Roscoe', 'Trower', 44, 'rtrower16@biglobe.ne.jp', 'Male', 25211, 2);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (44, 'Prisca', 'Paley', 35, 'ppaley17@unblog.fr', 'Female', 82522, 3);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (45, 'Jerrilee', 'Bealton', 49, 'jbealton18@ycombinator.com', 'Female', 24163, 4);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (46, 'Chad', 'Tuny', 36, 'ctuny19@51.la', 'Male', 78601, 8);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (47, 'Cloe', 'Giannasi', 66, 'cgiannasi1a@naver.com', 'Female', 31719, 1);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (48, 'Cassius', 'Margaret', 69, 'cmargaret1b@globo.com', 'Male', 84209, 8);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (49, 'Chiquita', 'Wrench', 58, 'cwrench1c@vistaprint.com', 'Female', 97332, 4);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (50, 'Cord', 'Comiskey', 58, 'ccomiskey1d@yellowbook.com', 'Male', 94092, 1);



-- 1) Вывести на экран имя, фамилию, зарплату сотрудников чья зарплата ниже чем
-- средняя зарплата сотрудников компании Google,
-- выборку упорядочить по убывающей зарплате

SELECT first_name,last_name,salary from employee
where salary < (SELECT AVG(salary)
    from employee join customer ON customer.customer_id = employee.customer_id
WHERE customer.customer_name = 'Google')
 ORDER BY salary desc;


-- 2) Вывести на экран имя, фамилию сотрудников компаний из USA чья зарплата
-- меньше максимальной зарплаты сотрудника компании BOSCH,
-- выборку упорядочить по возрастающей зарплате


SELECT first_name,last_name, customer.customer_country from employee
join customer On customer.customer_id = employee.customer_id
WHERE salary < (SELECT max("employee".salary) from employee join customer On employee.customer_id = customer.customer_id
where customer.customer_name ='Bosch')
 And customer.customer_country = 'USA' ORDER by employee.salary ASC ;

--  3) Увеличить зарплату на 25% сотрудницам чья зарплата меньше средней зарплаты мужчин и больше 10000

UPDATE employee
SET salary = salary * 1.25
where gender = 'Female 'AND salary > 10000 And salary <  (SELECT avg(salary)  FROM employee where gender = 'Male')


--  4) Подсчитать количество сотрудников старше 60 лет. Удалить всех сострудников старше 60 лет используя IN и подзапрос

SELECT count(age) from employee WHERE age > 60

SELECT * from employee where age IN (SELECT age FROM employee where employee.age > 60);

-- Добавить нового сотрудника в компанию Google со средней зарплатой по компании Google


INSERT into employee(id, first_name, last_name, age, email, gender, salary, customer_id)
VALUES (100,'Sergey', 'Brin',50,'brin@google.com','Male',
(SELECT avg(salary) from employee join customer on customer.customer_id = employee.customer_id
where customer.customer_name  = 'Google'), (select customer_id from customer where customer_name = 'Google'))


