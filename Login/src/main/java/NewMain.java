
import View.TelaLogin;
import javax.swing.JFrame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Temis juninho
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Cria uma instância da tela de login
        TelaLogin telaLogin = new TelaLogin();

        // Torna a tela de login visível
        telaLogin.setVisible(true);

        // Opcional: Defina o que acontece ao fechar a janela (exemplo: encerrar o programa)
        telaLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
