package View;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;

/**
 * VIEW: Tela Principal com formulário e painel de resumo.
 */
/*
 * Monta todos os componentes e oferece métodos públicos para o Controller
 * manipular ou ler as entradas.
 */
public class TelaPrincipalView extends JFrame {
    // Paleta de Cores Estilo Matrix
    public final Color VERDE_FONTE = new Color(0, 255, 65);
    public final Color VERDE_ESCURO = new Color(0, 160, 0);
    private final Color VERDE_BORDA = new Color(50, 205, 50);
    private final Color FUNDO_PRETO = new Color(10, 10, 10);
    private final Color FUNDO_COMPONENTES = new Color(20, 35, 20);
    // Fontes
    private final Font FONTE_QUADRADA_G = new Font(Font.MONOSPACED, Font.BOLD, 15);
    private final Font FONTE_CHECKBOX = new Font(Font.MONOSPACED, Font.BOLD, 17);
    private final Font FONTE_TITULO = new Font(Font.MONOSPACED, Font.BOLD, 16);

    // elementos
    private JTextField campoNome;
    private JComboBox<String> caixaSelecaoClasse;
    private JRadioButton opcaoFacil, opcaoMedio, opcaoDificil;
    private JCheckBox marcarMagia, marcarCura, marcarFurtividade, marcarForca;
    private JSlider barraNivel;
    private JTextField campoValorNivel;
    private JTextPane painelTextoResumo;
    private JButton botaoCriar;
    private JButton botaoLimpar;

    public TelaPrincipalView() {
        setTitle("SISTEMA GERADOR DE PERSONAGEM - RPG");
        setSize(1080, 750);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(15, 15));
        getContentPane().setBackground(FUNDO_PRETO);

        JPanel painelPrincipal = new JPanel(new GridLayout(1, 2, 15, 15));
        painelPrincipal.setBackground(FUNDO_PRETO);
        painelPrincipal.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        // PAINEL ESQUERDO: FORMULÁRIO
        JPanel painelEsquerda = criarPainelEscuro(null);
        painelEsquerda.setLayout(new BoxLayout(painelEsquerda, BoxLayout.Y_AXIS));
        painelEsquerda.setBorder(criarBordaComTitulo(" CRIE SEU PERSONAGEM "));

        // Nome
        JPanel painelNome = criarPainelEscuro(new FlowLayout(FlowLayout.CENTER, 10, 10));
        JLabel labelNome = new JLabel("Nome do Personagem: ");
        estilarRotulo(labelNome);
        campoNome = new JTextField(12);
        estilarCampoTexto(campoNome);
        painelNome.add(labelNome);
        painelNome.add(campoNome);
        painelEsquerda.add(painelNome);

        // Classe
        JPanel painelClasse = criarPainelEscuro(new FlowLayout(FlowLayout.CENTER, 10, 10));
        JLabel labelClasse = new JLabel("Classe: ");
        estilarRotulo(labelClasse);
        caixaSelecaoClasse = new JComboBox<>(new String[] { "Capitalista", "Proletario", "Homem", "Mulher" });
        caixaSelecaoClasse.setPreferredSize(new Dimension(200, 32));
        caixaSelecaoClasse.setFont(FONTE_QUADRADA_G);
        caixaSelecaoClasse.setBackground(FUNDO_COMPONENTES);
        caixaSelecaoClasse.setForeground(VERDE_FONTE);
        painelClasse.add(labelClasse);
        painelClasse.add(caixaSelecaoClasse);
        painelEsquerda.add(painelClasse);

        // Dificuldade e Habilidades
        JPanel painelMeio = criarPainelEscuro(new GridLayout(1, 2, 10, 10));

        JPanel painelDificuldade = criarPainelEscuro(new GridLayout(3, 1, 5, 5));
        painelDificuldade.setBorder(criarBordaComTitulo(" Nível dificuldade "));
        opcaoFacil = new JRadioButton("Ez Peze", true);
        opcaoMedio = new JRadioButton("Médio");
        opcaoDificil = new JRadioButton("Hardicore");
        estilarOpcao(opcaoFacil);
        estilarOpcao(opcaoMedio);
        estilarOpcao(opcaoDificil);

        // ButtonGroup controla os JRadioButton deixa selecionar somente 1 opcao
        ButtonGroup grupoDificuldade = new ButtonGroup();
        grupoDificuldade.add(opcaoFacil);
        grupoDificuldade.add(opcaoMedio);
        grupoDificuldade.add(opcaoDificil);

        painelDificuldade.add(opcaoFacil);
        painelDificuldade.add(opcaoMedio);
        painelDificuldade.add(opcaoDificil);

