USE niladri_db;
#table creation
create table College(
stu_id bigint primary key,
stu_fname varchar(20) not null,
stu_lname varchar(20) unique not null,
department varchar(10),
stu_type varchar(10),
fees double(12,2),
password numeric(4) unique not null
);