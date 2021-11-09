--drop tables if exists
DROP TABLE IF EXISTS book CASCADE;
DROP TABLE IF EXISTS issued_book CASCADE;
DROP TABLE IF EXISTS returned_book CASCADE;
DROP TABLE IF EXISTS library_user CASCADE;

--Create book table
CREATE TABLE IF NOT EXISTS book (
	book_id SERIAL PRIMARY KEY,
	book_name VARCHAR(100),
	book_writer VARCHAR(100),
	isbn VARCHAR(100),
	publisher VARCHAR(100),
	price int,
	user_id INTEGER
);


--create issued_book table
CREATE TABLE IF NOT EXISTS issued_book (
	IID SERIAL PRIMARY KEY,
	issued_date DATE,
	period NUMERIC,
	genre VARCHAR(100)

);

--create returned book table
CREATE TABLE IF NOT EXISTS returned_book (
	RID SERIAL PRIMARY KEY,
	return_date DATE,
	fine numeric
);
-- many-to-many junction table (bridge, join)
CREATE TABLE book_return_book (
	book_id INTEGER REFERENCES book(book_id),
	RID INTEGER REFERENCES returned_book(rid),
	PRIMARY KEY (book_id, rid)
);

-- many-to-many junction table (bridge, join)
CREATE TABLE book_issue_book (
	book_id INTEGER REFERENCES book(book_id),
	IID INTEGER REFERENCES issued_book(iid),
	PRIMARY KEY (book_id, iid)
);

-- create users table
CREATE TABLE IF NOT EXISTS library_user (
	user_id SERIAL PRIMARY KEY,
	user_name VARCHAR(25),
	user_password VARCHAR(100),
	user_type VARCHAR(50),
	first_name VARCHAR(25),
	last_name VARCHAR(25),
	address VARCHAR(100),
	phone VARCHAR(25)
);
--insert data to book 
INSERT INTO book(book_name,book_writer,isbn,publisher,price) values
('JAVA FOR BEGGINER','Herbert Schildt','1259589315','oracle press',48.75),
('THE SOUND OF FURY','Herbert Schildt','01549118706','Little, Brown & Company',14.75),
('LESS','Andrew Sean Greer','012378','Little, Brown & Company',30.75),
('ALL THE LIGHT','Anthony Doerr','1508239789','Little, Brown & Company',9.75),
('THE REUNION','Dan Walsh','1469213982','Brilliance Audio',13.99),
('POISON TOWN','Creston Mapes','012378','Brilliance Audio',22.75),
('FIREFLY LANE','Andrew Sean Greer','1469234459','Little, Brown & Company',98.75),
('I AM NOT WHO DO YOU THINK I AM','Andrew Sean Greer','1094000337','Blackstone Publishing',20.58),
('ONCE WE WERE HERE','christopher cosmos','1510757120','Arcade',17.84)
;
--insert data to library_user 
INSERT INTO library_user(user_name,user_password,user_type,first_name,last_name,address,phone) values
('admin','admin','admin','admin','admin','admin','admin' ),
('guru','katuwal','admin','Guru','katuwal','123 park st','608-444-1111');

--many books one library user
ALTER TABLE book 
ADD CONSTRAINT book_library_user_fkey 
FOREIGN KEY (user_id)
REFERENCES library_user(user_id);

select * from library_user;
select * from book;

