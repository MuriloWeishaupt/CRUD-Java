package br.com.empresa;

import br.com.empresa.database.Conexao;

public class App {
    public static void main(String[] args) {
        Conexao conexao = new Conexao();

        conexao.getConnection();
    }
}
