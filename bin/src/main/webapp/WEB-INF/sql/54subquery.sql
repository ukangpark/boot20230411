-- 서브 쿼리 (쿼리 안의 쿼리) 
USE w3schools;

SELECT * FROM Products;

-- 제품 id가 1인 제품이 속한 카테고리 id를 조회
SELECT CategoryId FROM Products WHERE ProductId = 1; -- 1

-- 카테고리 id가 1인 카테고리 이름을 조회
SELECT categoryName FROM Categories WHERE CategoryId = 1; -- Beverages

-- 제품 id가 1인 제품이 속한 카테고리 이름을 조회
SELECT categoryName FROM Categories
WHERE CategoryId = (SELECT CategoryId FROM Products WHERE ProductId = 1);

-- 2번 공급자와 같은 나라에 사는 고객 조회
SELECT Country FROM Suppliers
WHERE SupplierId = 2; -- usa
SELECT CustomerName FROM Customers
WHERE Country = 'USA';

SELECT * FROM Customers;
SELECT * FROM Suppliers;

SELECT Country FROM Suppliers WHERE supplierID=2; -- USA

SELECT CustomerName FROM Customers WHERE Country = 'USA';

SELECT CustomerName FROM Customers 
WHERE Country = (SELECT Country FROM Suppliers WHERE supplierID=2);

SELECT * FROM Customers;

SELECT CustomerName FROM Customers
WHERE Country = (SELECT Country FROM Suppliers WHERE SupplierId = 2); 

-- 평균가격보다 높은 가격의 상품들 조회
SELECT * FROM Products;

SELECT AVG(price) FROM Products;

SELECT ProductName, price FROM Products
GROUP BY price
ORDER BY price DESC;

SELECT ProductName, price FROM Products
GROUP BY price
HAVING price > (SELECT AVG(price) FROM Products)
ORDER BY price DESC;

-- 평균가격보다 높은 가격의 상품들 조회
SELECT * FROM Products;

SELECT AVG(price) FROM Products;

SELECT ProductName, price FROM Products
GROUP BY price
HAVING price > (SELECT AVG(price) FROM Products)
ORDER BY price DESC;



