-- AVG(평균), SUM(합계)

SELECT SUM(Price) FROM Products;
SELECT AVG(price) FROM Products;

-- 5번 카테고리 상품값의 합
SELECT SUM(Price) FROM Products WHERE CategoryID = 5;
-- 1번 카테고리 상품값의 평균
SELECT AVG(price) FROM Products WHERE CategoryID = 1;