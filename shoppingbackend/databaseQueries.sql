CREATE TABLE category (
	
	id IDENTITY,
	name VARCHAR(50),
	description VARCHAR(255),
	image_url VARCHAR(50),
	is_active BOOLEAN,
	
	CONSTRAINT pk_category_id PRIMARY KEY (id)

);

insert into category (name, description, image_url, is_active) values ('Laptop', 'Description for Laptop Category', 'cat_1.png', true);

insert into category (name, description, image_url, is_active) values ('Television', 'Description for TV`s Category', 'cat_2.png', true);

insert into category (name, description, image_url, is_active) values ('Mobile', 'Description for Mobile Category', 'cat_3.png', true);


CREATE TABLE user_detail (
     id IDENTITY,
     first_name VARCHAR(50),
     last_name VARCHAR(50),
     role VARCHAR(50),
     enabled BOOLEAN,
     password VARCHAR(50),
     email VARCHAR(100),
     contact_number VARCHAR(15),
     CONSTRAINT pk_user_id PRIMARY KEY(id),

);

INSERT INTO user_detail
(first_name, last_name, role, enabled, password, email, contact_number)
VALUES ('Evgen', 'Ten', 'ADMIN', true, 'admin', 'izerus@gmail.com', '7777777');

INSERT INTO user_detail
(first_name, last_name, role, enabled, password, email, contact_number)
VALUES ('Irka', 'Ravets', 'SUPPLIER', true, '12345', 'ir@gmail.com', '9999');

INSERT INTO user_detail
(first_name, last_name, role, enabled, password, email, contact_number)
VALUES ('Andrey', 'Evsey', 'SUPPLIER', true, '12345', 'ae@gmail.com', '3333');


CREATE TABLE product (
     id IDENTITY,
     code VARCHAR(20),
     name VARCHAR(50),
     brand VARCHAR(50),
     description VARCHAR(255),
     unit_price DECIMAL(10,2),
     quantity INT,
     is_active BOOLEAN,
     category_id INT,
     supplier_id INT,
     purchases INT DEFAULT 0,
     views INT DEFAULT 0,
     CONSTRAINT pk_product_id PRIMARY KEY(id),
     CONSTRAINT fk_product_category_id FOREIGN KEY (category_id) REFERENCES category (id),
     CONSTRAINT fk_product_supplier_id FOREIGN KEY (supplier_id) REFERENCES user_detail (id),
);


INSERT INTO product(code, name, brand, description, unit_price, quantity, is_active, category_id, supplier_id)
VALUES('gdsgsfgsf', 'iphone 5s', 'apple', 'nice phone for dummies', 37000, 10, true, 3, 2);

INSERT INTO product(code, name, brand, description, unit_price, quantity, is_active, category_id, supplier_id)
VALUES('gjdhjhdkf', 'Samsung s7', 'samsung', 'best camera phone', 25000, 5, true, 3, 3);

INSERT INTO product(code, name, brand, description, unit_price, quantity, is_active, category_id, supplier_id)
VALUES('v557jjdfgf', 'Google Pixel', 'google', 'Best android phone by google', 57000, 5, true, 3, 2);

INSERT INTO product(code, name, brand, description, unit_price, quantity, is_active, category_id, supplier_id)
VALUES('hnnj7nti8m6', 'MacBook Pro', 'apple', 'Best programming laptop', 54000, 3, true, 1, 2);

INSERT INTO product(code, name, brand, description, unit_price, quantity, is_active, category_id, supplier_id)
VALUES('cgbnmkl,lk989', 'Dell Inspiron 1520', 'dell', 'Best Laptop ever', 99000, 5, true, 1, 3);