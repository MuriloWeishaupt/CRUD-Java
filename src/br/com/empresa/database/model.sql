create database db_java;
use db_java;
drop table funcionario;

create table departamento (
	idDepartamento int not null auto_increment,
    nome varchar(45) not null,
    sigla varchar(45) not null,
    primary key (idDepartamento)
);

create table funcionario (
	idFuncionario int auto_increment primary key,
    nome varchar(45) not null,
    matricula int not null,
    departamento_fk int,
    constraint fk_departamento foreign key (departamento_fk) references departamento (idDepartamento)
);

insert into departamento(nome, sigla) values
	("Desenvolvimento", "DEV"),
    ("Qualidade", "QA"),
    ("Engenharia", "ENG");


insert into funcionario (nome, matricula, departamento_fk) values
	( "Maria", 2534, 3),
    ( "Murilo", 8352, 3),
    ( "Paula", 2855, 3);


select * from funcionario;


