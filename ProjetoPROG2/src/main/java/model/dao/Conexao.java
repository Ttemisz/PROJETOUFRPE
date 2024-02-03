
package model.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
   
   
    public Connection getConnection()throws SQLException{
        Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","1234");
        return conexao;
    
    }
    
    public static Connection conector() {
        Connection conexao = null;
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String usuario = "postgres";
        String senha = "1234";

        try {
            conexao = DriverManager.getConnection(url, usuario, senha);
            return conexao;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}

