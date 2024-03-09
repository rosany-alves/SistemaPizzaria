/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Rosany
 */
public class Conexao {
    public Connection getConnection(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=PIZZARIA;";
            String user = "teste";
            String password = "123456";
            return DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            // Lide com a exceção de uma maneira apropriada, como log de erro ou mensagem de usuário
            throw new RuntimeException("Erro ao conectar ao banco de dados.", e);
        }
    }
}
