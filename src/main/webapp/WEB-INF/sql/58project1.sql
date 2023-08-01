CREATE DATABASE Board;
USE Board;
-- 테이블명: UpperCamelCase
-- 컬럼명: lowerCamelCase
CREATE TABLE Board (
	id INT PRIMARY KEY AUTO_INCREMENT,
	title VARCHAR(50) NOT NULL,
    body VARCHAR(1000) NOT NULL,
    writer VARCHAR(20),
    inserted DATETIME DEFAULT NOW()
);

DESC Board;

SELECT * FROM Board;

INSERT INTO Board (title, body, writer)
VALUES ('샘플제목','샘플본문','user00');

CREATE DATABASE ours;