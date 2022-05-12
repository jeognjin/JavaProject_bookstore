--drop table book_order;
--drop table book;
--drop table customer;
--drop table publisher;

/* 도서 목록 */
CREATE TABLE book (
	bookno INT NOT NULL, /* 도서번호 */
	price INT NOT NULL, /* 가격 */
	title VARCHAR2(50) NOT NULL, /* 도서이름 */
	publisher_name VARCHAR2(50) NOT NULL /* 출판사이름 */
);

CREATE UNIQUE INDEX PK_book
	ON book (
		bookno ASC,
		price ASC
	);

ALTER TABLE book
	ADD
		CONSTRAINT PK_book
		PRIMARY KEY (
			bookno,
			price
		);

--drop SEQUENCE book_no;
create SEQUENCE book_no;

insert into book values(book_no.nextval, 12600, '불편한 편의점', '나무옆의자');
insert into book values(book_no.nextval, 14000, '작별인사', '복복서가');
insert into book values(book_no.nextval, 16000, '내가 틀릴 수도 있습니다', '다산초당');
insert into book values(book_no.nextval, 17000, '물고기는 존재하지 않는다', 'Grand Central Publishing');
insert into book values(book_no.nextval, 23300, 'Pachinko', '나무옆의자');
insert into book values(book_no.nextval, 11000, 'Wonder', 'Random House');

select * from book;
--delete from book;
