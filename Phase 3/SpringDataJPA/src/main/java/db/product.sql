USE mydb;
select * from product;
drop table product;
create table product(
	id int AUTO_INCREMENT PRIMARY KEY, 
	name varchar(255), 
	description varchar(255),
	price double
);