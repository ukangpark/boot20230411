USE w3schools;
CREATE DATABASE leetcode175;
USE leetcode175;

CREATE TABLE Person (
PersonId INT PRIMARY KEY ,
LastName VARCHAR(200),
FirstName VARCHAR(200)
);

INSERT INTO Person VALUES (1, 'Wang', 'Allen');
INSERT INTO Person VALUES (2, 'Alice', 'Bob');

SELECT * FROM Person;

CREATE TABLE Address (
AddressId INT PRIMARY KEY,
PersonId INT,
City VARCHAR(200),
State VARCHAR(200)
);

INSERT INTO Address VALUES (1, 2, 'New York City', 'New York');
INSERT INTO Address VALUES (2, 3, 'Leetcode', 'California');

SELECT * FROM Address;
SELECT * FROM Person;

SELECT p.firstName, p.lastName, a.city, a.state
FROM Person p LEFT JOIN Address a
ON p.personId=a.personId
ORDER BY firstName;

-- 서브쿼리로 풀어보기

-- 사람과 주소를 함께 조회
SELECT * FROM Person;

SELECT * FROM Address;

SELECT p.lastName, p.firstName, 
		(SELECT a.city FROM Address a
        WHERE p.PersonId = a.PersonId) city, 
		(SELECT a.state FROM Address a
        WHERE p.PersonId = a.PersonId) state
FROM Person p;





SELECT p.firstName, p.lastName,
	(SELECT a.city
    FROM Address a
	WHERE a.PersonId=p.PersonId) city,
    (SELECT a.state
    FROM Address a
	WHERE a.PersonId=p.PersonId) state
FROM Person p;