create table "user" (
id serial primary key,
first_name VARCHAR (100),
last_name VARCHAR (100),
username varchar(100),
password varchar (100),
role VARCHAR (100)
);

INSERT into "user"(first_name,last_name,username,password,role) values ('John','Johnson','Johny','password1','Student');
INSERT into "user"(first_name,last_name,username,password,role) values ('Jack','Jackson','Jacky','password2','Student1');
INSERT into "user"(first_name,last_name,username,password,role) values ('Mike','Tayson','Miky','password3','Student2');
INSERT into "user"(first_name,last_name,username,password,role) values ('Barack','Obama','Bama','password4','Student3');
INSERT into "user"(first_name,last_name,username,password,role) values ('Donald','Trump','Idiot','password5','Student4');



create table user_detail(
id Serial PRIMARY Key,
Phone INT ,
email VARCHAR (100),
age INT ,
gender VARCHAR (100),
user_id Int REFERENCES "user" (id)
)


INSERT into user_detail (Phone,email,age,gender,user_id) VALUES  (0971111111,'Johnson@johnson.com',26 ,'Female',1);
INSERT into user_detail (Phone,email,age,gender,user_id) VALUES  (0972222222,'Jack@jackson.com',34 ,'male',2);
INSERT into user_detail (Phone,email,age,gender,user_id) VALUES  (0973333333,'mike@mike.com',45 ,'male',3);
INSERT into user_detail (Phone,email,age,gender,user_id) VALUES  (0974444444,'barack@barack.com',54 ,'Female',4);
INSERT into user_detail (Phone,email,age,gender,user_id) VALUES  (0975555555,'trump@trump.com',65 ,'male',5);


SELECT * from "user"
INNER join user_detail u on "user".id = u.user_id



create table address(
id serial PRIMARY key ,
city VARCHAR (100),
country VARCHAR (100),
post_code VARCHAR(100),
user_detail_id_address  references user_detail (id)
)


ALTER table address ADD CONSTRAINT product_fkey FOREIGN KEY (product_fk)  REFERENCES address (id);

insert into address(city,country,post_code,user_detail_id) VALUES ('kyiv', 'ukraine', '34567',1);
insert into address(city,country,post_code,user_detail_id) VALUES ('London', 'UK', '22222',2);
insert into address(city,country,post_code,user_detail_id) VALUES ('NYC', 'USA', '33333',3);
insert into address(city,country,post_code,user_detail_id) VALUES ('LA', 'USA', '44444',4);
insert into address(city,country,post_code,user_detail_id) VALUES ('Tronto', 'CAnada', '55555',5);


create table category (
 id serial PRIMARY KEY ,
 name VARCHAR (100),
 description TEXT,
 sub_category INt REFERENCES  category (id)
);

INSERT into category(name, description) VALUES ('food', 'asdfg');
INSERT into category(name, description) VALUES ('alcohol', 'aaaaa');
INSERT into category(name, description) VALUES ('meat', 'bbbbb');
INSERT into category(name, description) VALUES ('milk', 'ccccc');
INSERT into category(name, description) VALUES ('bread', 'rrrrr');

create table product(
id serial primary key,
name varchar (100),
description varchar (100),
price int,
quantity int,
active BOOLEAN
);

ALTER table product ADD COLUMN category_id INT ;
ALTER table product ADD CONSTRAINT category_id FOREIGN KEY (category_id) REFERENCES category (id);



INSERT into product (name,description,price,quantity,active) values ('product1', 'soda', 20, 20, true);
INSERT into product (name,description,price,quantity,active) values ('product2', 'tv', 20, 30, false);
INSERT into product (name,description,price,quantity,active) values ('product3', 'laptop', 20, 40, true);
INSERT into product (name,description,price,quantity,active) values ('product4', 'soda', 20, 50, true);
INSERT into product (name,description,price,quantity,active) values ('product4', 'book', 20, 60, false);


Create table "order" (
serial_number SERIAL PRIMARY Key,
order_status BOOLEAN
);


insert into "order" (order_status) values (true );
insert into "order" (order_status) values (false );
insert into "order" (order_status) values (true );
insert into "order" (order_status) values (false );
insert into "order" (order_status) values (true );

Alter table "order" ADD column tag_id INt ;
Alter table "order" ADD column comment_id INt ;
Alter table "order" ADD constraint  tag_id FOREIGN KEY (tag_id) references tag(id);
Alter table "order" ADD constraint  comment_id FOREIGN KEY (comment_id) references comment(id);

Alter table "order" ADD column product_id INt ;
Alter table "order" ADD constraint  product_id FOREIGN KEY (product_id) references product(id);


 create table tag (
  id  serial primary key,
  name varchar (100)
);

insert into tag (name) values ('discounted');
insert into tag (name) values ('not discounted');
insert into tag (name) values ('discounted');
insert into tag (name) values ('not discounted');
insert into tag (name) values ('discounted');

CREATE table comment(
id Serial Primary key,
title VARCHAR (100),
text TEXT,
is_deleted BOOLEAN
);

INSERT INTO comment(title, text, is_deleted) values ('urgent','to be dilivered',false );
INSERT INTO comment(title, text, is_deleted) values ('done','dilivered',true );
INSERT INTO comment(title, text, is_deleted) values ('middle','to be dilivered',false );
INSERT INTO comment(title, text, is_deleted) values ('done','dilivered',true );
INSERT INTO comment(title, text, is_deleted) values ('not urgent','to be dilivered',false );

Create table user_orders(
user_id Int REFERENCES "user"(id),
order_id Int REFERENCES "order"(serial_number)
);

