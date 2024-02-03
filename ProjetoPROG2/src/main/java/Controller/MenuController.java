
package Controller;


import View.TelaCasaCadastro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.dao.Conexao;
import model.dao.MenuDAO;

public class MenuController {
    public void cadastroCasas(TelaCasaCadastro view) throws SQLException{
        Connection conexao = new Conexao().getConnection();
        MenuDAO cadastro = new MenuDAO();
        cadastro.cadastrarCasas(view.getCaixacasaid().getText(), view.getCaixacasacadastro1().getText(), view.getCaixacasacadastro2().getText(),view.getCaixacasacadastro3().getText());
    }
    
    public void buscar_por_id(Connection conn, String nome_tabela, int id) {
    PreparedStatement preparedStatement = null;
    ResultSet rs = null;

    try {
        String consulta = String.format("SELECT * FROM %s WHERE empid = ?", nome_tabela);
        preparedStatement = conn.prepareStatement(consulta);
        preparedStatement.setInt(1, id);

        rs = preparedStatement.executeQuery();

        while (rs.next()) {
            System.out.print(rs.getString("empid") + " ");
            System.out.print(rs.getString("nome") + " ");
            System.out.println(rs.getString("endereco"));
        }
    } catch (SQLException e) {
        System.out.println(e);
    } finally {
       
        try {
            if (rs != null) {
                rs.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}

}
