drop table neo_matrix;

truncate table neo_matrix;

create table neo_matrix
(
    phone_number varchar2(50) not null,
    age          number(10)   not null,
    email        varchar2(50),
    action       varchar2(50),
    constraint neo_matrix_pk primary key (phone_number, age)
);

insert into neo_matrix (phone_number, age, email, action)
select '79306661000', 33, 'neo@gmail.com', 'delete'
from dual
union all
select '79306661001', 29, 'trinity@gmail.com', 'delete'
from dual
union all
select '79306661002', 49, 'morpheus@gmail.com', 'delete'
from dual;
