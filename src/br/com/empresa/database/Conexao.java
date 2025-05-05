package br.com.empresa.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    private String servidor, banco, user, password;
    public Connection conexao;

    public Conexao() {
        this.servidor = "localhost";
        this.banco = "db_java";
        this.user = "root";
        this.password = "weishaupt";
    }


    public Boolean connectDrive() {

        try {

            this.conexao = DriverManager.getConnection("jdbc:mysql://" + this.servidor + "/" + this.banco, this.user, this.password);
            return true;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        }

    }

    public Connection getConnection() {
        boolean validaConexao = connectDrive();
        System.out.println(validaConexao);

        if (validaConexao) {
            return this.conexao;
        }

        return null;
    }

}
