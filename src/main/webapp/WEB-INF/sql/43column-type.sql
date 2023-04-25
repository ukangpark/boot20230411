USE w3schools;

CREATE TABLE MyTable30 (
col1 INT,
col2 VARCHAR(30)
);
DESC MyTable30;

INSERT INTO MyTable30 (col1, col2)
VALUES (30, 'java');
INSERT INTO MyTable30 (col1)
VALUES('33');-- ok 엄격하지 않음
INSERT INTO MyTable30 (col1)
VALUES('Three'); -- fail

INSERT INTO MyTable30 (col2)
VALUES(77); -- ok 엄격하지 않음 (String으로 들어간상태) 

SELECT * FROM MyTable30;

CREATE TABLE MyTable31 (
col1 DATE,
col2 DATETIME
);

INSERT INTO MyTable31(col1, col2)
VALUES('2023-04-20','2023-04-20 09:29:12');
SELECT * FROM MyTable31;

CREATE TABLE MyTable32 (
Name VARCHAR(30),
Age INT,
Price DEC(10,2),
Birth DATE,
Inserted DATETIME
);

DESC MyTable32;
SELECT * FROM MyTable32;

CREATE TABLE MyTable33 (
Title VARCHAR(200),
Published DATE,
Price INT,
Updated DATETIME,
Weight DEC(10,3)
);

DESC MyTable33;
SELECT * FROM MyTable33;

SELECT * FROM Suppliers;
DESC Suppliers;
SELECT SupplierName FROM Suppliers WHERE SupplierID = 1;

SELECT * FROM Employees;
DESC Employees;

SELECT CustomerName FROM Customers LIMIT 1;
SELECT * FROM Customers;

SELECT CustomerName, ContactName
FROM Customers
WHERE CustomerID = 3; -- 어제

USE w3schools;
SELECT CustomerName FROM Customers; -- 오늘

SELECT * FROM Products;

SELECT CustomerName FROM Customers WHERE Country = 'uk';

CREATE TABLE MyTable34 (
col1 INT,
col2 VARCHAR(30)
);

INSERT INTO MyTable34(col1, col2)
VALUES (99, 'hello');

SELECT * FROM MyTable34;

CREATE TABLE MyTable35(
col1 DOUBLE(3,2),
col2 VARCHAR(30)
);

SELECT * FROM MyTable35;

CREATE TABLE MyTable36 (
col1 INT,
col2 VARCHAR(50),
col3 DEC(10,2)
);

INSERT INTO MyTable36 (col1, col2, col3)
VALUES(22, 'hello', 3.14);

SELECT * FROM MyTable36;

CREATE TABLE MyTable37(
Name VARCHAR(20),
Age INT,
Score DEC(5.2)
);

SELECT * FROM MyTable37;

CREATE TABLE MyTable38 (
col1 INT,
col2 INT,
col3 VARCHAR(200),
col4 VARCHAR(200),
col5 DEC(10,3),
col6 DEC(10,3)
);

SELECT * FROM MyTable38;

CREATE TABLE MyTable39 (
col1 INT PRIMARY KEY AUTO_INCREMENT,
col2 VARCHAR(200),
col3 INT
);

DESC MyTable39;

INSERT INTO MyTable39 (col2, col3)
VALUES('hello', 99);
SELECT * FROM MyTable39;

CREATE TABLE MyTable40(
Id INT PRIMARY KEY AUTO_INCREMENT,
Age INT,
Name VARCHAR(30),
Score DEC(10,3)
);
DESC MyTable40;
SELECT * FROM MyTable40;

DESC Customers;
SELECT * FROM Customers;

SELECT * FROM Employees;
DESC Employees;


