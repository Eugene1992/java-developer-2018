CREATE TABLE car(
  id SERIAL PRIMARY KEY,
  name VARCHAR(20) NOT NULL ,
  serial_number VARCHAR(20) NOT NULL UNIQUE,
  weight INT NOT NULL
);

ALTER TABLE car
    ADD COLUMN color VARCHAR(30);

ALTER TABLE car
    ALTER COLUMN color SET NOT NULL;

INSERT INTO car (name, serial_number, weight, color)
VALUES ('Lada', 'GO666', 1200, 'brown');
INSERT INTO car (name, serial_number, weight, color)
VALUES ('Audi', 'AO008', 2200, 'white');
INSERT INTO car (name, serial_number, weight, color)
VALUES ('Mercedes', 'SC550', 2000, 'black');
INSERT INTO car (name, serial_number, weight, color)
VALUES ('BMW', 'SE007', 2100, 'black');
INSERT INTO car (name, serial_number, weight, color)
VALUES ('Bugatti', 'CH000', 1500, 'carbon_special');
INSERT INTO car (name, serial_number, weight, color)
VALUES ('Ford', 'MU052', 1700, 'red');
INSERT INTO car (name, serial_number, weight, color)
VALUES ('Chevrolet', 'CE001', 1700, 'yellow');
INSERT INTO car (name, serial_number, weight, color)
VALUES ('Daewoo', 'HL999', 1300, 'silver');
INSERT INTO car (name, serial_number, weight, color)
VALUES ('Lamborghini', 'HU777', 1400, 'green');
INSERT INTO car (name, serial_number, weight, color)
VALUES ('Citroen', 'CC004', 1800, 'laguna_special');

ALTER TABLE car
    ADD COLUMN test VARCHAR(10);
ALTER TABLE car
  ALTER COLUMN test TYPE INT USING test::INTEGER;
ALTER  TABLE car
    RENAME COLUMN test TO price;

UPDATE car SET price = random() * 100000;

SELECT *
FROM car
WHERE price BETWEEN 10000 AND 20000;

SELECT *
FROM car
WHERE weight = 2000;

SELECT *
FROM car
WHERE weight > 1000 AND color LIKE 'green';
