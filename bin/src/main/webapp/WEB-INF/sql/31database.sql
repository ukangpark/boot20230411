-- CREATE DATABASE : database 만들기
CREATE DATABASE mydb;
-- 만들걸 사용하겠다.
USE mydb;
CREATE TABLE MyTable11 (
Title VARCHAR(10),
Price INT
);

-- DROP DATABASE : 데이터베이스 지우기
-- 매우 주의해서 실행!! 테이블까지 날아감 복구불가능
DROP DATABASE mydb;

USE w3schools;

CREATE DATABASE mydb;
CREATE TABLE mydb (
Col1 VARCHAR(2)
);
DESC mydb;
DROP DATABASE mydb;
USE w3schools;

USE test;
SELECT * FROM MyTable10; -- 현재 DATABASE
SELECT * FROM w3schools.MyTable10; -- 다른 DATABASE

