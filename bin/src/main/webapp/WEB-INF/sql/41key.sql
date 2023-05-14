-- primary key : not null + unique
CREATE TABLE myTable24(
	Col1 INT PRIMARY KEY -- NOT NULL + UNIQUE
);

DESC myTable24;

CREATE TABLE MyTable25(
	Col1 INT,
    PRIMARY KEY (Col1)
);

DESC MyTable25;

CREATE TABLE MyTable26 (
	Col1 INT,
	Col2 INT,
    PRIMARY KEY (Col1, Col2) -- 두 컬럼의 조합이 유일
);
DESC MyTable26;

INSERT INTO MyTable26 (col1, col2)
VALUES (1,1); -- ok
INSERT INTO MyTable26 (col1, col2)
VALUES (1,1); -- fail
INSERT INTO MyTable26 (col1, col2)
VALUES (1,2); -- ok
SELECT * FROM MyTable26;

CREATE TABLE MyTable27 (
	Col1 INT,
    Col2 INT,
    PRIMARY KEY (Col1),
    PRIMARY KEY (Col2)
);
-- 제약사항 (constraints) 
-- default, unique, not null, primary key