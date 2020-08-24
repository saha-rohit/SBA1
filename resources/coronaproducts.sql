DROP DATABASE coronadb;

CREATE DATABASE coronadb;


USE coronadb;

CREATE TABLE coronaItems(
 id INT PRIMARY KEY,
 productdesc varchar(450) NOT NULL,
 productname varchar(100) NOT NULL,
 cost decimal NOT NULL, 
);



