-- = 같다
-- <> 다르다
SELECT * FROM Customers;
SELECT * FROM Customers WHERE Country = 'mexico';
SELECT * FROM Customers WHERE Country <> 'Mexico';
SELECT * FROM Customers WHERE Country != 'Mexico';

SELECT * FROM Suppliers WHERE Country <> 'usa'; 

-- > : 크다
SELECT * FROM Products WHERE Price > 90.00;
SELECT * FROM Products WHERE ProductName > 'U';
SELECT * FROM Employees WHERE BirthDate > '1960-01-01';
-- < : 작다
SELECT * FROM Employees WHERE BirthDate < '1960-01-01';
SELECT * FROM Products WHERE Price <5.00;