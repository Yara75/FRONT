drop table if exists PersonalInfo;
create table PersonalInfo (
    id SERIAL PRIMARY KEY,
    surname TEXT not null,
    name TEXT not null,
    birth date
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
);

drop table if exists ExPro;
create table ExPro(
    id serial primary key ,
    nameC text not null,
    beginD date not null unique,
    endD date not null unique,
    job text not null
);

drop table if exists Skills;
create table Skills(
    id serial primary key,
    domains text not null,
    details text not null
);

drop table if exists Hobbie;
create table Hobbie(
    id serial primary key,
    description text not null
);

drop table if exists Certif;
create table Certif(
    id serial primary key,
    name text not null ,
    domain text not null
);

drop table if exists Message;
create table Message(
    id serial primary key ,
    surname text not null ,
    name text not null ,
    contact text not null ,
    date date not null default now(),
    messageBody text not null
);