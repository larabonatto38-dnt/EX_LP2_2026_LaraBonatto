
import java.util.LinkedList;
import java.util.Scanner;

public class Matchmaking {

    public static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int acao;
        LinkedList<String> fila = new LinkedList<>();
        do {
            imprimir("1- Entrar Jogador Na Fila");
            imprimir("2- Atender Jogador");
            imprimir("3- Mostrar Jogadores Na Fila");
            imprimir("4- Tamanho da Fila");
            imprimir("0- Sair");

            acao = lerInt();

            switch (acao) {
                case 1:

                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                default:
                    acao = 0;
                    break;
            }
        } while (acao != 0);
    }

    public static void imprimir(String text) {
        System.out.println(text);
    }

    public static int lerInt() {
        int valor = 0;
        valor = LER.nextInt();
        return valor;
    }
}
