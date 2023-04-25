CREATE DATABASE leetcode181;
USE leetcode181;
CREATE TABLE Employee (
	Id INT PRIMARY KEY,
	Name VARCHAR(225),
    Salary INT,
    ManagerId INT
);

INSERT INTO Employee VALUES (1, 'Joe', 70000, 3);
INSERT INTO Employee VALUES (2, 'Henry', 80000, 4);
INSERT INTO Employee VALUES (3, 'Sam', 60000, NULL);
INSERT INTO Employee VALUES (4, 'Max', 90000, NULL);

SELECT * FROM Employee;

-- 매니저보다 많은 연봉받는 직원 이름 조회

SELECT *
FROM Employee e1 JOIN Employee e2;

SELECT *
FROM Employee e1 JOIN Employee e2
ON e1.managerId=e2.id;

SELECT e1.name employee
FROM Employee e1 JOIN Employee e2
ON e1.managerId=e2.id
WHERE e1.salary > e2.salary;

-- 서브 쿼리
SELECT name FROM Employee e1
WHERE salary > (SELECT salary FROM Employee e2 WHERE e2.id=e1.managerId);

