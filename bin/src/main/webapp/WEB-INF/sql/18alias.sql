-- alias : 별칭

SELECT * FROM Customers;
SELECT CustomerID, CustomerName FROM Customers;
SELECT CustomerID as id, CustomerName as name FROM Customers;

-- as 생략 가능
SELECT CustomerID id, 
		CustomerName name 
FROM Customers;

SELECT CustomerID id,
		CustomerName name
FROM Customers
ORDER BY CustomerID;

SELECT CustomerID id,
		CustomerName name
FROM Customers
ORDER BY id;

SELECT Country, COUNT(CustomerID)
FROM Customers
GROUP BY Country;

SELECT Country, COUNT(CustomerID) AS NumOfCustomer
FROM Customers
GROUP BY Country;

SELECT Country, COUNT(CustomerID) NumOfCustomer
FROM Customers
GROUP BY Country;

SELECT Country c, COUNT(CustomerID) NumOfCustomer
FROM Customers
GROUP BY Country
ORDER BY 2;

-- keyword 사용시 backtick
SELECT Country AS `from`, CustomerName FROM Customers;
