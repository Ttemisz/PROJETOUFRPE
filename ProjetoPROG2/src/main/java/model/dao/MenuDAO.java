
package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Casas;


public class MenuDAO {
    
    public MenuDAO() {
    }
    
    public void cadastrarCasas(String id,String endereco, String numeroQuartos, String area) throws SQLException{
        Connection conexao = new Conexao().getConnection();
        String sql = "INSERT INTO casas (id,endereco,numeroQuartos,area)VALUES('"+id+"','"+endereco+"','"+numeroQuartos+"','"+area+"')";
        System.out.println("teste sql:"+sql);
        PreparedStatement statment = conexao.prepareStatement(sql);
        statment.execute();
        conexao.close();
    }
    
    public Casas consultar(String id) throws SQLException {
        Connection conexao = new Conexao().getConnection();
        String sql = "SELECT * FROM casas WHERE id::VARCHAR = ?";

        
        try (PreparedStatement statement = conexao.prepareStatement(sql)) {
            statement.setString(1, id);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                String endereco = resultSet.getString("endereco");
                String numeroQuartos = resultSet.getString("numeroQuartos");
                String area = resultSet.getString("area");

                return new Casas(id, endereco, numeroQuartos, area);
            } else {
                return null; 
            }
        } finally {
            conexao.close();
        }
    }
    
    public void remover(){
        
    }
    
}


