USE w3schools;

-- transaction : 하나의 업무 단위
-- 하나의 transaction 여러 insert, update, delete
-- 명령문으로 구성될 수 있다.

CREATE TABLE Bank (
	CustomerName VARCHAR(255),
    money INT DEFAULT 0 );
    
SELECT * FROM Bank;
    
INSERT INTO Bank VALUES ('A', 100000);
INSERT INTO Bank VALUES ('B', 100000);

-- a의 돈(5000)을 b에게 이체 (이때 두개의 updqte가 둘다 성공하거나 둘다 실패하거나해야함)
UPDATE Bank SET money = money - 5000
WHERE customerName = 'A';
UPDATE Bank SET money = money + 5000
WHERE customerName = 'B';

SET autocommit = 0; -- 자동커밋 비활성화 (disable)
SET autocommit = 1; -- 자동커밋 활성화 (enable)

UPDATE Bank SET money = money - 5000 WHERE customerName = 'A';
UPDATE Bank SET money = money + 5000 WHERE customerName = 'B';
-- 트렌젝션 진행중인 상태(commit 아직 안됨 - 나만 바뀐게 보이고 다른사람은 이전 커밋상태가 보임)

SELECT * FROM Bank;

ROLLBACK; -- 마지막 커밋으로 되돌리기
COMMIT; -- 트렌젝션 완료

-- 이체시 오류 (A -> B 5000원)
UPDATE Bank SET money = money - 5000 WHERE customerName = 'A'; -- 잘 실행됨
-- 오류 생겼다고 가정
-- B에게 5000원이 이체되지 못한 상태에서 commit하면 안됨 rollback으로 이전상태로 돌아가기
ROLLBACK; 
    