package Controller;

import java.util.ArrayList;
import java.util.List;

import Model.Personagem;
import View.JanelaInicialView;
import View.TelaPrincipalView;

/**
 * CONTROLLER: O "cérebro" intermediário.
 * Escuta as ações da View, manipula os objetos do Model e devolve os resultados.
 */
/*
Gerencia todas as ações do usuário (clique nos botoes, criação do objeto Personagem, lógica de formatação e as ASCII art).
*/
public class PersonagemController {

    private JanelaInicialView janelaInicialView;
    private TelaPrincipalView telaPrincipalView;

    public PersonagemController(JanelaInicialView janelaInicialView, TelaPrincipalView telaPrincipalView) {
        this.janelaInicialView = janelaInicialView;
        this.telaPrincipalView = telaPrincipalView;

        // Associa os listeners dos botões
        initController();
    }

    private void initController() {
        // Evento do botão da Tela Inicial
        janelaInicialView.getBotaoInicial().addActionListener(e -> {
            telaPrincipalView.setVisible(true);
            janelaInicialView.dispose();
        });

        // Eventos dos botões da Tela Principal
        telaPrincipalView.getBotaoCriar().addActionListener(e -> acaoCriarPersonagem());
        telaPrincipalView.getBotaoLimpar().addActionListener(e -> limparFormulario());
    }

    // Processa a criação do Personagem lendo a View
    private void acaoCriarPersonagem() {
        String nome = telaPrincipalView.getCampoNome().getText();
        String classe = (String) telaPrincipalView.getCaixaSelecaoClasse().getSelectedItem();

        String dificuldade = "";
        if (telaPrincipalView.getOpcaoFacil().isSelected()) dificuldade = "Ez Peze";
        else if (telaPrincipalView.getOpcaoMedio().isSelected()) dificuldade = "Médio";
        else if (telaPrincipalView.getOpcaoDificil().isSelected()) dificuldade = "Hardicore";

        List<String> habilidadesSelecionadas = new ArrayList<>();
        if (telaPrincipalView.getMarcarRoubo().isSelected()) habilidadesSelecionadas.add("Roubo");
        if (telaPrincipalView.getMarcarForca().isSelected()) habilidadesSelecionadas.add("Força");
        if (telaPrincipalView.getMarcarFeiura().isSelected()) habilidadesSelecionadas.add("Feiura");
        if (telaPrincipalView.getMarcarBuniteza().isSelected()) habilidadesSelecionadas.add("Buniteza");

        int nivelInicial = telaPrincipalView.getBarraNivel().getValue();

        // Instancia o objeto MODEL
        Personagem novoPersonagem = new Personagem(nome, classe, dificuldade, habilidadesSelecionadas, nivelInicial);

        // Exibe o resultado na VIEW
        exibirResumo(novoPersonagem);
    }

    private void exibirResumo(Personagem personagem) {
        telaPrincipalView.getPainelTextoResumo().setText("");

        telaPrincipalView.adicionarTextoFormatado("\n\n★★★ PERSONAGEM CRIADO ★★★\n", telaPrincipalView.VERDE_FONTE, true);
        telaPrincipalView.adicionarTextoFormatado("==================================================\n\n", telaPrincipalView.VERDE_ESCURO, false);

        telaPrincipalView.adicionarTextoFormatado("Nome: " + personagem.getNome() + "\n\n", telaPrincipalView.VERDE_FONTE, true);
        telaPrincipalView.adicionarTextoFormatado("Classe: " + personagem.getClasse() + "\n\n", telaPrincipalView.VERDE_FONTE, true);
        telaPrincipalView.adicionarTextoFormatado("Dificuldade: " + personagem.getDificuldade() + "\n\n", telaPrincipalView.VERDE_FONTE, true);
        telaPrincipalView.adicionarTextoFormatado("Habilidades: " + String.join(", ", personagem.getHabilidades()) + "\n\n", telaPrincipalView.VERDE_FONTE, true);
        telaPrincipalView.adicionarTextoFormatado("Nível inicial: " + personagem.getNivelInicial() + "\n\n", telaPrincipalView.VERDE_FONTE, true);

        telaPrincipalView.adicionarTextoFormatado("==================================================\n\n", telaPrincipalView.VERDE_ESCURO, false);

        String asciiArt = obterAsciiArtPorClasse(personagem.getClasse());
        telaPrincipalView.adicionarTextoFormatado(asciiArt + "\n", telaPrincipalView.VERDE_FONTE, false);
    }

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
                       "        (___)(___)        ";

            default:
                return "";
        }
    }

    // deixa as informacoes vazias
    private void limparFormulario() {
        telaPrincipalView.getCampoNome().setText("");
        telaPrincipalView.getCaixaSelecaoClasse().setSelectedIndex(0);
        telaPrincipalView.getOpcaoFacil().setSelected(true);
        telaPrincipalView.getMarcarRoubo().setSelected(true);
        telaPrincipalView.getMarcarForca().setSelected(false);
        telaPrincipalView.getMarcarFeiura().setSelected(true);
        telaPrincipalView.getMarcarBuniteza().setSelected(false);
        telaPrincipalView.getBarraNivel().setValue(8);
        telaPrincipalView.getPainelTextoResumo().setText("");
    }
}