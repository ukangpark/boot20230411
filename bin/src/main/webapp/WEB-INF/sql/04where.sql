-- = 같다
-- <> 다르다
SELECT * FROM Customers WHERE Country = 'mexico';
SELECT * FROM Customers WHERE Country <> 'Mexico';
SELECT * FROM Customers WHERE Country != 'Mexico';

SELECT * FROM Suppliers WHERE Country <> 'usa'; 