CREATE TABLE product (
  product_id  SERIAL PRIMARY KEY,
  description VARCHAR(64)      NOT NULL,
  price       DOUBLE PRECISION NOT NULL,
  quantity    VARCHAR(64),
  active      BOOLEAN DEFAULT TRUE,
  category_id INT REFERENCES category (category_id),
  order_id    INT REFERENCES "order" (order_id)
);

CREATE TABLE comment (
  comment_id SERIAL PRIMARY KEY,
  title      VARCHAR(64) NOT NULL,
  text       VARCHAR(64),
  is_deleted BOOLEAN DEFAULT FALSE,
  order_id   INT REFERENCES "order" (order_id)
);

CREATE TABLE address (
  address_id SERIAL PRIMARY KEY,
  city       VARCHAR(64) NOT NULL,
  country    VARCHAR(64) NOT NULL,
  post_code  INT         NOT NULL
);

CREATE TABLE tag (
  tag_id  SERIAL PRIMARY KEY,
  name    VARCHAR(64) NOT NULL UNIQUE,
  user_id INT REFERENCES "user" (user_id)
);

CREATE TABLE category (
  category_id  SERIAL PRIMARY KEY,
  name         VARCHAR(64) NOT NULL,
  description  VARCHAR(64) NOT NULL,
  sub_category VARCHAR(64)
);

CREATE TABLE "order" (
  order_id      SERIAL PRIMARY KEY,
  serial_number INT         NOT NULL UNIQUE,
  order_status  VARCHAR(64) NOT NULL,
  address_id    INT REFERENCES address (address_id)
);

CREATE TABLE "user" (
  user_id        SERIAL PRIMARY KEY,
  first_name     VARCHAR(64) NOT NULL,
  last_name      VARCHAR(64) NOT NULL,
  username       VARCHAR(64) UNIQUE,
  password       VARCHAR(64) NOT NULL,
  role           VARCHAR(64),
  user_detail_id INT UNIQUE REFERENCES user_detail (user_datail_id)
);

CREATE TABLE user_detail (
  user_datail_id SERIAL PRIMARY KEY,
  phone          VARCHAR(64) NOT NULL UNIQUE,
  email          VARCHAR(64) NOT NULL UNIQUE,
  age            INT,
  gender         VARCHAR(64)
);

INSERT INTO user_detail VALUES (1, '380123456789', 'test1@mail.com', 45, 'Male');
INSERT INTO user_detail VALUES (2, '380123456788', 'test2@mail.com', 31, 'Female');
INSERT INTO user_detail VALUES (3, '380123456787', 'test3@mail.com', 28, 'Male');
INSERT INTO user_detail VALUES (4, '380123456786', 'test4@mail.com', 14, 'Female');
INSERT INTO user_detail VALUES (5, '380123456785', 'test5@mail.com', 67, 'Male');

INSERT INTO "user" VALUES (1, 'ALEX', 'Alexsov', 'lex', 'qwerty1', 'user', 5);
INSERT INTO "user" VALUES (2, 'Rachel', 'Rachelsov', 'rach', 'qwerty2', 'Admin', 4);
INSERT INTO "user" VALUES (3, 'JOHN', 'Jonsov', 'jo', 'qwerty3', 'tester', 3);
INSERT INTO "user" VALUES (4, 'JANE', 'Janesov', 'jan', 'qwerty4', 'dev', 2);
INSERT INTO "user" VALUES (5, 'MIKE', 'Mikesov', 'mike', 'qwerty5', 'user', 1);

INSERT INTO category VALUES (1, 'TECH', 'Tech category of product', 'sub_tech');
INSERT INTO category VALUES (2, 'FOOD', 'Food category of product', 'sub_food');
INSERT INTO category VALUES (3, 'CHEMICAl', 'Chemical category of product', 'sub_chemical');
INSERT INTO category VALUES (4, 'CAR', 'Car category of product', 'sub_car');
INSERT INTO category VALUES (5, 'TEST', 'Test category of product', 'sub_test');

INSERT INTO tag VALUES (1, 'first_tag', 1);
INSERT INTO tag VALUES (2, 'second_tag', 1);
INSERT INTO tag VALUES (3, 'third_tag', 2);
INSERT INTO tag VALUES (4, 'fourth_tag', 3);
INSERT INTO tag VALUES (5, 'fifth_tag', 4);

INSERT INTO address VALUES (1, 'Kyiv', 'Ukraine', '02095');
INSERT INTO address VALUES (2, 'Odessa', 'Ukraine', '03080');
INSERT INTO address VALUES (3, 'Donetsk', 'Ukraine', '04020');
INSERT INTO address VALUES (4, 'Kharkiv', 'Ukraine', '05060');
INSERT INTO address VALUES (5, 'Chernigiv', 'Ukraine', '07070');

INSERT INTO "order" VALUES (1, 11111, 'in progress', 5);
INSERT INTO "order" VALUES (2, 212321, 'closed', 1);
INSERT INTO "order" VALUES (3, 1234154, 'closed', 3);
INSERT INTO "order" VALUES (4, 45763457, 'denied', 2);
INSERT INTO "order" VALUES (5, 12465, 'new', 4);

INSERT INTO comment VALUES (1,'title1','sdgsdgsdgsd',TRUE,4);
INSERT INTO comment VALUES (2,'title2','cvssd',FALSE,2);
INSERT INTO comment VALUES (3,'title3','fdhsdfh',FALSE,3);
INSERT INTO comment VALUES (4,'title4','dfhjsdgjs',TRUE,1);
INSERT INTO comment VALUES (5,'title5','adfhsdfh',FALSE ,5);

INSERT INTO product VALUES (1,'description1',10000,'good',TRUE ,2,5);
INSERT INTO product VALUES (2,'description2',20000,'bad',TRUE ,1,4);
INSERT INTO product VALUES (3,'description3',30000,'soso',TRUE ,3,3);
INSERT INTO product VALUES (4,'description4',40000,'good',TRUE ,5,2);
INSERT INTO product VALUES (5,'description5',50000,'bad',TRUE ,4,1);