
package Controller;


import java.sql.Connection;
import java.sql.SQLException;
import model.Casas;
import model.dao.Conexao;
import model.dao.MenuDAO;
import View.TelaCasaCadastro;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class MenuController {
    
    
    private TelaCasaCadastro telaCasaCadastro;
    
    public MenuController() {
        
    }
    
    public void setTelaCasaCadastro(TelaCasaCadastro telaCasaCadastro) {
        this.telaCasaCadastro = telaCasaCadastro;
    }
    
    public MenuController(TelaCasaCadastro telaCasaCadastro) {
        this.telaCasaCadastro = telaCasaCadastro;
    }
    
    public TelaCasaCadastro getTelaCasaCadastro() {
        return telaCasaCadastro;
    }
    
    public void cadastroCasas(TelaCasaCadastro view) throws SQLException{
        Connection conexao = new Conexao().getConnection();
        MenuDAO cadastro = new MenuDAO();
        cadastro.cadastrarCasas(view.getCaixacasaid().getText(), view.getCaixacasacadastro1().getText(), view.getCaixacasacadastro2().getText(),view.getCaixacasacadastro3().getText());
    }
    

    public void consultarCasa(String id) throws SQLException {
        MenuDAO dao = new MenuDAO();

        try {
            Casas casaConsultada = dao.consultar(id);

            if (casaConsultada != null) {
            
            JOptionPane.showMessageDialog(null,"\nEndereço: " + casaConsultada.getEndereco()+"\n Número de Quartos: " + casaConsultada.getNumeroQuartos()+"\n Área: " + casaConsultada.getArea());
            casaConsultada.calcularDensidadeQuartosPorMetroQuadrado();

            System.out.println("Casa encontrada!");
            System.out.println("Endereço: " + casaConsultada.getEndereco());
            System.out.println("Número de Quartos: " + casaConsultada.getNumeroQuartos());
            System.out.println("Área: " + casaConsultada.getArea());
            
            
            } else {
                JOptionPane.showMessageDialog(getTelaCasaCadastro(), "Casa não encontrada.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(getTelaCasaCadastro(), "ERRO ao consultar casa.");
        }
    }
    
    public void removerCasa(String id) throws SQLException {
        Connection conexao = new Conexao().getConnection();
        String sql = "DELETE FROM casas WHERE id::VARCHAR = ?";

    try (PreparedStatement statement = conexao.prepareStatement(sql)) {
        statement.setString(1, id);
        int rowsDeleted = statement.executeUpdate();

        if (rowsDeleted > 0) {
            System.out.println("Casa removida com sucesso!!!!!!!");
        } else {
            System.out.println("nenhuma casa encontrada");
        }
    } finally {
        conexao.close();
    }
    }
}        






    



