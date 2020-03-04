DROP DATABASE IF EXISTS book_shop;
CREATE DATABASE book_shop;
USE book_shop;

CREATE TABLE countries(
country_id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
name NVARCHAR(50) NOT NULL UNIQUE CHECK(name <> '')
);

INSERT countries
VALUES
(1,'Беларусь'),
(2,'Украина'),
(3,'Канада'),
(4,'США'),
(5,'Англия');
SELECT * FROM  countries;

CREATE TABLE author(
	author_id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
	name NVARCHAR(10) NOT NULL CHECK(name <> 0),
	surname NVARCHAR(10) NOT NULL CHECK(surname <> 0),
	country_id INT NOT NULL,
	FOREIGN KEY (country_id) REFERENCES countries (country_id)
);

INSERT author
VALUES
(1,'Алексей', 'Васильев',1),
(2,'Никхил ','Абрахам',2),
(3,'Василий','Несвижский',3),
(4,'Даниэль ','Леук',5),
(5,'Патрик ','Нимейер',5);
SELECT * FROM author; 

CREATE TABLE theme(
theme_id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
name NVARCHAR(10) NOT NULL UNIQUE CHECK(name <> '')
);

INSERT theme
VALUES
(1,'Java'),
(2,'C++'),
(3,'C'),
(4,'C#'),
(5,'Python');
SELECT * FROM theme;

CREATE TABLE book(
 book_id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
 name NVARCHAR(10) NOT NULL,
 pages INT NOT NULL CHECK(pages > 0),
 price DECIMAL NOT NULL CHECK(pages >= 0),
 publish_date DATE NOT NULL, -- CHECK(publish_date <= NOW()),
 author_id INT NOT NULL,
 theme_id INT NOT NULL,
FOREIGN KEY (author_id) REFERENCES author(author_id),
 FOREIGN KEY (theme_id) REFERENCES theme(theme_id)
);

INSERT book
VALUES
('Программирование на Java',480,30,'25-08-2004'),
('Программирование на C++',520,30.5,'31-08-200'),
('Программирование на C',410,25.7,'14-06-1991'),
('Программирование на C#',360,22,'18-02-1999'),
('Программирование на Python',280,11,'03-03-2020');
SELECT * FROM book;

CREATE TABLE shop(
shop_id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
name NVARCHAR(64) NOT NULL CHECK(name <> ''),
country_id INT NOT NULL,
FOREIGN KEY (country_id) REFERENCES countries (country_id)
);

INSERT shop
VALUES
(1,'Основы Java'),
(2,'С++'),
(3,'С'),
(4,'С#'),
(5,'Python');
SELECT * FROM shop;

CREATE TABLE sale(
sale_id  INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
price DECIMAL NOT NULL,
quantity INT NOT NULL CHECK(quantity > 0),
sale_date DATE NOT NULL,-- DEFAULT NOW() CHECK(sale_date <= NOW()),
book_id INT NOT NULL,
shop_id INT NOT NULL,
FOREIGN KEY (book_id) REFERENCES book(book_id),
FOREIGN KEY (shop_id) REFERENCES shop(shop_id)
);

INSERT sale
VALUES
(1,'Java'),
(2,'Java'),
(3,'Java'),
(4,'Java'),
(5,'Java'),