-- update : 레코드 수정

SELECT * FROM Customers WHERE CustomerID = 1;
UPDATE Customers 				-- 테이블명
SET CustomerName = '서태웅'		-- 변경할 칼럼과 값
WHERE CustomerID = 1;			-- 변경할 레코드의 조건

UPDATE Customers
SET 
	CustomerName = '정대만', 
    City = 'Seoul',
    Country = 'Korea'
WHERE CustomerID = 1;

-- 1번 공급자의 이름, 도시, 나라 변경
SELECT * FROM Suppliers WHERE SupplierID = 1;
UPDATE Suppliers
SET SupplierName = 'kim',
	City = 'Seoul',
	Country = 'Korea'
WHERE SupplierID = 1;

SELECT * FROM Suppliers WHERE Country = 'USA';

UPDATE Suppliers
SET SupplierName = '채치수',
	Country = 'France'
WHERE Country = 'USA';

SELECT * FROM Suppliers WHERE Country = 'France';

SELECT * FROM Suppliers;
UPDATE Suppliers
SET ContactName = '북산',
	City = 'Seoul';
    
UPDATE Suppliers 
SET 
	PostalCode = CONCAT('J', PostalCode)
WHERE  Country = 'Japan';

SELECT * FROM Suppliers WHERE Country = 'Japan';

SELECT * FROM Products;
INSERT INTO Products
VALUES (1, 'cake', null, null, null, 300);
INSERT INTO Products
VALUES (2, 'pizza', null, null, null, 100);

UPDATE Products
SET Price = Price * 1300;