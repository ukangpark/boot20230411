USE Board;

SELECT * FROM Member;

CREATE TABLE Comment (
		id INT PRIMARY KEY AUTO_INCREMENT,
        boardId INT NOT NULL,
		content VARCHAR(500) NOT NULL,
        memberId VARCHAR(20) NOT NULL,
        inserted DATETIME NOT NULL DEFAULT now(),
        FOREIGN KEY (boardId) REFERENCES Board(id),
        FOREIGN KEY (memberId) REFERENCES Member(id)
);

INSERT INTO Comment (boardId, content, memberId)
VALUES (2067, '댓글하나', '5');
INSERT INTO Comment (boardId, content, memberId)
VALUES (2067, '댓글둘', '5');
INSERT INTO Comment (boardId, content, memberId)
VALUES (2067, '댓글셋', '5');

SELECT * FROM Comment
ORDER BY id DESC;