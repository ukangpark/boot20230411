-- catesian product (곱집합) 카테시안 곱
SELECT COUNT(*) FROM Products; -- 77
SELECT COUNT(*) FROM Categories; -- 8

SELECT COUNT(*) FROM Products JOIN Categories; -- 616
SELECT COUNT(*) FROM Products JOIN Categories; -- 616
SELECT * FROM Products JOIN Categories;

-- on : 조인 조건
SELECT * FROM Products JOIN Categories ON Products.CategoryID = Categories.CategoryID;

SELECT * FROM Products;
SELECT * FROM Categories;

-- 조인 후 컬럼 수 : 왼쪽테이블컬럼 수 + 오른쪽테이블컬럼 수
DESC Products; -- 6개 컬럼
DESC Categories; -- 3개 컬럼
SELECT * FROM Products JOIN Categories -- 9개 컬럼
ON Products.CategoryID = Categories.CategoryID; -- 9개 컬럼

 -- 관심있는 컬럼들만 뽑아서 조인하고 싶다 => 
SELECT ProductName,CategoryName FROM Products JOIN Categories
ON Products.CategoryID = Categories.CategoryID; -- 카테고리ID가 같은 것만 솎아내서 보겠다.

SELECT * FROM Suppliers;
SELECT ProductName, SupplierName FROM Products JOIN Suppliers
on Products.ProductID=Suppliers.SupplierID;

SELECT ProductName, SupplierName 
FROM Products As p JOIN Suppliers As s
ON p.SupplierID = s.SupplierID;

SELECT ProductName, SupplierName 
FROM Products p JOIN Suppliers s
ON p.SupplierID = s.SupplierID;

SELECT p.SupplierID
FROM Products p JOIN Suppliers s
ON p.SupplierID = s.SupplierID;