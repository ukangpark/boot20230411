USE w3schools;
-- normalization 정규화
-- 1NF (first normal form) 첫번째 정규화
-- 예제) 학생명, 전화번호 저장
CREATE TABLE Student (
	id INT PRIMARY KEY AUTO_INCREMENT, -- 기본키를 위해 인위적 키 컬럼 만듦 
	Name VARCHAR(50)
);

CREATE TABLE StudentPhone (
	id INT PRIMARY KEY AUTO_INCREMENT, -- (sysnthetic key)변경되지 않는 기본키가 존재해야하기 때문에 인위적인 컬럼만듦
	StudentId INT, -- name을 써야하는데, 동명이인이 있을 수 있으니까, id컬럼을 새로만듦
    Phone VARCHAR(50)
);

-- 예제) 교재 정보를 저장할 테이블 작성
CREATE TABLE books (
	Id INT PRIMARY KEY AUTO_INCREMENT, -- (sysnthetic key)
	Title VARCHAR(50),
    Price INT,
    Writer VARCHAR(50),
    Published DATE
);
-- 2NF (second normal form) 두번째 정규화
-- 3NF (third normal form) 세번째 정규화