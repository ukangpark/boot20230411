-- alter table : 테이블 변경
CREATE TABLE MyTable13 (
	Col1 INT,
	Col2 INT
);
 -- 컬럼 추가 ADD COLUMN
 ALTER TABLE MyTable13
 ADD COLUMN Col3 VARCHAR(10);
 DESC MyTable13;
 
 ALTER TABLE MyTable13
 ADD COLUMN Col4 VARCHAR(5);
 
  ALTER TABLE MyTable13
 ADD COLUMN Col5 DEC(5,2);
 
 -- 첫번째 칼럼으로 추가
 ALTER TABLE MyTable13 ADD COLUMN Col6 INT FIRST;
 ALTER TABLE MyTable13 ADD COLUMN Col7 INT FIRST;
 
 -- 중간에 컬럼 추가
 ALTER TABLE MyTable13 ADD COLUMN Col8 VARCHAR(9) AFTER Col7; -- Col7다음으로 넣겠다.
 
DESC MyTable13;

ALTER TABLE MyTable13 ADD COLUMN Col9 INT FIRST;

ALTER TABLE MyTable13 ADD COLUMN Col10 INT AFTER  Col6;
 
 
