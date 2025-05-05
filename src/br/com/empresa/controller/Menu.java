package br.com.empresa.controller;

import br.com.empresa.model.Funcionario;

import java.util.Scanner;

public class Menu {

    public void executarMenu() {

        boolean exit = false;

        Scanner scanner = new Scanner(System.in);
        FuncionarioController funcionarioController = new FuncionarioController();

        while (!exit) {
            System.out.println("------------ Bem Vindo ------------");
            System.out.println("-------------- Menu ---------------");
            System.out.println(" 1 - Listar Funcionários           ");
            System.out.println(" 2 - Deletar Funcionário           ");
            System.out.println(" 3 - Cadastrar Funcionário         ");
            System.out.println(" 4 - Sair"                          );

            System.out.print("Escolha uma opção: ");
            int userOption = scanner.nextInt();
            scanner.nextLine();

            switch (userOption) {
                case 1:
                    funcionarioController.consultarFuncionarios();
                    break;
                case 2:
                    funcionarioController.consultarFuncionarios();
                    System.out.print("Informe o ID do funcionário: ");
                    int funcId = scanner.nextInt();
                    scanner.nextLine();
                    boolean validaDelete = funcionarioController.deletarFuncionario(funcId);

                    if (validaDelete) {
                        System.out.println("Funcionário deletado com sucesso!");
                    } else {
                        System.out.println("Ocorreu um erro ao deletar o funcionário!");
                    }
                    break;
                case 3:
                        Funcionario funcionario = new Funcionario();
                        funcionario.cadastrarFuncionario();
                        boolean validaCadastro = funcionarioController.cadastrarFuncionario(funcionario);

                        if (validaCadastro) {
                            System.out.println("Funcionário cadastrado com sucesso!");
                        } else {
                            System.out.println("Ocorreu um erro ao cadastrar o funcionário");
                        }
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Escolha uma opção válida!");
            }


        }

    }

}
