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

