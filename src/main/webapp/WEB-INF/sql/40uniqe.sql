-- uniqe : 중복허용 안함
CREATE TABLE MyTable21 (
	Col1 INT,
    Col2 INT UNIQUE
);

INSERT INTO MyTable21 (Col1, Col2)
VALUES (1,1);
INSERT INTO MyTable21 (Col1, Col2)
VALUES (2,2);
INSERT INTO MyTable21 (Col1, Col2)
VALUES (2,3);

SELECT * FROM MyTable21;
DESC MyTable21;

CREATE TABLE MyTable22 (
	ssn VARCHAR(13) UNIQUE,
    name VARCHAR(20)
);

DESC MyTable22;

INSERT INTO MyTable22 (ssn, name)
VALUES ('1', '정대만');
INSERT INTO MyTable22 (ssn, name)
VALUES ('1', '송태섭'); -- fail
INSERT INTO MyTable22 (ssn, name)
VALUES (null, '채소연'); -- ok
INSERT INTO MyTable22 (ssn, name)
VALUES (null, '강백호'); -- ok
SELECT * FROM MyTable22;

CREATE TABLE MyTable23 (
	Col1 VARCHAR(20) NOT NULL UNIQUE DEFAULT 0
    );
    
    DESC MyTable23;