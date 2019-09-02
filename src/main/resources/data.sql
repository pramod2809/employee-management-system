DROP TABLE IF EXISTS employees;
 
create table employees
(
   id integer not null,
   name varchar(255) not null, 
   date_entered DATE not null,
   date_modified DATE not null,
   modified_user_id varchar(255) not null,
   created_by varchar(255) not null,
   is_parent BOOLEAN not null,
   alias varchar(255) not null,
   contacts varchar(255) not null,
   primary key(id)
);


--http://localhost:8080/h2-console/login.do  

