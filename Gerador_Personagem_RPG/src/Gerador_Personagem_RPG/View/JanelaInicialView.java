package View;

import javax.swing.*;
import java.awt.*;

/**
 * VIEW: Tela Inicial.
 * Responsável apenas pela apresentação da primeira janela.
 */
/*
Cria a tela inicial contendo apenas o layout visual.
*/
public class JanelaInicialView extends JFrame {

    // unico atributo
    private JButton botaoInicial;

    public JanelaInicialView() {
        // janela
        setTitle("SISTEMA GERADOR DE PERSONAGEM - RPG");
        setSize(600, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Estilo
        Color fundoPreto = new Color(10, 10, 10);
        Color verdeFonte = new Color(0, 255, 65);
        Color verdeBorda = new Color(50, 205, 50);
        Font fonteGrande = new Font(Font.MONOSPACED, Font.BOLD, 18);

        // painel
        JPanel painelInicial = new JPanel(new GridBagLayout());
        painelInicial.setBackground(fundoPreto);

        // Gerenciador de layout
        GridBagConstraints gbc = new GridBagConstraints(); // guarda as instruções de como um componente deve se comportar e onde deve ser posicionado na grade do layout
        gbc.gridx = 0; // coluna 0
        gbc.gridy = 0; // linha 0
        gbc.insets = new Insets(15, 15, 15, 15); // margem ao redor de 15X15X15X15
        gbc.anchor = GridBagConstraints.CENTER; // centraliza o componente na grade dele

        // o botao (e unico)
        botaoInicial = new JButton("[ ⚔️ CRIAR PERSONAGEM ]");
        botaoInicial.setFont(fonteGrande);
        botaoInicial.setPreferredSize(new Dimension(420, 60));
        botaoInicial.setBackground(new Color(20, 35, 20));
        botaoInicial.setForeground(verdeFonte);
        botaoInicial.setBorder(BorderFactory.createLineBorder(verdeBorda, 2));
        botaoInicial.setFocusPainted(false); // tira aquele quadrado/linha tracejada de foco padrão do Swing quando o botão é clicado.
        botaoInicial.setCursor(new Cursor(Cursor.HAND_CURSOR)); // muda cursor do mouse para o ícone de "mãozinha" ao passar por cima do botão.

        painelInicial.add(botaoInicial, gbc);
        add(painelInicial);
    }

    // getter do botao inicial
    public JButton getBotaoInicial() {
        return botaoInicial;
    }
}