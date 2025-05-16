package com.pet;

import com.pet.conexao.Conexao;
import com.pet.conexao.conexao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Conexao conexao = new Conexao();

        conexao.getConexao();
    }
}



// //PS C:\Users\aluno\Downloads\servidorMaven>  & 'C:\Program Files\Java\jre1.8.0_421\bin\java.exe' '-cp' 'C:\Users\aluno\Downloads\servidorMaven\target\classes' 'com.pet.App' 
// java.sql.SQLException: No suitable driver found for jdbc:mysql://localhost33306/nome_da_base_de_dados
// at java.sql.DriverManager.getConnection(Unknown Source)
// at java.sql.DriverManager.getConnection(Unknown Source)
// at com.pet.conexao.Conexao.getConexao(Conexao.java:22)
// at com.pet.App.main(App.java:16)
// ERRO NA CONEXÃO
// PS C:\Users\aluno\Downloads\servidorMaven> 