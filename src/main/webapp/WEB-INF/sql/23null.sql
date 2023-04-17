-- null
SELECT * FROM Products ORDER BY 1 DESC;
-- IFNULL : NULL이면 다른 값으로 변경
SELECT IFNULL(0, 100); -- 0
SELECT IFNULL('kim', 'lee'); -- kim
SELECT IFNULL(NULL, 100); -- 100

SELECT ProductID, ProductName, SupplierID, CategoryID, Unit, IFNULL(Price,0) 
FROM Products ORDER BY 1 DESC;

SELECT AVG(IFNULL(Price, 0)) as Average FROM Products WHERE CategoryID = 2;

-- 고객테이블에서 CustomerID, CustomerName, ContactName, Address 조회
-- ContactName이 Null이면 'Anonymous'로 조회되게 address가 null이면 'Homless'로 조회
SELECT CustomerID,
		IFNULL(ContactName, 'Anonymous') contactName,
        IFNULL(Address, 'Homless') address
FROM Customers ORDER BY 1 DESC;

