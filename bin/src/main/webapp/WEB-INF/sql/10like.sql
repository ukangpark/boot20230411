SELECT * FROM Customers WHERE CustomerName LIKE 'A%'; -- a로 시작하는 고객들
SELECT * FROM Customers WHERE CustomerName LIKE '%A'; -- a로 끝나는 고객들
SELECT * FROM Customers WHERE CustomerName LIKE '%or%'; -- 가운데가 or인 고객들
SELECT * FROM Customers WHERE CustomerName LIKE '_or%'; -- 앞에 한글자가 존재한 이후에 or인 고객들
SELECT * FROM Customers WHERE CustomerName LIKE '_r%'; -- 앞에 한글자가 존재한 이후에 r인 고객들
SELECT * FROM Customers WHERE CustomerName LIKE 'a_%'; -- 앞에 한글자가 a로 존재하고 뒤에 아무거나인 고객들'a%'와 같음
SELECT * FROM Customers WHERE CustomerName LIKE 'a__%'; -- 앞에 한글자가 a로 존재하고 뒤에 아무거나인 고객들'a%'와 같음
SELECT * FROM Customers WHERE CustomerName LIKE 'a%o'; -- a로 시작되고 o로 끝나는 고객들

-- 고객명(CustomerName), 계약명(ContactName)에 or이 포함된 고객들 조회
SELECT * FROM Customers WHERE CustomerName LIKE '%or%' OR ContactName LIKE '%or%';

