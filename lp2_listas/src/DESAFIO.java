import java.util.Scanner;
import java.util.Stack;

public class DESAFIO {

    final static public Scanner S = new Scanner(System.in);

    public static void main(String[] args) {
        Stack<String> pilhaEntradaPessoas = new Stack<>();
        Stack<String> pilhaSaida = new Stack<>();

        // push, pop, peek, isEmpty

        System.out.println("...:::Início dos Testes:::...");

        System.out.println(); // espaço

        // adiciona pessoas na fila
        pilhaEntradaPessoas.push("pessoa 1");
        pilhaEntradaPessoas.push("pessoa 2");
        pilhaEntradaPessoas.push("pessoa 3");

        // tira 2 pessoas da fila (deve sair: pessoa 1, depois pessoa 2)
        System.out.println("Saindo: " + sairFila(pilhaEntradaPessoas, pilhaSaida));
        System.out.println("Saindo: " + sairFila(pilhaEntradaPessoas, pilhaSaida));

        // adiciona mais umas pessoas
        pilhaEntradaPessoas.push("pessoa 4");
        pilhaEntradaPessoas.push("pessoa 5");
        pilhaEntradaPessoas.push("pessoa 6");

        // tira mais pessoas para esvaziar a fila (deve sair: 3, 4, 5 e 6)
        System.out.println("Saindo: " + sairFila(pilhaEntradaPessoas, pilhaSaida)); // pessoa 3
        System.out.println("Saindo: " + sairFila(pilhaEntradaPessoas, pilhaSaida)); // pessoa 4
        System.out.println("Saindo: " + sairFila(pilhaEntradaPessoas, pilhaSaida)); // pessoa 5
        System.out.println("Saindo: " + sairFila(pilhaEntradaPessoas, pilhaSaida)); // pessoa 6

        // testando com a fila 100% vazia
        System.out.println("Saindo (Teste Vazia): " + sairFila(pilhaEntradaPessoas, pilhaSaida));

        System.out.println(); // espaço

        System.out.println("...:::FIM:::...");
    }

    public static String sairFila(Stack<String> pilhaEntradaPessoas, Stack<String> pilhaSaida) {

        // se a pilha de saida estiver vazia
        if (pilhaSaida.isEmpty()) {

            // enquanto a pilha de entrada NAO estiver vazia (estiver cheia) se retira as
            // pessoas
            while (pilhaEntradaPessoas.isEmpty() == false) {
                // adiciona na pilha de saida a pessoa removida da de entrada
                pilhaSaida.push(pilhaEntradaPessoas.pop());
            }

        }

        // se a pilha de saída CONTINUAR vazia depois do while a fila está vazia
        if (pilhaSaida.isEmpty()) {
            return "ERRO: Não há ninguém na fila!";
        }

        // retorna quem saiu da Fila em geral (pilha de saida)
        return pilhaSaida.pop();
    }
}