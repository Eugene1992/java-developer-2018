DROP TABLE car;

CREATE TABLE car
(
    id SERIAL PRIMARY KEY,
    name VARCHAR(64) NOT NULL,
    serial_number VARCHAR(64) NOT NULL UNIQUE,
    weight INT
);

ALTER TABLE car ADD COLUMN color VARCHAR(64);

ALTER TABLE car ALTER COLUMN color SET NOT NULL;

INSERT INTO car VALUES (1,'BMV','M3',1,'white');
INSERT INTO car VALUES (2,'Renault','Logan',2,'red');
INSERT INTO car VALUES (3,'Suzuki','Suzuki model',3,'yellow');
INSERT INTO car VALUES (4,'Seat','Seat model',2,'black');
INSERT INTO car VALUES (5,'Feat','Feat model',4,'blue');
INSERT INTO car VALUES (6,'Mazda','Mazda model',2,'pink');
INSERT INTO car VALUES (7,'Toyota','Corolla',6,'green');
INSERT INTO car VALUES (8,'Mitsubishi','Lancer',2,'orange');
INSERT INTO car VALUES (9,'Opel','Opel model',7,'purple');
INSERT INTO car VALUES (10,'Jeep','Cheroki',2,'gray');

ALTER TABLE car ADD COLUMN test VARCHAR(64);

ALTER TABLE car RENAME COLUMN test TO price;

ALTER TABLE car ALTER COLUMN price TYPE INT USING price::integer;

UPDATE car SET price = random() * 20000;

SELECT * FROM car;

SELECT * FROM car WHERE price BETWEEN 10000 AND 20000;

SELECT * FROM car WHERE weight = 2;

SELECT * FROM car WHERE color LIKE 'green' AND price > 1000;