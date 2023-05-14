CREATE TABLE TableA (
	Num1 INT
);

CREATE TABLE TableB (
	Num2 INT
);

DESC TableA;
DESC TableB;

INSERT INTO TableA (Num1) VALUES (1);
INSERT INTO TableA (Num1) VALUES (2);
INSERT INTO TableA (Num1) VALUES (3);
INSERT INTO TableA (Num1) VALUES (4);
INSERT INTO TableA (Num1) VALUES (5);

INSERT INTO TableB (Num) VALUES (3), (4), (5), (6), (7);

SELECT * FROM TableA;
SELECT * FROM TableB;

SELECT * FROM TableA JOIN TableB; -- cartesian product가 일어남 컬럼 2개 레코드25개 

SELECT * FROM TableA a JOIN TableB b
ON a.num1=b.num2; -- inner join

SELECT * FROM TableA a LEFT JOIN TableB b
ON a.num1=b.num2; -- LIFT JOIN
SELECT * FROM TableA a LEFT OUTER JOIN TableB b
ON a.num1=b.num2; -- LIFT OUTER JOIN

SELECT * FROM TableA a RIGHT JOIN TableB b
ON a.num1=b.num2; -- RIGHT JOIN
