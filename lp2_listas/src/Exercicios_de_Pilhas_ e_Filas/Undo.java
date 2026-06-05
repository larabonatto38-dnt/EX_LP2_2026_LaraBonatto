import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Undo {

    public static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        // Pilha - LIFO (ultimo a entrar, é o primeiro a sair)
        int acao;
        Deque<String> pilha = new ArrayDeque<>();

        do {
            imprimir(" ");
            imprimir("  ....:::MENU:::....");
            imprimir(" ");
            imprimir("1- Digitar texto");
            imprimir("2- Desfazer (CTRL + Z)");
            imprimir("3- Mostrar histórico");
            imprimir("0- Sair");
            imprimir(" ");

            imprimir("Digite a acão que deseja fazer: ");
            acao = lerInt();
            LER.nextLine(); // apagar o resto de espaco do ler int pra nao dar B.O no ler next line que usei
                            // em um metodo ali

            switch (acao) {
                case 1:
                    digitarTexto(pilha);
                    break;

                case 2:
                    desfazer(pilha);
                    break;

                case 3:
                    mostrarHistorico(pilha);
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

    // Mostra as ações armazenadas na pilha.
    public static void mostrarHistorico(Deque<String> pilha) throws InterruptedException {
        if (pilha.isEmpty() == false) {

            imprimir("Ações armazenadas na pilha: ");
            for (String nomes : pilha) {
                imprimir(nomes);
            }
            imprimir(" ");
            Thread.sleep(3000);
            limparTela();

        } else {
            imprimir("Pilha vazia!");
            Thread.sleep(3000);
            limparTela();
        }

    }

    // Remove a última ação realizada. Caso a pilha esteja vazia: Nada para
    // desfazer!
    public static void desfazer(Deque<String> pilha) throws InterruptedException {
        if (pilha.isEmpty() == true) {
            imprimir("Nada para desfazer!");
            Thread.sleep(3000);
            limparTela();

        } else {
            String elementoTopo = pilha.getFirst();
            imprimir(elementoTopo + " foi removido!");
            pilha.remove(elementoTopo); // por algum motivo o comando pop nao aceitou String?
            imprimir(" ");
            Thread.sleep(3000);
            limparTela();
        }
    }

    // Adiciona uma nova ação no topo da pilha.
    public static void digitarTexto(Deque<String> pilha) throws InterruptedException {
        imprimir("Digite o texto para adicionar a pilha: ");
        String texto = LER.nextLine();
        pilha.push(texto);
        imprimir(texto + " foi adicionado na Pilha!");
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
