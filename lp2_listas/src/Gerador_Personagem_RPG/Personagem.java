package Gerador_Personagem_RPG;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe principal que define o modelo do Personagem e contém
 * a Interface Gráfica da Tela Principal do sistema RPG.
 */
public class Personagem {

    // ==========================================
    // 1. ATRIBUTOS PRINCIPAIS DO PERSONAGEM
    // ==========================================
    private String nome;
    private String classe;
    private String dificuldade;
    private List<String> habilidades;
    private int nivelInicial;

    // ==========================================
    // 2. CONSTRUTOR DA CLASSE PERSONAGEM
    // ==========================================
    public Personagem(String nome, String classe, String dificuldade, List<String> habilidades, int nivelInicial) {
        this.nome = nome;
        this.classe = classe;
        this.dificuldade = dificuldade;
        this.habilidades = habilidades;
        this.nivelInicial = nivelInicial;
    }

    // ==========================================
    // 3. MÉTODOS GETTERS E SETTERS
    // ==========================================
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public List<String> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<String> habilidades) {
        this.habilidades = habilidades;
    }

    public int getNivelInicial() {
        return nivelInicial;
    }

    public void setNivelInicial(int nivelInicial) {
        this.nivelInicial = nivelInicial;
    }

    // ==========================================
    // 4. INTERFACE GRÁFICA (TELA PRINCIPAL)
    // ==========================================
    public static class TelaPrincipal extends JFrame {

        // Constantes da Paleta de Cores Estilo Matrix
        private final Color VERDE_FONTE = new Color(0, 255, 65);
        private final Color VERDE_ESCURO = new Color(0, 160, 0);
        private final Color VERDE_BORDA = new Color(50, 205, 50);
        private final Color FUNDO_PRETO = new Color(10, 10, 10);
        private final Color FUNDO_COMPONENTES = new Color(20, 35, 20);

        // Constantes de Fontes
        private final Font FONTE_QUADRADA_G = new Font(Font.MONOSPACED, Font.BOLD, 15);
        private final Font FONTE_CHECKBOX = new Font(Font.MONOSPACED, Font.BOLD, 17);
        private final Font FONTE_TITULO = new Font(Font.MONOSPACED, Font.BOLD, 16);

        // Componentes do Formulário e Painel de Resumo
        private JTextField campoNome;
        private JComboBox<String> caixaSelecaoClasse;
        private JRadioButton opcaoFacil, opcaoMedio, opcaoDificil;
        private ButtonGroup grupoDificuldade;
        private JCheckBox marcarMagia, marcarCura, marcarFurtividade, marcarForca;
        private JSlider barraNivel;
        private JTextField campoValorNivel;
        private JTextPane painelTextoResumo;

        /**
         * Construtor da Tela Principal: Configura o layout, componentes e
         * posicionamento da janela.
         */
        public TelaPrincipal() {
            // Configurações básicas do JFrame
            setTitle("SISTEMA GERADOR DE PERSONAGEM - RPG");
            setSize(1080, 750);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Centraliza a janela no centro exato do monitor/tela do PC
            setLocationRelativeTo(null);

            setLayout(new BorderLayout(15, 15));
            getContentPane().setBackground(FUNDO_PRETO);

            // Painel principal dividido em 2 colunas (Esquerda: Formulário | Direita:
            // Resumo)
            JPanel painelPrincipal = new JPanel(new GridLayout(1, 2, 15, 15));
            painelPrincipal.setBackground(FUNDO_PRETO);
            painelPrincipal.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

            // ==========================================
            // PAINEL ESQUERDO: FORMULÁRIO DE CRIAÇÃO
            // ==========================================
            JPanel painelEsquerda = criarPainelEscuro(null);
            painelEsquerda.setLayout(new BoxLayout(painelEsquerda, BoxLayout.Y_AXIS));
            painelEsquerda.setBorder(criarBordaComTitulo(" CRIE SEU PERSONAGEM "));

            // Campo: Nome do Personagem
            JPanel painelNome = criarPainelEscuro(new FlowLayout(FlowLayout.CENTER, 10, 10));
            JLabel labelNome = new JLabel("Nome do personagem: ");
            estilarRotulo(labelNome);
            painelNome.add(labelNome);

            campoNome = new JTextField(12);
            estilarCampoTexto(campoNome);
            painelNome.add(campoNome);
            painelEsquerda.add(painelNome);

            // Campo: Classe do Personagem
            JPanel painelClasse = criarPainelEscuro(new FlowLayout(FlowLayout.CENTER, 10, 10));
            JLabel labelClasse = new JLabel("Classe: ");
            estilarRotulo(labelClasse);
            painelClasse.add(labelClasse);

            caixaSelecaoClasse = new JComboBox<>(new String[] { "Capitalista", "Proletario", "Homem", "Mulher" });
            caixaSelecaoClasse.setPreferredSize(new Dimension(200, 32));
            caixaSelecaoClasse.setFont(FONTE_QUADRADA_G);
            caixaSelecaoClasse.setBackground(FUNDO_COMPONENTES);
            caixaSelecaoClasse.setForeground(VERDE_FONTE);
            painelClasse.add(caixaSelecaoClasse);
            painelEsquerda.add(painelClasse);

            // Seção do Meio: Dificuldade e Habilidades
            JPanel painelMeio = criarPainelEscuro(new GridLayout(1, 2, 10, 10));

            // Subpainel: Seleção de Dificuldade
            JPanel painelDificuldade = criarPainelEscuro(new GridLayout(3, 1, 5, 5));
            painelDificuldade.setBorder(criarBordaComTitulo(" Nível dificuldade "));

            opcaoFacil = new JRadioButton("Ez Peze");
            opcaoMedio = new JRadioButton("Médio");
            opcaoDificil = new JRadioButton("Hardicore", true);

            estilarOpcao(opcaoFacil);
            estilarOpcao(opcaoMedio);
            estilarOpcao(opcaoDificil);

            grupoDificuldade = new ButtonGroup();
            grupoDificuldade.add(opcaoFacil);
            grupoDificuldade.add(opcaoMedio);
            grupoDificuldade.add(opcaoDificil);

            painelDificuldade.add(opcaoFacil);
            painelDificuldade.add(opcaoMedio);
            painelDificuldade.add(opcaoDificil);

            // Subpainel: Seleção de Habilidades
            JPanel painelHabilidades = criarPainelEscuro(new GridLayout(4, 1, 8, 8));
            painelHabilidades.setBorder(criarBordaComTitulo(" Habilidades "));

            marcarMagia = new JCheckBox("Roubo", true);
            marcarCura = new JCheckBox("Força", true);
            marcarFurtividade = new JCheckBox("Feiura");
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

            // Campo: Controle de Nível Inicial (JSlider)
            JPanel painelNivel = criarPainelEscuro(null);
            painelNivel.setLayout(new BoxLayout(painelNivel, BoxLayout.Y_AXIS));

            JLabel rotuloNivel = new JLabel("Nível inicial:");
            estilarRotulo(rotuloNivel);
            rotuloNivel.setAlignmentX(Component.CENTER_ALIGNMENT);
            painelNivel.add(rotuloNivel);

            JPanel painelContainerBarra = criarPainelEscuro(new FlowLayout(FlowLayout.CENTER, 10, 10));
            barraNivel = new JSlider(1, 10, 8);
            barraNivel.setPreferredSize(new Dimension(280, 50));
            barraNivel.setBackground(FUNDO_PRETO);
            barraNivel.setForeground(VERDE_FONTE);
            barraNivel.setFont(FONTE_QUADRADA_G);
            barraNivel.setMajorTickSpacing(1);
            barraNivel.setPaintTicks(true);
            barraNivel.setPaintLabels(true);

            campoValorNivel = new JTextField("8", 3);
            estilarCampoTexto(campoValorNivel);
            campoValorNivel.setEditable(false);
            campoValorNivel.setHorizontalAlignment(JTextField.CENTER);

            // Listener para atualizar o valor do texto conforme o Slider se move
            barraNivel.addChangeListener(e -> campoValorNivel.setText(String.valueOf(barraNivel.getValue())));

            painelContainerBarra.add(barraNivel);
            painelContainerBarra.add(campoValorNivel);
            painelNivel.add(painelContainerBarra);
            painelEsquerda.add(painelNivel);

            // Seção de Botões de Ação
            JPanel painelBotoes = criarPainelEscuro(new FlowLayout(FlowLayout.CENTER, 20, 15));
            JButton botaoCriar = new JButton("[ + ] Criar personagem");
            JButton botaoLimpar = new JButton("[ ✖ ] Limpar");

            estilarBotao(botaoCriar);
            estilarBotao(botaoLimpar);

            botaoCriar.addActionListener(e -> acaoCriarPersonagem());
            botaoLimpar.addActionListener(e -> limparFormulario());

            painelBotoes.add(botaoCriar);
            painelBotoes.add(botaoLimpar);
            painelEsquerda.add(painelBotoes);

            // ==========================================
            // PAINEL DIREITO: RESUMO DO PERSONAGEM
            // ==========================================
            JPanel painelDireita = criarPainelEscuro(new BorderLayout());
            painelDireita.setBorder(criarBordaComTitulo(" RESUMO DO PERSONAGEM "));

            painelTextoResumo = new JTextPane();
            painelTextoResumo.setEditable(false);
            painelTextoResumo.setBackground(FUNDO_PRETO);

            JScrollPane barraRolagemResumo = new JScrollPane(painelTextoResumo);
            barraRolagemResumo.getViewport().setBackground(FUNDO_PRETO);
            barraRolagemResumo.setBorder(BorderFactory.createLineBorder(VERDE_BORDA, 1));

            painelDireita.add(barraRolagemResumo, BorderLayout.CENTER);

            // Montagem dos dois painéis na janela
            painelPrincipal.add(painelEsquerda);
            painelPrincipal.add(painelDireita);
            add(painelPrincipal, BorderLayout.CENTER);
        }

        // ==========================================
        // 5. MÉTODOS DE ESTILIZAÇÃO DA INTERFACE
        // ==========================================

        // Cria painéis padronizados com o fundo preto
        private JPanel criarPainelEscuro(LayoutManager layout) {
            JPanel painel = (layout != null) ? new JPanel(layout) : new JPanel();
            painel.setBackground(FUNDO_PRETO);
            return painel;
        }

        // Estiliza rótulos de texto
        private void estilarRotulo(JLabel label) {
            label.setFont(FONTE_QUADRADA_G);
            label.setForeground(VERDE_FONTE);
        }

        // Estiliza caixas de entrada de texto
        private void estilarCampoTexto(JTextField campo) {
            campo.setFont(FONTE_QUADRADA_G);
            campo.setBackground(FUNDO_COMPONENTES);
            campo.setForeground(VERDE_FONTE);
            campo.setCaretColor(VERDE_FONTE);
            campo.setBorder(BorderFactory.createLineBorder(VERDE_BORDA, 1));
            campo.setPreferredSize(new Dimension(180, 32));
        }

        // Estiliza botões de rádio
        private void estilarOpcao(JComponent componente) {
            componente.setFont(FONTE_QUADRADA_G);
            componente.setBackground(FUNDO_PRETO);
            componente.setForeground(VERDE_FONTE);
        }

        // Estiliza caixas de seleção com fonte ampliada
        private void estilarCheckBoxGrandes(JCheckBox checkBox) {
            checkBox.setFont(FONTE_CHECKBOX);
            checkBox.setBackground(FUNDO_PRETO);
            checkBox.setForeground(VERDE_FONTE);
            checkBox.setFocusPainted(false);
            checkBox.setMargin(new Insets(3, 5, 3, 5));
        }

        // Estiliza os botões de ação
        private void estilarBotao(JButton botao) {
            botao.setFont(FONTE_QUADRADA_G);
            botao.setBackground(FUNDO_COMPONENTES);
            botao.setForeground(VERDE_FONTE);
            botao.setBorder(BorderFactory.createLineBorder(VERDE_BORDA, 2));
            botao.setPreferredSize(new Dimension(210, 42));
            botao.setFocusPainted(false);
            botao.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }

        // Cria bordas verdes com título centralizado
        private TitledBorder criarBordaComTitulo(String titulo) {
            Border bordaSimples = BorderFactory.createLineBorder(VERDE_BORDA, 1);
            TitledBorder bordaComTitulo = BorderFactory.createTitledBorder(bordaSimples, titulo);
            bordaComTitulo.setTitleColor(VERDE_BORDA);
            bordaComTitulo.setTitleFont(FONTE_TITULO);
            bordaComTitulo.setTitleJustification(TitledBorder.CENTER);
            return bordaComTitulo;
        }

        // ==========================================
        // 6. LÓGICA E EVENTOS DA INTERFACE
        // ==========================================

        // Coleta os dados digitados e gera o objeto Personagem
        private void acaoCriarPersonagem() {
            String nome = campoNome.getText();
            String classe = (String) caixaSelecaoClasse.getSelectedItem();

            String dificuldade = "";
            if (opcaoFacil.isSelected())
                dificuldade = "Ez Peze";
            else if (opcaoMedio.isSelected())
                dificuldade = "Médio";
            else if (opcaoDificil.isSelected())
                dificuldade = "Hardicore";

            List<String> habilidadesSelecionadas = new ArrayList<>();
            if (marcarMagia.isSelected())
                habilidadesSelecionadas.add("Roubo");
            if (marcarCura.isSelected())
                habilidadesSelecionadas.add("Força");
            if (marcarFurtividade.isSelected())
                habilidadesSelecionadas.add("Feiura");
            if (marcarForca.isSelected())
                habilidadesSelecionadas.add("Buniteza");

            int nivelInicial = barraNivel.getValue();

            Personagem novoPersonagem = new Personagem(nome, classe, dificuldade, habilidadesSelecionadas,
                    nivelInicial);
            exibirResumo(novoPersonagem);
        }

        // Exibe os dados do personagem e a arte ASCII centralizada no painel de resumo
        private void exibirResumo(Personagem personagem) {
            painelTextoResumo.setText("");

            adicionarTextoFormatado("\n\n★ PERSONAGEM CRIADO ★\n", VERDE_FONTE, true);
            adicionarTextoFormatado("===============================================\n\n", VERDE_ESCURO, false);

            adicionarTextoFormatado("Nome: " + personagem.getNome() + "\n\n", VERDE_FONTE, true);
            adicionarTextoFormatado("Classe: " + personagem.getClasse() + "\n\n", VERDE_FONTE, true);
            adicionarTextoFormatado("Dificuldade: " + personagem.getDificuldade() + "\n\n", VERDE_FONTE, true);
            adicionarTextoFormatado("Habilidades: " + String.join(", ", personagem.getHabilidades()) + "\n\n",
                    VERDE_FONTE, true);
            adicionarTextoFormatado("Nível inicial: " + personagem.getNivelInicial() + "\n\n", VERDE_FONTE, true);

            adicionarTextoFormatado("===============================================\n\n", VERDE_ESCURO, false);

            // Desenha a arte ASCII correspondente à classe
            String asciiArt = obterAsciiArtPorClasse(personagem.getClasse());
            adicionarTextoFormatado(asciiArt + "\n", VERDE_FONTE, false);
        }

        // Retorna a arte em ASCII equivalente à classe escolhida
        private String obterAsciiArtPorClasse(String classe) {
            switch (classe) {
                case "Capitalista":
                    return "       ┌───────────┐      \n" +
                            "       │   $ $ $   │      \n" +
                            "       └─────┬─────┘      \n" +
                            "         (  o_o )        \n" +
                            "        /|  $|$  |\\      \n" +
                            "       / |   |   | \\     \n" +
                            "         |___|___|       \n" +
                            "          |  |  |        \n" +
                            "         /   |   \\       \n" +
                            "        [____|____]      ";

                case "Proletario":
                    return "         __  __          \n" +
                            "        [  \\/  ]         \n" +
                            "        (  •_• )         \n" +
                            "       /|=======|\\       \n" +
                            "      / |   🛠️   | \\      \n" +
                            "        |_______|        \n" +
                            "        |  ||  |         \n" +
                            "        |  ||  |         \n" +
                            "       [___||___]        ";

                case "Homem":
                    return "          .---.          \n" +
                            "         /     \\         \n" +
                            "        (  . .  )        \n" +
                            "         \\  -  /         \n" +
                            "        .-'---'-.        \n" +
                            "       / |     | \\       \n" +
                            "      *  |  |  |  *      \n" +
                            "         |__|__|         \n" +
                            "         |  |  |         \n" +
                            "        (___)(___)       ";

                case "Mulher":
                    return "          .---.          \n" +
                            "         / ~~~ \\         \n" +
                            "        (  o.o  )        \n" +
                            "        /|  -  |\\        \n" +
                            "       / |  ♥  | \\       \n" +
                            "      /  /_____\\  \\      \n" +
                            "        /       \\        \n" +
                            "       /________\\        \n" +
                            "        |   |   |        \n" +
                            "       (___)(___)        ";

                default:
                    return "";
            }
        }

        // Insere texto no JTextPane com alinhamento centralizado e formatação
        private void adicionarTextoFormatado(String mensagem, Color cor, boolean emNegrito) {
            StyledDocument documentoTextual = painelTextoResumo.getStyledDocument();

            SimpleAttributeSet estilo = new SimpleAttributeSet();
            StyleConstants.setForeground(estilo, cor);
            StyleConstants.setBold(estilo, emNegrito);
            StyleConstants.setFontFamily(estilo, Font.MONOSPACED);
            StyleConstants.setFontSize(estilo, 14);
            StyleConstants.setAlignment(estilo, StyleConstants.ALIGN_CENTER);

            try {
                int inicio = documentoTextual.getLength();
                documentoTextual.insertString(inicio, mensagem, estilo);
                documentoTextual.setParagraphAttributes(inicio, mensagem.length(), estilo, false);
            } catch (Exception erro) {
                erro.printStackTrace();
            }
        }

        // Reseta todos os campos do formulário para o estado padrão
        private void limparFormulario() {
            campoNome.setText("");
            caixaSelecaoClasse.setSelectedIndex(0);
            opcaoFacil.setSelected(true);
            marcarMagia.setSelected(false);
            marcarCura.setSelected(false);
            marcarFurtividade.setSelected(false);
            marcarForca.setSelected(false);
            barraNivel.setValue(1);
            painelTextoResumo.setText("");
        }
    }
}