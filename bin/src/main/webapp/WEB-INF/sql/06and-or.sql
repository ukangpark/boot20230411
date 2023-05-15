USE w3schools;

SELECT * FROM Customers WHERE CustomerID > 4 AND Country = 'Germany';

SELECT * FROM Employees WHERE LastName >= 'M' AND BirthDate > '1960-01-01';

-- 카테고리 id가 2이고, 가격이 20.00이상인 상품들 조회
SELECT * FROM Products;
SELECT * FROM Products WHERsE CategoryID = 2 AND Price >= 20.00;

-- 1950-01-01 ~ 1959-12-31 사이에 태어난 직원들 조회
SELECT * FROM Employees;
SELECT * FROM Employees WHERE BirthDate >= '1950-01-01' AND BirthDate <= '1959-12-31';

-- or
SELECT * FROM Customers WHERE Country = 'Germany';
SELECT * FROM Customers WHERE Country = 'France';
SELECT * FROM Customers WHERE Country = 'Germany' OR Country = 'France';

-- 도시 London 또는 Madrid 에 있는 고객들 조회
SELECT * FROM Customers WHERE City ='London' OR City = 'Madrid';

SELECT * FROM Products WHERE CategoryID = 1 OR CategoryID = 2;

