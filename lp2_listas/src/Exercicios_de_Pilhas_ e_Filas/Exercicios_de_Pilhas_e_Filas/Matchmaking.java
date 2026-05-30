
import java.util.LinkedList;
import java.util.Scanner;

public class Matchmaking {

    public static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        // Fila - FIFO (primeiro que entra, é o primeiro que sai)
        int acao;
        LinkedList<String> fila = new LinkedList<>();

        do {
            imprimir(" ");
            imprimir("  ....:::MENU:::....");
            imprimir(" ");
            imprimir("1- Entrar Jogador Na Fila");
            imprimir("2- Atender Jogador");
            imprimir("3- Mostrar Jogadores Na Fila");
            imprimir("4- Tamanho da Fila");
            imprimir("0- Sair");
            imprimir(" ");

            imprimir("Digite a acão que deseja fazer: ");
            acao = lerInt();
            LER.nextLine(); // apagar o resto de espaco do ler int pra nao dar B.O no ler next line que usei
                            // em um metodo ali

            switch (acao) {
                case 1:
                    entrarNaFila(fila);
                    break;

                case 2:
                    atenderJogador(fila);
                    break;

                case 3:
                    mostrarFila(fila);
                    break;

                case 4:
                    tamanhoFila(fila);
                    break;

                case 0:
                    imprimir("Saindo do sistema... Tchau!");
                    Thread.sleep(3000);
                    limparTela();
                    break;

                default:
                    imprimir("Opcão inválida! Digite novamente...");
                    Thread.sleep(3000);
                    limparTela();
                    break;
            }

        } while (acao != 0);
    }

    // Retorna quantos jogadores estão aguardando.
    public static void tamanhoFila(LinkedList<String> fila) throws InterruptedException {
        imprimir("Quantidade de jogadores aguardando na fila: ");
        imprimirInt(fila.size());
        imprimir(" ");
        Thread.sleep(3000);
        limparTela();
    }

    // Exibe todos os jogadores da fila.
    public static void mostrarFila(LinkedList<String> fila) throws InterruptedException {
        if (fila.isEmpty() == false) {

            imprimir("Jogadores aguardando na fila: ");
            for (String nomes : fila) {
                imprimir(nomes);
            }
            imprimir(" ");
            Thread.sleep(3000);
            limparTela();

        } else {
            imprimir("Fila vazia! sem ninguém não somos alguém..");
            Thread.sleep(3000);
            limparTela();
        }

    }

    // Remove o jogador que está no início da fila. Caso a fila esteja vazia, exiba:
    // Fila vazia!
    public static void atenderJogador(LinkedList<String> fila) throws InterruptedException {
        if (fila.isEmpty() == true) {
            imprimir("Fila vazia! sem ninguém não somos alguém..");
            Thread.sleep(3000);
            limparTela();
        } else {
            String primeiro = fila.getFirst();
            imprimir(primeiro + " foi atendido!");
            fila.remove(primeiro);
            imprimir(" ");
            Thread.sleep(3000);
            limparTela();
        }
    }

    // Adiciona um jogador no final da fila.
    public static void entrarNaFila(LinkedList<String> fila) throws InterruptedException {
        imprimir("Digite o nome para entrar na Fila: ");
        String nome = LER.nextLine();
        fila.add(nome);
        imprimir(nome + " entrou na Fila!");
        imprimir(" ");
        Thread.sleep(3000);
        limparTela();
    }

    public static void limparTela() {
        for (int i = 0; i < 45; i++) {
            imprimir(" ");
        }
    }

    public static void imprimir(String text) {
        System.out.println(text);
    }

    public static void imprimirInt(int num) {
        System.out.println(num);
    }

    public static int lerInt() {
        int valor = 0;
        valor = LER.nextInt();
        return valor;
    }
}
