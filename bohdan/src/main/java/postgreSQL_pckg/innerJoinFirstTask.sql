CREATE TABLE passport (
  passport_id INT UNIQUE PRIMARY KEY,
  serie       VARCHAR(2)
);

CREATE TABLE pet (
  pet_id SERIAL PRIMARY KEY,
  name   VARCHAR(2)
);

CREATE TABLE book (
  book_id SERIAL PRIMARY KEY,
  genre   VARCHAR(30)
);

CREATE TABLE author (
  author_id   SERIAL PRIMARY KEY,
  name        VARCHAR(30),
  age         INT,
  passport_id INT UNIQUE REFERENCES passport (passport_id),
  pet_id      INT REFERENCES pet (pet_id)
);

CREATE TABLE book_author (
  book_author_id SERIAL PRIMARY KEY
);

ALTER TABLE book_author
  ADD COLUMN book_id INT;
ALTER TABLE book_author
  ADD CONSTRAINT book_id FOREIGN KEY (book_id) REFERENCES book (book_id);

ALTER TABLE book_author
  ADD COLUMN author_id INT;
ALTER TABLE book_author
  ADD CONSTRAINT author_id FOREIGN KEY (author_id) REFERENCES author (author_id);

ALTER TABLE pet ALTER COLUMN name TYPE VARCHAR(20);
ALTER TABLE book ADD COLUMN name VARCHAR(30);

INSERT INTO passport VALUES (123456, 'ME');
INSERT INTO passport VALUES (123455, 'ME');
INSERT INTO passport VALUES (123454, 'TT');
INSERT INTO passport VALUES (123453, 'KN');
INSERT INTO passport VALUES (123452, 'TT');
INSERT INTO passport VALUES (123451, 'ME');

INSERT INTO pet (name) VALUES ('cat');
INSERT INTO pet (name) VALUES ('dog');
INSERT INTO pet (name) VALUES ('parrot');
INSERT INTO pet (name) VALUES ('fish');

INSERT INTO author (name, age, passport_id, pet_id) VALUES ('John', 32, 123456, 1);
INSERT INTO author (name, age, passport_id, pet_id) VALUES ('Jack', 30, 123454, 2);
INSERT INTO author (name, age, passport_id, pet_id) VALUES ('Sarah', 29, 123455, 1);
INSERT INTO author (name, age, passport_id, pet_id) VALUES ('Hodor', 35, 123451, 2);
INSERT INTO author (name, age, passport_id, pet_id) VALUES ('Mark', 25, 123453, 3);
INSERT INTO author (name, age, passport_id, pet_id) VALUES ('Ali', 40, 123452, 4);

INSERT INTO book (name, genre) VALUES ('Harry Sweat', 'fantasy');
INSERT INTO book (name, genre) VALUES ('Krampus', 'horror');
INSERT INTO book (name, genre) VALUES ('Blue mood', 'novel');

INSERT INTO book_author (book_id, author_id) VALUES (1, 1);
INSERT INTO book_author (book_id, author_id) VALUES (1, 2);
INSERT INTO book_author (book_id, author_id) VALUES (2, 3);
INSERT INTO book_author (book_id, author_id) VALUES (2, 5);
INSERT INTO book_author (book_id, author_id) VALUES (2, 6);
INSERT INTO book_author (book_id, author_id) VALUES (3, 4);

SELECT a.name, a.age, p.serie, pet.name, b.genre
FROM book_author AS ba
INNER JOIN book AS b ON ba.book_id = b.book_id
INNER JOIN author AS a ON ba.author_id = a.author_id
INNER JOIN passport AS p ON a.passport_id = p.passport_id
INNER JOIN pet ON a.pet_id = pet.pet_id
WHERE p.serie LIKE 'ME' AND a.age > 31 AND pet.name IN ('dog', 'cat') AND b.genre IN ('fantasy', 'novel')



