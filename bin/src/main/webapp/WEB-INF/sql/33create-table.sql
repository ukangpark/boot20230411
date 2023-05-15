DESC MyTable10;
CREATE TABLE MyTable11 (
	-- MyTable10 을 똑같이 써도되지만 불폄함
);

SHOW CREATE TABLE MyTable10;
CREATE TABLE MyTable11 (
   `BookName` varchar(100) DEFAULT NULL,
   `Price` int(11) DEFAULT NULL,
   `Writer` varchar(100) DEFAULT NULL,
   `publisher` varchar(50) DEFAULT NULL,
   `published` date DEFAULT NULL
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
 
 -- 같은 걸럼명 타입으로 새로운 테이블 만들기
 CREATE TABLE MyTable12 AS SELECT * FROM MyTable10;
 
 SELECT * FROM MyTable11;