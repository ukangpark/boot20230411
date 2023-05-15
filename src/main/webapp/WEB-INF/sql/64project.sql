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

SELECT * FROM MemberAuthority;

INSERT INTO MemberAuthority 
VALUES ('admin0', 'admin');

SELECT *
FROM Member m LEFT JOIN MemberAuthority ma ON m.id=ma.memberId
WHERE m.id='admin0';

