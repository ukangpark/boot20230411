-- 내장함수
-- COUNT : 레코드 수 리턴

SELECT * FROM Customers;
SELECT COUNT(CustomerID) FROM Customers;
SELECT COUNT(CustomerName) FROM Customers;
SELECT COUNT(Country) FROM Customers;
SELECT COUNT(CustomerID) FROM Customers
WHERE Country = 'Brazil';

-- destinct : 중복제거
SELECT Country FROM Customers;-- 91
SELECT DISTINCT Country FROM Customers; -- 21

-- 나라의 개수
SELECT COUNT(Country) FROM Customers; -- 91
-- 중복을 제거한 나라의 개수
SELECT COUNT(DISTINCT Country) FROM Customers; -- 21

-- 전체 직원수
SELECT * FROM Employees;
SELECT COUNT(EmployeeID) FROM Employees;

-- 상파울로에 사는 고객 수
SELECT COUNT(CustomerID) FROM Customers WHERE City = 'São Paulo'; 

-- 공급자(suppliers)가 있는 나라 수(중복제거)
SELECT COUNT(DISTINCT Country) FROM Suppliers;
