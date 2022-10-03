create database ristorazione;

use ristorazione;

create table ristorazione.ristoranti(
id	int auto_increment,
nome varchar(100) not null unique,
indirizzo varchar(100) not null unique,
particolarita varchar(100),
consigli_vari varchar(100),
provato_non_provato varchar(100),
primary key (id)
);