SELECT Country FROM Suppliers;
SELECT DISTINCT Country FROM Suppliers; -- 여러행

-- 공급자들이 살고있는 나라에 있는 고객들 
SELECT DISTINCT Country FROM Suppliers; -- 여러행
SELECT CustomerName FROM Customers
WHERE Country IN (SELECT DISTINCT Country FROM Suppliers);

-- 1996-07-04 에 주문한 상품명 조회
SELECT * FROM Orders;
SELECT * FROM OrderDetails;
SELECT * FROM Products;

SELECT OrderId FROM Orders
WHERE OrderDate='1996-07-04';

SELECT ProductID FROM OrderDetails
WHERE OrderID IN (10248);
SELECT ProductName FROM Products
WHERE ProductID IN (11, 42, 72);

SELECT ProductName FROM Products
WHERE ProductID IN (SELECT ProductID FROM OrderDetails
	WHERE OrderID IN (SELECT OrderId FROM Orders
		WHERE OrderDate='1996-07-04'));
        
-- 1996-07-04 에 주문한 상품명 조회
SELECT * FROM OrderDetails;
SELECT * FROM Orders;
SELECT * FROM Products;

SELECT OrderID FROM Orders
WHERE OrderDate = '1996-07-04'; -- 10248

SELECT ProductID FROM OrderDetails
WHERE OrderID = 10248; -- 11, 42, 72

SELECT ProductName FROM Products
WHERE ProductID IN (SELECT ProductID FROM OrderDetails
WHERE OrderID IN (SELECT OrderID FROM Orders
WHERE OrderDate = '1996-07-04'));



