package com.pet.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    //Atrinutos do protocolo de conexão com o banco de dados
    private String url = "jdbc:mysql://localhost:3306/pet";
    private String user = "root";
    private String password = "";

    private Connection conexao;


    //Metodo para criar a conexão com o banco de dados
    public Connection getConexao(){
        
        try {
            //Try: tente fazer isso "a conexão"
         conexao = DriverManager.getConnection(url, user, password);
            System.out.println("CONEXÃO BEM SUCEDIDA");
            return conexao;
        } catch (SQLException e) { //se não conseguiu
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("ERRO NA CONEXÃO");
        }
        return null;
    }

}
