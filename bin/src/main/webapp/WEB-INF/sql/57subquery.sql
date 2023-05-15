USE w3schools;

SELECT lastName, firstName FROM Employees;

SELECT lastName, firstName 
FROM (SELECT lastName, firstName FROM Employees ) emp
WHERE lastName >= 'd' AND lastNAme < 'e';

-- 고객별 소비금액의 평균
SELECT AVG(소비금액) 소비금액평균 FROM
(
SELECT c.CustomerName, SUM(p.Price*od.Quantity) 소비금액
FROM Customers c JOIN Orders o ON c.CustomerID=o.CustomerID
				JOIN OrderDetails od ON o.OrderID=od.OrderID
                JOIN Products p ON od.ProductID=p.ProductID
GROUP BY c.CustomerID
ORDER BY 소비금액 DESC
) t1;

-- 직원별 매출액의 평균
SELECT AVG(처리금액) 처리금액평균 FROM
(
SELECT e.LastName, e.FirstName, e.EmployeeID, SUM(p.Price*od.Quantity) 처리금액
FROM Orders o JOIN OrderDetails od ON o.OrderID=od.OrderID
				JOIN Employees e ON o.EmployeeID=e.EmployeeID
				JOIN Products p ON od.ProductID=p.ProductID
GROUP BY e.EmployeeID
ORDER BY 처리금액 DESC
)t1;

-- 카테고리별 평균상품가격 조회 (평균상품가격이 30.00 달러 이상인 것만)

SELECT CategoryId, AVG(price) avg 
FROM Products
GROUP BY categoryid
HAVING AVG(price) >= 30.00;

SELECT CategoryId, average FROM
(
SELECT CategoryId, AVG(price) average
FROM Products
GROUP BY CategoryID
) t1
HAVING average >= 30.00;
