CREATE DATABASE leetcode183;
USE leetcode183;

CREATE TABLE Customers (
	Id INT PRIMARY KEY,
    Name VARCHAR(250)
);

INSERT INTO Customers VALUES (1, 'Joe');
INSERT INTO Customers VALUES (2, 'Henry');
INSERT INTO Customers VALUES (3, 'Sam');
INSERT INTO Customers VALUES (4, 'Max');

CREATE TABLE Orders (
	Id INT PRIMARY KEY,
    CustomerId INT,
    FOREIGN KEY (CustomerId) REFERENCES Customers(Id)
);

INSERT INTO Orders VALUES (1,3);
INSERT INTO Orders VALUES (2,1);

SELECT * FROM Customers;
SELECT * FROM Orders;

SELECT c.name Customers
FROM Customers c LEFT JOIN Orders o
ON c.id=o.customerid
WHERE o.customerId IS NULL;

-- 상품을 주문하지 않은 사람 조회
SELECT * FROM Customers;

SELECT CustomerId FROM Orders;

SELECT * FROM Customers WHERE id NOT IN (1,3);

SELECT * FROM Customers WHERE id NOT IN (SELECT CustomerId FROM Orders);
