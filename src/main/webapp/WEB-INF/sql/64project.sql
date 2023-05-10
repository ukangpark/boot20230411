USE Board;

SELECT * FROM Board;
SELECT * FROM Member;

DESC Board;
ALTER TABLE Board
ADD FOREIGN KEY (writer) REFERENCES Member(id);

UPDATE Board
SET writer = '1';

CREATE TABLE MemberAuthority (
	memberId VARCHAR(20) NOT NULL,
	authority VARCHAR(30) NOT NULL,
    FOREIGN KEY (memberId) REFERENCES Member(id),
    PRIMARY KEY (memberId, authority)
);


