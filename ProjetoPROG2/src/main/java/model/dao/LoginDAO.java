
package model.dao;

import View.TelaCasaCadastro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class LoginDAO {
    
    public void cadastrarUsuario(String nome, String email, String senha) throws SQLException{
        Connection conexao = new Conexao().getConnection();
        String sql = "INSERT INTO login (nome,email,senha)VALUES('"+nome+"','"+email+"','"+senha+"')";
        System.out.println("teste sql:"+sql);
        PreparedStatement statment = conexao.prepareStatement(sql);
        statment.execute();
        conexao.close();
    }
    
    public void login(String email, String senha) throws SQLException {
        Connection conexao = new Conexao().getConnection();
        String sql = "SELECT email, senha FROM login WHERE email = ? AND senha = ?";
        System.out.println("teste login:" + sql);

        PreparedStatement statement = conexao.prepareStatement(sql);
        statement.setString(1, email);
        statement.setString(2, senha);

        ResultSet rs = statement.executeQuery();

        if (rs.next()) {
            TelaCasaCadastro teladecadastro = new TelaCasaCadastro();
            teladecadastro.setVisible(true);
        } else {

        }
        
}
    //public void login(String email, String senha) throws SQLException{
        //Connection conexao = new Conexao().getConnection();
        //String sql = "SELECT email,senha FROM login WHERE email= '"+email+"' AND senha ='"+senha+"'";
        //System.out.println("teste login:"+sql);
       // PreparedStatement statment = conexao.prepareStatement(sql);
        //ResultSet rs = statment.executeQuery(sql); //biblioteca que vê e salva oque foi executado no SQL lá
        
       // if(rs.next()){
        //    System.out.println("possui usuario");
       // }else{
       //     System.out.println("não possui usuario");
       // }
       // conexao.close();
   // }
}
