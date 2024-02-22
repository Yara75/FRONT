drop table Personal_info;

create table Personal_info (
    item TEXT not null unique,
    info TEXT not null unique
);

drop table Free_entrie;

create table Free_entrie(
    section TEXT not null unique,
    info text not null unique
);