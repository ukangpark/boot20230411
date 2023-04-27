SELECT * FROM Products;
SELECT ProductName, CategoryId FROM Products;
SELECT ProductName, 
	(SELECT CategoryName 
    FROM Categories
    WHERE CategoryID=p.CategoryID) CategoryName
FROM Products p;

SELECT * FROM Products;
SELECT * FROM Suppliers;

SELECT ProductName,
	(SELECT SupplierName FROM Suppliers
    WHERE SupplierID=p.SupplierID) SupplierName
FROM Products p;

SELECT p.ProductName, s.SupplierName
FROM Products p JOIN Suppliers s
ON p.SupplierID=s.SupplierID;