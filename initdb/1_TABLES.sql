drop table PersonalInfo;

create table PersonalInfo (
    id serial,
    item TEXT not null unique,
    info TEXT not null unique
);

drop table FreeEntrie;

create table FreeEntrie(
    id serial,
    section TEXT not null unique,
    info text not null unique
);