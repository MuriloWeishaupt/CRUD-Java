package br.com.empresa.controller;

import br.com.empresa.database.Conexao;
import br.com.empresa.model.Funcionario;

import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FuncionarioController {

    public void consultarFuncionarios() {

        try {
            Conexao conexao = new Conexao();
            Connection objConnection = conexao.getConnection();

            Statement statement = objConnection.createStatement(); //Statement para executar comandos SQL em um banco de dados
            String queryConsulta = "select * from funcionario";

            ResultSet resultSet = statement.executeQuery(queryConsulta); //Retorno do banco de dados

            while (resultSet.next()) {

                Funcionario funcionario = new Funcionario();

                funcionario.setIdFuncionario(resultSet.getInt("idFuncionario"));
                funcionario.setNome(resultSet.getString("nome"));
                funcionario.setMatricula(resultSet.getInt("matricula"));
                funcionario.setDepartamento(resultSet.getInt("departamento_fk"));

                funcionario.exibirInfos();
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }


    public Boolean cadastrarFuncionario(Funcionario funcionario) {

        try {

            Conexao conexao = new Conexao();

            Connection objConnection = conexao.getConnection();

            Statement statement = objConnection.createStatement();

            String queryCreate = "insert into funcionario (nome, matricula, departamento_fk) values ('" +
                    funcionario.getNome() + "','" +
                    funcionario.getMatricula() + "','" +
                    funcionario.getDepartamento() + "')";

            statement.executeUpdate(queryCreate);
            return true;


        } catch (Exception e) {
            System.out.println(e);
            return false;
        }

    }

    public Boolean deletarFuncionario(int id) {

        try {
            Conexao conexao = new Conexao();
            Connection objConnection = conexao.getConnection();
            Statement statement = objConnection.createStatement();

            String queryDelete = "delete from funcionario where idFuncionario = " + id;
            statement.executeUpdate(queryDelete);
            return true;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        }

    }

}
