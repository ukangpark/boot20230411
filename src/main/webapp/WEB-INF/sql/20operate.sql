-- +, -, *, /, %
SELECT * FROM Products;
SELECT ProductName, Price * 1300 FROM Products;
SELECT ProductName, Price * 1300 KRW FROM Products;


SELECT ProductName, Price / 100 KRW FROM Products;
SELECT ProductName, Price + 100 KRW FROM Products;
SELECT ProductName, Price - 100 KRW FROM Products;

-- 문자열 연결
SELECT City + Country FROM Customers;
SELECT CONCAT(City, Country) FROM Customers;
SELECT CONCAT(City, ",", Country) FROM Customers;
SELECT CONCAT(City, " ", Country) FROM Customers;

-- 직원이름 "firstName, ListName"형식으로 조회
SELECT CONCAT(firstName, ",", lastName) FROM Employees;

-- 원화 (* 1300)로 10만원 이상인 상품들 조회
SELECT ProductName, price * 1300 krw
FROM Products
HAVING krw > 100000.00;

SELECT * FROM Products
WHERE Price*1300 >= 100000;

SELECT ProductName,
Price dollor,
Price * 1300 krw
FROM Products
WHERE Price >= 100000 / 1300;

-- 부분 문자열 : substring
SELECT SUBSTRING('hello world', 3, 3);

SELECT CustomerName FROM Customers;
SELECT SUBSTRING(CustomerName, 1, 3) FROM Customers;

-- 고객테이블에서 고객명, 나라이름(앞3글자만) 조회
SELECT SUBSTRING(CustomerName, 1, 3), SUBSTRING(Country, 1, 3) FROM Customers;

