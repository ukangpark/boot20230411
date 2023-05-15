DESC Orders;
SELECT * FROM Orders WHERE CustomerID=22;
SELECT * FROM Customers WHERE CustomerID=22;

-- 특정주문을 한고객 찾기
SELECT * FROM Orders o JOIN Customers c
ON o.CustomerID=c.CustomerID; -- 830
SELECT * FROM Orders o RIGHT JOIN Customers c
ON o.CustomerID=c.CustomerID -- 832
WHERE o.OrderID IS NULL; -- 주문한적없는 고객 

-- 주문을 처리한 적 없는 직원조회
DESC Orders;
SELECT * FROM Orders o RIGHT JOIN Employees e
ON o.EmployeeID=e.EmployeeID
WHERE o.OrderID IS NULL;


-- 