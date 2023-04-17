USE w3schools;

-- order by : 결과의 순서를 정할 때 사용하는 키워드
SELECT CustomerID, CustomerName, ContactName -- column 명들
FROM Customers -- table 
WHERE CustomerID < 10 -- 선택할 redords의 조건
ORDER BY ContactName DESC;

SELECT * FROM Customers
ORDER BY Country ASC;

-- 모든 상품을 가격순으로 조회(낮은 가격이 먼저 조회)
SELECT * FROM Products
ORDER BY Price;

-- 모든 직원을 생년월일 순 조회 (어린 직원이 먼저 조회)
SELECT * FROM Employees
ORDER BY BirthDate DESC;

-- 컬럼 index 사용 가능
SELECT * FROM Products ORDER BY Price;
SELECT * FROM Products ORDER BY 6;

SELECT * FROM Products ORDER BY 6 DESC;

-- 컬럼 index 사용해서 모든 고객을 도시 이름 순 정렬 조회
SELECT * FROM Customers ORDER BY 5;

-- 여러컬럼 기준 정렬 가능 (나라안에서 도시순으로 정렬)
SELECT * FROM Customers ORDER BY Country, City;
SELECT CustomerID, CustomerName, Country, City
FROM Customers
ORDER BY Country, City;

-- 여러 컬럼 기준으로 정렬시 컬럼당 오름차순, 내림차순 지정 가능
SELECT * FROM Customers ORDER BY Country DESC, City ASC;
SELECT * FROM Customers ORDER BY Country ASC, City DESC;

-- 상품을 카테고리(오름차순) 가격 (내림차순)으로 정렬 조회
SELECT * FROM Products ORDER BY CategoryID ASC, Price DESC;