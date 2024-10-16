create table lesson3_students
(
    id         bigserial    primary key,
    name       varchar(255) not null check (name != ' '),
    created_at timestamp default now(),
    is_female  boolean   default true,
    pin        varchar(7) unique,
    age        int check ( age >= 16 )
);

insert into lesson3_students

values (1, 'Kanan', now(), false, 'kenan', 20);

drop table if exists students;

select * from lesson3_students
where id = 2;

select nextval('students_id_seq');