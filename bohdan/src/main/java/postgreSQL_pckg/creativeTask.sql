CREATE TABLE address (
  id        SERIAL PRIMARY KEY,
  city      VARCHAR(30) NOT NULL,
  country   VARCHAR(30) NOT NULL,
  post_code INT CHECK (post_code > 0)
);

CREATE TABLE user_detail (
  id     SERIAL PRIMARY KEY,
  phone  VARCHAR(15),
  email  VARCHAR(50) NOT NULL,
  age    INT CHECK (age > 0),
  gender VARCHAR(10)
);

CREATE TABLE "user" (
  id         SERIAL PRIMARY KEY,
  first_name VARCHAR(30),
  last_name  VARCHAR(50),
  username   VARCHAR(20) NOT NULL,
  password   VARCHAR(20) NOT NULL,
  role       VARCHAR(30) NOT NULL,
  detail_id  INT REFERENCES user_detail UNIQUE,
  address_id INT REFERENCES address
);

CREATE TABLE category (
  id           SERIAL PRIMARY KEY,
  name         VARCHAR(30) NOT NULL,
  decription   TEXT,
  sub_category VARCHAR(30)
);

CREATE TABLE product (
  id          SERIAL PRIMARY KEY,
  description TEXT,
  price       INT     NOT NULL CHECK (price >= 0),
  quantity    INT     NOT NULL,
  active      BOOLEAN NOT NULL,
  category_id INT REFERENCES category
);

CREATE TABLE comment (
  id         SERIAL PRIMARY KEY,
  title      VARCHAR(20) NOT NULL,
  text       TEXT        NOT NULL,
  is_deleted BOOLEAN     NOT NULL
);

CREATE TABLE "order" (
  id            SERIAL PRIMARY KEY,
  serial_number VARCHAR(30) NOT NULL,
  order_status  VARCHAR(20) NOT NULL
);

CREATE TABLE tag (
  id   SERIAL PRIMARY KEY,
  name VARCHAR(30) NOT NULL
);

CREATE TABLE order_product (
  id         SERIAL PRIMARY KEY,
  order_id   INT REFERENCES "order" NOT NULL,
  product_id INT REFERENCES product NOT NULL
);

CREATE TABLE user_order (
  id       SERIAL PRIMARY KEY,
  user_id  INT REFERENCES "user"  NOT NULL,
  order_id INT REFERENCES "order" NOT NULL
);

CREATE TABLE product_comment (
  id         SERIAL PRIMARY KEY,
  product_id INT REFERENCES product NOT NULL,
  comment_id INT REFERENCES comment NOT NULL
);

CREATE TABLE product_tag (
  id         SERIAL PRIMARY KEY,
  product_id INT REFERENCES product NOT NULL,
  tag_id     INT REFERENCES tag
)