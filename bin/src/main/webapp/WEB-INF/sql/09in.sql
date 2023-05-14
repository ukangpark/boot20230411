-- 특정값 중에 있으면
SELECT * FROM Customers WHERE Country = 'Germany' OR Country = 'France';
SELECT * FROM Customers WHERE Country IN ('Germany' , 'France');

-- 3, 5번 카테고리에 속한 상품들 조회
SELECT * FROM Categories WHERE CategoryID IN (3, 5);
SELECT * FROM Categories WHERE CategoryID IN (1, 3, 5, 7);
SELECT * FROM Categories WHERE CategoryID = 1 OR CategoryID = 3 OR CategoryID = 5 OR CategoryID = 7;

-- Berlin, London, Madrid, Paris 에 있는 고객들 조회
SELECT * FROM Customers WHERE City IN ('Berlin', 'Madrid', 'Paris');
SELECT * FROM Customers WHERE City = 'Berlin' OR City = 'Madrid' OR City = 'Paris';

-- Berlin, London, Madrid, Paris 에 있지않은 고객들 조회
SELECT * FROM Customers WHERE NOT City IN ('Berlin', 'Madrid', 'Paris');
SELECT * FROM Customers WHERE City NOT IN ('Berlin', 'Madrid', 'Paris');

-- 1,3,5,7 카테고리가 아닌 상품들 조회
SELECT * FROM Categories WHERE CategoryID NOT IN (1,3,5,7);