

-- ОДИН ДО ОДНОГО   -- АВТОР ДО НОМЕРА ПАСПОРТА

CREATE table author(
author_id SERIAL PRIMARY KEY ,
name VARCHAR(30)
);

CREATE TABLE passport_details(
ID Serial PRIMARY KEY ,
passport_number VARCHAR (20) ,
author_id INT UNIQUE REFERENCES author(author_id)
);

INSERT INTO author(name) VALUES ('Ivan');
INSERT INTO author(name) VALUES ('Taras');
INSERT INTO author(name) VALUES ('Petro');
INSERT INTO author(name) VALUES ('Oleksiy');
INSERT INTO author(name) VALUES ('Stepan');
INSERT INTO author(name) VALUES ('Anna');
INSERT INTO author(name) VALUES ('Hanna');
INSERT INTO author(name) VALUES ('Obama');

INSERT INTO passport_details (passport_number,author_id) VALUES ('CE45678',1);
INSERT INTO passport_details (passport_number,author_id) VALUES ('CE43456',2);
INSERT INTO passport_details (passport_number,author_id) VALUES ('AD5678',3);
INSERT INTO passport_details (passport_number,author_id) VALUES ('AK34567',4);
INSERT INTO passport_details (passport_number,author_id) VALUES ('KH6789',5);
INSERT INTO passport_details (passport_number,author_id) VALUES ('AK432',6);
INSERT INTO passport_details (passport_number,author_id) VALUES ('TY34567',7);
INSERT INTO passport_details (passport_number,author_id) VALUES ('JJ74937',8);
INSERT INTO passport_details (passport_number,author_id) VALUES ('JJ74937',8);

SELECT author.name , passport_number FROM passport_details
INNER join author ON author.author_id = passport_details.author_id;


-- Один ко многим  -- автор і pets----------------------------------------------------

CREATE TABLE pet(
pet_id SERIAL PRIMARY KEY ,
type VARCHAR (20),
author_id INT REFERENCES author(author_id)
);


SELECT author.name, pet.type
FROM author
INNER JOIN pet ON pet.author_id = author.author_id ORDER BY author.name;


-- Вибірка :  багато до багатьох------------------------------------------------------------------

CREATE table book(
book_id SERIAL PRIMARY KEY,
name  VARCHAR(30)
);

CREATE TABLE author_books(
id SERIAl primary KEY,
author_id Int references author (author_id),
book_id int references book (book_id)
);


INSERT INTO book (name) VALUES ('Godfather');
INSERT INTO book (name) VALUES ('Three mychketeers');
INSERT INTO book (name) VALUES ('Mamma Mia');
INSERT INTO book (name) VALUES ('Java tutoria: 8');
INSERT INTO book (name) VALUES ('Main kampf');
INSERT INTO book (name) VALUES ('SQL Tutorial');




INSERT INTO author_books(author_id,book_id) VALUES (1,1);
INSERT INTO author_books(author_id,book_id) VALUES (1,1);
INSERT INTO author_books(author_id,book_id) VALUES (3,5);
INSERT INTO author_books(author_id,book_id) VALUES (4,1);
INSERT INTO author_books(author_id,book_id) VALUES (4,3);
INSERT INTO author_books(author_id,book_id) VALUES (3,4);
INSERT INTO author_books(author_id,book_id) VALUES (5,5);
INSERT INTO author_books(author_id,book_id) VALUES (5,6);



SELECT author.name AS name, book.name AS book
FROM author_books
INNER join author ON author_books.author_id=author.author_id
INNER JOIN book ON  book.book_id =author_books.book_id;

Alter table author ADD COLUMN age Int;

update author SET  age = random() * 85; --adding age column


--Select author with passport number and age bigger that 50

SELECT author.name, passport_details.passport_number from author
INNER JOIN passport_details ON passport_details.author_id = author.author_id WHERE passport_number Like 'CE%';


SELECT * from author_books
INNER JOIN author On author_books.author_id = author.author_id
INNER JOIN book On book.book_id = author_books.book_id
inner join pet On pet.author_id = author.author_id
INNER join passport_details on passport_details.author_id = author.author_id
WHERE author.age > 45
AND pet.type  In('Dog', 'Cat')
AND passport_details.passport_number Like 'CE%';
