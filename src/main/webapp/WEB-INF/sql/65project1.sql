USE Board;

SELECT * FROM Board;

CREATE TABLE BoardLike (
	boardId INT NOT NULL,
    memberId VARCHAR(20) NOT NULL,
    PRIMARY KEY (boardId, memberId),
    FOREIGN KEY (boardId) REFERENCES Board(id),
    FOREIGN KEY (MemberId) REFERENCES Member(id)
);

SELECT * FROM BoardLike;

SELECT 
	b.id,
	b.title,
	b.body,
	b.writer,
	b.inserted,
	f.fileName,
	(SELECT COUNT(*) from BoardLike WHERE boardId = b.id) countLike
FROM Board b LEFT JOIN FileName f ON b.id = f.boardId
WHERE b.id = 2070;

SELECT COUNT(*) FROM BoardLike
WHERE boardId = 2070;

SELECT * FROM BoardLike;
