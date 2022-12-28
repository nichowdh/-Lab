USE niladri_db;
# 1st table creation
create table Department(
Department_id int primary key,
Department_name varchar (15) ,
Department_head varchar (15),
Department_description varchar (20));


#2nd table creation
create table Employee_2(
Employee_id int primary key,
Employee_name varchar(20),
Employee_address varchar(50), 
Employee_salary double,
CHECK (Employee_salary between 1000 and 1000000),
Employee_Contact_No bigint(11),
Department_id int,foreign key(Department_id) references Department(Department_id));






