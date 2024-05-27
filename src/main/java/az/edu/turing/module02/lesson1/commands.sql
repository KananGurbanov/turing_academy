create table students(
                         name varchar(255),
                         age int,
                         grade double precision
);

drop table students;

insert into students
values ('Kanan', 20, 70);

select * from students;

select * from students where grade>69;

