CREATE TABLE MyTable17 (
	Col1 INT,
    Col2 INT NOT NULL
);

INSERT INTO MyTable17 (Col1, Col2)
VALUES (100, 200);

INSERT INTO MyTable17 (Col2)
VALUES (200);

INSERT INTO MyTable17 (Col1)
VALUES (100); -- FAIL
SELECT * FROM MyTable17;

CREATE TABLE MyTable18 (
	Col1 VARCHAR(20),
    Col2 VARCHAR(20) 
);

ALTER TABLE MyTable18
MODIFY COLUMN Col2 VARCHAR(20) NOT NULL;

INSERT INTO MyTable18 (Col1)
VALUES ('abc');

DESC MyTable17;

CREATE TABLE MyTable19 (
	Col1 INT DEFAULT 0,
    Col2 INT NOT NULL
);

DESC MyTable19;
INSERT INTO MyTable19(Col1, Col2)
VALUES (100, 200);
INSERT INTO MyTable19 (Col2)
VALUES (200); -- ok Col1에는 0
INSERT INTO MyTable19(Col1) VALUES (100); -- fail col2가 null을 허용하지 않으니까

-- not null default 조합 가능
CREATE TABLE MyTable20 (
	Col1 INT, -- NULL 허용, DEFAULT 없음
    Col2 INT NOT NULL, -- NULL 허용안함, DEFAULT 없음
    Col3 INT DEFAULT 0, -- NULL 허용, DEFAULT 0
    Col4 INT NOT NULL DEFAULT 0  -- NULL허용안함, DEFAULT 0
    );
    
    DESC MyTable20;