
package Controller;

import model.dao.*;
import View.TelaCadastro;
import View.TelaLogin;
import java.sql.Connection;
import java.sql.SQLException;


public class LoginController {
      
    public void cadastroUsuario(TelaCadastro view) throws SQLException{
        Connection conexao = new Conexao().getConnection();
        LoginDAO cadastro = new LoginDAO();
        cadastro.cadastrarUsuario(view.getCaixaRegistrarUsuario().getText(), view.getCaixaRegistrarEmail().getText(), view.getCaixaRegistrarSenha().getText());
    }
    
      public void LoginUsuario(TelaLogin view) throws SQLException{
        Connection conexao = new Conexao().getConnection();
        LoginDAO login = new LoginDAO();
        login.login(view.getCaixaUsuario().getText(), view.getCaixaSenha().getText());
       
    }
    }

