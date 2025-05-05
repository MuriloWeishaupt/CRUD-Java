package br.com.empresa;

import br.com.empresa.controller.FuncionarioController;
import br.com.empresa.controller.Menu;
import br.com.empresa.database.Conexao;

public class App {
    public static void main(String[] args) {
        Menu menu = new Menu();

        menu.executarMenu();
    }
}
