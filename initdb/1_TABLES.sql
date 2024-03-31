/*drop table if exists PersonalInfo;
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
);
*/
/*
create table students
(
    id SERIAL PRIMARY KEY,
    first_name TEXT not null,
    last_name TEXT not null,
    birthdate date null,
    major_id int null,
    image bytea null
);*/

create table infos
(
    id SERIAL PRIMARY KEY,
    nom TEXT not null,
    prenom TEXT not null
);
/*
create table majors
(
    id SERIAL PRIMARY KEY,
    name TEXT not null,
    description TEXT not null
);

create table courses
(
    id SERIAL PRIMARY KEY,
    name TEXT not null,
    hours int not null
);
*/

