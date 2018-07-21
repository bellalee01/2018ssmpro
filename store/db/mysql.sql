drop table user;
create table user(
	id int AUTO_INCREMENT,
	name varchar(100),
	password varchar(100),
	email varchar(100),
	mobile varchar(20),
	image varchar(100),
	gender int, 
	create_user varchar(50),
	create_time varchar(50),
	modify_user varchar(50),
	modify_time varchar(50),
	primary key(id)
);