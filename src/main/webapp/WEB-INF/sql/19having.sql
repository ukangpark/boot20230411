-- having절 : 집계함수의 조건 설정할 때 사용

SELECT Country, COUNT(CustomerID) 
FROM Customers
GROUP BY Country;

-- 나라별로 고객수가 5명이상인 나라만 조회
SELECT Country, COUNT(CustomerID) numOfCustomer
FROM Customers
WHERE numOfCustomer >= 5 -- record를 거르는 조건(조회결과를 거르는게아님)
GROUP BY Country;

SELECT Country, COUNT(CustomerID) numOfCustomer
FROM Customers
GROUP BY Country
HAVING numOfCustomer >= 5; -- group 함수의 조건절

-- 상품의 평균 가격이 30달러 이상인 카테고리 조회
SELECT CategoryID, AVG(Price) avg
FROM Products
GROUP BY CategoryID
HAVING avg >= 30.00;

-- 카테고리별 상품의 최고 가격이 100달러 이상인 카테고리
SELECT CategoryID, MAX(Price) maxPrice
FROM Products
GROUP BY CategoryID
HAVING maxPrice >= 100.00;