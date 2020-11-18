# jsp-jstl-sample

A Spring boot Application to perform Basic CRUD operations on users using JPA, JSP and JSTL

Change Database details in application.properties

Create table in MySQL database:

    create table user(
        id int PRIMARY KEY,
        uname varchar(20),
        gender varchar(30),
        email varchar(30),
        phone varchar(30),
        address varchar(30),
        city varchar(30)
    )
