-- foreign key(참조키)
-- 학생명, 전화번호(여러개가능)
CREATE TABLE Student (
	Id INT PRIMARY KEY AUTO_INCREMENT,
	Name VARCHAR(50)
);
CREATE TABLE StudentPhone(
	Id INT PRIMARY KEY AUTO_INCREMENT,
	StudentId INT, -- studentId는 Strudnet테이블의 id와 같아야함 -> 새롭게 저장되면 안됨 
	Phone VARCHAR(50), -- 어느학생의 전화번호인지 알아야함 특정테이블의 어떤데이터와 관련있는지에대한 컬럼을 넣어야함 => 보통 다른테이블의 키컬럼을 추가함
    -- FOREIGN KEY
    FOREIGN KEY (StudentId) REFERENCES Student(Id)
);

DESC Student;
DESC StudentPhone;

-- 데이터 입력
INSERT INTO Student (name) VALUES ('손흥민');
INSERT INTO Student (name) VALUES ('박지성');

SELECT * FROM Student;

INSERT INTO StudentPhone (StudentId, Phone) 
VALUES (1, '010-2222-3333');

INSERT INTO StudentPhone (StudentId, Phone) 
VALUES (2, '010-3333-4444');

INSERT INTO StudentPhone (StudentId, Phone) 
VALUES (3, '010-4444-5555'); -- fail

INSERT INTO StudentPhone (StudentId, Phone) 
VALUES (Null, '010-5555-6666'); -- ok

INSERT INTO StudentPhone (StudentId, Phone) 
VALUES (Null, '010-5555-6666'); -- ok

SELECT * FROM StudentPhone;

DELETE FROM StudentPhone WHERE StudentId IS NULL;
ALTER TABLE StudentPhone
MODIFY COLUMN StudentId INT NOT NULL;

INSERT INTO StudentPhone (StudentId, Phone) VALUES(1, '010-7777-7777');

DELETE FROM Student WHERE ID = 2; -- fail
-- > 외래키 제약사항이 있는 테이블의 데이터를 먼저 지워야함 
DELETE FROM StudentPhone WHERE ID = 2;
-- 지우고 나서, Student의 2번 학생을 지워야 지워짐 
SELECT * FROM Student;