drop table if exists PersonalInfo;
create table PersonalInfo (
    id serial,
    item TEXT not null unique,
    info TEXT not null
);

drop table if exists FreeEntrie;
create table FreeEntrie(
    id serial,
    section TEXT not null,
    info text not null
);

drop table if exists Diploma;
create table Diploma(
    id serial,
    obtentionDate date not null ,
    name text not null,
    school text not null
);

drop table if exists Contact;
create table Contact(
    id serial,
    type text not null,
    info text not null unique
)