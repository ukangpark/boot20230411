-- null : 값이 없음
-- null vs ''(비어있는스트링) : 데이터베이스마다 다름(mysql에서는 다름) 

-- IS NULL : 값이 null 인가?
SELECT * FROM Suppliers
WHERE ContactName IS NULL;

SELECT * FROM Suppliers
WHERE ContactName = '';

-- IS NOT NULL : 값이 NULL 아닌 컬럼 조회
SELECT * FROM Suppliers
WHERE NOT ContactName IS NULL;

SELECT * FROM Suppliers
WHERE ContactName IS NOT NULL;

-- Customers 테이블에서 Address 컬럼이 null인 레코드 조회
SELECT * FROM Customers WHERE Address IS NULL;
SELECT * FROM Customers WHERE Address IS NOT NULL;

-- 집계함수에서 NULL 제외
SELECT COUNT(CustomerID) FROM Customers;
SELECT COUNT(Address) FROM Customers;
SELECT COUNT(*) FROM Customers;

-- 공급자 테이블에서 SupplierID 컬럼의 값 수 구하기
SELECT COUNT(SupplierID) FROM Suppliers;
-- 공급자 테이블에서 ContactName 컬럼의 값 수 구하기
SELECT COUNT(ContactName) FROM Suppliers;

SELECT COUNT(*) FROM Suppliers;

SELECT * FROM Products ORDER BY 1 DESC;

INSERT INTO Products
VALUES(78, 'Cake', 12, 2, '조각', NULL);

INSERT INTO Products
(ProductID, ProductName, SupplierID, categoryID, Unit)
VALUES (79, 'Pizza', 12, 2, '조각'); -- 명시적인 null의 값을 넣는것과 같음

SELECT * FROM Products WHERE CategoryID = 2 ORDER BY 1 DESC;
-- 14

SELECT SUM(Price) FROM Products WHERE CategoryID = 2;
-- 276.75

SELECT AVG(Price) FROM Products WHERE CategoryID = 2;