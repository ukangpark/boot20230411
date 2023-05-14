DROP DATABASE w3schools;
USE w3schools;

SELECT * FROM Products;
DESC Products;

SELECT * FROM Categories;
DESC Categories;

ALTER TABLE Products
ADD FOREIGN KEY (CategoryID) 
REFERENCES Categories(CategoryID);

ALTER TABLE Products
ADD FOREIGN KEY (SupplierID)
REFERENCES Suppliers (SupplierID);

SELECT * FROM Employees;
SELECT * FROM OrderDetails;

ALTER TABLE OrderDetails
ADD FOREIGN KEY (OrderID)
REFERENCES Orders(OrderID);

ALTER TABLE OrderDetails
ADD FOREIGN KEY (ProductID)
REFERENCES Products(ProductID);

DESC Orders;

ALTER TABLE Orders
ADD FOREIGN KEY (EmployeeID)
REFERENCES Employees (EmployeeID);

ALTER TABLE Orders
ADD FOREIGN KEY (CustomerID)
REFERENCES Customers (CustomerID);

ALTER TABLE Orders
ADD FOREIGN KEY (ShipperID)
REFERENCES Shippers (ShipperID);

SELECT * FROM Products WHERE ProductID = 1;
SELECT * FROM Categories WHERE CategoryID = 1;

SELECT * FROM Products JOIN Categories ON
Products.categoryId = Categories.categoryId
WHERE Products.ProductId = 1;

SELECT * FROM Products AS p JOIN Categories AS c
ON p.categoryId = c.categoryId
WHERE p.ProductId = 1;

SELECT * FROM Products p JOIN Categories c
ON p.categoryId = c.categoryId
WHERE p.ProductId = 1;

SELECT * FROM Products JOIN Categories
WHERE Products.ProductId = 1;

SELECT * FROM Categories;