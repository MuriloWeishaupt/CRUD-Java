create database db_java;
use db_java;

create table departamento (
	idDepartamento int not null auto_increment,
    nome varchar(45) not null,
    sigla varchar(45) not null,
    primary key (idDepartamento)
);

create table funcionario (
	idFuncionario int not null,
    nome varchar(45) not null,
    matricula int not null,
    departamento_fk int,
    constraint fk_departamento foreign key (departamento_fk) references departamento (idDepartamento)
);

insert into departamento(nome, sigla) values
	("Desenvolvimento", "DEV"),
    ("Qualidade", "QA"),
    ("Engenharia", "ENG");


insert into funcionario (idFuncionario, nome, matricula, departamento_fk) values
	(1, "Maria", 2534, 3),
    (2, "Murilo", 8352, 3),
    (3, "Paula", 2855, 3);


select * from funcionario;


