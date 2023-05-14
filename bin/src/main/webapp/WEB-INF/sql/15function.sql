-- MIN, MAX

SELECT MIN(CustomerID) FROM Customers;
SELECT MAX(CustomerID) FROM Customers;
SELECT MIN(Price) FROM Products;
SELECT MAX(Price) FROM Products;

-- 가장 나이 많은 직원의 생년월일
SELECT MIN(birthDate) FROM Employees;

-- 가장 어린 직원의 생년월일
SELECT MAX(birthDate) FROM Employees;

-- 3번 카테고리에서 가장 비싼 상품의 가격
SELECT * FROM Products WHERE CategoryID = 3 ORDER BY Price DESC;
SELECT MAX(Price) FROM Products WHERE CategoryID = 3;

-- 5번 카테고리에서 가장 싼 상품의 가격
SELECT * FROM Products WHERE CategoryID = 5 ORDER BY Price;
SELECT MIN(Price) FROM Products WHERE CategoryID = 5;
