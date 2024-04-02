drop table if exists PersonalInfo;
create table PersonalInfo (
    id SERIAL PRIMARY KEY,
    surname TEXT not null,
    name TEXT not null,
    birth date
);

drop table if exists FreeEntrie;
create table FreeEntrie(
    id serial PRIMARY KEY ,
    section TEXT not null,
    info text not null
);

drop table if exists Diploma;
create table Diploma(
    id serial primary key ,
    obtentionDate date not null ,
    name text not null,
    school text not null
);

drop table if exists Contact;
create table Contact(
    id serial primary key ,
    type text not null,
    info text not null unique
)