
import javax.swing.SwingUtilities;

import Controller.PersonagemController;
import View.JanelaInicialView;
import View.TelaPrincipalView;

/*
Instancia as Views, une-as através do Controller e inicia o programa.
*/

public class App {
    public static void main(String[] args) {
        /*
         * O SwingUtilities.invokeLater é usado para garantir que a criação e
         * manipulação da interface gráfica (Swing) sejam executadas de forma segura
         * para threads (thread-safe).
         * No Java, o Swing possui uma única thread dedicada para gerenciar todos os
         * eventos e o desenho das telas, chamada EDT (Event Dispatch Thread).
         * Se você tentar criar ou modificar componentes visuais fora dessa thread (por
         * exemplo, diretamente na thread main), podem ocorrer bugs visuais, travamentos
         * e comportamentos imprevisíveis. O método invokeLater pega o bloco de código
         * fornecido (a expressão lambda () -> { ... }) e o envia para uma fila,
         * garantindo que ele seja executado dentro da EDT assim que possível.
         */
        SwingUtilities.invokeLater(() -> {
            // Instancia as Views
            JanelaInicialView janelaInicial = new JanelaInicialView();
            TelaPrincipalView telaPrincipal = new TelaPrincipalView();

            // Instancia o Controller ligando as duas telas
            new PersonagemController(janelaInicial, telaPrincipal);

            // Torna a primeira janela visível
            janelaInicial.setVisible(true);
        });
    }
}