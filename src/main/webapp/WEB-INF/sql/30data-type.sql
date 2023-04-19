-- 수형(Numeric)
CREATE TABLE MyTable04 (
	Col1 INT
);
DESC MyTable04;
INSERT INTO MyTable04 (Col1) VALUES (33);
INSERT INTO MyTable04 (Col1) VALUES (3.14);

SELECT * FROM MyTable04;

CREATE TABLE MyTable05 (
Col1 INT, Col2 INT
);

DESC MyTable05;

-- DEC 실수형
-- DEC(총길이, 소수점이하길이)
CREATE TABLE MyTable06(
Col1 DEC(5, 2), Col2 DEC(3,1)
);
INSERT INTO MyTable06 (Col1) VALUES (999.99); -- ok
INSERT INTO MyTable06 (Col1) VALUES (-999.99); -- ok
INSERT INTO MyTable06 (Col1) VALUES (1000.99); -- fail
INSERT INTO MyTable06 (Col1) VALUES (999.999); -- fail
SELECT * FROM MyTable06;

CREATE TABLE MyTable07 (
Col1 DEC(3,2), Col2 DEC(4,3)
);
INSERT INTO MyTable07 (Col1, Col2) VALUES(3.14, 3.1482);
SELECT * FROM MyTable07;

-- 문자형 (Character - String)
-- VARCHAR(길이) (문자형인데 길이가 가변적이다.)
CREATE TABLE MyTable02(
	Col1 VARCHAR(3),
    Col2 VARCHAR(5)
);
INSERT INTO MyTable02 (Col1, Col2)
VALUES ('abc','abcde');
INSERT INTO MyTable02 (Col1, Col2)
VALUES ('abc', 'abcde');
INSERT INTO MyTable02 (Col1, Col2)
VALUES ('abcd', 'abcdef');

SELECT * FROM MyTable02;

CREATE TABLE MyTable03 (
Col1 VARCHAR(10),
Col2 VARCHAR(100),
Col3 VARCHAR(1000)
);
DESC MyTable03;

-- 날짜시간
CREATE TABLE MyTable08 (
	Col1 DATE, Col2 DATETIME
);
INSERT INTO MyTable08 (Col1) VALUES ('2023-04-19');
SELECT * FROM MyTable08;
INSERT INTO MyTable08 (Col1) VALUES ('9999-12-31'); -- 최대값
INSERT INTO MyTable08 (Col1) VALUES ('1000-01-01'); -- 최소값

INSERT INTO MyTable08 (Col2) VALUES ('2023-04-19 11:41:30');

SELECT now();
INSERT INTO MyTable08 (Col1, Col2) VALUES(now(), now());

CREATE TABLE MyTable09 ( -- 학생정보테이블
	-- 학생이름, 성별, 생년월일, 기타정보, 시험성적
    Name VARCHAR(20),
	Gender VARCHAR(1),
    BirthDate DATE,
    Score DEC(5,2),
    Extra VARCHAR(1000)
);

INSERT INTO MyTable09 (name, gender, birthDate, score, extra)
VALUES ('손흥민', '여', '2000-02-02', 99.99, '축구선수');
SELECT * FROM MyTable09;

CREATE TABLE MyTable10 (
BookName VARCHAR(100),Price INT
);
INSERT INTO MyTable10 (BookName, Price) VALUES ('정보처리기사실기',28000 );

SELECT * FROM MyTable10;

ALTER TABLE MyTable10 
	ADD Writer VARCHAR(100),
    ADD publisher VARCHAR(50),
    ADD published DATE;
    
