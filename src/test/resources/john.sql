drop table john_wick;

create table john_wick
(
    phone_number varchar2(50) not null,
    age          number(10)   not null,
    email        varchar2(50) not null,
    action       varchar2(50),
    constraint john_wick_pk primary key (phone_number, age)
);

truncate table john_wick;

insert into john_wick (phone_number, age, email, action)
select '79306661000', 25, 'dean@gmail.com', 'create'
from dual
union all
select '79306661001', 30, 'sam@gmail.com', 'create'
from dual
union all
select '79306661002', 27, 'castiel@gmail.com', 'create'
from dual
union all
select '79306661003', 18, 'crowley@gmail.com', 'create'
from dual
union all
select '79306661004', 33, 'john@gmail.com', 'create'
from dual
union all
select '79306661005', 29, 'conor@gmail.com', 'create'
from dual
union all
select '79306661006', 21, 'habib@gmail.com', 'create'
from dual;
