-- 1) Create table car -> name(NON_NULL), serial_number(NON_NULL, UNIQUE), weight(NON_NULL)

CREATE TABLE car (
id SERIAL PRIMARY KEY , -- ПИТАННЯ : ТУТ НЕ ПОТРІБЕН КОНСТРЕІНТ NOT TULL????????
name VARCHAR(30) NoT  NULL,
weight INT NOT NULL
);

-- 2) Add column color

ALTER TABLE car aDD COLUMN color VARCHAR(30);

-- 3) Update color with NON_NULL constraint

ALTER TABLE car ALTER color  SET Not NULL;

-- 4) Insert 10 cars

INSERT INTo car VALUES (1,'bmw',random()*2000,'blue');
INSERT INTo car VALUES (2,'audi',random()*2000,'white');
INSERT INTo car VALUES (3,'bmw',random()*2000,'yellow');
INSERT INTo car VALUES (4,'lada',random()*2000,'black');
INSERT INTo car VALUES (5,'lanos',random()*2000,'brown');
INSERT INTo car VALUES (6,'chevrolet',random()*2000,'blue');
INSERT INTo car VALUES (7,'masda',random()*2000,'blue');
INSERT INTo car VALUES (8,'mercedes',random()*2000,'brown');
INSERT INTo car VALUES (9,'bmw',random()*2000,'white');
INSERT INTo car VALUES (10,'ZAZ',random()*2000,'black');


-- 5) Add column test

ALTER TABLE car ADD COLUMN test INT ;

-- 6) Change datatype of test column to INT

ALTER TABLE car ALTER test TYPE VARCHAR  USING (test:: varchar) ;

-- 7) Change name of test column to price

ALTER TABLE  car RENAME COLUMN test TO price;

-- 8) Update price of cars with random price

ALTER TABLE car ALTER price TYPE INT  USING (price:: INT );

UPDATE  car SET price = random()* 5000 ;


-- 9) Select cars with price more than 10000 and less than 20000

SELECT * FROM car WHERE price between 500 AND 800;

-- 10) Select cars with weight 2000

SELECT *FROM car WHERE weight > 1500;

-- 11) Select cars with Green color and weight more than 1000

SELECT *FROM car WHERE car.color = 'blue' and weight >1000;

DROP TABLE car;