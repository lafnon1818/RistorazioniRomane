create database ristorazione;

use ristorazione;

create table ristoranti(
id	int auto_increment,
nome varchar(100) not null unique,
indirizzo varchar(100) not null unique,
particolarita varchar(100),
consigli_vari varchar(100),
provatoNonProvato varchar(100),
primary key (id)
);

INSERT INTO ristoranti (nome, indirizzo, particolarita,consigli_vari,provatoNonProvato)
VALUES ( 'prova2', 'prova2', 'prova2', 'prova2', 'prova2');

select * from ristoranti;

drop table ristoranti;

commit;