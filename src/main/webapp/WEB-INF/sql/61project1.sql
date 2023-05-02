USE Board;

DESC Board;

CREATE TABLE FileName (
	id INT PRIMARY KEY AUTO_INCREMENT,
	boardId INT NOT NULL,
	fileName VARCHAR(300) NOT NULL,
    FOREIGN KEY (boardId) REFERENCES Board(id)
);

SELECT * FROM FileName;

SELECT * FROM Board
ORDER BY id DESC;

USE w3schools;

DESC Bank;

CREATE TABLE Bank (
	name VARCHAR(10),
    money INT
);

INSERT INTO Bank (name, money) VALUES ('A', 100000);
INSERT INTO Bank (name, money) VALUES ('B', 100000);
SELECT * FROM Bank;

USE Board;
SELECT * FROM FileName;

SELECT * FROM Board b JOIN FileName f
ON b.id = f.boardId
WHERE b.id = '2048'; -- file 있는 게시물 

SELECT * FROM Board b JOIN FileName f
ON b.id = f.boardId
WHERE b.id = '1818'; -- file 없는 게시물 -> 조회되지 않음 file이 없으니까 교집합이아님 

SELECT * FROM Board b LEFT JOIN FileName f
ON b.id = f.boardId
WHERE b.id = '1818'; -- file없는 게시물도 조회하기

USE w3schools;
SELECT 
	c.CategoryId id,
    c.CategoryName name,
    c.Description,
    p.productName,
    p.price
FROM Categories c JOIN Products p
ON c.CategoryId = p.CategoryId
WHERE c.CategoryId = 1;

SELECT *
FROM Suppliers s JOIN Products p
ON s.supplierId = p.supplierId;

