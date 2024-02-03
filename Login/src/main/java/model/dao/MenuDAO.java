
package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class MenuDAO {
    public void cadastrarCasas(String id,String endereco, String numeroQuartos, String area) throws SQLException{
        Connection conexao = new Conexao().getConnection();
        String sql = "INSERT INTO casas (id,endereco,numeroQuartos,area)VALUES('"+id+"','"+endereco+"','"+numeroQuartos+"','"+area+"')";
        System.out.println("teste sql:"+sql);
        PreparedStatement statment = conexao.prepareStatement(sql);
        statment.execute();
        conexao.close();
    }
}