        JPanel painelHabilidades = criarPainelEscuro(new GridLayout(4, 1, 8, 8));
        painelHabilidades.setBorder(criarBordaComTitulo(" Habilidades "));
        marcarMagia = new JCheckBox("Roubo", true);
        marcarCura = new JCheckBox("Força");
        marcarFurtividade = new JCheckBox("Feiura", true);
        marcarForca = new JCheckBox("Buniteza");
        estilarCheckBoxGrandes(marcarMagia);
        estilarCheckBoxGrandes(marcarCura);
        estilarCheckBoxGrandes(marcarFurtividade);
        estilarCheckBoxGrandes(marcarForca);

        painelHabilidades.add(marcarMagia);
        painelHabilidades.add(marcarCura);
        painelHabilidades.add(marcarFurtividade);
        painelHabilidades.add(marcarForca);

        painelMeio.add(painelDificuldade);
        painelMeio.add(painelHabilidades);
        painelEsquerda.add(painelMeio);

        // Nível Inicial
        JPanel painelNivel = criarPainelEscuro(null);
        painelNivel.setLayout(new BoxLayout(painelNivel, BoxLayout.Y_AXIS));
        JLabel rotuloNivel = new JLabel("Nível inicial:");
        estilarRotulo(rotuloNivel);
        rotuloNivel.setAlignmentX(Component.CENTER_ALIGNMENT);
        painelNivel.add(rotuloNivel);

        // nesse painelzinho tem a barra deslizante
        JPanel painelContainerBarra = criarPainelEscuro(new FlowLayout(FlowLayout.CENTER, 10, 10));
        // a barra deslizante
        barraNivel = new JSlider(JSlider.HORIZONTAL, 1, 10, 8); // na HORIZONTAL. comeca em 1, vai ate 10 e inicia em 8
        barraNivel.setPreferredSize(new Dimension(280, 50));
        barraNivel.setBackground(FUNDO_PRETO);
        barraNivel.setForeground(VERDE_FONTE);
        barraNivel.setFont(FONTE_QUADRADA_G);
        barraNivel.setMajorTickSpacing(1);
        barraNivel.setPaintTicks(true);
        barraNivel.setPaintLabels(true);

        // quadradinho que fica na frente da barra mostrando o nivel selecionado
        campoValorNivel = new JTextField("8", 3); // comeca com "8" dentro, largura 3
        estilarCampoTexto(campoValorNivel);
        campoValorNivel.setEditable(false); // nao pode ser alterado pelo usuario
        campoValorNivel.setHorizontalAlignment(JTextField.CENTER);

        /*
         * Adiciona um ouvinte de eventos (ChangeListener) ao slider barraNivel.
         * toda vez que a barra é arrastada:
         */
        barraNivel.addChangeListener(e -> campoValorNivel.setText(String.valueOf(barraNivel.getValue())));
        // barraNivel.getValue() pega o número inteiro correspondente à posição atual.
        // String.valueOf(...) converte esse número em texto.
        // campoValorNivel.setText(...) atualiza a caixa de texto com o novo valor que
        // foi pego.

        painelContainerBarra.add(barraNivel);
        painelContainerBarra.add(campoValorNivel);
        painelNivel.add(painelContainerBarra);
        painelEsquerda.add(painelNivel);

        // Botões de Ação
        JPanel painelBotoes = criarPainelEscuro(new FlowLayout(FlowLayout.CENTER, 20, 15));
        botaoCriar = new JButton("[ + ] Criar personagem");
        botaoLimpar = new JButton("[ ✖ ] Limpar");
        estilarBotao(botaoCriar);
        estilarBotao(botaoLimpar);

        painelBotoes.add(botaoCriar);
        painelBotoes.add(botaoLimpar);
        painelEsquerda.add(painelBotoes);

        // PAINEL DIREITO: RESUMO
        JPanel painelDireita = criarPainelEscuro(new BorderLayout());
        painelDireita.setBorder(criarBordaComTitulo(" RESUMO DO PERSONAGEM "));

        painelTextoResumo = new JTextPane();
        painelTextoResumo.setEditable(false); // nao pode ser alterado pelo usuario
        painelTextoResumo.setBackground(FUNDO_PRETO);

        // barrinha que faz a tela rolar pra baixo
        JScrollPane barraRolagemResumo = new JScrollPane(painelTextoResumo);
        barraRolagemResumo.getViewport().setBackground(FUNDO_PRETO);
        barraRolagemResumo.setBorder(BorderFactory.createLineBorder(VERDE_BORDA, 1));

        painelDireita.add(barraRolagemResumo, BorderLayout.CENTER);

