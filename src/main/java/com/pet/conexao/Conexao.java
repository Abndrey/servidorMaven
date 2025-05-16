package com.pet.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    //Atrinutos do protocolo de conexão com o banco de dados
    private String url = "jdbc:mysql://localhost33306/nome_da_base_de_dados";
    private String user = "root";
    private String password = "";

    //Metodo para criar a conexão com o banco de dados
    public void getConexao(){
        try {
            Connection conexao = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
