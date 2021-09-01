drop table if exists mcgregor;

create table mcgregor
(
    phone_number varchar   not null,
    age          integer   not null,
    email        varchar   not null,
    action       varchar,
    date_time    timestamp not null,
    primary key (phone_number, age)
);

truncate mcgregor;

insert into mcgregor (phone_number, age, email, action, date_time)
values ('79306661000', 25, 'dean@gmail.com', 'create', '2019-02-13 18:01:01'),
       ('79306661001', 30, 'sam@gmail.com', 'create', '2019-02-21 18:05:01'),
       ('79306661002', 27, 'castiel@gmail.com', 'create', '2019-04-15 21:30:30'),
       ('79306661003', 18, 'crowley@gmail.com', 'create', '2019-05-30 18:11:01'),
       ('79306661004', 33, 'john@gmail.com', 'create', '2019-05-12 17:00:01'),
       ('79306661005', 29, 'conor@gmail.com', 'create', '2019-06-17 19:22:01'),
       ('79306661006', 21, 'habib@gmail.com', 'create', '2019-10-09 18:56:01');