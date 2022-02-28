create database library_management;
use library_management;

CREATE TABLE student (
	FullName VARCHAR(100) NOT NULL,
    RollNo VARCHAR(20) PRIMARY KEY,
    Gender Varchar(10),
    Password VARCHAR(100)
    );
CREATE TABLE IF NOT EXISTS `books` (
  `id` varchar(20) NOT NULL ,
  `name` varchar(100) NOT NULL,
  `author` varchar(100) NOT NULL,
  `genre` varchar(100) NOT NULL,
  `issued` TINYINT  NOT NULL,
  PRIMARY KEY (`id`)
); 
INSERT INTO `books` (`id`, `name`, `author`, `genre`,`issued`) VALUES
('b001',  'C In Depth', 'Shrivastav','Programming', 0),
('b002',  'DBMS', 'Korth', 'Programming',0 ),
('b003',  'And Then There Were None', 'Agatha Christie','Mystery' , 0 );

CREATE TABLE issuedBooks (
  `id` varchar(20)  PRIMARY KEY,
  `name` varchar(100) ,
  `author` varchar(100),
  `genre` varchar(100) ,
  `issuedBy` varchar(20),
   `issueDate` date ,
   `returnDate` date
);




    
    
    