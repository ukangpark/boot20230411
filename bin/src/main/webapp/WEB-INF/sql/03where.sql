-- WHERE : 특정 레코드를 선택하는 조건절
SELECT * FROM Customers WHERE Country = 'Mexico';
SELECT * FROM Customers WHERE Country = 'UK';
SELECT * FROM Customers WHERE CustomerID = 3;
-- 프랑스에 사는 CustomerName만 Customers테이블에서 가져오기
SELECT CustomerName FROM Customers WHERE Country = 'france';

-- Country가 USA인 공급자이름과 주소를 공급자 테이블에서 조회해보자
SELECT SupplierName, Address FROM Suppliers WHERE Country = 'USA';