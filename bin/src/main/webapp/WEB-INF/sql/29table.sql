-- CREATE TABLE : 새 테이블 만들기
-- TABLE 이름 작성규칙 (회사마다 다름)
-- 우리 과정에서는 UpperCamelCase를 사용할 예정

CREATE TABLE MyTable01 (
-- 컬럼 정의
-- 컬럼명 값의 type, ...
-- 우리과정에서는 UpperCamelCase(대소문자구분안함)
Col1 INT,
Col2 VARCHAR(255)
);

SELECT * FROM MyTable01;
-- DESC : 테이블 구조 보기
DESC MyTable01;
INSERT INTO MyTable01 (Col1, Col2)
VALUES(30, '가나다');
INSERT INTO MyTable01 (Col1, Col2)
VALUES('삼십', '가나다');