-- change column 컬럼 변경
DESC MyTable13;
ALTER TABLE MyTable13
CHANGE COLUMN Col3 Col13 VARCHAR(20);

INSERT INTO MyTable13 (Col13)
VALUES ('가나다라마바사');
SELECT * FROM MyTable13;

ALTER TABLE MyTable13
CHANGE COLUMN Col13 Col3 VARCHAR(3); -- fail

ALTER TABLE MyTable13
CHANGE COLUMN Col10 Col20 VARCHAR(20);
DESC MyTable13;