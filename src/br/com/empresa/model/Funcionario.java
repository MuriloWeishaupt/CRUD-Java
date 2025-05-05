package br.com.empresa.model;

import java.util.Scanner;

public class Funcionario {

    private int idFuncionario;
    private String nome;
    private int departamento;
    private int matricula;

    Scanner scanner = new Scanner(System.in);

    public void cadastrarFuncionario() {
        System.out.println("/-------- Cadastro de Funcionário --------/");
        System.out.print("Informe o nome: ");
        this.nome = scanner.nextLine();
        System.out.print("Informe a matrícula: ");
        this.matricula = scanner.nextInt();
        System.out.println("Informe o departamento [ 1 - DEV   2 - QA   3 - ENG]: ");
        this.departamento = scanner.nextInt();
        scanner.nextLine();

        System.out.println("/-----------------------------------------/");

    }

    public void exibirInfos() {
        System.out.println("/---Informações Funcionário---/");
        System.out.println("ID: " + this.idFuncionario);
        System.out.println("NOME: " + this.nome);
        System.out.println("DEPARTAMENTO: " + this.departamento);
        System.out.println("MATRÍCULA: " + this.matricula);
        System.out.println("/-----------------------------/");
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getDepartamento() {
        return departamento;
    }

    public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }
}