        painelPrincipal.add(painelEsquerda);
        painelPrincipal.add(painelDireita);
        add(painelPrincipal, BorderLayout.CENTER);
    }

    // Auxiliares de Estilização
    private JPanel criarPainelEscuro(LayoutManager layout) {
        JPanel painel = (layout != null) ? new JPanel(layout) : new JPanel();
        painel.setBackground(FUNDO_PRETO);
        return painel;
    }

    private void estilarRotulo(JLabel label) {
        label.setFont(FONTE_QUADRADA_G);
        label.setForeground(VERDE_FONTE);
    }

    private void estilarCampoTexto(JTextField campo) {
        campo.setFont(FONTE_QUADRADA_G);
        campo.setBackground(FUNDO_COMPONENTES);
        campo.setForeground(VERDE_FONTE);
        campo.setCaretColor(VERDE_FONTE);
        campo.setBorder(BorderFactory.createLineBorder(VERDE_BORDA, 1));
        campo.setPreferredSize(new Dimension(180, 32));
    }

    private void estilarOpcao(JComponent componente) {
        componente.setFont(FONTE_QUADRADA_G);
        componente.setBackground(FUNDO_PRETO);
        componente.setForeground(VERDE_FONTE);
    }

    private void estilarCheckBoxGrandes(JCheckBox checkBox) {
        checkBox.setFont(FONTE_CHECKBOX);
        checkBox.setBackground(FUNDO_PRETO);
        checkBox.setForeground(VERDE_FONTE);
        checkBox.setFocusPainted(false);
        checkBox.setMargin(new Insets(3, 5, 3, 5));
    }

    private void estilarBotao(JButton botao) {
        botao.setFont(FONTE_QUADRADA_G);
        botao.setBackground(FUNDO_COMPONENTES);
        botao.setForeground(VERDE_FONTE);
        botao.setBorder(BorderFactory.createLineBorder(VERDE_BORDA, 2));
        botao.setPreferredSize(new Dimension(210, 42));
        botao.setFocusPainted(false);
        botao.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    private TitledBorder criarBordaComTitulo(String titulo) {
        Border bordaSimples = BorderFactory.createLineBorder(VERDE_BORDA, 1);
        TitledBorder bordaComTitulo = BorderFactory.createTitledBorder(bordaSimples, titulo);
        bordaComTitulo.setTitleColor(VERDE_BORDA);
        bordaComTitulo.setTitleFont(FONTE_TITULO);
        bordaComTitulo.setTitleJustification(TitledBorder.CENTER);
        return bordaComTitulo;
    }

    // add um texto com visual personalizado no painel
    public void adicionarTextoFormatado(String mensagem, Color cor, boolean emNegrito) {
        // Pega a estrutura interna do painel que gerencia os textos e estilos
        StyledDocument documentoTextual = painelTextoResumo.getStyledDocument();
        // Cria a "pasta" onde vai guardar os estilos visuais
        SimpleAttributeSet estilo = new SimpleAttributeSet();
        // Configura a cor da letra
        StyleConstants.setForeground(estilo, cor);
        // Ativa ou desativa o negrito
        StyleConstants.setBold(estilo, emNegrito);
        // Define a fonte como monoespaçada (tipo código de programação)
        StyleConstants.setFontFamily(estilo, Font.MONOSPACED);
        // Define tamanho do texto para 14
        StyleConstants.setFontSize(estilo, 14);
        // Centraliza o texto no painel
        StyleConstants.setAlignment(estilo, StyleConstants.ALIGN_CENTER);

        try {
            // Pega a posição do fim do texto atual para escrever logo depois dele
            int inicio = documentoTextual.getLength();
            // Escreve a nova mensagem no final com a cor e fonte configuradas
            documentoTextual.insertString(inicio, mensagem, estilo);
            // Aplica a centralização no texto que acabou de ser inserido
            documentoTextual.setParagraphAttributes(inicio, mensagem.length(), estilo, false);

        } catch (Exception erro) { // se der BO
            erro.printStackTrace(); // imprime a trilha do erro
        }
    }

    // Getters dos elementos para interação no Controller
    public JTextField getCampoNome() {
        return campoNome;
    }

    public JComboBox<String> getCaixaSelecaoClasse() {
        return caixaSelecaoClasse;
    }

    public JRadioButton getOpcaoFacil() {
        return opcaoFacil;
    }

    public JRadioButton getOpcaoMedio() {
        return opcaoMedio;
    }

    public JRadioButton getOpcaoDificil() {
        return opcaoDificil;
    }

    public JCheckBox getMarcarRoubo() {
        return marcarMagia;
    }

    public JCheckBox getMarcarForca() {
        return marcarCura;
    }

    public JCheckBox getMarcarFeiura() {
        return marcarFurtividade;
    }

    public JCheckBox getMarcarBuniteza() {
        return marcarForca;
    }

    public JSlider getBarraNivel() {
        return barraNivel;
    }

    public JTextPane getPainelTextoResumo() {
        return painelTextoResumo;
    }

    public JButton getBotaoCriar() {
        return botaoCriar;
    }

    public JButton getBotaoLimpar() {
        return botaoLimpar;
    }
}