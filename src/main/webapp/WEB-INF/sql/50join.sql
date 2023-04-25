SELECT COUNT(*) FROM Products; -- 77
SELECT COUNT(*) FROM Categories; -- 8
SELECT COUNT(*) FROM Suppliers; -- 29

SELECT * FROM Products;
SELECT * FROM Categories;
SELECT * FROM Suppliers;

DESC Products; -- 컬럼6개
DESC Categories; -- 컬럼3개
DESC Suppliers; -- 컬럼8개

SELECT * FROM Products JOIN Categories JOIN Suppliers; -- 17개 컬럼
SELECT COUNT(*) FROM Products JOIN Categories JOIN Suppliers; -- 17864행 

SELECT * FROM
Products p JOIN Categories c ON p.CategoryID = c.CategoryID
			JOIN Suppliers s ON p.SupplierID = s.SupplierID;

-- 1번 상품의 상품명, 카테고리명, 공급자명
SELECT ProductID, p.ProductName, c.CategoryName, s.SupplierName
FROM Products p JOIN Categories c ON p.CategoryID=c.CategoryID
				JOIN Suppliers s ON p.SupplierID=s.SupplierID
WHERE p.ProductID = 1;

SELECT * FROM Orders;
SELECT * FROM OrderDetails;
SELECT * FROM Products;

-- 예제) 1996-07-14에 주문한 상품명 조회
SELECT o.OrderDate, p.ProductName
 FROM Orders o JOIN OrderDetails od ON o.OrderID=od.OrderID
				JOIN Products p ON od.ProductID=p.ProductID
WHERE o.OrderDate = '1996-07-04'; 

-- 예제) 1996-07-14 매출 조회
SELECT SUM(od.Quantity * p.Price) 매출
FROM OrderDetails od JOIN Products p ON od.ProductID=p.ProductID
					JOIN Orders o ON od.OrderID=o.OrderID
WHERE o.OrderDate = '1996-07-04';

-- 일별 매출 조회
SELECT o.OrderDate, SUM(od.Quantity * p.Price) 일별매출
FROM OrderDetails od JOIN Products p ON od.ProductID=p.ProductID
					JOIN Orders o ON od.OrderID=o.OrderID
GROUP BY o.OrderDate
ORDER BY 1;

SELECT * FROM Employees;
SELECT * FROM Orders;
SELECT * FROM OrderDetails;
SELECT * FROM Products;
SELECT * FROM Customers;

-- 직원별 처리금액
SELECT e.LastName, e.FirstName, e.EmployeeID, SUM(p.Price*od.Quantity) 처리금액
FROM Orders o JOIN OrderDetails od ON o.OrderID=od.OrderID
				JOIN Employees e ON o.EmployeeID=e.EmployeeID
				JOIN Products p ON od.ProductID=p.ProductID
GROUP BY e.EmployeeID
ORDER BY 처리금액 DESC;

-- 상품별  판매금액
SELECT p.ProductID, p.ProductName, SUM(p.Price*od.Quantity) 판매금액
FROM Products p JOIN OrderDetails od ON p.ProductID=od.ProductID
GROUP BY p.ProductID
ORDER BY 판매금액 DESC;

-- 고객별 소비금액
SELECT c.CustomerName, SUM(p.Price*od.Quantity) 소비금액
FROM Customers c JOIN Orders o ON c.CustomerID=o.CustomerID
				JOIN OrderDetails od ON o.OrderID=od.OrderID
                JOIN Products p ON od.ProductID=p.ProductID
GROUP BY c.CustomerID
ORDER BY 소비금액 DESC;


