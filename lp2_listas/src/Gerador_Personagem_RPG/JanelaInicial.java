package Gerador_Personagem_RPG;

import javax.swing.*;
import java.awt.*;
import Gerador_Personagem_RPG.Personagem.TelaPrincipal;

public class JanelaInicial {

    public static void main(String[] args) {
        // Garante que a interface gráfica (Swing) rode na thread de eventos correta (EDT)
        SwingUtilities.invokeLater(() -> {
            
            // ==========================================
            // 1. CONFIGURAÇÃO DA JANELA PRINCIPAL
            // ==========================================
            JFrame janelaInicial = new JFrame("SISTEMA GERADOR DE PERSONAGEM - RPG");
            janelaInicial.setSize(600, 350); // Define a largura (600px) e altura (350px)
            janelaInicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Encerra o programa ao fechar
            janelaInicial.setLocationRelativeTo(null); // Centraliza a janela na tela do usuário

            // ==========================================
            // 2. PALETA DE CORES E FONTES (ESTILO MATRIX)
            // ==========================================
            Color fundoPreto = new Color(10, 10, 10);     // Fundo escuro
            Color verdeFonte = new Color(0, 255, 65);     // Verde brilhante para os textos
            Color verdeBorda = new Color(50, 205, 50);    // Verde limão para o contorno dos botões
            Font fonteGrande = new Font(Font.MONOSPACED, Font.BOLD, 18); // Fonte estilo terminal

            // ==========================================
            // 3. CRIAÇÃO E LAYOUT DO PAINEL
            // ==========================================
            // Usa GridBagLayout para facilitar o alinhamento centralizado
            JPanel painelInicial = new JPanel(new GridBagLayout());
            painelInicial.setBackground(fundoPreto);

            // Objeto de restrições para posicionamento dos elementos no painel
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridx = 0; // Coluna 0
            gbc.gridy = 0; // Linha 0
            gbc.insets = new Insets(15, 15, 15, 15); // Espaçamento interno (margem)
            gbc.anchor = GridBagConstraints.CENTER;   // Centraliza os componentes no painel

            // ==========================================
            // 4. CONFIGURAÇÃO DO BOTÃO PRINCIPAL
            // ==========================================
            JButton botaoInicial = new JButton("[ ⚔️ CRIAR PERSONAGEM ]");
            botaoInicial.setFont(fonteGrande);
            botaoInicial.setPreferredSize(new Dimension(420, 60)); // Tamanho fixo do botão
            botaoInicial.setBackground(new Color(20, 35, 20));     // Fundo escuro do botão
            botaoInicial.setForeground(verdeFonte);                // Cor do texto
            botaoInicial.setBorder(BorderFactory.createLineBorder(verdeBorda, 2)); // Borda verde estilizada
            botaoInicial.setFocusPainted(false);                    // Remove a borda de foco azul padrão
            botaoInicial.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Altera o ponteiro do mouse para a mãozinha

            // ==========================================
            // 5. EVENTO DE CLIQUE DO BOTÃO
            // ==========================================
            // Abre a janela principal do gerador e fecha a janela de boas-vindas
            botaoInicial.addActionListener(e -> {
                new TelaPrincipal().setVisible(true); // Exibe a interface do formulário
                janelaInicial.dispose();              // Destrói a janela inicial para liberar memória
            });

            // ==========================================
            // 6. MONTAGEM E EXIBIÇÃO DA TELA
            // ==========================================
            painelInicial.add(botaoInicial, gbc); // Adiciona o botão ao painel com as configurações do layout
            janelaInicial.add(painelInicial);     // Adiciona o painel à janela principal
            janelaInicial.setVisible(true);       // Torna a janela visível para o usuário
        });
    }
}