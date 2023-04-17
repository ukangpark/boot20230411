SELECT * FROM Customers WHERE CustomerID >= 10 AND CustomerID <= 19;
SELECT * FROM Customers WHERE CustomerID BETWEEN 10 AND 19;

-- 50년대생 직원들 조회
SELECT * FROM Employees WHERE BirthDate BETWEEN '1590-01-01' AND '1959-12-30';

-- 50년대생이 아닌 직원들
SELECT * FROM Employees WHERE NOT (BirthDate BETWEEN '1590-01-01' AND '1959-12-30');

-- 가격이 10달러대 (10.00~19.99) 상품들
SELECT * FROM Products WHERE Price BETWEEN 10.00 AND 19.99;
