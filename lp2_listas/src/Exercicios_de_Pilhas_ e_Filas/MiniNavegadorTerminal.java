import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class MiniNavegadorTerminal {

    public static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        // · PILHA → histórico de páginas
        // · FILA → downloads pendentes

        int acao;
        LinkedList<String> fila = new LinkedList<>();
        Deque<String> pilha = new ArrayDeque<>();

        do {
            imprimir(" ");
            imprimir("  ....:::MENU:::....");
            imprimir(" ");
            imprimir("  ....:::Histórico de navegação:::....");
            imprimir(" ");
            imprimir("1- Abrir página");
            imprimir("2- Voltar página");
            imprimir("3- Mostrar histórico");
            imprimir(" ");
            imprimir("  ....:::Downloads pendentes:::....");
            imprimir(" ");
            imprimir("4- Adicionar download");
            imprimir("5- Processar download");
            imprimir("6- Mostrar downloads");
            imprimir("0- Sair");
            imprimir(" ");

            imprimir("Digite a acão que deseja fazer: ");
            acao = lerInt();
            LER.nextLine(); // apagar o resto de espaco do ler int pra nao dar B.O no ler next line que usei
                            // em um metodo ali

            switch (acao) {
                case 1:
                    abrirPagina(pilha);
                    break;

                case 2:
                    voltarPagina(pilha);
                    break;

                case 3:
                    mostrarHistorico(pilha);
                    break;

                case 4:
                    adicionarDownload(fila);
                    break;

                case 5:
                    processarDownload(fila);
                    break;

                case 6:
                    mostrarDownloads(fila);
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

    public static void mostrarDownloads(LinkedList<String> fila) throws InterruptedException {
        if (fila.isEmpty() == false) {

            imprimir("Downloads pendentes: ");
            for (String downloads : fila) {
                imprimir(downloads);
            }
            imprimir(" ");
            Thread.sleep(3000);
            limparTela();

        } else {
            imprimir("Sem downloads!");
            Thread.sleep(3000);
            limparTela();
        }

    }

    // O primeiro download adicionado deve ser o primeiro a ser processado.
    public static void processarDownload(LinkedList<String> fila) throws InterruptedException {
        if (fila.isEmpty() == true) {
            imprimir("Sem nada para processar!");
            Thread.sleep(3000);
            limparTela();
        } else {
            String primeiro = fila.getFirst();
            imprimir(primeiro + " foi processado!");
            fila.remove(primeiro);
            imprimir(" ");
            Thread.sleep(3000);
            limparTela();
        }
    }

    // Adicionar um arquivo à fila de downloads.
    public static void adicionarDownload(LinkedList<String> fila) throws InterruptedException {
        imprimir("Digite o arquivo a ser adicionado na fila de downloads: ");
        String arquivo = LER.nextLine();
        fila.add(arquivo);
        imprimir(arquivo + " foi adicionado a fila!");
        imprimir(" ");
        Thread.sleep(3000);
        limparTela();
    }

    public static void mostrarHistorico(Deque<String> pilha) throws InterruptedException {
        if (pilha.isEmpty() == false) {

            imprimir("Histórico: ");
            for (String paginas : pilha) {
                imprimir(paginas);
            }
            imprimir(" ");
            Thread.sleep(3000);
            limparTela();

        } else {
            imprimir("Histórico vazio!");
            Thread.sleep(3000);
            limparTela();
        }

    }

    //  Ao escolher “Voltar”, a última página acessada deve ser removida da pilha.
    public static void voltarPagina(Deque<String> pilha) throws InterruptedException {
        if (pilha.isEmpty() == true) {
            imprimir("Sem nada para voltar!");
            Thread.sleep(3000);
            limparTela();
        } else {
            String topoPilha = pilha.getFirst();
            imprimir(topoPilha + " foi voltado!");
            pilha.remove(topoPilha);
            imprimir(" ");
            Thread.sleep(3000);
            limparTela();
        }
    }

    // Quando o usuário acessa uma página: https://google.com ela deve ser adicionada ao histórico.
    public static void abrirPagina(Deque<String> pilha) throws InterruptedException {
        imprimir("Digite a pagina para abri-la: ");
        String pagina = LER.nextLine();
        pilha.push(pagina);
        imprimir(pagina + " foi adicionada ao histórico!");
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
