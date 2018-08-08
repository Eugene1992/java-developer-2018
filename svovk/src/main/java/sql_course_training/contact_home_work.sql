--Привет, сорри, но чето скайп не отправил сообщение с домашкой( Вдруг кто успеет поколупать ее, то вот:
--1) Создать таблицу contact

CREATE TABLE contact();

--2) Удалить таблицу contact

DROP TABLE contact;

--3) Создать таблицу contact с атрибутами first_name(VARCHAR, NON_NULL),
--last_name(TEXT), birthday(DATE), phone(INT), city(VARCHAR), country(VARCHAR)

CREATE TABLE contact(
contact_id  int PRIMARY KEY,
first_name VARCHAR(20) NOT NULL ,
last_name TEXT,
birthday DATE,
phone INT,
city VARCHAR,
coutry  VARCHAR (30)
);

--4) Изменить тип атрибута last_name с TEXT на VARCHAR

ALTER TABLE contact ALTER last_name TYPE VARCHAR(20) USING (last_name :: varchar );

--5) Добавить ограничение NON_NULL в атрибут last_name

ALTER TABLE contact ALTER COLUMN last_name Set NOT NULL ;

--6) Заполнить таблицу contact 20 записями(женские имена должны заканчиваться на букву 'а')

INSERT INTO contact VALUES (1,'Hanna','Ivanova','12-22-12',0666666666,'Kiev','Ukraine');
INSERT INTO contact VALUES (2,'Anna','Ivanova','12-12-90',0777777777,'Lviv','Ukraine');
INSERT INTO contact VALUES (3,'Ivan','Mihailov','12-12-80',0978759446 ,'Krim','Ukraine');
INSERT INTO contact VALUES (4,'Yaroslav','Ivanov','12-12-80',0978759446 ,'Krim','Ukraine');
INSERT INTO contact VALUES (5,'Stepan','Slon','12-12-80',0978759446 ,'Krim','Ukraine');
INSERT INTO contact VALUES (6,'Maria','Zyraff','12-16-50',0978759446 ,'Krim','Ukraine');
INSERT INTO contact VALUES (7,'Misha','Petrov','11-15-80',0978759446 ,'Krim','Ukraine');
INSERT INTO contact VALUES (8,'Evgeniy','Petrov','12-12-80',0978759446 ,'Krim','Ukraine');
INSERT INTO contact VALUES (9,'Taras','Pavloskiy','12-12-80',0978759446 ,'Krim','Ukraine');
INSERT INTO contact VALUES (10,'Pavlo','Petrov','12-22-80',0978759446 ,'Krim','Ukraine');
INSERT INTO contact VALUES (11,'Maria','Petrov','12-12-80',0978759446 ,'Krim','Ukraine');
INSERT INTO contact VALUES (12,'Volodumyr','Petrov','12-12-80',0978759446 ,'Krim','Ukraine');
INSERT INTO contact VALUES (13,'Petro','ukrainec','12-12-80',0978759446 ,'Krim','Ukraine');
INSERT INTO contact VALUES (14,'Evgeniy','Petrov','12-12-80',0978759446 ,'Krim','Ukraine');
INSERT INTO contact VALUES (15,'Petro','Petrov','12-12-80',0978759446 ,'Krim','Ukraine');
INSERT INTO contact VALUES (16,'Volodumyr','Zaec','12-12-80',0978759446 ,'Krim','Ukraine');
INSERT INTO contact VALUES (17,'Maria','Vovk','12-12-80',0978759446 ,'Krim','Ukraine');
INSERT INTO contact VALUES (18,'Evgeniy','Medvid','12-12-80',0978759446 ,'Krim','Ukraine');
INSERT INTO contact VALUES (19,'Petro','Lev','12-12-80',0978759446 ,'Krim','Ukraine');
INSERT INTO contact VALUES (20,'Volodumyr','krokodyl','12-12-80',0978759446 ,'Krim','Ukraine');

--ПИТАННЯ - ЯК ВСТВВИТИ РАНДОМНУ ДАТУ І РАНДОМНЕ ЧИСЛО МІЖ 10 і 11 ЗНАЧЕННЯМ


--7) Добавить в таблицу contact атрибут gender(VARCHAR)

ALTER TABLE contact ADD COLUMN gender VARCHAR(10);

--8) Изменить таблицу contact, заполнив атрибут gender значениями male/female по условию -
--.если first_name заканчивается на букву 'а' - female, все другие - male

UPDATE  contact
SET gender = 'female'
WHERE first_name LIKE '%a' ;

UPDATE  contact
SET gender = 'male'
WHERE first_name Not LIKE '%a';

--9) Добавить атрибут rating (INT) с ограничением - только положительные значения

ALTER TABLE contact ADD COLUMN rating Int CHECK (rating >0); --

UPDATE contact SET rating = random()*100;

SELECT * FROM contact  ORDER BY contact.rating ASC;

--Возможно добавлю пунктов еще)

DROP TABLE contact;