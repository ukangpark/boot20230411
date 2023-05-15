-- delete from : 테이블의 레코드를 지우기 

DELETE FROM Customers WHERE CustomerID = 94;

SELECT * FROM Customers WHERE CustomerID = 94;

-- 93번 고객 지우기
DELETE FROM Customers WHERE CustomerID = 93;
SELECT * FROM Customers WHERE CustomerID = 93;

-- 78번 상품 지우기
DELETE FROM Products WHERE ProductID = 78;
SELECT * FROM Products WHERE ProductID = 78;

-- 79번  상품 지우기
DELETE FROM Products WHERE ProductID = 79;
SELECT * FROM Products WHERE ProductID = 79;

DELETE
FROM Products
WHERE CategoryID = 1;

SELECT COUNT(*) FROM Products;

DELETE
FROM Products;

SELECT *
FROM Products;

-- 고객테이블에서 USA에 사는 고객들 지우기
SELECT *
FROM Customers WHERE Country = 'USA';

DELETE
FROM Customers WHERE Country = 'USA';

-- 모든 직원 지우기
SELECT *
FROM Employees;