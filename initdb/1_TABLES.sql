drop table personal_info;

create table personal_info (
    item TEXT not null unique,
    value TEXT not null unique
);